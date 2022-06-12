package com.itheima.service.test;

import com.itheima.config.SpringConfigfuration;
import com.itheima.service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class userTest {
    @Test
    public void testDemo1(){
       ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfigfuration.class);
        DataSource bean = app.getBean(DataSource.class);
        System.out.println(bean);

    }
}
