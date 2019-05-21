package com.wangyuan.growing.demo.day5_21;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-21 15:58
 */
public class Demo2 {
    public static void change(int x,int y) {
        x = x+y; //7
        y = x-y;//3
        x = x-y;//4
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        change(x,y);
        System.out.println(x);
        System.out.println(y);



    }
}
