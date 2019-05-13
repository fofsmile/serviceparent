package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock;

/**
 * @program: serviceparent
 * @description: test A
 * @author: WangYuan
 * @create: 2019-05-13 16:27
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.doSome("a");
    }
}
