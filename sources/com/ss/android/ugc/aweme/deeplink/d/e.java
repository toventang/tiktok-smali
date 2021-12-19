package com.ss.android.ugc.aweme.deeplink.d;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;

public final class e {
    static {
        Covode.recordClassIndex(49377);
    }

    public static void a(String str, boolean z, String str2) {
        c a2 = new c().a("url", str).a("errorDesc", str2);
        if (z) {
            b.a("aweme_open_schema_rate", 0, a2.a());
        } else {
            b.a("aweme_open_schema_rate", 1, a2.a());
        }
    }
}
