package com.facebook.common.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public final class c extends b implements g {
    static {
        Covode.recordClassIndex(28615);
    }

    public c(Executor executor) {
        super("SerialExecutor", executor, new LinkedBlockingQueue());
    }

    @Override // com.facebook.common.b.b
    public final synchronized void execute(Runnable runnable) {
        MethodCollector.i(1624);
        super.execute(runnable);
        MethodCollector.o(1624);
    }
}
