package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.facebook.j.a.d;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class NetWorkSpeedInterceptor implements INetReleaseInterceptor {
    static {
        Covode.recordClassIndex(72237);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        d.a.f48738a.a();
        Response proceed = chain.proceed(request);
        d.a.f48738a.b();
        return proceed;
    }
}
