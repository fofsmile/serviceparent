package com.wangyuan.growing.thread.day5_09.mysynchronized.demo3;

import com.wangyuan.growing.thread.day4_49.currentthread.MyThread;

/**
 * @program: serviceparent
 * @description: do 1
 * @author: WangYuan
 * @create: 2019-05-09 22:39
 */
public class Do1 extends Thread {
    private MyMethod myMethod;
    public Do1(MyMethod myMethod) {
        this.myMethod = myMethod;
    }

    @Override
    public void run() {
        try {
            myMethod.doSome("Do1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
