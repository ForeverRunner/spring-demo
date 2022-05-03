package com.xxd.learn.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UserCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getClassLoader().loadClass("com.xxd.learn.service.User");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
