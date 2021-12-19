package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class ir implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ dt f51886a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ iq f51887b;

    static {
        Covode.recordClassIndex(32320);
    }

    public final void run() {
        MethodCollector.i(6742);
        synchronized (this.f51887b) {
            try {
                this.f51887b.f51883a = false;
                if (!this.f51887b.f51885c.w()) {
                    this.f51887b.f51885c.q().f51475j.a("Connected to remote service");
                    this.f51887b.f51885c.a(this.f51886a);
                }
            } finally {
                MethodCollector.o(6742);
            }
        }
    }

    ir(iq iqVar, dt dtVar) {
        this.f51887b = iqVar;
        this.f51886a = dtVar;
    }
}
