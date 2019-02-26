package com.spring.service;

import com.spring.dao3.QcCorpustabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QcCorpustabMapperImpl {

    @Resource
    QcCorpustabMapper qcCorpustabMapper;

    public List<Map<String, Object>> queryCustomerClient() {
        System.out.println("system:-------------------------");
        return qcCorpustabMapper.queryCustomerClient();
    }

    public static void main(String[] args) {
        QcCorpustabMapperImpl q=new QcCorpustabMapperImpl();
        q.queryCustomerClient();
    }

}