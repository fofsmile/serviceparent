package com.wangyuan.growing.demo.day5_14;

import lombok.Data;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-14 17:58
 */

public enum  ColorEnmu {
    YELLOW("黄色",1);
    private String name;
    private int index;
    private ColorEnmu(String name,int index) {
        this.name = name;
        this.index = index;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "name is "+name +" and index is "+index;
    }

}
