package itcast.heima;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class jdbcpo {
    @Test
    public void jdbcc3p0() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/students?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void jdbcdruid() throws SQLException {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/students?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        dataSource.close();
    }
    @Test
    public void  jdbcprdru() throws SQLException{
        ResourceBundle rb= ResourceBundle.getBundle("jdbc");
        String driver=rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String name = rb.getString("jdbc.name");
        String password = rb.getString("jdbc.password");;

        DruidDataSource dataSource=new DruidDataSource();
          dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(name);
        dataSource.setPassword(password);
        DruidPooledConnection cd = dataSource.getConnection();
        System.out.println(cd);
    }
    @Test
    public  void  jdbcpom() throws SQLException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource da = app.getBean(DataSource.class);
        Connection connection = da.getConnection();
        System.out.println(connection);


    }
}
