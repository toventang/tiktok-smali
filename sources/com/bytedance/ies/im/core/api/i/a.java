package com.bytedance.ies.im.core.api.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f33993a;

    static {
        Covode.recordClassIndex(20232);
    }

    public static synchronized long a() {
        long currentTimeMillis;
        synchronized (a.class) {
            MethodCollector.i(9251);
            currentTimeMillis = System.currentTimeMillis();
            long j2 = f33993a;
            if (currentTimeMillis <= j2) {
                currentTimeMillis = 1 + j2;
            }
            f33993a = currentTimeMillis;
            MethodCollector.o(9251);
        }
        return currentTimeMillis;
    }
}
