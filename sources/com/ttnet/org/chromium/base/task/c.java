package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

final /* synthetic */ class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f155315a = new c();

    static {
        Covode.recordClassIndex(103342);
    }

    private c() {
    }

    public final void execute(Runnable runnable) {
        MethodCollector.i(11726);
        p pVar = p.f155335b;
        synchronized (PostTask.f155286a) {
            try {
                if (PostTask.f155287b != null || pVar.r) {
                    PostTask.f155288c[pVar.p].a(pVar, runnable);
                } else {
                    PostTask.nativePostDelayedTask(pVar.f155345l, pVar.f155346m, pVar.n, pVar.o, pVar.p, pVar.q, runnable, 0);
                }
            } finally {
                MethodCollector.o(11726);
            }
        }
    }
}
