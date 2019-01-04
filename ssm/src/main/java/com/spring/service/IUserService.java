package com.spring.service;

import com.spring.model.User;

public interface IUserService {
    User selectUser(Long id);
}
