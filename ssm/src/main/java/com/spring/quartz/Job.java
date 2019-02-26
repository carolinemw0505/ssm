package com.spring.quartz;

import com.spring.service.IElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;

public class Job {

    @Autowired
    IElasticSearchService iElasticSearchServiceImpl;
    public void execute() throws Exception {
        iElasticSearchServiceImpl.addData();
//        System.out.println(new Date()+"定时执行任务");
    }
}
