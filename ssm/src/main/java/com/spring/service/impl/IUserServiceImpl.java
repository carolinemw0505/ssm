package com.spring.service.impl;

import com.spring.model.User;
import com.spring.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserServiceImpl implements IUserService {

//    @Resource
//    IUserDao userDao;

    @Override
    public User selectUser(Long id) {
//        return userDao.selectUser(id);
        return null;
    }
}
