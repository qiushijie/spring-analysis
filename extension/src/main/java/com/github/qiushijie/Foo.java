package com.github.qiushijie;

import org.springframework.stereotype.Component;

@Component
public class Foo {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
