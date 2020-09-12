package com.github.qiushijie.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationEntry {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.qiushijie.factorybean");
        Tool tool = applicationContext.getBean(Tool.class);
        System.out.println(tool);
        ToolFactory toolFactory = applicationContext.getBean("&tool", ToolFactory.class);
        System.out.println(toolFactory);
    }

}
