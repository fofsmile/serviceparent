package com.wangyuan.growing.thread.day5_09.mysynchronized.demo1;

/**
 * @program: serviceparent
 * @description: 线程测试A
 * @author: WangYuan
 * @create: 2019-05-09 22:06
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;

    }
    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("a");
    }



}
