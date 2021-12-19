package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class c implements b {
    static {
        Covode.recordClassIndex(31578);
    }

    private c() {
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.google.android.gms.internal.g.b
    public final ExecutorService a(ThreadFactory threadFactory) {
        MethodCollector.i(3987);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.o(3987);
        return unconfigurableExecutorService;
    }
}
