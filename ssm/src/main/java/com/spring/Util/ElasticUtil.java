package com.spring.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spring.enume.IndexName;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ElasticUtil {
    private static TransportClient client;
    private static String host="127.0.0.1";
//    private static String host="10.20.1.236";
    private static int port=9300;
    public static TransportClient Client() throws Exception {
        if(client==null) {
            Settings settings = Settings.builder()
                    .put("cluster.name", "my-application")
                    .put("client.transport.sniff",true)
                    .put("client.transport.ping_timeout","20s")
                    .build();
//            client.transport.sniff
//            设置为true,将自动嗅探整个集群，自动加入集群的节点到连接列表中。
//            client.transport.ignore_cluster_name
//            Set to true to ignore cluster name validation of connected nodes. (since 0.19.4)
//            client.transport.ping_timeout
//            The time to wait for a ping response from a node. Defaults to 5s.
//                    client.transport.nodes_sampler_interval
//            Settings settings=Settings.builder().put("cluster.name","elasticsearch").build();
            client = new PreBuiltTransportClient(settings).addTransportAddresses(new TransportAddress(
                    InetAddress.getByName(host), port));
        }
        return client;
    }

    public static String addJsonData(String indexName, String typeName,  JSONArray data,String... idName) throws Exception {
        if(client==null) {
            ElasticUtil.Client();
        }

        List<String> list=new ArrayList<>();
        for (Object d : data) {
            try {
                XContentBuilder xContentBuilder = XContentFactory.jsonBuilder().startObject();
                JSONObject object = JSONObject.parseObject(JSON.toJSONString(d));
                String id = "";
                for (String key : object.keySet()) {
                    xContentBuilder = xContentBuilder.field(key, object.get(key));
                    if (findKey(key, idName)) {
                        id += object.get(key) + "-";
                    }
                }
                if (id.length() > 0) {
                    id = id.substring(0, id.length() - 1);
                }
                xContentBuilder = xContentBuilder.endObject();
                while (true) {
                   try {
                       IndexResponse response = client.prepareIndex(indexName, typeName, id).setSource(xContentBuilder).get();
                       list.add(response.toString());
                       break;
                   }catch (Exception e) {
                       closeClient();
                       client = ElasticUtil.Client();
                       continue;
                   }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list.toString();
    }


    public static boolean findKey(String key,String... keyList){
        boolean flag=false;
        for(int i=0;i<keyList.length;i++){
            if (key.equalsIgnoreCase(keyList[i])){
                flag=true;
                break;
            }
        }
        return flag;
    }


    public Map<String,Object> searchIndex(String index,String type,String id){
        GetResponse response=client.prepareGet(index,type,id).get();
        Map<String,Object> data=response.getSource();
        return data;
    }

    public String delData(String index,String type,String id) throws IOException{
        DeleteResponse response=client.prepareDelete(index,type,id).get();
        return response.toString();
    }

    public String delIndex(String indexName) throws IOException {
        AcknowledgedResponse request=client.admin().indices().prepareDelete(indexName).execute()
                .actionGet();
        return request.toString();
    }

    public static void closeClient(){
        if (client!=null){
            client.close();
        }
    }

    public String getSearchString(String indexName,String date,String dateTime) throws Exception{
        String result;
        SearchResponse response=client.prepareSearch(indexName)
                .setTypes(indexName)
                .setQuery(QueryBuilders.rangeQuery(dateTime).from(date).to(DateUtil.add_month(date))).get();

        SearchHits hits=response.getHits();

        JSONArray j=new JSONArray();
        JSONObject o;

        for(SearchHit h:hits){
            o=JSON.parseObject(h.toString());
            j.add(o);
        }

        result=j.toJSONString();
        return result;
    }

    public static boolean isExistIndex(String indexName) throws Exception{
        boolean result=ElasticUtil.Client().admin().indices().exists(new IndicesExistsRequest().indices(new String[]{indexName})).actionGet().isExists();
        System.out.println(indexName+":"+result);
        return result;

    }

    public static void main(String[] args) throws Exception{
        client=ElasticUtil.Client();
        ElasticUtil eu=new ElasticUtil();
//        JSONObject object=new JSONObject();
//        JSONObject object1=new JSONObject();
//        JSONArray array=new JSONArray();
//        object.put("key1","val1");
//        object.put("id","1");
//        object.put("id1","11");
//        object1.put("key1","val2");
//        object1.put("id","2");
//        object1.put("id1","12");
//        array.add(object);
//        array.add(object1);
//        eu.addJsonData("test","tweet",array,"id","id1");
//
//        Map<String,Object> map=eu.searchIndex("test","tweet","12-2");
//
//        System.out.println("map1-length:"+map.size());
//
//        for(String key:map.keySet()){
//            System.out.println("key.value:"+map.get(key));
//        }
//
////        eu.delData("test","tweet","12-2");
////
////        map=eu.searchIndex("test","tweet","12-2");
////
////        System.out.println("map2-length:"+map.size());
//
//        //eu.addData();
////        eu.delData();
//        eu.delIndex("y_customer_monitor_detail");

//        SearchResponse response=ElasticUtil.client.prepareSearch("customer_monitor_data")
//                .setTypes("customer_monitor_data")
//                .setQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchPhrasePrefixQuery("ID","1"))).get();
//            SearchHits hits=response.getHits();
//
//            for(SearchHit h:hits){
//                System.out.println(h.getSourceAsString());
//            }
//

        if (ElasticUtil.isExistIndex("customer_client_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("customer_client_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("agent_problem_remaind_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("agent_problem_remaind_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("customer_problem_monitor_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("customer_problem_monitor_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("group_problem_monitor_data")){
            ElasticUtil.client.admin().indices().prepareDelete("group_problem_monitor_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("client_monitor_problem_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("client_monitor_problem_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("client_monitor_problem_compare_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("client_monitor_problem_compare_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("group_monitor_problem_compare_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("group_monitor_problem_compare_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("client_skill_match_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("client_skill_match_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("group_leader_monitor_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("group_leader_monitor_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("bussiness_quality_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("bussiness_quality_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("bussiness_pop_statistic_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("bussiness_pop_statistic_data").execute().actionGet();
        }

        if(ElasticUtil.isExistIndex("bussiness_handle_detail_data")) {
            ElasticUtil.client.admin().indices().prepareDelete("bussiness_handle_detail_data").execute().actionGet();
        }


//        System.out.println(IndexName.queryCustomerClient.ordinal());


//        System.out.println(GlobalConst.indexNames[IndexName.queryBussinessPopStatisticTable.ordinal()]);

//        System.out.println(GlobalConst.indexType[IndexName.queryCustomerClient.ordinal()]);

//        ElasticUtil.client.admin().indices().prepareDelete("customer_client_data",
//                "agent_problem_remaind_data","customer_problem_monitor_data","group_problem_monitor_data",
//                "client_monitor_problem_data","bussiness_quality_data",
//                "client_monitor_problem_compare_data","group_monitor_problem_compare_data",
//                "client_skill_match_data","group_leader_monitor_data").execute().actionGet();
//
//        ElasticUtil.client.admin().indices().prepareDelete("customer_client_data",
//                "agent_problem_remaind_data","customer_problem_monitor_data","group_problem_monitor_data",
//                "client_monitor_problem_data","bussiness_quality_data",
//                "client_monitor_problem_compare_data","group_monitor_problem_compare_data",
//                "client_skill_match_data","group_leader_monitor_data").execute().actionGet();
    }
}
