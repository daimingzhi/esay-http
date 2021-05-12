package com.easy.code.http.annotation;

/**
 * @author dmz
 * @date Create in 17:56 2021/5/12
 */
public @interface EasyHttpClient {

    String value() default "";

    String rootUrl() default "";

    int connectTimeout() default -1;

    int readTimeout() default -1;
}
