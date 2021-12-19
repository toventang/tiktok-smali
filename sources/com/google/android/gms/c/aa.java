package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class aa<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f49890a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Queue<z<TResult>> f49891b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f49892c;

    static {
        Covode.recordClassIndex(31143);
    }

    aa() {
    }

    public final void a(z<TResult> zVar) {
        MethodCollector.i(4275);
        synchronized (this.f49890a) {
            try {
                if (this.f49891b == null) {
                    this.f49891b = new ArrayDeque();
                }
                this.f49891b.add(zVar);
            } finally {
                MethodCollector.o(4275);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r1 = r3.f49890a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r3.f49891b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r3.f49892c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        r0.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4342);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.c.h<TResult> r4) {
        /*
            r3 = this;
            r2 = 4342(0x10f6, float:6.084E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            java.lang.Object r1 = r3.f49890a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.c.z<TResult>> r0 = r3.f49891b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f49892c     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0015
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0015:
            r0 = 1
            r3.f49892c = r0
            monitor-exit(r1)
        L_0x0019:
            java.lang.Object r1 = r3.f49890a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.c.z<TResult>> r0 = r3.f49891b     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0034 }
            com.google.android.gms.c.z r0 = (com.google.android.gms.c.z) r0     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002b
            r0 = 0
            r3.f49892c = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0030
        L_0x002b:
            monitor-exit(r1)
            r0.a(r4)
            goto L_0x0019
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.aa.a(com.google.android.gms.c.h):void");
    }
}
