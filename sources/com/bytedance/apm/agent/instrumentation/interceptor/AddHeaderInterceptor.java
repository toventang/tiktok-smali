package com.bytedance.apm.agent.instrumentation.interceptor;

import android.text.TextUtils;
import com.bytedance.apm.c.a.d;
import com.bytedance.covode.number.Covode;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddHeaderInterceptor implements Interceptor {
    static {
        Covode.recordClassIndex(14339);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        if (TextUtils.isEmpty(request.header("x-tt-trace-log")) && d.a.f24718a.f24711e) {
            if (d.a.f24718a.b() && d.a.f24718a.f24710d) {
                newBuilder.addHeader("x-tt-trace-log", "01");
            } else if (d.a.f24718a.f24709c == 1 && d.a.f24718a.f24710d) {
                newBuilder.addHeader("x-tt-trace-log", "02");
            }
        }
        return chain.proceed(newBuilder.build());
    }
}
