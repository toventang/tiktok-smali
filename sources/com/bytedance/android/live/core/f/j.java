package com.bytedance.android.live.core.f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f9081a;

    static {
        Covode.recordClassIndex(4646);
    }

    public static Handler a() {
        MethodCollector.i(10574);
        if (f9081a == null) {
            synchronized (j.class) {
                try {
                    if (f9081a == null) {
                        f9081a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10574);
                    throw th;
                }
            }
        }
        Handler handler = f9081a;
        MethodCollector.o(10574);
        return handler;
    }

    public static void a(Runnable runnable) {
        a().post(runnable);
    }
}
