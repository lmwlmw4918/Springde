package itheima.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import itheima.service.accountservice;




public class accountController {

    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        accountservice bean = app.getBean(accountservice.class);
        bean.zhuan("zhangshan","lisi",500);
    }
}
