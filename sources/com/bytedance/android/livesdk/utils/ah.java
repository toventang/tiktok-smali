package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;

public final class ah {
    static {
        Covode.recordClassIndex(13129);
    }

    public static long a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
