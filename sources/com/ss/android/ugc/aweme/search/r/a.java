package com.ss.android.ugc.aweme.search.r;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.x;

public abstract class a implements x.a {
    static {
        Covode.recordClassIndex(79185);
    }

    public abstract String a(Aweme aweme, String str, r rVar);

    @Override // com.ss.android.ugc.aweme.utils.x.a
    public final boolean a(Aweme aweme, String str) {
        String str2;
        if (TextUtils.equals(str, "search_result") || TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_ecommerce")) {
            return true;
        }
        if (!TextUtils.equals(str, "trending_page") && !TextUtils.equals(str, "compilation_detail") && !TextUtils.equals(str, "from_city_card")) {
            return false;
        }
        q a2 = am.a();
        if (a2 != null) {
            str2 = a2.c().f121172a;
        } else {
            str2 = "";
        }
        c.a.a("ref_common_search_can_apply_params", str2);
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r6 == null) goto L_0x000b;
     */
    @Override // com.ss.android.ugc.aweme.utils.x.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, com.ss.android.ugc.aweme.utils.dm r6) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0058
            boolean r1 = r6 instanceof com.ss.android.ugc.aweme.search.k.r
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.search.k.r r6 = (com.ss.android.ugc.aweme.search.k.r) r6
            if (r6 != 0) goto L_0x0053
        L_0x000b:
            com.ss.android.ugc.aweme.search.k.q r1 = com.ss.android.ugc.aweme.search.k.am.a()
            if (r1 == 0) goto L_0x003c
            java.util.Map r2 = r1.b()
            if (r2 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.search.k.r$a r1 = com.ss.android.ugc.aweme.search.k.r.F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L_0x003c
            boolean r1 = r2 instanceof java.lang.ref.WeakReference
            if (r1 == 0) goto L_0x003c
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x003c
            boolean r1 = r2 instanceof com.ss.android.ugc.aweme.search.k.r
            if (r1 == 0) goto L_0x003c
            r6 = r2
            com.ss.android.ugc.aweme.search.k.r r6 = (com.ss.android.ugc.aweme.search.k.r) r6
            if (r6 != 0) goto L_0x0053
        L_0x003c:
            if (r4 == 0) goto L_0x0053
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.k.r>> r2 = com.ss.android.ugc.aweme.search.r.b.n
            java.lang.String r1 = r4.getAid()
            java.lang.Object r1 = r2.get(r1)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L_0x0052
            java.lang.Object r0 = r1.get()
            com.ss.android.ugc.aweme.search.k.r r0 = (com.ss.android.ugc.aweme.search.k.r) r0
        L_0x0052:
            r6 = r0
        L_0x0053:
            java.lang.String r0 = r3.a(r4, r5, r6)
            return r0
        L_0x0058:
            r6 = r0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.r.a.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.utils.dm):java.lang.String");
    }
}
