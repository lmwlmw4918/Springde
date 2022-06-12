package itcast.heima;


import itcast.dao.userDao;
import itcast.service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {

    @Test
    public void beanTestDemo(){
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("appLocationContext.xml");
        userDao oi = app.getBean(userDao.class);
        System.out.println(oi);
    }
    @Test
    public void  beanServiceText(){
         ApplicationContext app=new ClassPathXmlApplicationContext("appLocationContext.xml");
        userService userService =(userService) app.getBean("userService");
        userService.save();
    }
}
