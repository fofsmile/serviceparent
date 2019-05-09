package com.wangyuan.growing.thread.day5_09.mysynchronized.demo3;

/**
 * @program: serviceparent
 * @description: do 2
 * @author: WangYuan
 * @create: 2019-05-09 22:41
 */
public class Do2 extends Thread {
    private MyMethod myMethod;
    public Do2(MyMethod myMethod) {
        this.myMethod = myMethod;
    }

    @Override
    public void run() {
        try {
            myMethod.doSome("Do2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
