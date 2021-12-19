package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class y implements ae {

    /* renamed from: a  reason: collision with root package name */
    private static y f48115a;

    static {
        Covode.recordClassIndex(29074);
    }

    private y() {
    }

    public static synchronized y a() {
        y yVar;
        synchronized (y.class) {
            MethodCollector.i(14445);
            if (f48115a == null) {
                f48115a = new y();
            }
            yVar = f48115a;
            MethodCollector.o(14445);
        }
        return yVar;
    }
}
