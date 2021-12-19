package com.google.android.gms.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class f implements d {
    static {
        Covode.recordClassIndex(31562);
    }

    private f() {
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    @Override // com.google.android.gms.internal.d.d
    public final ExecutorService a(ThreadFactory threadFactory) {
        MethodCollector.i(14333);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.o(14333);
        return unconfigurableExecutorService;
    }
}
