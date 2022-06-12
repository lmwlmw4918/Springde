import com.github.pagehelper.PageHelper;
import com.itheima.domain.Order;
import com.itheima.mapper.OrderMapper;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisMappe2 {
    public OrderMapper mapper;
    @Before
    public void  before() throws Exception{
        InputStream resource = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = build.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);

    }
    @Test
    public void  test1(){
        List<Order> all = mapper.findAll();
        for (Order order : all) {
            System.out.println(order);
        }

    }
    @Test
    public void  test3(){
        List<Order> all = mapper.findAll();
        for (Order order : all) {
            System.out.println(order);
        }

    }
}
