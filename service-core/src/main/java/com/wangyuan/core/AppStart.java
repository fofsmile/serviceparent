package com.wangyuan.core;

import com.sun.jersey.core.impl.provider.entity.XMLRootObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: serviceparent
 * @description: 启动类
 * @author: WangYuan
 * @create: 2019-04-30 10:04
 */
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
    }
}
