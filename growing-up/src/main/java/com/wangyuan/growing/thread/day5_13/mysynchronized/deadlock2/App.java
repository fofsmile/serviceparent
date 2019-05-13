package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock2;

/**
 * @program: serviceparent
 * @description: start
 * @author: WangYuan
 * @create: 2019-05-13 16:46
 */
public class App {
    public static void main(String[] args) {
        String lock1 = "锁1";
        String lock2 = "锁2";
        new ThreadA(lock1,lock2).start();
        new ThreadB(lock1,lock2).start();
    }




}
