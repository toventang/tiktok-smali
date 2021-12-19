package com.ss.android.ugc.aweme.feed.f;

import android.webkit.CookieManager;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.e;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final String f93108a = (com.ss.android.c.b.f59141e + "/aweme/v2/feed/");

    /* renamed from: b  reason: collision with root package name */
    public static final a f93109b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f93110c = i.a((h.f.a.a) C2262a.f93112a);

    public static String a() {
        return (String) f93110c.getValue();
    }

    private a() {
    }

    public static String b() {
        if (!l.a((Object) com.ss.android.ugc.aweme.feed.cache.h.g(), (Object) a())) {
            return null;
        }
        com.ss.android.ugc.aweme.feed.cache.h.h();
        return com.ss.android.ugc.aweme.feed.cache.h.h();
    }

    static {
        Covode.recordClassIndex(59047);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f.a$a  reason: collision with other inner class name */
    static final class C2262a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2262a f93112a = new C2262a();

        static {
            Covode.recordClassIndex(59048);
        }

        C2262a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (r1 != null) goto L_0x0046;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
            if (r2 != null) goto L_0x0032;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.String invoke() {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.f.a.C2262a.invoke():java.lang.Object");
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f93113a;

        static {
            Covode.recordClassIndex(59049);
        }

        b(String str) {
            this.f93113a = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            String cookie = CookieManager.getInstance().getCookie(this.f93113a);
            String str = this.f93113a;
            l.b(cookie, "");
            a.a(str, cookie);
            return z.f158842a;
        }
    }

    public static String a(String str) {
        k.a();
        k.a(d.a());
        k a2 = k.a();
        l.b(a2, "");
        if (!a2.c()) {
            e a3 = k.a().a(new com.bytedance.frameworks.baselib.network.http.d.a.b.l(str, "get"));
            if (a3 == null || !(!l.a((Object) str, (Object) a3.f29188a)) || !com.bytedance.frameworks.baselib.network.http.g.i.b(a3.f29188a)) {
                return str;
            }
            String str2 = a3.f29188a;
            l.b(str2, "");
            return str2;
        }
        String a4 = k.a().a(str);
        if (!(!l.a((Object) str, (Object) a4)) || !com.bytedance.frameworks.baselib.network.http.g.i.b(a4)) {
            return str;
        }
        l.b(a4, "");
        return a4;
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.feed.cache.h.g(str);
        com.ss.android.ugc.aweme.feed.cache.h.h(str2);
    }
}
