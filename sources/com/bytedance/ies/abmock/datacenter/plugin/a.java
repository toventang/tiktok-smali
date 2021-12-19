package com.bytedance.ies.abmock.datacenter.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f31837b;

    /* renamed from: a  reason: collision with root package name */
    public Map<BaseConfigPlugin, Boolean> f31838a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(18616);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(1311);
        if (f31837b == null) {
            synchronized (a.class) {
                try {
                    if (f31837b == null) {
                        f31837b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1311);
                    throw th;
                }
            }
        }
        a aVar = f31837b;
        MethodCollector.o(1311);
        return aVar;
    }
}
