package com.wangyuan.growing.thread.day5_09.mysynchronized.demo3;

/**
 * @program: serviceparent
 * @description: test method
 * @author: WangYuan
 * @create: 2019-05-09 22:37
 */
public class MyMethod {
    //public void doSome(String username) throws InterruptedException {
    public synchronized void doSome(String username) throws InterruptedException {
        System.out.println("username = "+username +" is do this");
        Thread.sleep(5000);
        System.out.println("username = "+username +" done");
    }



}
