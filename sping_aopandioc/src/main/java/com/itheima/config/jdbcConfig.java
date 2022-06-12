package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class jdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.name")
    private String name;
    @Value("${jdbc.password}")
    private String password;
    @Bean
    public DataSource dataSource(){
       DruidDataSource dataSource=new DruidDataSource();
       dataSource.setDriverClassName(driver);
       dataSource.setUrl(url);
       dataSource.setName(name);
       dataSource.setPassword(password);


     return dataSource;
    }
}
