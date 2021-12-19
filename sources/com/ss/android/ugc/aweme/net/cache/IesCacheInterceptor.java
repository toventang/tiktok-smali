package com.ss.android.ugc.aweme.net.cache;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import h.f.b.l;

public final class IesCacheInterceptor implements a {
    static {
        Covode.recordClassIndex(72135);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        Request.a newBuilder = aVar.a().newBuilder();
        Request a2 = aVar.a();
        l.b(a2, "");
        String url = a2.getUrl();
        l.b(url, "");
        Request a3 = newBuilder.a(k.class, new k(url)).a();
        l.b(a3, "");
        u<?> a4 = a.a(a3);
        if (a4 == null) {
            b.a(a3, false);
            u<?> a5 = aVar.a(a3);
            l.b(a5, "");
            a.a(a3, a5);
            return a5;
        }
        b.a(a3, true);
        return a4;
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
        u<?> a2 = a(aVar);
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
