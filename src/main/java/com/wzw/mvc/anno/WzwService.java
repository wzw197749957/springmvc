package com.wzw.mvc.anno;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WzwService {
    String value() default "";
}
