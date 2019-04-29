package com.wangyuan.growing.thread.day4_49;

/**
 * @program: serviceparent
 * @description: 模拟B用户登录
 * @author: WangYuan
 * @create: 2019-04-29 23:06
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
