package com.bytedance.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f41322c;

    /* renamed from: a  reason: collision with root package name */
    final Map<String, String> f41323a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Map<String, String> f41324b = new HashMap();

    static {
        Covode.recordClassIndex(25319);
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(7706);
        if (f41322c == null) {
            synchronized (d.class) {
                try {
                    if (f41322c == null) {
                        f41322c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7706);
                    throw th;
                }
            }
        }
        d dVar = f41322c;
        MethodCollector.o(7706);
        return dVar;
    }

    public final String a(String str) {
        String str2 = this.f41323a.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
