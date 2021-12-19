package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseSsInterceptor implements a {
    static {
        Covode.recordClassIndex(17128);
    }

    public void a(Request request, u uVar) {
    }

    private static String a(String str) {
        try {
            return e.b(str);
        } catch (Throwable unused) {
            return str;
        }
    }

    private u a(a.AbstractC1036a aVar) {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request a2 = aVar.a();
        try {
            URL url = new URL(a2.getUrl());
            if (url.getProtocol().equals("http")) {
                e.a(url.getHost(), url.getPath(), false);
            }
        } catch (MalformedURLException unused) {
        }
        Request a3 = a(a2);
        if (a3.getMetrics() != null) {
            a3.getMetrics().x.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        u a4 = aVar.a(a3);
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        a(a3, a4);
        if (a3.getMetrics() != null) {
            a3.getMetrics().y.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf2.longValue()));
        }
        return a4;
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return a(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }

    public Request a(Request request) {
        String a2;
        if (request == null) {
            return request;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        String url = request.getUrl();
        if (request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.b) {
            request.getExtraInfo();
            a2 = e.a(url);
        } else {
            a2 = e.a(url);
        }
        if (request.getMetrics() != null) {
            request.getMetrics().z = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        if (request.getUrl().startsWith("https:") && a2.startsWith("http:")) {
            try {
                URL url2 = new URL(a2);
                e.a(url2.getHost(), url2.getPath(), true);
            } catch (Throwable unused) {
            }
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        if (request.isAddCommonParam()) {
            com.bytedance.frameworks.baselib.network.http.a.a aVar = com.bytedance.frameworks.baselib.network.http.a.b.a().f28938a;
            if (aVar == null || !aVar.f28926a) {
                a2 = a(a2);
            } else {
                a2 = com.bytedance.frameworks.baselib.network.http.a.b.a().a(request, a2);
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().A = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Request.a newBuilder = request.newBuilder();
        newBuilder.a(a2);
        return newBuilder.a();
    }
}
