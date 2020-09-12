package com.github.qiushijie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private ComponentHandlerInterceptor componentHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SimpleHandlerInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(componentHandlerInterceptor).addPathPatterns("/*");
    }
}
