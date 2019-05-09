package com.wangyuan.growing.thread.day5_09.mysynchronized.demo2;

/**
 * @program: serviceparent
 * @description: test b
 * @author: WangYuan
 * @create: 2019-05-09 22:31
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        try {
            hasSelfPrivateNum.addI("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
