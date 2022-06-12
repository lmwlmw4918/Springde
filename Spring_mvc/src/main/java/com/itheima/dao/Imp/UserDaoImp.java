package com.itheima.dao.Imp;

import com.itheima.dao.UserDao;

public class UserDaoImp implements UserDao {
    @Override
    public void save() {
        System.out.println("save Running");
    }
}
