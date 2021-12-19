package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class t<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final Object f49926a = new Object();

    /* renamed from: b  reason: collision with root package name */
    d f49927b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49928c;

    static {
        Covode.recordClassIndex(31169);
    }

    public t(Executor executor, d dVar) {
        this.f49928c = executor;
        this.f49927b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        r3.f49928c.execute(new com.google.android.gms.c.u(r3, r4));
     */
    @Override // com.google.android.gms.c.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.c.h<TResult> r4) {
        /*
            r3 = this;
            r2 = 4524(0x11ac, float:6.34E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4.c()
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r3.f49926a
            monitor-enter(r1)
            com.google.android.gms.c.d r0 = r3.f49927b     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0023
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        L_0x0023:
            monitor-exit(r1)
            java.util.concurrent.Executor r1 = r3.f49928c
            com.google.android.gms.c.u r0 = new com.google.android.gms.c.u
            r0.<init>(r3, r4)
            r1.execute(r0)
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.t.a(com.google.android.gms.c.h):void");
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        MethodCollector.i(4525);
        synchronized (this.f49926a) {
            try {
                this.f49927b = null;
            } finally {
                MethodCollector.o(4525);
            }
        }
    }
}
