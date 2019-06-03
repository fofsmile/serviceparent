package com.wangyuan.growing.demo.day5_27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: serviceparent
 * @description: start
 * @author: WangYuan
 * @create: 2019-05-27 11:14
 */
public class App {

    public static Map<String,Object> doFilter(List<User> users) {
        Map map =new HashMap<String,Object>();
        List<User> pingtech = users.stream()
                    .filter(user -> user.getName().equals("pingtech") && user.getAge() == 10)
                    .collect(Collectors.toList());
        users.removeAll(pingtech);
        map.put("pingtech",pingtech);
        map.put("original",users);
        return map;
    }

    public static void main(String[] args) {
        List<User> users = DataMaker.make();
        Map<String, Object> map = doFilter(users);
        System.out.println(map.get("pingtech"));
        System.out.println("---------------------------");
        System.out.println(map.get("original"));


    }


}
