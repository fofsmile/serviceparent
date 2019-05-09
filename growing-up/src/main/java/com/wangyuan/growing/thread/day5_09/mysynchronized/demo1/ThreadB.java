package com.wangyuan.growing.thread.day5_09.mysynchronized.demo1;

/**
 * @program: serviceparent
 * @description: 线程测试B
 * @author: WangYuan
 * @create: 2019-05-09 22:08
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }
    @Override
    public void run() {
        hasSelfPrivateNum.addI("B");
        super.run();
    }
}
