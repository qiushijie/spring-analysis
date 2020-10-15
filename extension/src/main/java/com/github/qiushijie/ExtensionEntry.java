package com.github.qiushijie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtensionEntry {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.qiushijie");
        getBean();
        changeFooName(applicationContext);
        ((ConfigurableApplicationContext) applicationContext).close();
    }

    private static void getBean() {
        FooService fooService = ApplicationContextHolder.getBean(FooService.class);
        fooService.sayHi();
    }

    private static void changeFooName(ApplicationContext applicationContext) {
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo.getName());
    }

}
