package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类时spring的核心配置类
@Configuration
//  <context:component-scan base-package="com"/>
@ComponentScan("com")
//   <context:property-placeholder location="classpath:jdbc.properties"/>
@Import(DataSourceConfigration.class)
public class SpringConfigfuration {

}
