package com.study.controller;

import com.study.pojo.User;
import com.study.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public ModelAndView test1() {
        System.out.println("this is userTest");
        userService.test();
        return null;
    }

    @RequestMapping("/getUser")
    public String getUser(@RequestParam("username") String username) {
        User user=userService.getUser(username);
        System.out.println(user);
        return "sucesess";
    }
}