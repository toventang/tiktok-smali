package com.ss.android.ad.splash.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f58939b;

    /* renamed from: a  reason: collision with root package name */
    public long f58940a;

    static {
        Covode.recordClassIndex(36460);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(1338);
        if (f58939b == null) {
            synchronized (b.class) {
                try {
                    if (f58939b == null) {
                        f58939b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1338);
                    throw th;
                }
            }
        }
        b bVar = f58939b;
        MethodCollector.o(1338);
        return bVar;
    }
}
