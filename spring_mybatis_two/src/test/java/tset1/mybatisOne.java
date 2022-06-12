package tset1;

import com.itheima.dao.OrderMapper;
import com.itheima.dao.UserMapper;
import com.itheima.domain.Order;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class mybatisOne {
    @Test
    public void test4()throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findUserAllRole();
        for (User user:all){
            System.out.println(user);
        }
        sqlSession.close();



    }
    @Test
    public void test2()throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
       for (User user:all){
           System.out.println(user);
       }
       sqlSession.close();
    }

        @Test
    public void test1()throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
       OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            List<Order> all = mapper.findAll();
            System.out.println(all);
        }
    @Test
    public void test3()throws Exception{

            int arry[]={1,6,5,4,3,11};

        for (int i = 1; i < arry.length; i++) {
            for (int j=0;j<arry.length-i;j++){
                if (arry[j]>arry[j+1]){
                    int num;
                    num=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=num;
                }
            }
            }
        for (int i : arry) {
            System.out.println(i);
        }

        }
    }

