package com.easy.code.http.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dmz
 * @date Create in 20:07 2021/5/12
 */
public class EasyHttpProxy<T> implements InvocationHandler {

    private final Class<T> mapperInterface;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public EasyHttpProxy(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }
}
