package com.spring.controller;

import com.spring.service.IElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/elasticSearch")
public class ElasticSearchController {

    @Autowired
    IElasticSearchService elasticSearchServiceImpl;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "aaaa";
    }

    @RequestMapping("addDataService")
    @ResponseBody
    public String addDataService() throws Exception{
        elasticSearchServiceImpl.addData();
        return "success";
    }

    @RequestMapping(value = "/searchData",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String searchData(HttpServletRequest request,HttpServletResponse response){
        String result="";
        try {
            String indexName = request.getParameter("indexName");
            String date = request.getParameter("date");
            result = elasticSearchServiceImpl.searchData(indexName, date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
//    public String addData(){
//        Result result=new Result();
//        try{
//            elasticSearchService.addData();
//            result.setResult1(GlobalConst.error);
//            result.setResultCode(GlobalConst.successCode);
//            result.setMessage("添加索引成功");
//        }catch(Exception e){
//            e.printStackTrace();
//            result.setResult1(GlobalConst.error);
//            result.setResultCode(GlobalConst.errorCode);
//            result.setMessage("添加索引失败");
//        }
//        return JSON.toJSONString(result);
//    }
}
