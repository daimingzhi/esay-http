package com.easy.code.http.annotation;

import com.easy.code.http.core.enums.EasyRequestMethod;

/**
 * @author dmz
 * @date Create in 19:18 2021/5/12
 */
public @interface EasyMethod {

	/**
	 * 请求方法
	 */
	EasyRequestMethod method();

	/**
	 * 请求路径
	 */
	String path();
}