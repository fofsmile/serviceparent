package com.wangyuan.growing.demo.day5_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: serviceparent
 * @description: 注入
 * @author: WangYuan
 * @create: 2019-05-09 17:11
 */
@RestController
public class Demo3 {

    private  Demo2 demo2;
    @Autowired
    public Demo3(Demo2 demo2) {
        this.demo2 = demo2;
        demo2.test();
    }

    @RequestMapping("/test")
    public void test() {
        demo2.test();
    }




}
