package com.wangyuan.growing.demo.day6_03;


import com.alibaba.fastjson.JSONArray;

/**
 * @program: serviceparent
 * @description: jsonarray test
 * @author: WangYuan
 * @create: 2019-06-03 16:43
 */
public class Demo1 {
    public static void main(String[] args) {
        String contentJson = " [{111=aaa}, {222=bbb/ccc}]";
        JSONArray ja = new JSONArray();
        ja.add(contentJson);
        System.out.println(ja);
        System.out.println(ja.getString(0));
    }
}
