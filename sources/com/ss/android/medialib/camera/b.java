package com.ss.android.medialib.camera;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f59716a;

    public interface a {
        static {
            Covode.recordClassIndex(36876);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(36875);
    }

    public static b a() {
        MethodCollector.i(2853);
        if (f59716a == null) {
            synchronized (b.class) {
                try {
                    if (f59716a == null) {
                        f59716a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2853);
                    throw th;
                }
            }
        }
        b bVar = f59716a;
        MethodCollector.o(2853);
        return bVar;
    }
}
