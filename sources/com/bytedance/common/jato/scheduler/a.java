package com.bytedance.common.jato.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f26878b;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f26879a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(15861);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(14362);
            if (f26878b == null) {
                f26878b = new a();
            }
            aVar = f26878b;
            MethodCollector.o(14362);
        }
        return aVar;
    }
}
