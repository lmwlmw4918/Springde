package Test;

import com.itheima.config.serviceConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = serviceConfig.class)
public class test {
    @Autowired
    private AccountService accountService;
    @Test
    public void test1(){
    List<Account> accounts=accountService.findOne(25);
        System.out.println(accounts);
    }

}
