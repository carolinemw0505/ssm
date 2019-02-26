package com.spring.service;

public interface IElasticSearchService {
    void addData() throws Exception;

    String searchData(String indexName,String date) throws Exception;
}
