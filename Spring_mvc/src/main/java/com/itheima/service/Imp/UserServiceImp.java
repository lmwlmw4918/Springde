package com.itheima.service.Imp;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImp implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
