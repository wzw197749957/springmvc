package com.wzw.mvc.anno;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WzwSecurity {
    String[] value() default {};
}
