package com.alta.springdemo;

import com.alta.springdemo.data.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @Test
    void testCreateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Hello a = context.getBean("hello",Hello.class);
        Hello b = context.getBean("hello1",Hello.class);
//        Hello c = context.getBean(Hello.class);

        Assertions.assertNotSame(a, b);
    }
}
