package com.easy.code.http.annotation.scan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dmz
 * @date Create in 23:44 2021/5/12
 */
public @interface EasyClientScan {

    String basePackageName();

    /**
     * 默认只扫描{@link com.easy.code.http.annotation.EasyHttpClient}标注的接口
     * 
     */
    boolean useDefaultFilters() default true;

    EasyClientScan.Filter[] includeFilters() default {};

    EasyClientScan.Filter[] excludeFilters() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({})
    public @interface Filter {

        /**
         *
         */
        Class<?>[] value() default {};

        Class<?>[] classes() default {};

        String[] pattern() default {};
    }
}
