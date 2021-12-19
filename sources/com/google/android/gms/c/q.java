package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p f49920a;

    static {
        Covode.recordClassIndex(31166);
    }

    q(p pVar) {
        this.f49920a = pVar;
    }

    public final void run() {
        MethodCollector.i(6861);
        synchronized (this.f49920a.f49917a) {
            try {
                if (this.f49920a.f49918b != null) {
                    this.f49920a.f49918b.a();
                }
            } finally {
                MethodCollector.o(6861);
            }
        }
    }
}
