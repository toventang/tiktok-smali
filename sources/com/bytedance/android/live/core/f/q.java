package com.bytedance.android.live.core.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class q {
    static {
        Covode.recordClassIndex(4662);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        if (str.contains("_")) {
            return str;
        }
        return TextUtils.concat(str, "_", "0").toString();
    }
}
