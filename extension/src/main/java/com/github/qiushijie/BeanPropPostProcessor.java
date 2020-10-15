package com.github.qiushijie;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPropPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Foo) {
            // 设置 name
            ((Foo) bean).setName("BeanPostProcessor");
        }
        return bean;
    }
}
