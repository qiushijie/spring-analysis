package com.github.qiushijie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hi")
    public String sayHello(String name) {
        return "hi, " + name;
    }
}
