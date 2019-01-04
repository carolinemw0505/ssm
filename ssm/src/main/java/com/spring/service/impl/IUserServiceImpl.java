package com.spring.service.impl;

import com.spring.dao.IUserDao;
import com.spring.model.User;
import com.spring.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    IUserDao userDao;

    @Override
    public User selectUser(Long id) {
        return userDao.selectUser(id);
    }
}
