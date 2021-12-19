package com.bytedance.helios.a.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private static a f30627a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f30628b;

    /* renamed from: c  reason: collision with root package name */
    private static b f30629c;

    static {
        Covode.recordClassIndex(17789);
    }

    private a() {
        super("helios.bg", 10);
    }

    public static a a() {
        a aVar;
        MethodCollector.i(3921);
        synchronized (a.class) {
            try {
                c();
                aVar = f30627a;
            } finally {
                MethodCollector.o(3921);
            }
        }
        return aVar;
    }

    public static Handler b() {
        Handler handler;
        MethodCollector.i(3922);
        synchronized (a.class) {
            try {
                c();
                handler = f30628b;
            } finally {
                MethodCollector.o(3922);
            }
        }
        return handler;
    }

    private static void c() {
        if (f30627a == null) {
            a aVar = new a();
            f30627a = aVar;
            aVar.start();
            f30628b = new Handler(f30627a.getLooper());
            f30629c = new b(f30628b);
        }
    }
}
