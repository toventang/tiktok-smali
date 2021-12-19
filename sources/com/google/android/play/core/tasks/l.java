package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class l<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f53380a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Queue<k<ResultT>> f53381b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53382c;

    static {
        Covode.recordClassIndex(32974);
    }

    l() {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r1 = r3.f53380a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r3.f53381b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r3.f53382c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6596);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r0.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6596);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.play.core.tasks.d<ResultT> r4) {
        /*
            r3 = this;
            r2 = 6596(0x19c4, float:9.243E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            java.lang.Object r1 = r3.f53380a
            monitor-enter(r1)
            java.util.Queue<com.google.android.play.core.tasks.k<ResultT>> r0 = r3.f53381b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f53382c     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0015
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)     // Catch:{ all -> 0x003a }
            return
        L_0x0015:
            r0 = 1
            r3.f53382c = r0     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
        L_0x0019:
            java.lang.Object r1 = r3.f53380a
            monitor-enter(r1)
            java.util.Queue<com.google.android.play.core.tasks.k<ResultT>> r0 = r3.f53381b     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.tasks.k r0 = (com.google.android.play.core.tasks.k) r0     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002e
            r0 = 0
            r3.f53382c = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0033
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            r0.a(r4)
            goto L_0x0019
        L_0x0033:
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.tasks.l.a(com.google.android.play.core.tasks.d):void");
    }

    public final void a(k<ResultT> kVar) {
        MethodCollector.i(6529);
        synchronized (this.f53380a) {
            try {
                if (this.f53381b == null) {
                    this.f53381b = new ArrayDeque();
                }
                this.f53381b.add(kVar);
            } finally {
                MethodCollector.o(6529);
            }
        }
    }
}
