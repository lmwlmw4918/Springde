package com.itheima.listener;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ser = sce.getServletContext();
        String co = ser.getInitParameter("contextConfiglocation");
        ApplicationContext app=new ClassPathXmlApplicationContext(co);
            //将spring应用上下文对象存储到servletcontext域中

        ser.setAttribute("app",app);
        System.out.println("spring 容器创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
