package com.ss.android.ugc.aweme.ck;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

public final class m implements IInterceptor {
    static {
        Covode.recordClassIndex(43789);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0023
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r2 = h.f.b.l.a(r1, r2)
            r1 = 0
            java.lang.String r0 = "mix/detail"
            boolean r0 = h.m.p.b(r2, r0, r1)
            return r0
        L_0x0023:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.m.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }
}
