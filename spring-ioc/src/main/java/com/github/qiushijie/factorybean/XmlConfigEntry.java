package com.github.qiushijie.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigEntry {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean-spring-ctx.xml");
        Tool tool = context.getBean(Tool.class);
        System.out.println(tool);
        // &bean获取其工厂类
        ToolFactory toolFactory = context.getBean("&tool", ToolFactory.class);
        System.out.println(toolFactory);
    }

}
