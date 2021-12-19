package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49929a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t f49930b;

    static {
        Covode.recordClassIndex(31170);
    }

    u(t tVar, h hVar) {
        this.f49930b = tVar;
        this.f49929a = hVar;
    }

    public final void run() {
        MethodCollector.i(6710);
        synchronized (this.f49930b.f49926a) {
            try {
                if (this.f49930b.f49927b != null) {
                    this.f49930b.f49927b.a(this.f49929a.e());
                }
            } finally {
                MethodCollector.o(6710);
            }
        }
    }
}
