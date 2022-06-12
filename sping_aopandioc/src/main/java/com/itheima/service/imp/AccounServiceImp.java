package com.itheima.service.imp;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccounServiceImp implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findOne(int i) {
        List<Account> accountList = accountDao.findOne(i);
        return accountList;
    }
}
