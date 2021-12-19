package com.bytedance.apm.ttnet;

import android.os.SystemClock;
import com.bytedance.apm.c.a.d;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import java.util.ArrayList;

public class TTNetSampleInterceptor implements a {
    static {
        Covode.recordClassIndex(14764);
    }

    private static u a(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        if (h.a(a2.headers("x-tt-trace-log")) && d.a.f24718a.f24711e) {
            if (d.a.f24718a.b() && d.a.f24718a.f24710d) {
                return aVar.a(a(a2, "01"));
            }
            if (d.a.f24718a.f24709c == 1 && d.a.f24718a.f24710d) {
                return aVar.a(a(a2, "02"));
            }
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

    private static Request a(Request request, String str) {
        ArrayList arrayList = new ArrayList(request.getHeaders());
        Request.a newBuilder = request.newBuilder();
        arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-trace-log", str));
        newBuilder.f42460c = arrayList;
        return newBuilder.a();
    }
}
