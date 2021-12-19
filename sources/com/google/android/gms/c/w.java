package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49934a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v f49935b;

    static {
        Covode.recordClassIndex(31172);
    }

    w(v vVar, h hVar) {
        this.f49935b = vVar;
        this.f49934a = hVar;
    }

    public final void run() {
        MethodCollector.i(6643);
        synchronized (this.f49935b.f49931a) {
            try {
                if (this.f49935b.f49932b != null) {
                    this.f49935b.f49932b.a((Object) this.f49934a.d());
                }
            } finally {
                MethodCollector.o(6643);
            }
        }
    }
}
