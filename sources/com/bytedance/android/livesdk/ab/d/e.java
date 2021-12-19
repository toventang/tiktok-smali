package com.bytedance.android.livesdk.ab.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static List<Runnable> f13555a = new ArrayList();

    static {
        Covode.recordClassIndex(7512);
    }

    public static synchronized void a() {
        synchronized (e.class) {
            MethodCollector.i(10708);
            try {
                if (!f13555a.isEmpty()) {
                    for (Runnable runnable : f13555a) {
                        runnable.run();
                    }
                }
                f13555a.clear();
                MethodCollector.o(10708);
            } catch (Throwable unused) {
                MethodCollector.o(10708);
            }
        }
    }
}
