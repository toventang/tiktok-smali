package com.bytedance.android.monitorV2.l;

import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static long f24021a;

    static {
        Covode.recordClassIndex(14166);
    }

    public static long a() {
        if (f24021a == 0) {
            f24021a = System.currentTimeMillis();
        }
        return f24021a;
    }
}
