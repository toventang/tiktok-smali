package com.ss.android.ugc.aweme.search.m;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.search.g;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.search.n.d;
import h.f.b.l;
import java.util.Set;

public final class b implements IInterceptor {
    static {
        Covode.recordClassIndex(79123);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r4 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x004b
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = h.f.b.l.a(r1, r0)
            java.lang.String r0 = "search"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0045
            if (r4 == 0) goto L_0x0047
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.getHost()
        L_0x002f:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r0.getPath()
        L_0x0039:
            java.lang.String r1 = h.f.b.l.a(r1, r2)
            java.lang.String r0 = "search/"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            r1 = r2
            if (r4 == 0) goto L_0x0039
            goto L_0x002f
        L_0x004b:
            r1 = r2
            if (r4 == 0) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            r0 = r2
            goto L_0x0017
        L_0x0051:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.m.b.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle a2;
        Set<String> set = null;
        if (routeIntent == null || routeIntent.getUri() == null || context == null) {
            return false;
        }
        Uri uri = routeIntent != null ? routeIntent.getUri() : null;
        Intent extra = routeIntent.getExtra();
        Bundle a3 = extra != null ? a(extra) : null;
        Intent extra2 = routeIntent.getExtra();
        if (!(extra2 == null || (a2 = a(extra2)) == null)) {
            set = a2.keySet();
        }
        if (!(a3 == null || set == null)) {
            Uri.Builder buildUpon = uri.buildUpon();
            for (T t : set) {
                Object a4 = a(a3, t);
                if (a4 == null) {
                    a4 = "";
                }
                buildUpon.appendQueryParameter(t, String.valueOf(a4));
            }
            uri = buildUpon.build();
        }
        l.b(uri, "");
        Bundle animationBundle = routeIntent.getAnimationBundle();
        l.d(context, "");
        l.d(uri, "");
        b.a newBuilder = com.ss.android.ugc.aweme.search.model.b.Companion.newBuilder();
        d a5 = a.a(uri, newBuilder);
        com.ss.android.ugc.aweme.search.model.b a6 = newBuilder.a();
        com.ss.android.ugc.aweme.search.model.d dVar = new com.ss.android.ugc.aweme.search.model.d();
        a.a(uri, dVar);
        dVar.setSearchEnterParam(a6);
        g.a(context, dVar, a6, animationBundle, a5);
        return true;
    }
}
