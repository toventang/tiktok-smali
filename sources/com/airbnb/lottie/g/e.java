package com.airbnb.lottie.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static a f5653a;

    public interface a {
        static {
            Covode.recordClassIndex(2346);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(2345);
    }

    protected static synchronized void a() {
        synchronized (e.class) {
            MethodCollector.i(6159);
            a aVar = f5653a;
            if (aVar != null) {
                aVar.a();
                f5653a = null;
            }
            MethodCollector.o(6159);
        }
    }
}
