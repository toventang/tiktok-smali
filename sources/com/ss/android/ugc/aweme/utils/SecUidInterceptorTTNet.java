package com.ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import okhttp3.HttpUrl;

public class SecUidInterceptorTTNet implements a {
    static {
        Covode.recordClassIndex(93259);
    }

    private static u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        HttpUrl parse = HttpUrl.parse(a2.getUrl());
        if (parse != null) {
            gw.a();
            gw.a(parse);
            HttpUrl.Builder newBuilder = parse.newBuilder();
            String[] strArr = gw.f143036b;
            for (String str : strArr) {
                String queryParameter = parse.queryParameter(str);
                if (TextUtils.isEmpty(parse.queryParameter("sec_".concat(String.valueOf(str))))) {
                    String c2 = gw.a().c(queryParameter);
                    if (!TextUtils.isEmpty(c2)) {
                        if (gw.a().b(parse.toString())) {
                            newBuilder.removeAllQueryParameters(str);
                        }
                        newBuilder.setQueryParameter("sec_".concat(String.valueOf(str)), c2);
                    }
                }
            }
            a2 = a2.newBuilder().a(newBuilder.build().toString()).a();
        }
        return aVar.a(a2);
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
