package com.bytedance.ttnet.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f44593b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f44594a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(27282);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(6830);
            if (f44593b == null) {
                f44593b = new a();
            }
            aVar = f44593b;
            MethodCollector.o(6830);
        }
        return aVar;
    }
}
