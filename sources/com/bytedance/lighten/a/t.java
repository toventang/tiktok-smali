package com.bytedance.lighten.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class t {
    static {
        Covode.recordClassIndex(24618);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return r.b().c(Uri.parse(str));
    }
}
