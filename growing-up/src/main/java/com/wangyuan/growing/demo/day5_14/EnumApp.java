package com.wangyuan.growing.demo.day5_14;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-14 17:12
 */
public class EnumApp {
    public static void main(String[] args) {
        EnumDemo1[] values = EnumDemo1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
        System.out.println(EnumDemo1.SPRING);
        EnumDemo1.SPRING.hello2();
        //System.out.println();
        //System.out.println(values);
    }


}
