package com.wjf.controller;

import com.wjf.domain.User;
import com.wjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "login")
    public String login(HttpServletRequest request, ModelMap map){
    String name=request.getParameter("username");
    String password=request.getParameter("password");
        User user=new User();
        user.setUsername(name);
        user.setPassword(password);
        User u = userService.login(user);
        if(u!=null){
            return "/success";
        }
        return "/index";
    }
}
