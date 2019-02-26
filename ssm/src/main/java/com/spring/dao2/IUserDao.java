package com.spring.dao2;

import com.spring.model.User;

public interface IUserDao {
    User selectUser(Long id);
}
