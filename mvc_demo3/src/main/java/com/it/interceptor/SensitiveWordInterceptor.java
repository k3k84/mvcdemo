package com.it.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

//铭感词拦截器
public class SensitiveWordInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    //跳转到jsp页面时替换铭感词
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       //定义铭感此列表
        String [] sensitiveWords = {"坏人","笨蛋","暴力"};
        //获取model中的所有数据
        Map<String, Object> model = modelAndView.getModel();
        Set<Map.Entry<String, Object>> entries = model.entrySet();
        //遍历model,替换敏感词
        for (Map.Entry<String, Object> entry: entries) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            //将model的值和敏感词列表遍历比对
            for (String sensitiveWord:sensitiveWords) {
                //只要数据模型包含铭感词，替换
                if (value.contains(sensitiveWord)){
                    String newStr = value.replaceAll(sensitiveWord, "***");
                    model.put(key,newStr);
                }
            }
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
