package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f53370a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f53371b;

    static {
        Covode.recordClassIndex(32969);
    }

    g(h hVar, d dVar) {
        this.f53371b = hVar;
        this.f53370a = dVar;
    }

    public final void run() {
        MethodCollector.i(9618);
        synchronized (this.f53371b.f53372a) {
            try {
                if (this.f53371b.f53373b != null) {
                    this.f53371b.f53373b.a(this.f53370a.d());
                }
            } finally {
                MethodCollector.o(9618);
            }
        }
    }
}
