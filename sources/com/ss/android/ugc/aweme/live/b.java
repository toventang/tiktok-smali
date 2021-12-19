package com.ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f108334a;

    static {
        Covode.recordClassIndex(69409);
    }

    private b() {
    }

    public static f a() {
        MethodCollector.i(10404);
        if (f108334a == null) {
            synchronized (b.class) {
                try {
                    if (f108334a == null) {
                        f108334a = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10404);
                    throw th;
                }
            }
        }
        f fVar = f108334a;
        MethodCollector.o(10404);
        return fVar;
    }
}
