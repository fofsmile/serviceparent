package com.wangyuan.growing.demo.day5_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: serviceparent
 * @description: test
 * @author: WangYuan
 * @create: 2019-05-09 17:14
 */
@Configuration
public class Demo4 {
    @Bean
    public Demo2 demo2() {
        return new Demo2();
    }


}
