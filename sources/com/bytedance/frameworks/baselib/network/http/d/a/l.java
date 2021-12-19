package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class l implements Interceptor {
    static {
        Covode.recordClassIndex(17087);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Map<String, String> a2 = e.a(request.url().toString(), request.headers().toMultimap());
        if (a2 == null) {
            return chain.proceed(request);
        }
        Request.Builder builder = new Request.Builder();
        builder.url(request.url());
        builder.method(request.method(), request.body());
        builder.tag(request.tag());
        Headers.Builder newBuilder = request.headers().newBuilder();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            newBuilder.add(entry.getKey(), entry.getValue());
        }
        builder.headers(newBuilder.build());
        return chain.proceed(builder.build());
    }
}
