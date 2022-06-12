package com.ithei.test;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    //删除操作
    public void  test3() throws Exception{
        User user=new User();
        user.setId(3);
        user.setUsername("Alan");
        user.setPassword("123");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
        sqlSession.delete("UserMapper.delete",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //修改操作
    public void  test2() throws Exception{
        User user=new User();
        user.setId(3);
        user.setUsername("Alan");
        user.setPassword("123");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
       sqlSession.update("UserMapper.update",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //插入操作
    public void  test1() throws Exception{
        User user=new User();
        user.setId(7);
        user.setUsername("jack");
        user.setPassword("123");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作
       sqlSession.insert("UserMapper.save", user);
//       sqlSession.commit();
        sqlSession.close();
    }
    @Test
    //查询操作
    public void  test() throws Exception{
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
        List<User> userlist = sqlSession.selectList("UserMapper.findAll");

        System.out.println(userlist);
        //释放资源
        sqlSession.close();
    }
    @Test
    //查询操作
    public void  test4() throws Exception {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//       User user= sqlSession.selectOne("UserMapper.findOne",6);
//        System.out.println(user);
//        //执行操作
    }}
