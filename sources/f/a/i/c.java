package f.a.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.e.j.a;
import f.a.e.j.j;

/* access modifiers changed from: package-private */
public final class c<T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    final a<T> f157979b;

    /* renamed from: c  reason: collision with root package name */
    boolean f157980c;

    /* renamed from: d  reason: collision with root package name */
    a<Object> f157981d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f157982e;

    static {
        Covode.recordClassIndex(104891);
    }

    private void g() {
        a<Object> aVar;
        MethodCollector.i(10902);
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f157981d;
                    if (aVar == null) {
                        this.f157980c = false;
                        return;
                    }
                    this.f157981d = null;
                } finally {
                    MethodCollector.o(10902);
                }
            }
            aVar.a((org.a.c) this.f157979b);
        }
    }

    @Override // org.a.c
    public final void onComplete() {
        MethodCollector.i(10901);
        if (this.f157982e) {
            MethodCollector.o(10901);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157982e) {
                    this.f157982e = true;
                    if (this.f157980c) {
                        a<Object> aVar = this.f157981d;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f157981d = aVar;
                        }
                        aVar.a(j.complete());
                        MethodCollector.o(10901);
                        return;
                    }
                    this.f157980c = true;
                    this.f157979b.onComplete();
                    MethodCollector.o(10901);
                }
            } finally {
                MethodCollector.o(10901);
            }
        }
    }

    c(a<T> aVar) {
        this.f157979b = aVar;
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        this.f157979b.a_(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        f.a.h.a.a(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10900);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4.f157979b.onError(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10900);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return;
     */
    @Override // org.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            r3 = 10900(0x2a94, float:1.5274E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            boolean r0 = r4.f157982e
            if (r0 == 0) goto L_0x0010
            f.a.h.a.a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0010:
            monitor-enter(r4)
            boolean r0 = r4.f157982e     // Catch:{ all -> 0x004c }
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r2 = 1
            goto L_0x0039
        L_0x0019:
            r4.f157982e = r1     // Catch:{ all -> 0x004c }
            boolean r0 = r4.f157980c     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            f.a.e.j.a<java.lang.Object> r0 = r4.f157981d     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002a
            f.a.e.j.a r0 = new f.a.e.j.a     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r4.f157981d = r0     // Catch:{ all -> 0x004c }
        L_0x002a:
            java.lang.Object r1 = f.a.e.j.j.error(r5)     // Catch:{ all -> 0x004c }
            java.lang.Object[] r0 = r0.f157939b     // Catch:{ all -> 0x004c }
            r0[r2] = r1     // Catch:{ all -> 0x004c }
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0037:
            r4.f157980c = r1
        L_0x0039:
            monitor-exit(r4)
            if (r2 == 0) goto L_0x0043
            f.a.h.a.a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0043:
            f.a.i.a<T> r0 = r4.f157979b
            r0.onError(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.i.c.onError(java.lang.Throwable):void");
    }

    @Override // org.a.c
    public final void onNext(T t) {
        MethodCollector.i(10899);
        if (this.f157982e) {
            MethodCollector.o(10899);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157982e) {
                    if (this.f157980c) {
                        a<Object> aVar = this.f157981d;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f157981d = aVar;
                        }
                        aVar.a(j.next(t));
                        MethodCollector.o(10899);
                        return;
                    }
                    this.f157980c = true;
                    this.f157979b.onNext(t);
                    g();
                    MethodCollector.o(10899);
                }
            } finally {
                MethodCollector.o(10899);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r3.f157979b.onSubscribe(r4);
        g();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10736);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    @Override // org.a.c, f.a.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSubscribe(org.a.d r4) {
        /*
            r3 = this;
            r2 = 10736(0x29f0, float:1.5044E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r3.f157982e
            r1 = 1
            if (r0 != 0) goto L_0x003a
            monitor-enter(r3)
            boolean r0 = r3.f157982e     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0011:
            boolean r0 = r3.f157980c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0029
            f.a.e.j.a<java.lang.Object> r1 = r3.f157981d     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0020
            f.a.e.j.a r1 = new f.a.e.j.a     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r3.f157981d = r1     // Catch:{ all -> 0x0032 }
        L_0x0020:
            java.lang.Object r0 = f.a.e.j.j.subscription(r4)     // Catch:{ all -> 0x0032 }
            r1.a(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0029:
            r3.f157980c = r1     // Catch:{ all -> 0x0032 }
            r0 = 0
            r1 = 0
            goto L_0x000f
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        L_0x0038:
            if (r1 == 0) goto L_0x0041
        L_0x003a:
            r4.cancel()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0041:
            f.a.i.a<T> r0 = r3.f157979b
            r0.onSubscribe(r4)
            r3.g()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.i.c.onSubscribe(org.a.d):void");
    }
}
