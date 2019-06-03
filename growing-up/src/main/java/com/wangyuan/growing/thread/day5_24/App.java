package com.wangyuan.growing.thread.day5_24;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-24 09:00
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadA());
        thread.start();
        thread.join();

        System.out.println(" i am main method");



    }

}
