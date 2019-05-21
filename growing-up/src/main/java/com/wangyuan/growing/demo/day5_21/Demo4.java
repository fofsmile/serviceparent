package com.wangyuan.growing.demo.day5_21;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-21 16:50
 */
public class Demo4 {

    public static String test(int i ){
        if(i%2 == 0) {
            return "偶数";
        }else {
            return "奇数";
        }
    }

    public static int test2(int i) {
       if(i ==1) {
           return 1;
       }else {
           int sum = i*test2(i-1);
           return sum;
       }
    }



    public static void main(String[] args) {
//        System.out.println(test(2));
//        System.out.println(test(6));
//        System.out.println(test(5));
//        System.out.println(test(11));

        System.out.println(test2(5));
    }


}
