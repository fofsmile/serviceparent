package com.wangyuan.growing.demo.day5_14;

import com.sun.deploy.security.ValidationState;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-14 17:09
 */
public enum  EnumDemo1 {
    SPRING,
    SUMMER,
    AUTUMN;
    ;
    private enum Type{
        TYPE1{
            public void hello() {
                System.out.println(" i am  spring1");
            }
        },
        TYPE2{
            public void hello() {
                System.out.println(" i am  spring2");
            }
        };
    }


    public void hello2() {
        String name = SPRING.name();
        System.out.println(name);
        System.out.println("i am hello2");
    }
}
