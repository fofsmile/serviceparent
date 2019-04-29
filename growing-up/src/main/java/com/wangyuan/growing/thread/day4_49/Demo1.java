package com.wangyuan.growing.thread.day4_49;

public class Demo1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.start();
        System.out.println("i am main "+ Thread.currentThread().getName());
    }


}
