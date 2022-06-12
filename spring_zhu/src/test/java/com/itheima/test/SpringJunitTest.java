package com.itheima.test;

import com.itheima.config.DataSourceConfigration;
import com.itheima.config.SpringConfigfuration;
import com.itheima.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import javax.swing.plaf.ScrollPaneUI;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfigfuration.class})
public class SpringJunitTest {
    @Autowired
    private userService userService;
    @Autowired
    private DataSource dataSource;


    @Test
    public void test1(){
         userService.save();
        }

    @Test
    public void test2() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }
    @Test
    public void ts(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = app.getBean(JdbcTemplate.class);


    }
}
