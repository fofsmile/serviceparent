package com.wangyuan.growing.thread.day5_16.threadpool;

import java.util.concurrent.*;

/**
 * @program: serviceparent
 * @description: 线程池推荐创建方式
 * @author: WangYuan
 * @create: 2019-05-16 15:10
 */
public class ThreadLocalPoolDemo {
    private static int poolSize = 2;
    private static int maxPoolSize = 5;
    private static int keepAlive = 30;
    private static LinkedBlockingQueue queue = new LinkedBlockingQueue();

    public static ThreadPoolExecutor getInstance() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, maxPoolSize, keepAlive, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }


    public static void main(String[] args) {
        //ThreadA a = new ThreadA();
        ThreadPoolExecutor executor = getInstance();
        //executor.execute(a);
        System.out.println(" 开始 队列长度是 " + queue.size());
        for (int i = 0; i < 10; i++) {
            System.out.println("线程是" + i + "queue size is" + queue.size());
            executor.execute(new ThreadA());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executor.shutdown();
            System.out.println(" 结束 队列长度是 " + queue.size());
        }

    }
}


