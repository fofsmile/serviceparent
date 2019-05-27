package com.wangyuan.growing.demo.day5_27;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: serviceparent
 * @description: 制造数据
 * @author: WangYuan
 * @create: 2019-05-27 11:08
 */
public class DataMaker {
    public static List<User> make() {
        List list = new ArrayList();
        for(int i=0 ;i<100;i++) {
            list.add(new User("测试"+i,i));
        }
        list.add(new User("pingtech",10));
        return list;
    }

}
