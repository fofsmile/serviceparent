package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock2;

import lombok.Data;

/**
 * @program: serviceparent
 * @description: dead lock
 * @author: WangYuan
 * @create: 2019-05-13 16:40
 */
@Data
public class ThreadA extends Thread {
    private String lock1;
    private String lock2;
    public ThreadA(String lock1,String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("i take the lock1 -"+Thread.currentThread().getName());
            synchronized (lock2) {
                System.out.println("i take the lock2 -"+Thread.currentThread().getName());
            }
        }
    }

}
