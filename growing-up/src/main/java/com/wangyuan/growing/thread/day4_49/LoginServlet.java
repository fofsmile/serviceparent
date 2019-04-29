package com.wangyuan.growing.thread.day4_49;

/**
 * @program: serviceparent
 * @description: 非线程安全 测试
 * @author: WangYuan
 * @create: 2019-04-29 23:00
 */
public class LoginServlet {
    private static String name;
    private static String password;
    public static synchronized void doPost(String username,String pass) {
        try {
            name = username;
            if (name.equals("a")) {
                Thread.sleep(5000);
            }
            password = pass;
            System.out.println("name is " + name);
            System.out.println("password is " + password);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }





}
