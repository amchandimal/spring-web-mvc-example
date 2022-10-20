package com.chandimal.springwebmvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("")
    String getHome(){
        return "home";
    }

    @GetMapping("/myaccounts")
    String getMyAccounts(){
        return "myaccount";
    }

    @GetMapping("aboutus")
    String getAboutUs(){
        return "aboutus";
    }

}
