package itcast.service;

import itcast.dao.userDao;
import itcast.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class userServiceImp implements userService{
    private userDao userDao;
    private  String name;
    private int age;
    private List<String> list;
    private Map<String, User> map;
    private Properties properties;

    public userServiceImp(String name, int age, List<String> list, Map<String, User> map, Properties properties) {
        this.name = name;
        this.age = age;
        this.list = list;
        this.map = map;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "userServiceImp{" +
                "list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public userServiceImp(userDao userDao) {
        this.userDao = userDao;
    }
    public userServiceImp(){};

    //    public void setUserDao(userDao userDao) {
//        this.userDao = userDao;
//
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void save() {
       userDao.save();
        System.out.println(name+"=="+age);
        System.out.println("==================================");
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
    }}
