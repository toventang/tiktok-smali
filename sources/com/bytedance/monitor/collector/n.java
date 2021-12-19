package com.bytedance.monitor.collector;

import com.bytedance.covode.number.Covode;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    static long f41574a = -1;

    /* renamed from: b  reason: collision with root package name */
    static long f41575b = -1;

    static {
        Covode.recordClassIndex(25431);
    }

    static long a(String str) {
        try {
            int i2 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i2))).longValue();
        } catch (Throwable unused) {
            return 100;
        }
    }
}
