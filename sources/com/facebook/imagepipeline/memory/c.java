package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48075a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f48076b = c.class;

    /* renamed from: c  reason: collision with root package name */
    private static int f48077c = 384;

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f48078d;

    static {
        int i2;
        Covode.recordClassIndex(29048);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            i2 = (min / 4) * 3;
        } else {
            i2 = min / 2;
        }
        f48075a = i2;
    }

    public static b a() {
        MethodCollector.i(14637);
        if (f48078d == null) {
            synchronized (c.class) {
                try {
                    if (f48078d == null) {
                        f48078d = new b(f48077c, f48075a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14637);
                    throw th;
                }
            }
        }
        b bVar = f48078d;
        MethodCollector.o(14637);
        return bVar;
    }
}
