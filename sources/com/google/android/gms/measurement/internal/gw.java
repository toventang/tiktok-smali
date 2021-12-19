package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

final class gw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51726a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51727b;

    static {
        Covode.recordClassIndex(32271);
    }

    public final void run() {
        MethodCollector.i(7530);
        synchronized (this.f51726a) {
            try {
                this.f51726a.set(Long.valueOf(this.f51727b.s().a(this.f51727b.f().w(), p.M)));
                try {
                    this.f51726a.notify();
                } finally {
                    MethodCollector.o(7530);
                }
            } catch (Throwable th) {
                this.f51726a.notify();
                MethodCollector.o(7530);
                throw th;
            }
        }
    }

    gw(gk gkVar, AtomicReference atomicReference) {
        this.f51727b = gkVar;
        this.f51726a = atomicReference;
    }
}
