package com.android.billingclient.api;

import com.android.billingclient.api.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f5877a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e.a f5878b;

    static {
        Covode.recordClassIndex(2460);
    }

    public final void run() {
        MethodCollector.i(5977);
        synchronized (this.f5878b.f5833a) {
            try {
                if (this.f5878b.f5835c != null) {
                    this.f5878b.f5835c.b(this.f5877a);
                }
            } finally {
                MethodCollector.o(5977);
            }
        }
    }

    r(e.a aVar, h hVar) {
        this.f5878b = aVar;
        this.f5877a = hVar;
    }
}
