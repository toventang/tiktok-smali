package com.bytedance.android.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f23424b;

    /* renamed from: a  reason: collision with root package name */
    Map<String, Set<String>> f23425a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(13944);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(3432);
        if (f23424b == null) {
            synchronized (c.class) {
                try {
                    if (f23424b == null) {
                        f23424b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3432);
                    throw th;
                }
            }
        }
        c cVar = f23424b;
        MethodCollector.o(3432);
        return cVar;
    }
}
