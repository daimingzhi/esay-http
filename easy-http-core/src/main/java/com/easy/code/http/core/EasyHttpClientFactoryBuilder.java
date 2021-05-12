package com.easy.code.http.core;

import java.time.Duration;

/**
 * 通过{@build()}方法获取一个EasyHttpClientFactory
 * 
 * @author dmz
 * @date Create in 17:55 2021/5/12
 */
public class EasyHttpClientFactoryBuilder {

    private Duration connectTimeout;

    private Duration readTimeout;

    public EasyHttpClientFactory build() {
        EasyHttpClientFactory httpClientFactory = new EasyHttpClientFactory();
        return httpClientFactory;
    }

}
