package com.itheima.dao;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImp implements UserDao {
    @Override
    public void save() {
        System.out.println("save running");
    }
}
