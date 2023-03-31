package com.it.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor2 implements HandlerInterceptor {
    //请求到达Controller前执行的方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("lanjieqi2请求到达Controller之前");
        return true;
    }
    //跳转到jsp前执行的方法，此时可以添加数据
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("lanjieqi2跳转到jsp之前");
        request.setAttribute("name","上工厂");
    }
    //跳转到jsp之后执行的，此时不能向jsp添加数据
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("lanjieqi2跳转到jsp之后");
        request.setAttribute("age",10);    }
}
