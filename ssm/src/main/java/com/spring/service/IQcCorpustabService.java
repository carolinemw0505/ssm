package com.spring.service;

import com.spring.model.QcCorpustabKey;

import java.util.List;
import java.util.Map;

public interface IQcCorpustabService {
    List<Map<String,Object>> selectByPrimaryKey(QcCorpustabKey qcCorpustabKey);
}
