package com.example.shop.config;

import com.example.shop.interceptor.Interceptor1;
import com.example.shop.interceptor.Interceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers (ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/loginFailed").setViewName("loginFailed");
    }
@Autowired
    private Interceptor1 interceptor1;
    @Autowired
    private Interceptor2 interceptor2;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(interceptor1)
                .addPathPatterns("/home");
        registry.addInterceptor(interceptor2)
                .addPathPatterns("/home");

    }
}
