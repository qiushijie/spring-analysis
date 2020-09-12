package com.github.qiushijie;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FooServiceAspect {

    // *代表全部，..代表匹配全部参数
    @Before("execution(void com.github.qiushijie.FooService.sayHi(String))")
    public void beforeSayHi(JoinPoint point) {
        String name = (String) point.getArgs()[0];
        System.out.println("execution FooService sayHi, name: " + name);
    }

    @After("execution(void com.github.qiushijie.FooService.sayHi(String))")
    public void afterSayHi(JoinPoint point) {
        System.out.println("execution FooService sayHi complete");
    }

    @Around("execution(void com.github.qiushijie.FooService.sayHi(String))")
    public void aroundSayHi(ProceedingJoinPoint point) throws Throwable {
        String name = (String) point.getArgs()[0];
        Object[] args = {name + "!"};
        point.proceed(args);
    }

    @Around("execution(boolean com.github.qiushijie.FooService.isOk())")
    public boolean aroundIsOk(ProceedingJoinPoint point) {
        return true;
    }

}
