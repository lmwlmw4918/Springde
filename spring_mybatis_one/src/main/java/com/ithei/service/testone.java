package com.ithei.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.ithei.dao.UserMapper;
import com.ithei.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.print.DocFlavor;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testone {
//    public static void main(String[] args)  throws Exception{
//        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> all = mapper.findAll();
//        System.out.println(all);
//
//    }
    @Test
    public void test1() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setId(2);
        user.setUsername("lisi");
//        user.setPassword("123");
        List<User> all = mapper.findAll(user);
        System.out.println(all);

    }
    @Test
    public void test2() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        //设置分页相关参数 当前页+每页显示条数

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(50);
        List<User> byids = mapper.findByids(list);
        for (User byid : byids) {
            System.out.println(byid);
        }


    }
    @Test
    public void test3() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setId(4);
        user.setUsername("Bob");
        user.setPassword("123");
        user.setBirthday(new Date());
        mapper.save(user);

    }
    @Test
    public void test4() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        PageHelper.startPage(1,3);
        List<User> userList = mapper.find();



        for (User user : userList) {
            System.out.println(user);
        }
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一个："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一个："+pageInfo.isIsLastPage());
        sqlSession.close();

    }
}
