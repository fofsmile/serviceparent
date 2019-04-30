package com.wangyuan.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.wangyuan")
public class ProviderStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStarter.class,args);
    }
}
