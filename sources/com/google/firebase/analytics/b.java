package com.google.firebase.analytics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.nl;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class b extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(33692);
    }

    public final void execute(Runnable runnable) {
        MethodCollector.i(5445);
        super.execute(nl.f51231a.a(runnable));
        MethodCollector.o(5445);
    }

    b(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30, timeUnit, blockingQueue);
    }
}
