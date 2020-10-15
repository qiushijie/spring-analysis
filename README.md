spring源码分析
---

> 本文源码基于spring 5.2.8版本

# ioc容器结构

ApplicationContext提供应用上下文，包含事件机制和BeanFactory等。BeanFactory负责bean的注册创建和管理，是ioc容器功能实现的核心。BeanDefinition是BeanFactory中bean定义的结构，bean的定义可以是xml也可以是注解，BeanFactory根据BeanDefinition创建和管理对应的bean。BeanDefinition的读取由BeanDefinitionReader接口完成，BeanDefinition的注册由BeanDefinitionRegistry接口完成。

## BeanDefinition
属性列表：
> 全部属性请查看源码，这里只是列举常用的部分

