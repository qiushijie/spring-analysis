package com.github.qiushijie;

import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {

    @Override
    public void sayHi(String name) {
        System.out.println("Hi: " + name);
    }

    @Override
    public boolean isOk() {
        return false;
    }

}
