package com.github.qiushijie;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DefaultListableBeanFactoryEntry {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建render
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // beans.xml 资源
        ClassPathResource resource = new ClassPathResource("beans.xml");
        // 加载BeanDefinition
        reader.loadBeanDefinitions(resource);
        Simple simple = beanFactory.getBean(Simple.class);
        System.out.println(simple);
    }

}
