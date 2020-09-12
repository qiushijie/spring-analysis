package com.github.qiushijie.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 用于创建复杂bean，用xml配置难以满足的情况下
 * mybatis-spring就提供了SqlSessionFactoryBean供配置使用
 */
public class ToolFactory implements FactoryBean<Tool> {

    private int factoryId;

    private int toolId;

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    @Override
    public Tool getObject() throws Exception {
        return new Tool(toolId);
    }

    @Override
    public Class<?> getObjectType() {
        return Tool.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public String toString() {
        return "ToolFactory{" +
                "factoryId=" + factoryId +
                ", toolId=" + toolId +
                '}';
    }
}
