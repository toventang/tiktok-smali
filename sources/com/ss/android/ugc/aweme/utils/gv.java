package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class gv implements Interceptor {
    static {
        Covode.recordClassIndex(93611);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        HttpUrl url = request.url();
        if (url != null) {
            gw.a();
            gw.a(url);
            HttpUrl.Builder newBuilder = url.newBuilder();
            String[] strArr = gw.f143036b;
            for (String str : strArr) {
                String queryParameter = url.queryParameter(str);
                if (TextUtils.isEmpty(url.queryParameter("sec_".concat(String.valueOf(str))))) {
                    String c2 = gw.a().c(queryParameter);
                    if (!TextUtils.isEmpty(c2)) {
                        if (gw.a().b(url.toString())) {
                            newBuilder.removeAllQueryParameters(str);
                        }
                        newBuilder.setQueryParameter("sec_".concat(String.valueOf(str)), c2);
                    }
                }
            }
            request = request.newBuilder().url(newBuilder.build().toString()).build();
        }
        return chain.proceed(request);
    }
}
