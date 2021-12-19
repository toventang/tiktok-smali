package com.ss.android.ugc.aweme.search.ecom;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.mixfeed.b.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.b.c;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class f implements a {

    /* renamed from: f  reason: collision with root package name */
    private static final a f121062f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<Context> f121063a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<User> f121064b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<r> f121065c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<String> f121066d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<String> f121067e;

    static {
        Covode.recordClassIndex(78871);
    }

    static final class a {
        static {
            Covode.recordClassIndex(78872);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static Uri a(Uri uri, String str) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        l.b(queryParameterNames, "");
        if (!(!queryParameterNames.isEmpty()) || queryParameterNames == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!l.a((Object) str2, (Object) str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        l.b(build, "");
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (0 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[LOOP:0: B:10:0x0033->B:12:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.search.ecom.a.a r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecom.f.a(com.ss.android.ugc.aweme.search.ecom.a.a, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.search.ecom.a
    public final void a(com.ss.android.ugc.aweme.search.ecom.a.a aVar, int i2) {
        String str = "";
        l.d(aVar, str);
        r invoke = this.f121065c.invoke();
        Map<String, String> a2 = c.a(this.f121064b.invoke(), aVar, invoke);
        a2.put("item_order", String.valueOf(i2 + 1));
        String str2 = aVar.f121040h;
        String str3 = null;
        if (str2 == null || str2.length() <= 0) {
            String builder = Uri.parse("aweme://webview/").buildUpon().appendQueryParameter("url", aVar.f121041i).appendQueryParameter("title", aVar.f121034b).toString();
            l.b(builder, str);
            SmartRouter.buildRoute(this.f121063a.invoke(), builder).open();
        } else {
            l.d(a2, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(a2);
            String remove = linkedHashMap.remove("enter_from");
            if (remove != null) {
                str = remove;
            }
            linkedHashMap.put("enter_from_info", str);
            linkedHashMap.remove("page_name");
            linkedHashMap.put("source_page_type", "show_window");
            a(aVar, linkedHashMap);
        }
        new com.ss.android.ugc.aweme.search.ecom.b.a().b(a2).f();
        d dVar = (d) ((d) ((d) ((d) b.b(invoke).g(invoke.n)).x(this.f121066d.invoke())).w(this.f121067e.invoke())).r("mt_goods");
        User invoke2 = this.f121064b.invoke();
        if (invoke2 != null) {
            str3 = invoke2.getUid();
        }
        ((d) ((d) dVar.v(str3)).s(aVar.f121034b)).d(Integer.valueOf(i2)).f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends android.content.Context> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(h.f.a.a<? extends Context> aVar, h.f.a.a<? extends User> aVar2, h.f.a.a<r> aVar3, h.f.a.a<String> aVar4, h.f.a.a<String> aVar5) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        l.d(aVar5, "");
        this.f121063a = aVar;
        this.f121064b = aVar2;
        this.f121065c = aVar3;
        this.f121066d = aVar4;
        this.f121067e = aVar5;
    }
}
