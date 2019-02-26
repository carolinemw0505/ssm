package com.spring.quartz;

import com.spring.service.IElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;

public class ElasticsearchQuartz  {


    @Autowired
    IElasticSearchService iElasticSearchServiceImpl;

    public void execute()  throws Exception{
        iElasticSearchServiceImpl.addData();
        //System.out.println("定时任务执行："+new Date());
    }
}
