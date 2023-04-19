package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {

    public  UserDao userDao(){

        return new UserDaoImpl();
    }
}
