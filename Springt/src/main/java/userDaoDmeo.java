import it.heima.userDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userDaoDmeo {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("appLocationContext.xml");
        userDao userDao = (userDao) app.getBean("userDao");
        userDao.save();
    }
}
