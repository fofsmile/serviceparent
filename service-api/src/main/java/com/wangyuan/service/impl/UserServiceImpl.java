package com.wangyuan.service.impl;

import com.wangyuan.core.model.User;

import com.wangyuan.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User(1L,"ribbon-provider1","123456","i am ribbon");
    }
}
