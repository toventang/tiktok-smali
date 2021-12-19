package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;

public final class CommonParamsInitInterceptor implements a {
    static {
        Covode.recordClassIndex(72229);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        System.currentTimeMillis();
        SettingServiceImpl.v().r();
        System.currentTimeMillis();
        u<?> a2 = aVar.a(aVar.a());
        l.b(a2, "");
        return a2;
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
