package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/m1")
    public String m1(){
        System.out.println("控制器方法");
        return "result";
    }
}
