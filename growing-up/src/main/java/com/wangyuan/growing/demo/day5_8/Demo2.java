package com.wangyuan.growing.demo.day5_8;

/**
 * @program: serviceparent
 * @description: test interface
 * @author: WangYuan
 * @create: 2019-05-08 16:08
 */
public class Demo2 implements InterfaceDemo1 {
    @Override
    public String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        InterfaceDemo1 demo2= new Demo2();
         int i=InterfaceDemo1.i;
    }
}
