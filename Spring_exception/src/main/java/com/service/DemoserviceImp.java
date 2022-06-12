package com.service;

import com.exception.MyException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Service
public class DemoserviceImp implements DemoService {
    @Override
    public void show() {
        System.out.println("抛出类型转换异常");
        Object str="shanghai";
        Integer num=(Integer) str;
    }

    @Override
    public void show1() {
        System.out.println("抛出零异常");
        int i=1/0;
    }

    @Override
    public void show2() throws FileNotFoundException {
        System.out.println("文件找不到异常");
        InputStream inputStream=new FileInputStream("C:/xxx/xxx/xxx/xxx.txt");
    }

    @Override
    public void show3() {
        System.out.println("空指针异常");
            String STR=null;
            STR.length();
    }

    @Override
    public void show4() throws MyException {
        System.out.println("自定义异常");
        throw  new MyException();

    }
}
