package com.xxd.learn.spring.context;

import com.xxd.learn.config.AppConfig;
import com.xxd.learn.service.UserService;
import com.xxd.learn.service.UserService1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.test();
        UserService1 userService1 = (UserService1) context.getBean("userService1");
        userService1.test();


    }
}
