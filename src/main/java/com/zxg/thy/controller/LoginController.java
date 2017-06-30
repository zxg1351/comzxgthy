package com.zxg.thy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/6/30.
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @RequestMapping(value = "/login.html")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("login");

        return modelAndView;
    }


    @RequestMapping(value = "/login")
    public String userLogin(){

        return "success";
    }
}
