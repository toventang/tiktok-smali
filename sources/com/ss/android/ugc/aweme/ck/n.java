package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

public final class n implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71138a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43790);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43791);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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
            java.lang.String r0 = "chatting/message"
            boolean r0 = h.f.b.l.a(r0, r1)
            return r0
        L_0x0022:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.n.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            com.ss.android.ugc.aweme.commercialize.im.a aVar = com.ss.android.ugc.aweme.commercialize.im.a.f74476a;
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            aVar.a(activity, str2);
            return true;
        }
        com.ss.android.ugc.aweme.commercialize.im.a aVar2 = com.ss.android.ugc.aweme.commercialize.im.a.f74476a;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        aVar2.a((Activity) null, str);
        return true;
    }
}
