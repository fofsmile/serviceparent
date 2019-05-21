package com.wangyuan.growing.demo.day5_21;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-21 16:23
 */
public class Demo3 {
    static class A {
        public int f(int a) {
            return a+1;
        }
    }
    static class B extends A{
        public int f(int a,char c) {
            return a + 2;
        }
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.f(0));

        System.out.println(4^7);

        int i =2;
        System.out.println(i++/3);
    }
}
