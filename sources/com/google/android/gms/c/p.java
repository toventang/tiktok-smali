package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class p<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final Object f49917a = new Object();

    /* renamed from: b  reason: collision with root package name */
    b f49918b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49919c;

    static {
        Covode.recordClassIndex(31165);
    }

    public p(Executor executor, b bVar) {
        this.f49919c = executor;
        this.f49918b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r3.f49919c.execute(new com.google.android.gms.c.q(r3));
     */
    @Override // com.google.android.gms.c.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.c.h r4) {
        /*
            r3 = this;
            r2 = 7015(0x1b67, float:9.83E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r3.f49917a
            monitor-enter(r1)
            com.google.android.gms.c.b r0 = r3.f49918b     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        L_0x001d:
            monitor-exit(r1)
            java.util.concurrent.Executor r1 = r3.f49919c
            com.google.android.gms.c.q r0 = new com.google.android.gms.c.q
            r0.<init>(r3)
            r1.execute(r0)
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.p.a(com.google.android.gms.c.h):void");
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        MethodCollector.i(7049);
        synchronized (this.f49917a) {
            try {
                this.f49918b = null;
            } finally {
                MethodCollector.o(7049);
            }
        }
    }
}
