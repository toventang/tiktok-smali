package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;
import com.bytedance.covode.number.Covode;
import okhttp3.OkHttpClient;

public class OkHttp3Instrumentation {
    static {
        Covode.recordClassIndex(14334);
    }

    public static OkHttpClient init() {
        return new OkHttpClient.Builder().addInterceptor(new AddHeaderInterceptor()).eventListenerFactory(new OkHttpEventFactory(null)).build();
    }

    public static OkHttpClient build(OkHttpClient.Builder builder) {
        return builder.addInterceptor(new AddHeaderInterceptor()).eventListenerFactory(new OkHttpEventFactory(builder.build().eventListenerFactory())).build();
    }
}
