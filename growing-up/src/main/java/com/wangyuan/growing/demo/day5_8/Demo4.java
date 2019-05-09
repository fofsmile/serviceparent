package com.wangyuan.growing.demo.day5_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: serviceparent
 * @description: 排序
 * @author: WangYuan
 * @create: 2019-05-08 17:08
 */
public class Demo4 implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        Collections.sort(new ArrayList<String>(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
