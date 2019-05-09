package com.wangyuan.growing.thread.day5_09.mysynchronized.demo2;

/**
 * @program: serviceparent
 * @description: test a
 * @author: WangYuan
 * @create: 2019-05-09 22:28
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }
    @Override
    public void run() {
        try {
            hasSelfPrivateNum.addI("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
