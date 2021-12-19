package com.ss.android.account.token;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.bs.b;
import java.util.ArrayList;
import java.util.Map;

public class TTTokenInterceptor implements a {
    static {
        Covode.recordClassIndex(36193);
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

    private static u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a2.getHeaders());
        Map a3 = d.a(a2.getUrl());
        if (a3 != null && !a3.isEmpty()) {
            for (Map.Entry entry : a3.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    arrayList.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        Request.a newBuilder = a2.newBuilder();
        newBuilder.f42460c = arrayList;
        u a4 = aVar.a(newBuilder.a());
        d.a(a2.getUrl(), TTTokenUtils.a(a4.f42629a.f42476d));
        return a4;
    }
}
