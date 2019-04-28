package com.wangyuan.chapter4miroservice.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String userName) {
        System.out.println(userName);
        return "hello world";
    }
}
