package com.spring.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spring.dao3.QcCorpustabMapper;
import com.spring.enume.IndexName;
import com.spring.service.IElasticSearchService;
import com.spring.util.DateUtil;
import com.spring.util.ElasticUtil;
import com.spring.util.GlobalConst;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("iElasticSearchServiceImpl")
public class IElasticSearchServiceImpl implements IElasticSearchService{


    @Autowired
    QcCorpustabMapper qcCorpustabMapper;

    public void addData() throws Exception{
        List<Map<String,Object>> list=qcCorpustabMapper.queryCustomerClient();
        list=DateUtil.convertDate(list);
        String jsonObject=JSON.toJSONString(list);
        JSONArray array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryCustomerClient.ordinal()],GlobalConst.indexNames[IndexName.queryCustomerClient.ordinal()],
                array,"id");


        list=qcCorpustabMapper.queryAgentProblemAndRemaind();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryAgentProblemAndRemaind.ordinal()],GlobalConst.indexNames[IndexName.queryAgentProblemAndRemaind.ordinal()],
                array, "id");


        list=qcCorpustabMapper.queryCustomerProblemMonitor();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryCustomerProblemMonitor.ordinal()],GlobalConst.indexNames[IndexName.queryCustomerProblemMonitor.ordinal()],
                array, "id");


        list=qcCorpustabMapper.queryGroupProblemMonitorTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryGroupProblemMonitorTable.ordinal()],GlobalConst.indexNames[IndexName.queryGroupProblemMonitorTable.ordinal()],
                array, "id");

        list=qcCorpustabMapper.queryClientMonitorProblemTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryClientMonitorProblemTable.ordinal()],GlobalConst.indexNames[IndexName.queryClientMonitorProblemTable.ordinal()],
                array, "id");


        list=qcCorpustabMapper.queryBussinessQualityTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryBussinessQualityTable.ordinal()],GlobalConst.indexNames[IndexName.queryBussinessQualityTable.ordinal()],
                array, "id");


        list=qcCorpustabMapper.queryClientMonitorProblemCompareTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryClientMonitorProblemCompareTable.ordinal()],GlobalConst.indexNames[IndexName.queryClientMonitorProblemCompareTable.ordinal()],
                array,"id");


        list=qcCorpustabMapper.queryGroupMonitorProblemCompareTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryGroupMonitorProblemCompareTable.ordinal()],GlobalConst.indexNames[IndexName.queryGroupMonitorProblemCompareTable.ordinal()],
                array,"id");

        list=qcCorpustabMapper.queryClientSkillMatchTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryClientSkillMatchTable.ordinal()],GlobalConst.indexNames[IndexName.queryClientSkillMatchTable.ordinal()],array,
                "id");

        list=qcCorpustabMapper.queryGroupLeaderMonitorTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryGroupLeaderMonitorTable.ordinal()],GlobalConst.indexNames[IndexName.queryGroupLeaderMonitorTable.ordinal()],array,
                "id");

        list=qcCorpustabMapper.queryBussinessHandleDetailTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryBussinessHandleDetailTable.ordinal()],GlobalConst.indexNames[IndexName.queryBussinessHandleDetailTable.ordinal()],array,
                "id");

        list=qcCorpustabMapper.queryBussinessPopStatisticTable();
        list=DateUtil.convertDate(list);
        jsonObject=JSON.toJSONString(list);
        array=JSONArray.parseArray(jsonObject);

        ElasticUtil.addJsonData(GlobalConst.indexNames[IndexName.queryBussinessPopStatisticTable.ordinal()],GlobalConst.indexNames[IndexName.queryBussinessPopStatisticTable.ordinal()],
                array,"id");
    }


    public String searchData(String indexName,String date) throws Exception{
        String result="",indexN="";
        SearchResponse response;
        TransportClient client=ElasticUtil.Client();
        ElasticUtil u=new ElasticUtil();
        switch (indexName){
            case "queryCustomerClient":{
                indexN=GlobalConst.indexNames[IndexName.queryCustomerClient.ordinal()];
                    response=client.prepareSearch(indexN)
                            .setTypes(indexN)
                            .setQuery(QueryBuilders.boolQuery()
                                    .should(QueryBuilders.boolQuery()
                                                    .must(QueryBuilders.matchPhraseQuery("WARNINGSWORDS","客户敏感词"))
                                                    .must(QueryBuilders.matchPhraseQuery("FEELEXCEPTION","客户情绪异常"))
                                                    .must(QueryBuilders.matchPhraseQuery("JNWORDS","技能不匹配"))
                                                    .must(QueryBuilders.matchPhraseQuery("SPEEDEXCEPTION","客户语速异常")))
                                    .must(QueryBuilders.matchPhraseQuery("AREA","西安中心"))
                                    .must(QueryBuilders.matchPhraseQuery("AGENTGROUP","西安-中端组"))
                                    .must(QueryBuilders.matchPhraseQuery("SMALLAGENTGROUP","白金2组(杨晨2)"))
                                    .must(QueryBuilders.rangeQuery("TIME").from(date).to(DateUtil.add_month(date)))
                                    ).get();
                SearchHits hits=response.getHits();
                JSONObject r=new JSONObject();
                r.put("result",hits.totalHits);
                result=r.toString();
                break;
            }
            case "queryAgentProblemAndRemaind":{
                indexN=GlobalConst.indexNames[IndexName.queryAgentProblemAndRemaind.ordinal()];
                response=client.prepareSearch(indexN)
                        .setTypes(indexN)
                        .setQuery(QueryBuilders.boolQuery()
                                .must(QueryBuilders.matchPhraseQuery("C23","西安中心"))
                                .must(QueryBuilders.matchPhraseQuery("C20","西安-中端组"))
                                .must(QueryBuilders.matchPhraseQuery("C14","白金2组(杨晨2)"))
                                .must(QueryBuilders.rangeQuery("CALLTIME").from(date).to(DateUtil.add_month(date)))
                        ).get();
                SearchHits hits=response.getHits();

                JSONArray j=new JSONArray();
                JSONObject o;
                for(SearchHit h:hits){
                    o=JSON.parseObject(h.toString());
                    j.add(o);
                }

                result=j.toJSONString();
                break;
            }
            case "queryCustomerProblemMonitor":{
                indexN=GlobalConst.indexNames[IndexName.queryCustomerProblemMonitor.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryGroupProblemMonitorTable":{
                indexN=GlobalConst.indexNames[IndexName.queryGroupProblemMonitorTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryClientMonitorProblemTable":{
                indexN=GlobalConst.indexNames[IndexName.queryClientMonitorProblemTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryBussinessQualityTable":{
                indexN=GlobalConst.indexNames[IndexName.queryBussinessQualityTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryClientMonitorProblemCompareTable":{
                indexN=GlobalConst.indexNames[IndexName.queryClientMonitorProblemCompareTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryGroupMonitorProblemCompareTable":{
                indexN=GlobalConst.indexNames[IndexName.queryGroupMonitorProblemCompareTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryClientSkillMatchTable":{
                indexN=GlobalConst.indexNames[IndexName.queryClientSkillMatchTable.ordinal()];
                result=u.getSearchString(indexN,date,"TIME");
                break;
            }
            case "queryGroupLeaderMonitorTable":{
                indexN=GlobalConst.indexNames[IndexName.queryGroupLeaderMonitorTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryBussinessHandleDetailTable":{
                indexN=GlobalConst.indexNames[IndexName.queryBussinessHandleDetailTable.ordinal()];
                result=u.getSearchString(indexN,date,"CALLTIME");
                break;
            }
            case "queryBussinessPopStatisticTable":{
                indexN=GlobalConst.indexNames[IndexName.queryBussinessPopStatisticTable.ordinal()];
                result=u.getSearchString(indexN,date,"POPUPCREATETIME");
                break;
            }
            default:{
                break;
            }
        }
        return result;
    }

}
