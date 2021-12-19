package com.ss.android.ugc.aweme.net;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(72187);
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, str2) || str.endsWith(".".concat(String.valueOf(str2)))) {
            return true;
        }
        return false;
    }
}
