package com.wangyuan.growing.demo.day5_5;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @program: serviceparent
 * @description: test hashcode
 * @author: WangYuan
 * @create: 2019-05-05 17:20
 */
@Data
public class Demo4 {
    private String userName;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo4 demo4 = (Demo4) o;
        return Objects.equals(userName, demo4.userName) &&
                Objects.equals(password, demo4.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }


    public static void main(String[] args) {
        int[] i =   new int[]{1,2,3,4,5};
        List<int[]> ints = Arrays.asList(i);

//        for (int i1 = 0; i1 < list.size(); i1++) {
//            System.out.println(list.get(i1)[1]);
//        }
        //int i1 = list.indexOf(3);

        //System.out.println(i1);
    }
}
