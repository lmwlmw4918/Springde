package com.service;

import com.exception.MyException;

import java.io.FileNotFoundException;

public interface DemoService {
    void show();
    void show1();
    void show2() throws FileNotFoundException;
    void show3();
    void show4() throws MyException;
}
