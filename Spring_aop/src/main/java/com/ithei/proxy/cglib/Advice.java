package com.ithei.proxy.cglib;

public class Advice {


    public void before(){
        System.out.println("前置增强");
    }
    public  void afterRetRunning(){



        System.out.println("后置增强");
    }
}
