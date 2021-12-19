package com.bytedance.helios.a.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30631a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f30632b;

    private c() {
    }

    static {
        Covode.recordClassIndex(17791);
    }

    public static final Handler a() {
        Handler handler;
        MethodCollector.i(6472);
        synchronized (c.class) {
            try {
                if (f30632b == null) {
                    f30632b = new Handler(Looper.getMainLooper());
                }
                handler = f30632b;
                if (handler == null) {
                    l.a();
                }
            } finally {
                MethodCollector.o(6472);
            }
        }
        return handler;
    }
}
