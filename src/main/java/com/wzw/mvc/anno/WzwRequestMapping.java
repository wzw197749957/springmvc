package com.wzw.mvc.anno;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WzwRequestMapping {
    String value() default "";
}
