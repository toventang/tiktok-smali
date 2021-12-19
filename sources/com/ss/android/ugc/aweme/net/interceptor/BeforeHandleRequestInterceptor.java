package com.ss.android.ugc.aweme.net.interceptor;

import android.app.Activity;
import android.content.ComponentName;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import h.f.b.l;

public final class BeforeHandleRequestInterceptor implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f112387a;

    static {
        Covode.recordClassIndex(72227);
    }

    public BeforeHandleRequestInterceptor(a aVar) {
        l.d(aVar, "");
        this.f112387a = aVar;
    }

    private u<?> a(a.AbstractC1036a aVar) {
        String str;
        ComponentName componentName;
        l.d(aVar, "");
        Request a2 = aVar.a();
        l.b(a2, "");
        if (com.ss.android.ugc.aweme.net.g.a.a(a2)) {
            return this.f112387a.intercept(aVar);
        }
        Activity j2 = f.j();
        if (j2 == null || (componentName = j2.getComponentName()) == null || (str = componentName.getClassName()) == null) {
            str = "unknown";
        }
        l.b(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        u<?> intercept = this.f112387a.intercept(aVar);
        l.b(intercept, "");
        com.ss.android.ugc.aweme.net.g.a.a(a2, intercept, currentTimeMillis, str);
        return intercept;
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
