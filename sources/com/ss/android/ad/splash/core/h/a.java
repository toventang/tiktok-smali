package com.ss.android.ad.splash.core.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f58595b;

    /* renamed from: a  reason: collision with root package name */
    public volatile ExecutorService f58596a;

    static {
        Covode.recordClassIndex(36328);
    }

    public static a a() {
        MethodCollector.i(1713);
        if (f58595b == null) {
            synchronized (a.class) {
                try {
                    if (f58595b == null) {
                        f58595b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1713);
                    throw th;
                }
            }
        }
        a aVar = f58595b;
        MethodCollector.o(1713);
        return aVar;
    }

    public final void a(ExecutorService executorService) {
        if (executorService != null) {
            this.f58596a = executorService;
        }
    }
}
