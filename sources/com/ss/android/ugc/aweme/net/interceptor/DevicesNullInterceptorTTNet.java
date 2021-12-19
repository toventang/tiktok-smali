package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import okhttp3.HttpUrl;

public class DevicesNullInterceptorTTNet implements a {
    static {
        Covode.recordClassIndex(72232);
    }

    private static u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        HttpUrl parse = HttpUrl.parse(a2.getUrl());
        HttpUrl.Builder newBuilder = parse.newBuilder();
        if (TextUtils.equals("", parse.queryParameter("device_id"))) {
            newBuilder.removeAllQueryParameters("device_id");
            parse = newBuilder.build();
        }
        return aVar.a(a2.newBuilder().a(parse.toString()).a());
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
}
