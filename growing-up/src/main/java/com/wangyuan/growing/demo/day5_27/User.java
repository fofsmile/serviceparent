package com.wangyuan.growing.demo.day5_27;

import lombok.Data;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-27 11:07
 */
@Data
public class User {
    private String name;
    private int age;
    public User(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
