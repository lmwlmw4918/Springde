package itcast.dao.daoImp;


import itcast.dao.userDao;

public class userDaoImp implements userDao {
    public userDaoImp(){
        System.out.println("对象创建了");
    }
    @Override
    public void save() {
        System.out.println("hello,save");
    }
    public void init(){
        System.out.println("方法初始化了");
    }
    public void destory(){
        System.out.println("方法销毁了");
    }

}
