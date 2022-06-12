package com.ithei.proxy.jdk;

public class Target implements Targetinterfece{
    @Override
    public void save() {
        System.out.println("save  running ....");
    }
}
