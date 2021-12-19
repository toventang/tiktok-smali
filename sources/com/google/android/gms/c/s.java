package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f49924a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r f49925b;

    static {
        Covode.recordClassIndex(31168);
    }

    s(r rVar, h hVar) {
        this.f49925b = rVar;
        this.f49924a = hVar;
    }

    public final void run() {
        MethodCollector.i(4546);
        synchronized (this.f49925b.f49921a) {
            try {
                if (this.f49925b.f49922b != null) {
                    this.f49925b.f49922b.a(this.f49924a);
                }
            } finally {
                MethodCollector.o(4546);
            }
        }
    }
}
