package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock;

/**
 * @program: serviceparent
 * @description: test b
 * @author: WangYuan
 * @create: 2019-05-13 16:35
 */
public class ThreadB extends Thread  {
    private Service service;
    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.doSome("b");
    }

}
