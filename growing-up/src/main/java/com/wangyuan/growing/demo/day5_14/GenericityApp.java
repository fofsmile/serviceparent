package com.wangyuan.growing.demo.day5_14;

import com.wangyuan.growing.demo.day5_10.App;

import java.util.ArrayList;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-14 14:49
 */
public class GenericityApp {
    public static void main(String[] args) {
        //<? extends T> 表示类型的上界，表示参数化类型的可能是T 或是 T的子类
        ArrayList<Apple> apples1 = new ArrayList<>();
        ArrayList<? extends Fruits> fruits = apples1;
        //<? super T> 表示类型下界（Java Core中叫超类型限定），表示参数化类型是此类型的超类型（父类型），直至Object
        ArrayList<Fruits> fruits1 = new ArrayList<Fruits>();
        ArrayList<? super Apple> apples2 = fruits1;


    }



}
