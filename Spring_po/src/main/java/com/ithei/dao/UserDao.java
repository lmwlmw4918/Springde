package com.ithei.dao;

import com.ithei.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

  long save(User user);

    void saveUserRoleRel(Long id, long[] roleIds);

    void deluser(Long userId);

    void delUserRolerel(Long userId);

    User findByUsernameAndPassword(String username, String password);
}
