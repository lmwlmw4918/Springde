package com.itheima.service.imp;

import com.itheima.Mapper.accountMapper;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.List;
@Service("accountService")
@EnableAspectJAutoProxy
public class AccountServiceImp implements AccountService {
  Resource resource=new ClassPathResource("application.xml");
  BeanFactory factory=new XmlBeanFactory(resource);


    @Autowired
    private  accountMapper mapper;

    public AccountServiceImp(accountMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void save(Account account) {
        mapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountList = mapper.findAll();
        return accountList;


    }
}