package com.bytedance.android.livesdk.live.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f18671b;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.live.a.a f18672a;

    static {
        Covode.recordClassIndex(10456);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(9980);
        if (f18671b == null) {
            synchronized (a.class) {
                try {
                    if (f18671b == null) {
                        f18671b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9980);
                    throw th;
                }
            }
        }
        a aVar = f18671b;
        MethodCollector.o(9980);
        return aVar;
    }
}
