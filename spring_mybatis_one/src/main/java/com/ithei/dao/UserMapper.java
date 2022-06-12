package com.ithei.dao;

import com.ithei.domain.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll(User user);
    public List<User> findByid(int q);
    public List<User> findByids(List<Integer> ids);
    public  void save(User user);
    public List<User> find();
}
