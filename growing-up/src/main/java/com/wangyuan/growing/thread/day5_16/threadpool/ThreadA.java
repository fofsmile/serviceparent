package com.wangyuan.growing.thread.day5_16.threadpool;

/**
 * @program: serviceparent
 * @description: 测试线程类
 * @author: WangYuan
 * @create: 2019-05-16 15:20
 */
public class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println(" i am Thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
