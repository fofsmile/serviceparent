package com.wangyuan.growing.demo.day5_10;

/**
 * @program: serviceparent
 * @description: 多态
 * @author: WangYuan
 * @create: 2019-05-10 14:39
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("get User over");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
