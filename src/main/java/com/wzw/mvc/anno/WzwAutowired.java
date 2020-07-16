package com.wzw.mvc.anno;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WzwAutowired {
    String value() default "";
}
