package com.wangyuan.growing.thread.day5_24;

/**
 * @program: serviceparent
 * @description: test join method
 * @author: WangYuan
 * @create: 2019-05-24 08:57
 */
public class ThreadA implements Runnable{


    @Override
    public void run() {
        System.out.println(" i am start "+Thread.currentThread().getName());
    }
}
