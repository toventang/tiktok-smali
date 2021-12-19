package com.ss.android.ugc.aweme.ug.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class a {
    static {
        Covode.recordClassIndex(92623);
    }

    static SharedPreferences a() {
        return d.a(com.bytedance.ies.ugc.appcontext.d.a(), "apps_flyer_cache", 0);
    }

    static SharedPreferences.Editor b() {
        return a().edit();
    }

    public static long c() {
        return a().getLong("active_time", 0);
    }

    static void a(String str, boolean z) {
        b().putBoolean(str, z).apply();
    }
}
