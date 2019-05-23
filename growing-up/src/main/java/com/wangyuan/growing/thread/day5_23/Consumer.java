package com.wangyuan.growing.thread.day5_23;

import java.util.List;

/**
 * @program: serviceparent
 * @description: 消费者
 * @author: WangYuan
 * @create: 2019-05-23 16:16
 */
public class Consumer  extends Thread{
    private Object lock;
    private List list;

    public Consumer(List list,Object lock) {
        this.list = list;
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            while(true) {
                if (list.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("get from list is " + list.get(0));
                list.remove(0);
                lock.notify();
            }
        }

    }
}
