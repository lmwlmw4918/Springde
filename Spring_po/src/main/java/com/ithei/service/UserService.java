package com.ithei.service;

import com.ithei.domain.User;

import java.util.List;

public interface UserService {
    public List<User> list() ;

    void save(User user, long[] roleIds);

    void del(Long userId);

    User login(String username, String password);
}
