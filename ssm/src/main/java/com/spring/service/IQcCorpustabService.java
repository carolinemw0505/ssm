package com.spring.service;

import com.spring.model.QcCorpustab;
import com.spring.model.QcCorpustabKey;

public interface IQcCorpustabService {
    QcCorpustab selectByPrimaryKey(QcCorpustabKey qcCorpustabKey);
}
