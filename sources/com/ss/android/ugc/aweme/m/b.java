package com.ss.android.ugc.aweme.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f109049a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f109050b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f109051c;

    public interface a {
        static {
            Covode.recordClassIndex(69834);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(69833);
    }

    private b() {
        if (f109050b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    public static b a() {
        MethodCollector.i(9003);
        if (f109050b == null) {
            synchronized (f109049a) {
                try {
                    if (f109050b == null) {
                        f109050b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9003);
                    throw th;
                }
            }
        }
        b bVar = f109050b;
        MethodCollector.o(9003);
        return bVar;
    }

    public final void b() {
        MethodCollector.i(9004);
        synchronized (f109049a) {
            try {
                List<a> list = this.f109051c;
                if (list != null) {
                    Iterator<a> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().a()) {
                            it.remove();
                        }
                    }
                    MethodCollector.o(9004);
                }
            } finally {
                MethodCollector.o(9004);
            }
        }
    }
}
