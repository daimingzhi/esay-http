package com.easy.code.http.annotation;

/**
 * @author dmz
 * @date Create in 20:13 2021/5/12
 */
public @interface EasyHeaders {
    EasyHeader[] value() default {};
}
