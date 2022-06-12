package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperImp implements UserMapper {
    @Override
    public List<User> findAll() throws IOException {

//        User user =new User();
//        user.setId(6);
//        user.setUsername("xiongda");
//        user.setPassword("123");

        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sessionFactory.openSession(true);
        List<User> user = sqlSession.selectList("UserMapper.findAll");

        return user;
    }
}
