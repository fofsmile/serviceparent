package com.wangyuan.growing.thread.day4_49;

/**
 * @program: serviceparent
 * @description: 登录方法测试
 * @author: WangYuan
 * @create: 2019-04-29 23:07
 */
public class LoginApp {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
    }
}
