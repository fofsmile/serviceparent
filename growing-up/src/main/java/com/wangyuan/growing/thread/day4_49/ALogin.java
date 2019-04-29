package com.wangyuan.growing.thread.day4_49;

/**
 * @program: serviceparent
 * @description: 模拟用户A登录
 * @author: WangYuan
 * @create: 2019-04-29 23:05
 */
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
