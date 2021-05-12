package com.easy.code.http.annotation;

import com.easy.code.http.core.enums.EasyRequestMethod;

/**
 * @author dmz
 * @date Create in 19:18 2021/5/12
 */
public @interface EasyMethod {

	EasyRequestMethod method();

	String url();
}
