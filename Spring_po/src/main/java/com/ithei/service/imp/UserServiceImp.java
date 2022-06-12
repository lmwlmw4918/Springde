package com.ithei.service.imp;

import com.ithei.dao.RoleDao;
import com.ithei.dao.UserDao;
import com.ithei.domain.Role;
import com.ithei.domain.User;
import com.ithei.service.UserService;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //分行改装userList中的没哟个user的roles数据
        for (User user : userList) {
            //获得user的id
            Long id = user.getId();
            //将id作为参数查询当前的role集合数据
             List<Role> roleList=roleDao.findByUserid(id);
             user.setRoles(roleList);
        }
        return userList;
    }

    @Override
    public void save(User user, long[] roleIds) {
        //        第一步向sys_user表中存储数据

        long userId = userDao.save(user);
        //        第二步向sys_user_role关系表中存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);
    }

    @Override
    public void del(Long userId) {
    //       删除sys_user_role表
        userDao.delUserRolerel(userId);
    //       删除sys_user表
        userDao.deluser(userId);
    }

    @Override
    public User login(String username, String password) {


        try {
             User user=  userDao.findByUsernameAndPassword(username,password);
             return user;
        } catch (EmptyResultDataAccessException exception) {
           return null;
        }
    }
}
