package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import d.a.b.b.b;
import h.f.b.l;
import java.util.concurrent.Executor;

public final class KNExecutor implements b {
    private final Executor iExecutor;

    static {
        Covode.recordClassIndex(95544);
    }

    @Override // d.a.b.b.b
    public final void shutdown() {
    }

    public KNExecutor(Executor executor) {
        l.c(executor, "");
        this.iExecutor = executor;
    }

    public final void execute(Runnable runnable) {
        this.iExecutor.execute(new KNExecutor$execute$1(runnable));
    }
}
