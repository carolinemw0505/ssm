package com.spring.service.impl;

import com.spring.dao3.QcCorpustabMapper;
import com.spring.model.QcCorpustabKey;
import com.spring.service.IQcCorpustabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("iQcCorpustabService2")
public class IQcCorpustabServiceImpl2 implements IQcCorpustabService {

    @Autowired
    QcCorpustabMapper qcCorpustabMapper;

    @Override
    public List<Map<String,Object>> selectByPrimaryKey(QcCorpustabKey qcCorpustabKey) {
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        return qcCorpustabMapper.queryBussinessPopStatisticTable();
    }
}
