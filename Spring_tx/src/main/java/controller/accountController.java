package controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.accountservice;
public class accountController {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        accountservice bean = applicationContext.getBean(accountservice.class);
       bean.zhuan("zhangshan","lisi",500);

    }
}
