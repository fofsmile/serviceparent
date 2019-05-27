package com.wangyuan.growing.demo.day5_27;

/**
 * @program: serviceparent
 * @description: 单例
 * @author: WangYuan
 * @create: 2019-05-27 14:49
 */
public class SingletonDemo {
    private SingletonDemo() {

    }
    public static SingletonDemo getInstance() {
        return InnerSingle.demo;
    }
    private  static class InnerSingle{
        private static SingletonDemo demo = new SingletonDemo();

    }

}
