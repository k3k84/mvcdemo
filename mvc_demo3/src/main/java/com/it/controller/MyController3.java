package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController3 {
    @RequestMapping("/m3")
    @ResponseBody
    @CrossOrigin("http://localhost:8080")
    public String m3(Model model){
            System.out.println("测试跨域请求");
         return "cross!";
    }
}
