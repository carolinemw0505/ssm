package com.spring.service;

import com.spring.model.Tuser;
import com.spring.model.User;

public interface ITUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    Tuser selectByPrimaryKey(Integer id);
}
