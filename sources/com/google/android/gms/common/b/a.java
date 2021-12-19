package com.google.android.gms.common.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ScheduledExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static AbstractC1209a f50291a;

    /* renamed from: com.google.android.gms.common.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1209a {
        static {
            Covode.recordClassIndex(31348);
        }

        ScheduledExecutorService a();
    }

    static {
        Covode.recordClassIndex(31347);
    }

    public static synchronized AbstractC1209a a() {
        AbstractC1209a aVar;
        synchronized (a.class) {
            MethodCollector.i(9826);
            if (f50291a == null) {
                f50291a = new b();
            }
            aVar = f50291a;
            MethodCollector.o(9826);
        }
        return aVar;
    }
}
