package com.easy.code.http.annotation;

/**
 * @author dmz
 * @date Create in 17:56 2021/5/12
 */
public @interface EasyHttpClient {

	String domain() default "";

	String path() default "";

}
