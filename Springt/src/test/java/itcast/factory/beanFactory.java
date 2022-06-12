package itcast.factory;

import itcast.dao.daoImp.userDaoImp;
import itcast.dao.userDao;
public class beanFactory {
    public  userDao getUser(){
        return new userDaoImp();
    }
}
