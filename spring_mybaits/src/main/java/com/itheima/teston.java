package com.itheima;

import com.itheima.dao.UserMapper;
import com.itheima.dao.UserMapperImp;
import com.itheima.domain.User;

import java.io.IOException;
import java.util.List;

public class teston {
    public static void main(String[] args) throws IOException {
     UserMapperImp userMapperImp=new UserMapperImp();
        List<User> all = userMapperImp.findAll();
        System.out.println(all);
    }
}
