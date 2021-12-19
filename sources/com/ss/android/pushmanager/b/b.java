package com.ss.android.pushmanager.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f60107a;

    static {
        Covode.recordClassIndex(37138);
    }

    public static b a() {
        MethodCollector.i(6602);
        if (f60107a == null) {
            synchronized (b.class) {
                try {
                    if (f60107a == null) {
                        f60107a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6602);
                    throw th;
                }
            }
        }
        b bVar = f60107a;
        MethodCollector.o(6602);
        return bVar;
    }
}
