package com.wangyuan.growing.thread.day5_23;

import java.util.Date;
import java.util.List;

/**
 * @program: serviceparent
 * @description: 生产者
 * @author: WangYuan
 * @create: 2019-05-23 16:16
 */
public class Provider extends Thread {
    private Object lock;
    private List list;
    public Provider(List list,Object lock) {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while(true) {
                if (list.size() != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("list is product ");
                list.add(new Date());
                lock.notify();
            }
        }

    }
}
