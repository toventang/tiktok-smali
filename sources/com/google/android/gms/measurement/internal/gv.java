package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

final class gv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51724a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51725b;

    static {
        Covode.recordClassIndex(32270);
    }

    public final void run() {
        String a2;
        MethodCollector.i(8051);
        synchronized (this.f51724a) {
            try {
                AtomicReference atomicReference = this.f51724a;
                km s = this.f51725b.s();
                String w = this.f51725b.f().w();
                dq<String> dqVar = p.L;
                if (w == null) {
                    a2 = dqVar.a(null);
                } else {
                    a2 = dqVar.a(s.f52014a.a(w, dqVar.f51424a));
                }
                atomicReference.set(a2);
                try {
                    this.f51724a.notify();
                } finally {
                    MethodCollector.o(8051);
                }
            } catch (Throwable th) {
                this.f51724a.notify();
                MethodCollector.o(8051);
                throw th;
            }
        }
    }

    gv(gk gkVar, AtomicReference atomicReference) {
        this.f51725b = gkVar;
        this.f51724a = atomicReference;
    }
}
