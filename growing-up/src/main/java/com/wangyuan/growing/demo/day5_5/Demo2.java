package com.wangyuan.growing.demo.day5_5;

/**
 * @program: serviceparent
 * @description: singleton 4 enum
 * @author: WangYuan
 * @create: 2019-05-05 15:23
 */
public class Demo2 {
    private Demo2() {

    }
    public static Demo2 getInstance() {
        return Singleton.SINGLETON.getInstance();
    }

    private static enum Singleton{
        SINGLETON;
        private Demo2 demo2;
        private Singleton(){
            demo2 = new Demo2();
        }
        public Demo2 getInstance() {
            return demo2;
        }
    }

    public static void main(String[] args) {
        Demo2 d1 = Demo2.getInstance();
        Demo2 d2 = Demo2.getInstance();
        System.out.println(d1 == d2);

    }
}
