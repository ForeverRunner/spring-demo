package com.xxd.learn.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(UserCondition.class)
public class UserService {

    public void test() {
        System.out.println("test");
    }
}
