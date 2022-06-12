package com.itheima.controller;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController  {
//    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
//    public String save(){
//        System.out.println("Controller save  running");
//        return "success";
//    }
    @RequestMapping(value = "/quick2")
    public ModelAndView save1(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","itcast");
        modelAndView.setViewName("success");
        System.out.println("Controller save  running");
        return modelAndView;
    }
    @RequestMapping(value = "/quick3")
    public ModelAndView save2(ModelAndView modelAndView){

        modelAndView.addObject("username","itcast");
        modelAndView.setViewName("success");
        System.out.println("Controller save  running");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4")
    public String save3(Model modelc){
        modelc.addAttribute("username","张飞");
        System.out.println("Controller save  running");
        return "success";
    }
    @RequestMapping(value = "/quick5")
    public String save4(HttpServletRequest request){
        request.setAttribute("username","王五");
        System.out.println("Controller save  running");
        return "success";
    }
    @RequestMapping(value = "/quick6")
    @ResponseBody
    public String  save5(){
        System.out.println("Controller save2  running");
        return "good neighbor";
    }
    @RequestMapping(value = "/quick7")
    @ResponseBody
    public String  save6(){

        return "{\'username\':\'zhangshan\',\'age\':28}";
    }
    @RequestMapping(value = "/quick8",produces ="text/html;charset=utf-8" )
    @ResponseBody
    public String  save7() throws JsonProcessingException {
            User user=new User();
            user.setName("张山");
            user.setAge(28);
            //使用json转换工具将对象转换成json格式再返回
        ObjectMapper ob=new ObjectMapper();
        String s = ob.writeValueAsString(user);
        return s;
    }
    @RequestMapping(value = "/quick9")
    @ResponseBody
    //期望spring自动将User转换成json格式的字符串
    public User save8() throws JsonProcessingException {
        User user=new User();
        user.setName("lisi");
        user.setAge(28);

        return user;
    }
    @RequestMapping(value = "/quick10")
    @ResponseBody

    public void save9(String username,int age) throws JsonProcessingException {
        System.out.println(username);
        System.out.println(age);
    }
    @RequestMapping(value = "/quick11")
    @ResponseBody

    public void save10(String[]strs) throws JsonProcessingException {
        System.out.println(Arrays.asList(strs));
    }
    @RequestMapping(value = "/quick12")
    @ResponseBody
    //期望spring自动将User转换成json格式的字符串
    public void save11(VO vo) {
        System.out.println(vo);
    }
    @RequestMapping(value = "/quick13")
    @ResponseBody

    public void save12(@RequestBody List<User> userList) {
        System.out.println(userList);
    }
    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save12(@RequestParam(value = "name",required = false,defaultValue = "六六") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save13(Date date){
        System.out.println(date);
    }
    @RequestMapping(value = "/quick16")
    @ResponseBody
    public void save14(@RequestHeader(value ="User-Agent",defaultValue = "false") String user_Agent){

        System.out.println(user_Agent);
    }
    @RequestMapping(value = "/quick17")
    @ResponseBody
    public void save15(@RequestHeader(value ="User-Agent",defaultValue = "false") String user_Agent){

        System.out.println(user_Agent);
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void save16(String username, MultipartFile uploadFile){

        String name = uploadFile.getOriginalFilename();
        try {
            uploadFile.transferTo(new File("D:\\test\\"+name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
