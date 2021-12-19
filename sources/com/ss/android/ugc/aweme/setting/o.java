package com.ss.android.ugc.aweme.setting;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.h.a;

public final class o {
    static {
        Covode.recordClassIndex(80227);
    }

    public static boolean a() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return a.a("aweme_app", "use_dynamic_cover", z);
    }
}
