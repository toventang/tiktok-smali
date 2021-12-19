package com.bytedance.webx.b.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(28074);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "webx";
        }
        if (!str.startsWith("webx_")) {
            return "webx_".concat(String.valueOf(str));
        }
        return str;
    }
}
