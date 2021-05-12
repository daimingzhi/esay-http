package com.easy.code.http.annotation;

/**
 * @author dmz
 * @date Create in 19:09 2021/5/12
 */
public @interface EasyHeader {

    String value();

    /**
     * header key名称
     */
    String headerKey();
}
