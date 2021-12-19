package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.shortvideo.y.a;
import h.f.b.l;

public final class p implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private final String f71152a = "openShoot";

    static {
        Covode.recordClassIndex(43796);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r4 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0022
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = h.f.b.l.a(r1, r2)
            java.lang.String r0 = r3.f71152a
            boolean r0 = h.f.b.l.a(r1, r0)
            return r0
        L_0x0022:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.p.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null || routeIntent.getUri() == null || !(context instanceof Activity)) {
            return true;
        }
        Uri uri = routeIntent.getUri();
        l.b(uri, "");
        a.a((Activity) context, uri);
        return true;
    }
}
