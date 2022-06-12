package com.itheima.Mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface accountMapper{

    public void save(Account accout);
    public List<Account> findAll();
}
