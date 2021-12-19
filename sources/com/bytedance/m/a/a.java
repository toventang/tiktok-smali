package com.bytedance.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.e.f;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f41308b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, f> f41309a = new HashMap();

    static {
        Covode.recordClassIndex(25311);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(8900);
        if (f41308b == null) {
            synchronized (a.class) {
                try {
                    if (f41308b == null) {
                        f41308b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8900);
                    throw th;
                }
            }
        }
        a aVar = f41308b;
        MethodCollector.o(8900);
        return aVar;
    }
}
