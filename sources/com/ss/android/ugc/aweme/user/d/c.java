package com.ss.android.ugc.aweme.user.d;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f142361a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(93112);
    }

    public static SharedPreferences a() {
        SharedPreferences a2 = d.a(a.f62426a, "com.ss.spipe_setting", 0);
        l.b(a2, "");
        return a2;
    }

    private static SharedPreferences b() {
        SharedPreferences a2 = d.a(a.f62426a, "aweme_user", 0);
        l.b(a2, "");
        return a2;
    }

    public static final void a(String str) {
        b().edit().putString("user_info_raw", str).apply();
    }
}
