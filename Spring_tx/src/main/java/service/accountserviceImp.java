package service;
import dao.accountdao;
public class accountserviceImp implements accountservice{

  private accountdao accountdao;

  public void setAccountdao(dao.accountdao accountdao) {
    this.accountdao = accountdao;
  }


  @Override
  public void zhuan(String name, String namec, int money) {
    accountdao.in(name,namec,money);
    int i=1/0;
    accountdao.outc(name,namec,money);
  }
}
