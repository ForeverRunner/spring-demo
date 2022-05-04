package com.xxd.learn.service;

import com.xxd.learn.annotations.JsonValue;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(UserCondition.class)
public class UserService {
    @JsonValue("{\"name\":\"zhangsan\",\"age\":24}")
    private User user;

    public void test() {
        System.out.println(user);
    }
}
