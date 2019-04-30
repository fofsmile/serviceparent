package com.wangyuan.provider.controller;

import com.wangyuan.core.model.User;
import com.wangyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public User getUser() {
        return userService.getUser();
    }
}
