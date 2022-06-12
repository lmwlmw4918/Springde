import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest3 {

    public UserMapper mapper;


    @Before
    public void  before() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = build.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);

    }
    @Test
    public void test1(){
        List<User> l = mapper.findUserAndOrderAll();
        for (User user : l) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        List<User> l = mapper.findUserAndRoleAll();
        for (User user : l) {
            System.out.println(user);
        }
    }


}
