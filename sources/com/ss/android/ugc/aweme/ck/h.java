package com.ss.android.ugc.aweme.ck;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.utils.dc;
import h.f.b.l;
import java.util.Set;

public final class h implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71134a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43780);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43781);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static Uri a(Uri uri, String str, String str2) {
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                if (!l.a((Object) t, (Object) str)) {
                    clearQuery.appendQueryParameter(t, uri.getQueryParameter(t));
                }
            }
            clearQuery.appendQueryParameter(str, str2);
            Uri build = clearQuery.build();
            l.b(build, "");
            return build;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Boolean valueOf;
        if (routeIntent != null && b.a().a(true, "bundle_dynamic_load", 0) == 1) {
            Uri parse = Uri.parse(routeIntent.getUrl());
            l.b(parse, "");
            if (l.a((Object) parse.getAuthority(), (Object) "reactnative")) {
                String queryParameter = parse.getQueryParameter("channel");
                if (queryParameter != null) {
                    valueOf = Boolean.valueOf(dc.a().contains(queryParameter));
                } else {
                    String queryParameter2 = parse.getQueryParameter("channel_name");
                    if (!(queryParameter2 == null || (queryParameter2 + "_android") == null)) {
                        valueOf = Boolean.valueOf(dc.a().contains(str));
                    }
                }
                if (valueOf == null || !valueOf.booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r7, com.bytedance.router.RouteIntent r8) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.h.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
