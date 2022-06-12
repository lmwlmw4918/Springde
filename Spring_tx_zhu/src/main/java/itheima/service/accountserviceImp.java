package itheima.service;
import itheima.dao.accountdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

@Service("accountService")
@Transactional(isolation = Isolation.DEFAULT)
public class accountserviceImp implements accountservice{
  @Autowired
  private accountdao accountdao;


  @Override
  //@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
  public void zhuan(String name, String namec, int money) {
    accountdao.in(name,namec,money);
    int i=1/0;
    accountdao.outc(name,namec,money);
  }
}
