package com.github.qiushijie;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * BeanNameUrlHandlerMapping
 * 找不到url mapping情况下，直接匹配bean名
 */
@Component("/test")
public class BeanNameController {

    @GetMapping
    @ResponseBody
    public String test() {
        return "test";
    }

}
