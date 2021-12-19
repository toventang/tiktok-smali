package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.b.b;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class j extends b {
    static {
        Covode.recordClassIndex(24649);
    }

    public j(Executor executor) {
        super("FixSizeSerialExecutor", executor, new i());
    }

    @Override // com.facebook.common.b.b
    public final synchronized void execute(Runnable runnable) {
        MethodCollector.i(12474);
        super.execute(runnable);
        MethodCollector.o(12474);
    }
}
