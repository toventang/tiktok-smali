package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104571a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static Keva f104572b;

    private a() {
    }

    static {
        Covode.recordClassIndex(66994);
        Keva repo = Keva.getRepo("ec_local_sp_keva_name", 0);
        l.b(repo, "");
        f104572b = repo;
    }

    public static void a(String str) {
        l.d(str, "");
        f104572b.storeBoolean(str, false);
    }

    public static boolean b(String str) {
        l.d(str, "");
        return f104572b.getBoolean(str, true);
    }
}
