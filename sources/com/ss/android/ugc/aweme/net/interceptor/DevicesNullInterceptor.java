package com.ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.IReleaseInterceptor;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class DevicesNullInterceptor implements IReleaseInterceptor {
    static {
        Covode.recordClassIndex(72231);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (TextUtils.equals("", request.url().queryParameter("device_id"))) {
            request = request.newBuilder().url(request.url().newBuilder().removeAllQueryParameters("device_id").build()).build();
        }
        return chain.proceed(request);
    }
}
