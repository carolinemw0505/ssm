package com.spring.util;

import com.spring.service.IElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;

public class Thread1 implements Runnable{

    @Autowired
    IElasticSearchService iElasticSearchServiceImpl;
    @Override
    public void run() {
        try {
            iElasticSearchServiceImpl.addData();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for (int i=0;i<100;i++){
//            System.out.println("线程一：------------------------------"+i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
