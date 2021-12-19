package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class ip implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ dt f51881a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ iq f51882b;

    static {
        Covode.recordClassIndex(32318);
    }

    public final void run() {
        MethodCollector.i(6869);
        synchronized (this.f51882b) {
            try {
                this.f51882b.f51883a = false;
                if (!this.f51882b.f51885c.w()) {
                    this.f51882b.f51885c.q().f51476k.a("Connected to service");
                    this.f51882b.f51885c.a(this.f51881a);
                }
            } finally {
                MethodCollector.o(6869);
            }
        }
    }

    ip(iq iqVar, dt dtVar) {
        this.f51882b = iqVar;
        this.f51881a = dtVar;
    }
}
