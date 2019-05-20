package com.wangyuan.growing.thread.day5_16.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: serviceparent
 * @description: cachedThread pool
 * @author: WangYuan
 * @create: 2019-05-16 14:29
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //cachedThreadPool.execute();
    }




}
