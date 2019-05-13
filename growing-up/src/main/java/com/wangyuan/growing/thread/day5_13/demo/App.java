package com.wangyuan.growing.thread.day5_13.demo;

import java.io.ObjectStreamConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-13 17:08
 */
public class App implements ObjectStreamConstants {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1Impl();
        Demo1Impl demo2 = new Demo1Impl();
        //demo1.test4();
        //demo2.test4();
        //System.out.println(SC_EXTERNALIZABLE);
        Map map = new HashMap();
        HashMap map2 = new HashMap();
        ConcurrentHashMap<Object, Object> map3 = new ConcurrentHashMap<>();
        map.put(null,"hello");
        map2.put(null,"hello2");
        //map3.put(null,"hello3");
        System.out.println(map.get(null));
        System.out.println(map2.get(null));
        //System.out.println(map3.get(null));


    }



}
