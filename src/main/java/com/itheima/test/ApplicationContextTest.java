package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ApplicationContextTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userservice = applicationContext.getBean(UserService.class);
        userservice.show();
    }
}
