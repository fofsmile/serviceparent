package com.wangyuan.growing.demo.day5_5;

/**
 * @program: serviceparent
 * @description: test outoboxing
 * @author: WangYuan
 * @create: 2019-05-05 15:46
 */
public class Demo3 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        //Long sum = 0L;
        long sum = 0L;
        for(int i=0;i<Integer.MAX_VALUE;i++) {
            sum+=i;
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
