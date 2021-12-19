package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class a implements Interceptor {
    static {
        Covode.recordClassIndex(72241);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        HttpUrl.Builder newBuilder;
        HttpUrl.Builder newBuilder2;
        HttpUrl parse;
        HttpUrl.Builder newBuilder3;
        l.d(chain, "");
        Request request = chain.request();
        String g2 = d.g();
        if (ApiAlisgInterceptorTTNet.f112384b.contains(g2)) {
            String encodedPath = request.url().encodedPath();
            Iterator<T> it = ApiAlisgInterceptorTTNet.f112383a.iterator();
            while (it.hasNext()) {
                l.b(encodedPath, "");
                if (!(!p.b(encodedPath, (String) it.next(), false) || (parse = HttpUrl.parse(request.url().toString())) == null || (newBuilder3 = parse.newBuilder()) == null)) {
                    String host = parse.host();
                    if (!p.b(encodedPath, "/service/2/app_log/", false)) {
                        newBuilder3.host("api-h2.tiktokv.com");
                    } else if ("log-va.tiktokv.com".equals(host)) {
                        newBuilder3.host("log.tiktokv.com");
                    } else if ("rtlog-va.tiktokv.com".equals(host)) {
                        newBuilder3.host("rtlog.tiktokv.com");
                    }
                    request = request.newBuilder().url(newBuilder3.build().toString()).build();
                }
            }
        } else if (ApiAlisgInterceptorTTNet.f112385c.contains(g2)) {
            HttpUrl parse2 = HttpUrl.parse(request.url().toString());
            if (!(parse2 == null || (newBuilder2 = parse2.newBuilder()) == null || !l.a((Object) parse2.host(), (Object) "api-va.tiktokv.com"))) {
                newBuilder2.host("api19-va.tiktokv.com");
                request = request.newBuilder().url(newBuilder2.build().toString()).build();
            }
        } else {
            HttpUrl parse3 = HttpUrl.parse(request.url().toString());
            if (!(parse3 == null || (newBuilder = parse3.newBuilder()) == null || !l.a((Object) parse3.host(), (Object) "api-va.tiktokv.com"))) {
                newBuilder.host("api16-va.tiktokv.com");
                request = request.newBuilder().url(newBuilder.build().toString()).build();
            }
        }
        Response proceed = chain.proceed(request);
        l.b(proceed, "");
        return proceed;
    }
}
