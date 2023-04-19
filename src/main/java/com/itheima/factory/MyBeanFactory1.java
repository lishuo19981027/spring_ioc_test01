package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {

    public  static UserDao userDao(){

        return new UserDaoImpl();
    }
}
