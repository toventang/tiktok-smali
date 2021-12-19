package com.ss.android.ugc.aweme.donation.detail;

import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.al.d;

public final class c implements IInterceptor {
    static {
        Covode.recordClassIndex(51753);
    }

    static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82998a = new a();

        static {
            Covode.recordClassIndex(51754);
        }

        a() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.d.a.c.a(new d(false, false));
        }
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
            java.lang.String r1 = "donation/pannel"
            r0 = 0
            boolean r0 = h.m.p.a(r2, r1, r0)
            return r0
        L_0x0023:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.c.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0131, code lost:
        if (r18 != null) goto L_0x000f;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r17, com.bytedance.router.RouteIntent r18) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.c.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
