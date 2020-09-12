package com.github.qiushijie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopAnnotationEntry {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.qiushijie");
        FooService fooService = applicationContext.getBean(FooService.class);
        fooService.sayHi("J");
        System.out.println("isOk: " + fooService.isOk());
    }

}
