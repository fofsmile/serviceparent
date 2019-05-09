package com.wangyuan.growing.demo.day5_8;

import lombok.Data;

/**
 * @program: serviceparent
 * @description: test
 * @author: WangYuan
 * @create: 2019-05-08 16:41
 */
//@Data
public class Demo3 {
    private String name;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.setName("123");
        demo3.setPassword("234");
        System.out.println(demo3);
    }
}
