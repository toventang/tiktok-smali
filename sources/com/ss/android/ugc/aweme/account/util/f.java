package com.ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(40269);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i2 = 0; i2 < bytes.length; i2++) {
                bytes[i2] = (byte) (bytes[i2] ^ 5);
            }
            return d.a(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }
}
