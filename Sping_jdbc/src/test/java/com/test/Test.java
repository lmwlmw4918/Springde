package com.test;

import com.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.beans.BeanProperty;
import java.util.List;

public class Test {


    @org.junit.Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        jdbc.update("insert into account values(?,?)", new Object[]{"Alan", 21});

    }

    @org.junit.Test
    public void test2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        jdbc.update("update account set age=? where name=?",new Object[]{"19","tom"});

    }
    @org.junit.Test
    public void test3() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        jdbc.update("delete from account where name=?",new Object[]{"tony"});

    }
    @org.junit.Test
    public void test4() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        List<User> query = jdbc.query("select * from account", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(query);

    }
    @org.junit.Test
    public void test5() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = app.getBean(JdbcTemplate.class);
        User user = jdbc.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<User>(User.class), "tom");
        System.out.println(user);
    }
}