package com.github.qiushijie;

import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {


    @Override
    public void sayHi() {
        System.out.println("hi: foo!");
    }
}
