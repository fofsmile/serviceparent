package com.wangyuan.growing.thread.day5_09.mysynchronized.demo2;

/**
 * @program: serviceparent
 * @description: 2个对象2个锁
 * @author: WangYuan
 * @create: 2019-05-09 22:23
 */
public class HasSelfPrivateNum {
    private int num = 0;
    //public synchronized void addI(String username) {
    public  void addI(String username) throws InterruptedException {
        if("a".equals(username)) {
            num = 100;
            Thread.sleep(2000);
            System.out.println("a set over");
        }else {
            num = 200;
            System.out.println("b set over");
        }
        System.out.println("username is = "+username+" and num is = "+num);
    }


}
