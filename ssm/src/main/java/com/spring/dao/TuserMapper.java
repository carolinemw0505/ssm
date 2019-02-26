package com.spring.dao;

import com.spring.model.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    Tuser selectByPrimaryKey(Integer id);

}