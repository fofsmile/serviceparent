package com.wangyuan.growing.thread.day4_49.isalive;

/**
 * @program: serviceparent
 * @description: isalive test
 * @author: WangYuan
 * @create: 2019-04-29 23:22
 */
public class Demo4IaAlive extends Thread {

    @Override
    public void run() {
        System.out.println(" is ALive ? "+isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Demo4IaAlive alive = new Demo4IaAlive();
        System.out.println("begin "+alive.isAlive());
        alive.start();
        Thread.sleep(5000);
        System.out.println("end "+alive.isAlive());
    }
}
