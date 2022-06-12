package com.itheima.service;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
public class userServiceImp implements userService{

    @Value("${jdbc.driver}")
    private  String driver;
// <bean name="userDao" class="com.itheima.dao.UserDaoImp"></bean>
//    @Autowired
//    @Qualifier("UserDao")
    @Resource(name ="UserDao")
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void save() {
        userDao.save();;

    }
    @PostConstruct
    public void init(){
        System.out.println("save  执行了");
    }
    @PreDestroy
    public void destory(){
        System.out.println("destory 执行了");
    }
    }

