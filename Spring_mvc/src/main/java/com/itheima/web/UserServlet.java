package com.itheima.web;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext ser = request.getServletContext();
//        ApplicationContext app = (ApplicationContext) ser.getAttribute("app");
        WebApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(ser);
        UserService bean = app.getBean(UserService.class);
        bean.save();

    }
}
