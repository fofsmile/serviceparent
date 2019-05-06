package com.wangyuan.growing.thread.day5_06.yield;

/**
 * @program: serviceparent
 * @description: yield test
 * @author: WangYuan
 * @create: 2019-05-06 22:15
 */
public class YieldDemo1 extends Thread{

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0;i<50000000;i++) {
            Thread.yield();
            count = count+(i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时 " + (endTime-startTime));
    }


    public static void main(String[] args) {
        YieldDemo1 demo1 = new YieldDemo1();
        demo1.start();
    }
}
