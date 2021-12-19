package com.ss.bytertc.engine.utils;

import android.util.Base64;
import com.a;
import com.bytedance.covode.number.Covode;

public class TokenUtils {
    static {
        Covode.recordClassIndex(101071);
    }

    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            return "Basic " + Base64.encodeToString(a.a("%s:%s:%s", new Object[]{str2, str3, str4}).getBytes(), 2);
        } else if (!str.contains("Basic")) {
            return "Bearer ".concat(String.valueOf(str));
        } else {
            return str;
        }
    }
}
