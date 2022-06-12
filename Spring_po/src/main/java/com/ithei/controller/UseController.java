package com.ithei.controller;

import com.ithei.domain.Role;
import com.ithei.domain.User;
import com.ithei.service.RoleService;
import com.ithei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UseController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public ModelAndView list(){
      List<User> userList= userService.list();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }
    @Autowired
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/saveUI")
    public ModelAndView saveUI(){
        ModelAndView modelAndView=new ModelAndView();
        List<Role> list = roleService.list();
        modelAndView.addObject("roleList",list);
        modelAndView.setViewName("user-add");

        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(User user ,long[]roleIds){
            userService.save(user,roleIds);
        return "redirect:/user/list";
    }
    @RequestMapping("/del/{userId}")
    public String del(@PathVariable("userId") Long userId ){
        userService.del(userId);

        return "redirect:/user/list";
    }
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
      User user= userService.login(username,password);
      if (user!=null){
          session.setAttribute("user",user);
          return "redirect:/index.jsp";
      }
      return "redirect:/login.jsp";
    }


}
