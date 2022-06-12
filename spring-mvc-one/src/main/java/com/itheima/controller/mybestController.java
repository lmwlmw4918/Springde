package com.itheima.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mybestController {
    @RequestMapping("/save")
    @ResponseBody
    public String  save(){
        System.out.println("save 方法执行了");
        return"{info:springmvc}";
    }


}
