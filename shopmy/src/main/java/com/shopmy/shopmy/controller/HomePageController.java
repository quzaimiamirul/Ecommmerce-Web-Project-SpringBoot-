package com.shopmy.shopmy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {

    @RequestMapping("/homepage")
    @ResponseBody
    public String greet(){
        return "Welcome to Shopmy!";
    }
}
