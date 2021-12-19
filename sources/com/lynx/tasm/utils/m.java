package com.lynx.tasm.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.c;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f57045a;

    static {
        Covode.recordClassIndex(35485);
    }

    public static void b() {
        c.a(a(), "Expected to run on UI thread!");
    }

    public static boolean a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void a(Runnable runnable) {
        MethodCollector.i(13949);
        synchronized (m.class) {
            try {
                if (f57045a == null) {
                    f57045a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.o(13949);
                throw th;
            }
        }
        f57045a.post(runnable);
        MethodCollector.o(13949);
    }

    public static void a(Runnable runnable, Object obj) {
        MethodCollector.i(13951);
        synchronized (m.class) {
            try {
                if (f57045a == null) {
                    f57045a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.o(13951);
                throw th;
            }
        }
        f57045a.removeCallbacks(runnable, obj);
        MethodCollector.o(13951);
    }

    public static void a(Runnable runnable, Object obj, long j2) {
        MethodCollector.i(13950);
        synchronized (m.class) {
            try {
                if (f57045a == null) {
                    f57045a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                MethodCollector.o(13950);
                throw th;
            }
        }
        f57045a.postAtTime(runnable, obj, j2);
        MethodCollector.o(13950);
    }
}
