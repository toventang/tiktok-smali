package com.ss.android.ugc.aweme.language;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class c {
    static {
        Covode.recordClassIndex(68633);
    }

    public static boolean a() {
        try {
            com.ss.android.ugc.aweme.app.services.c a2 = com.ss.android.ugc.aweme.app.services.c.a(d.a());
            if (TextUtils.isEmpty("enable_region_swtich") || a2.f66887a == null || a2.f66887a.optInt("enable_region_swtich", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }
}
