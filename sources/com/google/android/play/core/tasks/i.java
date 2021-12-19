package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f53375a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f53376b;

    static {
        Covode.recordClassIndex(32971);
    }

    i(j jVar, d dVar) {
        this.f53376b = jVar;
        this.f53375a = dVar;
    }

    public final void run() {
        MethodCollector.i(6601);
        synchronized (this.f53376b.f53377a) {
            try {
                if (this.f53376b.f53378b != null) {
                    this.f53376b.f53378b.a((Object) this.f53375a.c());
                }
            } finally {
                MethodCollector.o(6601);
            }
        }
    }
}
