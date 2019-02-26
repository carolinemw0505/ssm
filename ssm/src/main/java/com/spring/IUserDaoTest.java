package com.spring;

import com.spring.dao3.QcCorpustabMapper;
import com.spring.service.IElasticSearchService;
import com.spring.service.IQcCorpustabService;
import com.spring.service.QcCorpustabMapperImpl;
import com.spring.util.Thread1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
//@ContextConfiguration({"classpath:spring-mvc.xml"})
public class IUserDaoTest {
//    @Autowired
//    IUserDao userDao;
//    @Autowired
//    TuserMapper tuserMapper;
//
    @Autowired
    QcCorpustabMapper qcCorpustabMapper;

    @Resource
    IQcCorpustabService iQcCorpustabService2;

    @Autowired
    QcCorpustabMapperImpl qcCorpustabMapperImpl;

//    @Autowired
//    IElasticSearchServiceImpl iElasticSearchServiceImpl;

    @Autowired
    IElasticSearchService iElasticSearchServiceImpl;

    @Test
    public void test() throws Exception{
        //QcCorpustabMapperImpl qcCorpustabMapperImpl=new QcCorpustabMapperImpl();
//        List<Map<String,Object>> r=qcCorpustabMapper.queryCustomerClient();
//
//        System.out.println(r.size());
//
////        IQcCorpustabService q=new IQcCorpustabServiceImpl();
//        r=iQcCorpustabService2.selectByPrimaryKey(new QcCorpustabKey());
//
//        System.out.println(r.size());
//
//        r=qcCorpustabMapperImpl.queryCustomerClient();
//
//        System.out.println(r.size());
//
//        ApplicationContext cx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
//
//        QcCorpustabMapperImpl qc2=cx.getBean(QcCorpustabMapperImpl.class);
//

//        r=qc2.queryCustomerClient();
//        System.out.println(r.size());
//
//        cx=SpringCtx.instance().getCtx();
//        QcCorpustabMapperImpl qc3= cx.getBean(QcCorpustabMapperImpl.class);
//        r=qc3.queryCustomerClient();
//        System.out.println("tools:"+r.size());

        iElasticSearchServiceImpl.addData();

//        Thread t1=new Thread(new Thread1());
//        t1.start();
//        Thread t2=new Thread(new Thread2());
//        t2.start();

//        iElasticSearchServiceImpl2.serviceTest();
//        System.out.println(iElasticSearchServiceImpl.searchData("queryBussinessPopStatisticTable","2018-12"));
    }

//    @Autowired
//    ITUserService itUserService;
//
//    @Autowired
//    QcCorpustabMapper qcCorpustabMapper;

//    @Test
//    public void selectUser() throws Exception{
////        Tuser user=tuserMapper.selectByPrimaryKey(1);
//
//        Tuser tuser=itUserService.selectByPrimaryKey(1);
//        System.out.println("ip:"+tuser.getRegip());
//    }

//    @Test
//    public  void selectQcCorpustabMapper() throws Exception {
//        QcCorpustabKey qcCorpustabKey=new QcCorpustabKey();
//        qcCorpustabKey.setTenantid("egoo");
//        qcCorpustabKey.setCorpusid(1100L);
//        QcCorpustab qcCorpustab=qcCorpustabMapper.selectByPrimaryKey(qcCorpustabKey);
//        System.out.println("qcCorpustab.getCorpustext:"+qcCorpustab.getCorpustext());
//        List<Map<String,Object>> map=qcCorpustabMapper.queryCustomerClient();
//
//        System.out.println("map.length:"+map.size());
//
//        for(String key:map.get(0).keySet()){
//            System.out.println(key+":"+map.get(0).get(key).toString());
//        }
//
//        map=qcCorpustabMapper.queryAgentProblemAndRemaind();
//
//        System.out.println("map1.length:"+map.size());
//
//        for (String key:map.get(0).keySet()){
//            System.out.println(key+":"+map.get(0).get(key).toString());
//        }
//
//
//        map=qcCorpustabMapper.queryCustomerProblemMonitor();
//
//        System.out.println("map2.length:"+map.size());
//
//        for(String key:map.get(0).keySet()){
//            System.out.println(key+":"+map.get(0).get(key).toString());
//        }


//        List<Map<String,Object>> map2=qcCorpustabMapper.queryCustomerProblemMonitor();
//
//        List<Map<String,Object>> map1=qcCorpustabMapper.queryTest();
//
//        boolean flag=true;
//
//        for(int i=0;i<map1.size();i++){
//            flag=findTheSame(map1.get(i),map2);
//            if(!flag){
//                break;
//            }
//        }

//        System.out.println("flag:"+flag);

//        List<Map<String,Object>> map=qcCorpustabMapper.queryGroupProblemMonitorTable();
//
//        System.out.println("map.length:"+map.size());
//
//        for(String key:map.get(0).keySet()){
//            System.out.println(key+":"+map.get(0).get(key));
//        }

//        List<Map<String,Object>> map=qcCorpustabMapper.queryClientMonitorProblemTable();
//
//        System.out.println("map.length:"+map.size());
//
//        for (String key:map.get(0).keySet()){
//            System.out.println(key+":"+map.get(0).get(key));
//        }

//        List<Map<String, Object>> map = qcCorpustabMapper.queryBussinessQualityTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }

//        List<Map<String, Object>> map = qcCorpustabMapper.queryClientMonitorProblemTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }

//        List<Map<String, Object>> map = qcCorpustabMapper.queryGroupMonitorProblemCompareTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }

//        List<Map<String, Object>> map = qcCorpustabMapper.queryClientSkillMatchTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }


//
//        List<Map<String, Object>> map = qcCorpustabMapper.queryBussinessHandleDetailTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }

//        List<Map<String, Object>> map = qcCorpustabMapper.queryGroupLeaderMonitorTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }
//
//        List<Map<String, Object>> map = qcCorpustabMapper.queryBussinessPopStatisticTable();
//
//        System.out.println("map.length:" + map.size());
//
//        for (String key : map.get(0).keySet()) {
//            System.out.println(key + ":" + map.get(0).get(key));
//
//        }
//    }

//    public boolean findTheSame(Map<String,Object> row,List<Map<String,Object>> list){
//        boolean flag=false;
//        for(int i=0;i<list.size();i++){
//
//            flag=true;
//            for(String key:row.keySet()){
//                    if(!row.get(key).equals(list.get(i).get(key))){
//                        flag=false;
//                        break;
//                    }
//            }
//            if(flag){
//                break;
//            }
//        }
//        return flag;
//    }

//    @Test
//    public void selectUser()throws Exception{
//        User user=userDao.selectUser(1l);
//
//        System.out.println("ip:"+user.getRegIp());
//    }

//    @Resource
//    private IQcCorpustabService iQcCorpustabService=null;

//    @Test
//    public void testMybatisGenerate(){
//        QcCorpustabKey qcCorpustabKey=new QcCorpustabKey();
//        qcCorpustabKey.setTenantid("egoo");
//        qcCorpustabKey.setCorpusid(1100L);
//
//        QcCorpustab qcCorpustab=iQcCorpustabService.selectByPrimaryKey(qcCorpustabKey);
//
//        System.out.println("qcCorpustab:"+qcCorpustab.getBussinesscenarios()+"-"+
//        qcCorpustab.getCorpustype()+"-"+qcCorpustab.getSensitivitylevel()+"-"+qcCorpustab.getCorpustext());
//    }

//    @Test
//    public void testResult(){
//        Result1 result=new Result1();
//        result.setResultCode(0);
////        result.setResult1(GlobalConst.success);
//        result.setMessage("成功");
//
//        System.out.println(result.toString());
//
//        String string="";
//        JSONObject json=JSONObject.parseObject(JSON.toJSONString(result));
//
//        System.out.println(json.toJSONString());
//    }
}
