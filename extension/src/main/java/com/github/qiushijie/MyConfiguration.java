package com.github.qiushijie;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
public class MyConfiguration {

    @EventListener(ContextRefreshedEvent.class)
    public void onStart(ContextRefreshedEvent event) {
        System.out.println("[@EventListener] application start complete");
    }

}
