package com.alta.springdemo;

import com.alta.springdemo.data.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

public class BeanConfiguration {
    private static final Logger log = LoggerFactory.getLogger(BeanConfiguration.class);

    @Bean
    public Hello hello(){
        Hello hello = new Hello();
        log.info("hello bean");
        return hello;
    }

    @Bean
    public Hello hello1(){
        Hello hello = new Hello();
        log.info("hello1 bean");
        return hello;
    }

}
