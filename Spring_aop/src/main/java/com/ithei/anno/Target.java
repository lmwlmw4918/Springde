package com.ithei.anno;


import org.springframework.stereotype.Component;

@Component("target")
public class Target implements Targetinterfece {
    @Override
    public void save() {

        System.out.println("save  running ....");
    }
}
