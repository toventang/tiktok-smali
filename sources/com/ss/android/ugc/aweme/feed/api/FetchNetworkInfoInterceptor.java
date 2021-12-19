package com.ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;

public final class FetchNetworkInfoInterceptor implements a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f91933a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f91934b;

    static {
        Covode.recordClassIndex(57880);
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

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087 A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c A[Catch:{ all -> 0x00b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.retrofit2.u<?> a(com.bytedance.retrofit2.c.a.AbstractC1036a r18) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor.a(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }
}
