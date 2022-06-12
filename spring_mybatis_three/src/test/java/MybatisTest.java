import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

   public UserMapper mapper;


    @Before
    public void  before() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = build.openSession(true);
       mapper = sqlSession.getMapper(UserMapper.class);

    }
    @Test
    public void Test1(){
        User user=new User();
        user.setId(7);
        user.setUsername("Dave");
        user.setPassword("123");
        mapper.save(user);
    }
    @Test
    public void Test2(){

        User user=new User();
        user.setId(7);
        user.setUsername("chengsheng");
        user.setPassword("123");
        mapper.update(user);
    }
    @Test
    public void Test3(){

        User user=new User();
        user.setId(6);
        user.setUsername("chengsheng");
        user.setPassword("123");
        mapper.delete(7);
    }
    @Test
    public void Test4(){
        User u = mapper.findById(6);
        System.out.println(u);
    }
    @Test
    public void Test5(){
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
