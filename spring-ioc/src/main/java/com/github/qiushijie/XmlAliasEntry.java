package com.github.qiushijie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAliasEntry {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Simple simple = context.getBean("s", Simple.class);
        System.out.println(simple);
    }

}
