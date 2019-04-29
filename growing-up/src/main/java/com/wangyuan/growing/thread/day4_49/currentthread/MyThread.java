package com.wangyuan.growing.thread.day4_49.currentthread;

/**
 * @program: serviceparent
 * @description: test
 * @author: WangYuan
 * @create: 2019-04-29 23:15
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(" run 方法 "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //myThread.start();
        myThread.run();
    }

}
