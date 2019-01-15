package com.spring.service.impl;

import com.spring.dao.QcCorpustabMapper;
import com.spring.model.QcCorpustab;
import com.spring.model.QcCorpustabKey;
import com.spring.service.IQcCorpustabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iQcCorpustabService")
public class IQcCorpustabServiceImpl implements IQcCorpustabService {

    @Autowired
    QcCorpustabMapper qcCorpustabMapper;

    @Override
    public QcCorpustab selectByPrimaryKey(QcCorpustabKey qcCorpustabKey) {
        return qcCorpustabMapper.selectByPrimaryKey(qcCorpustabKey);
    }
}
