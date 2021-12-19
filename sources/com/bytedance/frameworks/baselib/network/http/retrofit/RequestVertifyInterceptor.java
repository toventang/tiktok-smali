package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;

public final class RequestVertifyInterceptor implements a {
    static {
        Covode.recordClassIndex(17129);
    }

    private static Request a(Request request) {
        if (request != null && !request.isResponseStreaming()) {
            return b(request);
        }
        return request;
    }

    private static u a(a.AbstractC1036a aVar) {
        s c2 = aVar.c();
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request a2 = a(aVar.a());
        if (c2 != null) {
            c2.x.put("RequestVerifyInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        return aVar.a(a2);
    }

    private static Request b(Request request) {
        try {
            String url = request.getUrl();
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            request.isAddCommonParam();
            Object[] objArr = new Object[1];
            request.getBody();
            if (e.f29334f != null) {
                url = e.f29334f.b(url);
            }
            if (request.getMetrics() != null) {
                request.getMetrics().B = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            Request.a newBuilder = request.newBuilder();
            newBuilder.a(url);
            return newBuilder.a();
        } catch (Throwable unused) {
            return request;
        }
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
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
}
