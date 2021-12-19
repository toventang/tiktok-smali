package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.HashMap;
import java.util.Map;

final class h implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Map<p, n> f155327a = new HashMap();

    static {
        Covode.recordClassIndex(103349);
    }

    h() {
    }

    private synchronized e a() {
        e eVar;
        MethodCollector.i(12758);
        eVar = (e) ThreadUtils.a(i.f155328a);
        MethodCollector.o(12758);
        return eVar;
    }

    private n a(p pVar) {
        if (pVar.r) {
            return a();
        }
        return new TaskRunnerImpl(pVar);
    }

    @Override // com.ttnet.org.chromium.base.task.m
    public final synchronized void a(p pVar, Runnable runnable) {
        boolean z;
        MethodCollector.i(12635);
        if (pVar.p != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            n a2 = a(pVar);
            a2.a(runnable, 0);
            a2.a();
            MethodCollector.o(12635);
            return;
        }
        n nVar = this.f155327a.get(pVar);
        if (nVar == null) {
            nVar = a(pVar);
            nVar.b();
            this.f155327a.put(pVar, nVar);
        }
        nVar.a(runnable, 0);
        MethodCollector.o(12635);
    }
}
