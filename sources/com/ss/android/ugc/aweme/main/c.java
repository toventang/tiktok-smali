package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.main.c.b;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f109216c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f109217a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f109218b;

    static {
        Covode.recordClassIndex(69937);
    }

    public static c a() {
        MethodCollector.i(1668);
        if (f109216c == null) {
            synchronized (c.class) {
                try {
                    if (f109216c == null) {
                        f109216c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1668);
                    throw th;
                }
            }
        }
        c cVar = f109216c;
        MethodCollector.o(1668);
        return cVar;
    }

    public final void a(boolean z) {
        if (this.f109218b != z) {
            this.f109218b = z;
            com.ss.android.ugc.d.a.c.a(new b());
        }
    }
}
