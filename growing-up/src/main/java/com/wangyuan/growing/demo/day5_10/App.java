package com.wangyuan.growing.demo.day5_10;

/**
 * @program: serviceparent
 * @description: starter
 * @author: WangYuan
 * @create: 2019-05-10 14:42
 */
public class App {
    public static void main(String[] args) {
         UserDao dao = new UserDaoImpl();
        UserDaoImpl dao2 = new UserDaoImpl();
        dao.getUser();
        dao.hello();
        dao2.getUser();
        dao2.hello();
    }



}
