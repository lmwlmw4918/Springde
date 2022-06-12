package com.controller;



import com.service.DemoService;
import com.service.DemoserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {


        @Autowired
        private DemoService demoService;
        @RequestMapping(value = "/show")
        public  String show() throws Exception{
            System.out.println("show running");
            demoService.show();

            return "index";

        }




}
