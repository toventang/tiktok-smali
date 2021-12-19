package com.bytedance.android.monitorV2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f23837b;

    /* renamed from: a  reason: collision with root package name */
    Map<String, Set<String>> f23838a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(14109);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(11686);
        if (f23837b == null) {
            synchronized (c.class) {
                try {
                    if (f23837b == null) {
                        f23837b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11686);
                    throw th;
                }
            }
        }
        c cVar = f23837b;
        MethodCollector.o(11686);
        return cVar;
    }
}
