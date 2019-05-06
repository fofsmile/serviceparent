package com.wangyuan.growing.thread.day5_06.priority;

/**
 * @program: serviceparent
 * @description: start demo test
 * @author: WangYuan
 * @create: 2019-05-06 22:43
 */
public class DemoApp {
    public static void main(String[] args) throws InterruptedException {
        PriorityDemo1 demo1 = new PriorityDemo1();
        demo1.setPriority(Thread.NORM_PRIORITY+3);
        demo1.start();
        PriorityDemo2 demo2 = new PriorityDemo2();
        demo2.setPriority(Thread.NORM_PRIORITY-3);
        demo2.start();
        Thread.sleep(20000);
        demo1.stop();
        demo2.stop();
        System.out.println(demo1.getCount());
        System.out.println(demo2.getCount());


    }
}
