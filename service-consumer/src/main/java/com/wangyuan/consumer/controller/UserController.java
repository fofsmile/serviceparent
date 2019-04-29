package com.wangyuan.consumer.controller;

import com.wangyuan.consumer.service.UserFeignClient;
import com.wangyuan.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserFeignClient userFeignClient;
    @RequestMapping("/getUser")
    public User getUser() {
        User user = restTemplate.getForObject("http://service-provider/getUser", User.class);
        return user;
    }

    @RequestMapping("/getUserByFeign")
    public User getUserByFeign() {
        User user = userFeignClient.getUser();
        return user;
    }


}
