package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.ss.android.token.c;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class b implements INetReleaseInterceptor {
    static {
        Covode.recordClassIndex(72242);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ArrayList arrayList;
        Request request = chain.request();
        Map a2 = d.a(request.url().toString());
        Headers headers = request.headers();
        if (a2 != null && !a2.isEmpty()) {
            if (headers == null) {
                headers = Headers.of(a2);
            } else {
                Headers.Builder newBuilder = headers.newBuilder();
                for (Map.Entry entry : a2.entrySet()) {
                    newBuilder.add((String) entry.getKey(), (String) entry.getValue());
                }
                headers = newBuilder.build();
            }
        }
        Request.Builder newBuilder2 = request.newBuilder();
        if (headers == null) {
            headers = request.headers();
        }
        Response proceed = chain.proceed(newBuilder2.headers(headers).build());
        Headers headers2 = proceed.headers();
        if (headers2 != null) {
            arrayList = new ArrayList();
            for (String str : headers2.names()) {
                arrayList.add(new c(str, headers2.get(str)));
            }
        } else {
            arrayList = null;
        }
        d.a(request.url().toString(), arrayList);
        return proceed;
    }
}
