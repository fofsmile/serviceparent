package com.wangyuan.growing.thread.day5_09.mysynchronized.demo1;

/**
 * @program: serviceparent
 * @description: starter
 * @author: WangYuan
 * @create: 2019-05-09 22:11
 */
public class App {
    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();

        ThreadA a = new ThreadA(num);
        a.start();
        ThreadB b = new ThreadB(num);
        b.start();
    }

}
