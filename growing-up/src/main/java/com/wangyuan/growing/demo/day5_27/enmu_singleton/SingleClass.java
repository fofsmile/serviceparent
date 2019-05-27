package com.wangyuan.growing.demo.day5_27.enmu_singleton;

/**
 * @program: serviceparent
 * @description:
 * @author: WangYuan
 * @create: 2019-05-27 15:01
 */
public class SingleClass {
    private SingleClass() {

    }
    private enum SingleTon{
        INSTANCE;
        private SingleClass singleClass;
        SingleTon() {
            this.singleClass = new SingleClass();
        }
        public static SingleClass getInstance() {
            return INSTANCE.singleClass;
        }
    }

    public static void main(String[] args) {
        SingleClass instance = SingleTon.INSTANCE.singleClass;
        SingleClass instance2 = SingleTon.INSTANCE.singleClass;
        SingleClass instance3 = SingleTon.INSTANCE.singleClass;
        SingleClass instance4 = SingleTon.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }


}
