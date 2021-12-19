package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ik implements hj {
    static {
        Covode.recordClassIndex(31877);
    }

    private ik() {
    }

    /* synthetic */ ik(byte b2) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.hj
    public final ExecutorService a(ThreadFactory threadFactory) {
        MethodCollector.i(3217);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.o(3217);
        return unconfigurableExecutorService;
    }
}
