package com.xxd.learn.annotations;

import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonValue {

    /**
     * The actual value expression: for example {@code #{systemProperties.myProp}}.
     */
    String value();
}
