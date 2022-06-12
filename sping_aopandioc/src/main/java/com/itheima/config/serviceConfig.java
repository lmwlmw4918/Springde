package com.itheima.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import({jdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class serviceConfig {
}
