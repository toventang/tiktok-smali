package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

final class gy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51734a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51735b;

    static {
        Covode.recordClassIndex(32273);
    }

    public final void run() {
        MethodCollector.i(7420);
        synchronized (this.f51734a) {
            try {
                this.f51734a.set(Double.valueOf(this.f51735b.s().c(this.f51735b.f().w(), p.O)));
                try {
                    this.f51734a.notify();
                } finally {
                    MethodCollector.o(7420);
                }
            } catch (Throwable th) {
                this.f51734a.notify();
                MethodCollector.o(7420);
                throw th;
            }
        }
    }

    gy(gk gkVar, AtomicReference atomicReference) {
        this.f51735b = gkVar;
        this.f51734a = atomicReference;
    }
}
