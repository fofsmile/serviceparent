package com.wangyuan.growing.thread.day5_13.mysynchronized.deadlock;

/**
 * @program: serviceparent
 * @description: test method
 * @author: WangYuan
 * @create: 2019-05-13 16:27
 */
public class Service {

    public synchronized void doSome(String userName) {
         if("a".equals(userName)) {
            System.out.println("userName is run "+userName);
            while(true) {

            }
        }else {
             System.out.println("userName is "+userName);
         }


    }



}
