package com.example.shop.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component

public class Interceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,Object handler) throws Exception{
        System.out.println("Interceptor1======before execution");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,Object handler,
                           ModelAndView modelAndView) throws Exception{
        System.out.println("Interceptor1======execution");
    }
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,Object handler,
                                Exception ex) throws Exception{
        System.out.println("Interceptor1======after execution");
    }
}
