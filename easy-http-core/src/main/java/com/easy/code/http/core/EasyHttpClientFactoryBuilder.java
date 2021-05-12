package com.easy.code.http.core;

/**
 * 通过{@build()}方法获取一个EasyHttpClientFactory
 * 
 * @author dmz
 * @date Create in 17:55 2021/5/12
 */
public class EasyHttpClientFactoryBuilder {

    public EasyHttpClientFactory build() {
        EasyHttpClientFactory httpClientFactory = new EasyHttpClientFactory();
        return httpClientFactory;
    }

}
