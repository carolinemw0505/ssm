package com.spring.dao;

import com.spring.model.User;

public interface IUserDao {
    User selectUser(Long id);
}
