package com.ss.android.ugc.aweme.mix.api.response;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.bs.b;

public final class PlaylistTimeGapInterceptor implements a {
    static {
        Covode.recordClassIndex(70313);
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        Request request;
        u<?> uVar;
        T t;
        c cVar;
        Object obj;
        if (aVar != null) {
            try {
                request = aVar.a();
            } catch (Throwable unused) {
                if (aVar != null) {
                    return aVar.a(aVar.a());
                }
                return null;
            }
        } else {
            request = null;
        }
        if (request == null) {
            return null;
        }
        if (aVar != null) {
            uVar = aVar.a(request);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            t = uVar.f42630b;
        } else {
            t = null;
        }
        if (uVar != null) {
            cVar = uVar.f42629a;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            obj = cVar.f42478f;
        } else {
            obj = null;
        }
        if ((t instanceof g) && (obj instanceof com.bytedance.frameworks.baselib.network.http.a)) {
            t.setRequestInfo((com.bytedance.frameworks.baselib.network.http.a) obj);
        }
        return uVar;
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
