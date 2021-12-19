package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.d.d;
import com.ss.android.ugc.aweme.net.d.b;
import h.f.b.l;
import java.util.Set;

public final class CommonTimeOutInterceptor implements a {
    static {
        Covode.recordClassIndex(72230);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        Request a2 = aVar.a();
        Set<String> set = b.f112287b.f112290a;
        l.b(a2, "");
        if (set.contains(a2.getPath())) {
            Object extraInfo = a2.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new d();
                a2.setExtraInfo(extraInfo);
            }
            if (!(extraInfo instanceof com.bytedance.frameworks.baselib.network.http.b)) {
                extraInfo = null;
            }
            com.bytedance.frameworks.baselib.network.http.b bVar = (com.bytedance.frameworks.baselib.network.http.b) extraInfo;
            if (bVar != null) {
                bVar.f28948i = b.f112287b.f112294e;
                bVar.f28945f = b.f112287b.f112291b;
                bVar.f28947h = b.f112287b.f112292c;
                bVar.f28946g = b.f112287b.f112293d;
            }
        }
        u<?> a3 = aVar.a(a2);
        l.b(a3, "");
        return a3;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof com.ss.android.ugc.aweme.bs.b)) {
            return a(aVar);
        }
        com.ss.android.ugc.aweme.bs.b bVar = (com.ss.android.ugc.aweme.bs.b) aVar.c();
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
