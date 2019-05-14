package com.wangyuan.growing.demo.day5_14;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: serviceparent
 * @description: 测试泛型
 * @author: WangYuan
 * @create: 2019-05-14 10:32
 */
public class Demo1 {
    public static Set union(Set set1,Set set2) {
        Set result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }

    public static <E> Set<E> union2(Set<E> set1,Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }


}
