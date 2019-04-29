package com.wangyuan.consumer.service;

import com.wangyuan.core.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="service-provider")
public interface UserFeignClient {
    @RequestMapping("/getUser")
    public User getUser();
}
