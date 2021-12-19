package com.bytedance.android.monitor.l;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static long f23542a;

    static {
        Covode.recordClassIndex(13984);
    }

    public static long a() {
        if (f23542a == 0) {
            f23542a = System.currentTimeMillis();
        }
        return f23542a;
    }
}
