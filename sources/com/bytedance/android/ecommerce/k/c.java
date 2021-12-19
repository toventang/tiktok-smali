package com.bytedance.android.ecommerce.k;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(3430);
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
