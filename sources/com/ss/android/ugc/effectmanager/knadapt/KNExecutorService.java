package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import d.a.b.b.b;
import h.f.b.l;
import java.util.concurrent.ExecutorService;

public final class KNExecutorService implements b {
    private final ExecutorService iExecutor;

    static {
        Covode.recordClassIndex(95546);
    }

    @Override // d.a.b.b.b
    public final void shutdown() {
        this.iExecutor.shutdown();
    }

    public KNExecutorService(ExecutorService executorService) {
        l.c(executorService, "");
        this.iExecutor = executorService;
    }

    public final void execute(Runnable runnable) {
        this.iExecutor.execute(new KNExecutorService$execute$1(runnable));
    }
}
