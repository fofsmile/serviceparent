package com.wangyuan.growing.demo.day5_8;

/**
 * @program: serviceparent
 * @description: test
 * @author: WangYuan
 * @create: 2019-05-08 14:17
 */
public abstract class AbstractDemo1 {

    public void test1(){
        System.out.println(" i am test1");
    }

    public String test2(String name) {
        return name;
    }

    public int test3() {
        return 123;
    }
    abstract void test4();

}
