package com.wangyuan.growing.thread.day5_23;

import java.util.ArrayList;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-23 16:17
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ArrayList list = new ArrayList();
        Object lock = new Object();

        Provider provider = new Provider(list,lock);
        Consumer consumer = new Consumer(list,lock);
        provider.start();
        Thread.sleep(1000);
        consumer.start();

    }


}
