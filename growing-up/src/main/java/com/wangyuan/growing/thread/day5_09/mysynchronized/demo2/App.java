package com.wangyuan.growing.thread.day5_09.mysynchronized.demo2;

/**
 * @program: serviceparent
 * @description: starter
 * @author: WangYuan
 * @create: 2019-05-09 22:32
 */
public class App {
    public static void main(String[] args) {
        HasSelfPrivateNum num1 = new HasSelfPrivateNum();
        HasSelfPrivateNum num2 = new HasSelfPrivateNum();
        new ThreadA(num1).start();
        new ThreadB(num2).start();
    }


}
