package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

final class gl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51692a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51693b;

    static {
        Covode.recordClassIndex(32260);
    }

    public final void run() {
        MethodCollector.i(8096);
        synchronized (this.f51692a) {
            try {
                this.f51692a.set(Boolean.valueOf(this.f51693b.s().d(this.f51693b.f().w(), p.K)));
                try {
                    this.f51692a.notify();
                } finally {
                    MethodCollector.o(8096);
                }
            } catch (Throwable th) {
                this.f51692a.notify();
                MethodCollector.o(8096);
                throw th;
            }
        }
    }

    gl(gk gkVar, AtomicReference atomicReference) {
        this.f51693b = gkVar;
        this.f51692a = atomicReference;
    }
}
