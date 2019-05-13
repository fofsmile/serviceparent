package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock;

/**
 * @program: serviceparent
 * @description: start
 * @author: WangYuan
 * @create: 2019-05-13 16:35
 */
public class App {
    public static void main(String[] args) {
        Service service = new Service();
        new ThreadA(service).start();
        new ThreadB(service).start();
    }



}
