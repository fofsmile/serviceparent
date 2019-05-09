package com.wangyuan.growing.thread.day5_09.mysynchronized.demo1;

/**
 * @program: serviceparent
 * @description: 方法内的变量为线程安全
 * @author: WangYuan
 * @create: 2019-05-09 22:00
 */
public class HasSelfPrivateNum {
    /**
     * 非线程安全
     */
    private int num = 0;
    public void addI(String username) {
        try {
            //int num = 0; //线程安全
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println("username is " + username + "and num is " + num);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }



}
