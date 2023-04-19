package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        //创建读取器（XML文件）
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        //读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");
        //根据id获取Bean实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        //System.out.println(userService);

        UserDao userDao  = (UserDao) beanFactory.getBean("userDao");
        //System.out.println(userDao);

    }
}
