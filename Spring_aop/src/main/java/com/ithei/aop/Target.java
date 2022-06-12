package com.ithei.aop;

public class Target implements Targetinterfece {
    @Override
    public void save() {

        System.out.println("save  running ....");
    }
}
