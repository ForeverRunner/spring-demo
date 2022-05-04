package com.xxd.learn.processer;

import com.xxd.learn.annotations.JsonValue;
import com.xxd.learn.common.JsonUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class JsonValueBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonValue.class)) {
                JsonValue annotation = field.getAnnotation(JsonValue.class);
                String value = annotation.value();
                Class<?> declaringClass = field.getType();
                Object objectValue = JsonUtil.parseObject(value, declaringClass);
                try {
                    field.setAccessible(true);
                    field.set(bean, objectValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;
    }
}
