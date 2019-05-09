package com.wangyuan.growing.demo.day5_9;

/**
 * @program: serviceparent
 * @description: test
 * @author: WangYuan
 * @create: 2019-05-09 17:02
 */
public class Demo1 {
    private String name="123";
    {
        System.out.println("我是构造代码块");
    }

    public Demo1() {
        System.out.println(name);
        System.out.println("我是构造方法");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public static void main(String[] args) {
        new Demo1();
    }







}
