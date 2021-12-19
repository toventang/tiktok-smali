package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

final class v<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final Object f49931a = new Object();

    /* renamed from: b  reason: collision with root package name */
    e<? super TResult> f49932b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49933c;

    static {
        Covode.recordClassIndex(31171);
    }

    public v(Executor executor, e<? super TResult> eVar) {
        this.f49933c = executor;
        this.f49932b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r3.f49933c.execute(new com.google.android.gms.c.w(r3, r4));
     */
    @Override // com.google.android.gms.c.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.c.h<TResult> r4) {
        /*
            r3 = this;
            r2 = 4505(0x1199, float:6.313E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r3.f49931a
            monitor-enter(r1)
            com.google.android.gms.c.e<? super TResult> r0 = r3.f49932b     // Catch:{ all -> 0x0017 }
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
            java.util.concurrent.Executor r1 = r3.f49933c
            com.google.android.gms.c.w r0 = new com.google.android.gms.c.w
            r0.<init>(r3, r4)
            r1.execute(r0)
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.v.a(com.google.android.gms.c.h):void");
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        MethodCollector.i(4507);
        synchronized (this.f49931a) {
            try {
                this.f49932b = null;
            } finally {
                MethodCollector.o(4507);
            }
        }
    }
}
