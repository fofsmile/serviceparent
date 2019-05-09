package com.wangyuan.growing.thread.day5_09.mysynchronized.demo3;

/**
 * @program: serviceparent
 * @description: starter
 * @author: WangYuan
 * @create: 2019-05-09 22:43
 */
public class App {
    public static void main(String[] args) {
        MyMethod method = new MyMethod();
        new Do1(method).start();
        new Do2(method).start();
    }

}
