package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock2;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-13 16:45
 */
public class ThreadB extends Thread {
    private String lock1;
    private String lock2;
    public ThreadB(String lock1,String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("i take the lock1 -"+Thread.currentThread().getName());
            synchronized (lock1) {
                System.out.println("i take the lock2 -"+Thread.currentThread().getName());
            }
        }
    }
}
