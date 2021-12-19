package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

final class gz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51736a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51737b;

    static {
        Covode.recordClassIndex(32274);
    }

    public final void run() {
        MethodCollector.i(8008);
        synchronized (this.f51736a) {
            try {
                this.f51736a.set(Integer.valueOf(this.f51737b.s().b(this.f51737b.f().w(), p.N)));
                try {
                    this.f51736a.notify();
                } finally {
                    MethodCollector.o(8008);
                }
            } catch (Throwable th) {
                this.f51736a.notify();
                MethodCollector.o(8008);
                throw th;
            }
        }
    }

    gz(gk gkVar, AtomicReference atomicReference) {
        this.f51737b = gkVar;
        this.f51736a = atomicReference;
    }
}
