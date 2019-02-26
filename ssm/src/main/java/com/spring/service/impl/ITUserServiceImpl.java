package com.spring.service.impl;

import com.spring.dao.TuserMapper;
import com.spring.model.Tuser;
import com.spring.service.ITUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tuserService")
public class ITUserServiceImpl implements ITUserService {

    @Resource
    TuserMapper tuserMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tuser record) {
        return tuserMapper.insert(record);
    }

    @Override
    public Tuser selectByPrimaryKey(Integer id) {
        return tuserMapper.selectByPrimaryKey(id);
    }
}
