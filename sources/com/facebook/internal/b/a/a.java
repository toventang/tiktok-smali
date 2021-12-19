package com.facebook.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f48568a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f48569b = a.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, Object> f48570c = new HashMap();

    static {
        Covode.recordClassIndex(29287);
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            MethodCollector.i(518);
            if (com.facebook.internal.a.b.a.a(a.class)) {
                MethodCollector.o(518);
                return null;
            }
            try {
                if (f48568a == null) {
                    f48568a = new a();
                }
                a aVar = f48568a;
                MethodCollector.o(518);
                return aVar;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
                MethodCollector.o(518);
                return null;
            }
        }
    }
}
