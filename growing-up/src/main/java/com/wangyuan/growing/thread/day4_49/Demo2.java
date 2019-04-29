package com.wangyuan.growing.thread.day4_49;

/**
 * @program: serviceparent
 * @description: thread demo
 * @author: WangYuan
 * @create: 2019-04-29 22:46
 */
public class Demo2 extends Thread {
    private int count = 5;
    public Demo2(String name) {
        super();
        this.setName(name);
    }
    public Demo2() {

    }
    @Override
    synchronized public void run() {
        while(count>0) {
            count --;
            System.out.println("i am "+this.getName()+" count = "+count);
        }
    }

    public static void main(String[] args) {
        Demo2 a = new Demo2("A");
        Demo2 b = new Demo2("B");
        Demo2 c = new Demo2("C");
//        a.start();
//        b.start();
//        c.start();
        Demo2 demo2 = new Demo2();
        Thread a1 = new Thread(demo2, "A");
        Thread b1 = new Thread(demo2, "B");
        Thread c1 = new Thread(demo2, "C");
        a1.start();
        b1.start();
        c1.start();



    }
}
