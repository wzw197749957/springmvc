package com.wzw.mvc.anno;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WzwController {
    String value() default "";
}
