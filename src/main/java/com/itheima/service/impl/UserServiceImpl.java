package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {



    /*private List<String> stringList;
        private List<UserDao> userDaoList;
        public void setUserDaoList(List<UserDao> userDaoList) {
            this.userDaoList = userDaoList;
        }
        public void setStringList(List<String> stringList) {
            this.stringList = stringList;
        }*/
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public void show(){
        List<User> all=userMapper.findAll();
        for(User user:all){
            System.out.println(user);
        }
    }
    /*private UserDao userDao;
    //BeanFactory去调用该方法 从容器中获取userDao设置到此处
    public void setUserDao(UserDao userDao){
        System.out.println("BeanFactory去调用该方法 从容器中获取userDao设置到此处"+userDao);
        this.userDao=userDao;
    }*/

}
