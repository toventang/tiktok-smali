package com.ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.e.p;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class g {

    /* renamed from: a */
    public static final g f121124a = new g();

    /* renamed from: b */
    private static long f121125b;

    private g() {
    }

    static {
        Covode.recordClassIndex(78897);
    }

    private static boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        f121125b = currentTimeMillis;
        if (currentTimeMillis - f121125b >= 1000) {
            return true;
        }
        return false;
    }

    public static void a(Context context, d dVar, b bVar, Bundle bundle, com.ss.android.ugc.aweme.search.n.d dVar2) {
        String str;
        l.d(dVar, "");
        if (a() && context != null) {
            com.ss.android.ugc.aweme.search.l.l.f121431a = System.currentTimeMillis();
            com.ss.android.ugc.aweme.discover.j.l.a();
            com.ss.android.ugc.aweme.search.l.a.d.f121338a.a();
            if (dVar.getKeyword() != null) {
                com.ss.android.ugc.aweme.search.s.b.a(dVar);
                com.ss.android.ugc.aweme.search.e.d.f121005a.b();
            }
            dVar.setSearchEnterParam(bVar);
            boolean z = true;
            String str2 = null;
            int i2 = 0;
            if (!TextUtils.isEmpty(dVar.getSwitchTab())) {
                String switchTab = dVar.getSwitchTab();
                l.b(switchTab, "");
                Integer valueOf = Integer.valueOf(j.b(switchTab));
                if (valueOf.intValue() >= 0 && valueOf != null) {
                    i2 = valueOf.intValue();
                }
                if (dVar.getFilterOption().isDefaultOption()) {
                    c.a(new p(i2));
                } else {
                    c.a(new p(i2, dVar.getFilterOption()));
                }
            } else {
                boolean a2 = MSAdaptionService.c().a(context);
                if (bVar != null) {
                    str = bVar.getEnterSearchFrom();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, "homepage_hot")) {
                    if (bVar != null) {
                        str2 = bVar.getEnterSearchFrom();
                    }
                    if (!TextUtils.equals(str2, "homepage_follow")) {
                        z = false;
                    }
                }
                if (!(context instanceof Activity) || a2 || z) {
                    SearchResultActivity.a.a(context, dVar, bVar, null, dVar2);
                    return;
                }
                if (bundle == null) {
                    bundle = androidx.core.app.b.a((Activity) context, new e[0]).a();
                }
                SearchResultActivity.a.a(context, dVar, bVar, bundle, dVar2);
            }
        }
    }
}
