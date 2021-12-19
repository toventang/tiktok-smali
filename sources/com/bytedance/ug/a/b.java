package com.bytedance.ug.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f45726a;

    static {
        Covode.recordClassIndex(27821);
    }

    b() {
    }

    private static i b() {
        try {
            return new d();
        } catch (Throwable unused) {
            return new n();
        }
    }

    static i a() {
        MethodCollector.i(5684);
        if (f45726a == null) {
            synchronized (b.class) {
                try {
                    if (f45726a == null) {
                        f45726a = b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5684);
                    throw th;
                }
            }
        }
        i iVar = f45726a;
        MethodCollector.o(5684);
        return iVar;
    }
}
