package com.ss.android.ugc.aweme.net.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import h.f.b.l;

public final class TTNetMonitorInterceptor implements a {
    static {
        Covode.recordClassIndex(72272);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        e<Request, u<?>> a2 = n.f112474e.a(new e<>(aVar.a(), null, 62));
        if (a2.f112463f == d.INTERCEPT && a2.f112459b != null) {
            R r = a2.f112459b;
            if (r == null) {
                l.b();
            }
            return r;
        } else if (a2.f112463f != d.EXCEPTION || a2.f112462e == null) {
            Q q = a2.f112458a;
            if (q == null) {
                l.b();
            }
            a2.f112459b = (R) aVar.a(q);
            e<Request, u<?>> b2 = n.f112474e.b(a2);
            if (b2.f112463f != d.EXCEPTION || b2.f112462e == null) {
                R r2 = b2.f112459b;
                if (r2 == null) {
                    l.b();
                }
                return r2;
            }
            RuntimeException runtimeException = b2.f112462e;
            if (runtimeException == null) {
                l.b();
            }
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = a2.f112462e;
            if (runtimeException2 == null) {
                l.b();
            }
            throw runtimeException2;
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
