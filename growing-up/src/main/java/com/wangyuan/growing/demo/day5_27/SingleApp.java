package com.wangyuan.growing.demo.day5_27;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-27 14:53
 */
public class SingleApp {

    public static void main(String[] args) {
        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();
        SingletonDemo demo3 = SingletonDemo.getInstance();
        SingletonDemo demo4 = SingletonDemo.getInstance();
        SingletonDemo demo5 = SingletonDemo.getInstance();

        System.out.println(demo1);
        System.out.println(demo2);
        System.out.println(demo3);
        System.out.println(demo4);
        System.out.println(demo5);
    }

}
