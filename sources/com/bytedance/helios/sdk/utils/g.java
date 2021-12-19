package com.bytedance.helios.sdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.a.a.b;
import java.util.concurrent.Executor;

public final class g extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private static g f31012a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f31013b;

    /* renamed from: c  reason: collision with root package name */
    private static b f31014c;

    static {
        Covode.recordClassIndex(18011);
    }

    private g() {
        super("helios.monitor", 0);
    }

    public static g a() {
        g gVar;
        MethodCollector.i(2380);
        synchronized (g.class) {
            try {
                d();
                gVar = f31012a;
            } finally {
                MethodCollector.o(2380);
            }
        }
        return gVar;
    }

    public static Handler b() {
        Handler handler;
        MethodCollector.i(2381);
        synchronized (g.class) {
            try {
                d();
                handler = f31013b;
            } finally {
                MethodCollector.o(2381);
            }
        }
        return handler;
    }

    public static Executor c() {
        b bVar;
        MethodCollector.i(2382);
        synchronized (g.class) {
            try {
                d();
                bVar = f31014c;
            } finally {
                MethodCollector.o(2382);
            }
        }
        return bVar;
    }

    private static void d() {
        if (f31012a == null) {
            g gVar = new g();
            f31012a = gVar;
            gVar.start();
            f31013b = new Handler(f31012a.getLooper());
            f31014c = new b(f31013b);
        }
    }
}
