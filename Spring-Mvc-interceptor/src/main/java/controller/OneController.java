package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class OneController {


    @RequestMapping("/target")
    public ModelAndView pco(){
        System.out.println("使目标资源执行");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","布达拉宫");

        modelAndView.setViewName("login");
        return modelAndView;

    }
}
