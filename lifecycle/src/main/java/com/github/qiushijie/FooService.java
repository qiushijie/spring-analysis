package com.github.qiushijie;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FooService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private FooDto fooDto;

    public FooService() {
        System.out.println("FooService [constructor]");
    }

    /**
     *
     */
    @Autowired
    public void setFooDto(FooDto fooDto) {
        System.out.println("FooService [setFooDto]");
        this.fooDto = fooDto;
    }

    /**
     * BeanNameAware
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("FooService [setBeanName]");
    }

    /**
     * BeanFactoryAware
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("FooService [setBeanFactory]");
    }

    /**
     * ApplicationContextAware
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("FooService [setApplicationContext]");
    }

    @PostConstruct
    public void init() {
        System.out.println("FooService [init]");
    }

    /**
     * InitializingBean
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("FooService [afterPropertiesSet]");
    }

    /**
     * DisposableBean
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("FooService [destroy]");
    }
}
