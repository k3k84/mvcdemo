package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
    @RequestMapping("/m2")
    public String m2(Model model){
     model.addAttribute("name","大笨蛋");
    return "result";
    }
}
