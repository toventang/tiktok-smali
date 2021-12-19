package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(14707);
    }

    public static void a(String str, String str2) {
        if (str.length() != 0 && str2 != null && str2.length() != 0 && ((long) str2.length()) > 3072) {
            while (str2.length() > 3072) {
                str2 = str2.replace(str2.substring(0, 3072), "");
            }
        }
    }
}
