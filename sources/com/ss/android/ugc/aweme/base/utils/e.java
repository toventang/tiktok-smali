package com.ss.android.ugc.aweme.base.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class e {
    static {
        Covode.recordClassIndex(42130);
    }

    public static void a(String str) {
        r.a(str, new d().a("mobile_model", Build.MODEL).a("mobile_brand", Build.BRAND).a("android_version", Build.VERSION.RELEASE).f66730a);
    }
}
