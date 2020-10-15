package com.github.qiushijie;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof FooService) {
            System.out.println("MyBeanPostProcess [postProcessBeforeInitialization] beanName: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof FooService) {
            System.out.println("MyBeanPostProcess [postProcessAfterInitialization] beanName: " + beanName);
        }
        return bean;
    }
}
