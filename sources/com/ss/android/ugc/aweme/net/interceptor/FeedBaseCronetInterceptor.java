package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.feed.api.e;

public class FeedBaseCronetInterceptor implements a {
    static {
        Covode.recordClassIndex(72235);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public u a(a.AbstractC1036a aVar) {
        return aVar.a(aVar.a());
    }

    private static boolean a(Request request) {
        if (request == null || request.getUrl() == null || !e.a(request.getUrl())) {
            return false;
        }
        return true;
    }

    private u b(a.AbstractC1036a aVar) {
        Request a2 = aVar.a();
        if (!a() || !a(a2)) {
            return aVar.a(aVar.a());
        }
        return a(aVar);
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return b(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u b2 = b(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return b2;
    }
}
