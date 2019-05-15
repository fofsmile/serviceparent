package com.wangyuan.growing.thread.day5_15;

import java.util.concurrent.CountDownLatch;

/**
 * @program: serviceparent
 * @description: test CountDownLatch
 * @author: WangYuan
 * @create: 2019-05-15 10:05
 */
public class CountDownLatchDemo extends Thread {
    private static final CountDownLatch latch = new CountDownLatch(2);

    @Override
    public void run() {
        System.out.println("i am thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        super.run();
    }


    public static void main(String[] args) throws InterruptedException {
        CountDownLatchDemo demo1 = new CountDownLatchDemo();
        CountDownLatchDemo demo2 = new CountDownLatchDemo();
        demo1.start();
        demo2.start();
        latch.await();
        System.out.println("i am main thread");


    }
}
