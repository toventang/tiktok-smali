package f.a.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.e.j.a;
import f.a.e.j.j;
import f.a.z;

/* access modifiers changed from: package-private */
public final class e<T> extends g<T> implements a.AbstractC4175a<Object> {

    /* renamed from: a  reason: collision with root package name */
    final g<T> f158046a;

    /* renamed from: b  reason: collision with root package name */
    boolean f158047b;

    /* renamed from: c  reason: collision with root package name */
    a<Object> f158048c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f158049d;

    static {
        Covode.recordClassIndex(104927);
    }

    private void i() {
        a<Object> aVar;
        MethodCollector.i(10579);
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f158048c;
                    if (aVar == null) {
                        this.f158047b = false;
                        return;
                    }
                    this.f158048c = null;
                } finally {
                    MethodCollector.o(10579);
                }
            }
            aVar.a((a.AbstractC4175a<? super Object>) this);
        }
    }

    @Override // f.a.z
    public final void onComplete() {
        MethodCollector.i(10425);
        if (this.f158049d) {
            MethodCollector.o(10425);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f158049d) {
                    this.f158049d = true;
                    if (this.f158047b) {
                        a<Object> aVar = this.f158048c;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f158048c = aVar;
                        }
                        aVar.a(j.complete());
                        MethodCollector.o(10425);
                        return;
                    }
                    this.f158047b = true;
                    this.f158046a.onComplete();
                    MethodCollector.o(10425);
                }
            } finally {
                MethodCollector.o(10425);
            }
        }
    }

    e(g<T> gVar) {
        this.f158046a = gVar;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f158046a.b((z) zVar);
    }

    @Override // f.a.e.j.a.AbstractC4175a, f.a.d.k
    public final boolean a(Object obj) {
        return j.acceptFull(obj, this.f158046a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        f.a.h.a.a(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10275);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4.f158046a.onError(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10275);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return;
     */
    @Override // f.a.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            r3 = 10275(0x2823, float:1.4398E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            boolean r0 = r4.f158049d
            if (r0 == 0) goto L_0x0010
            f.a.h.a.a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0010:
            monitor-enter(r4)
            boolean r0 = r4.f158049d     // Catch:{ all -> 0x004c }
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r2 = 1
            goto L_0x0039
        L_0x0019:
            r4.f158049d = r1     // Catch:{ all -> 0x004c }
            boolean r0 = r4.f158047b     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            f.a.e.j.a<java.lang.Object> r0 = r4.f158048c     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002a
            f.a.e.j.a r0 = new f.a.e.j.a     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r4.f158048c = r0     // Catch:{ all -> 0x004c }
        L_0x002a:
            java.lang.Object r1 = f.a.e.j.j.error(r5)     // Catch:{ all -> 0x004c }
            java.lang.Object[] r0 = r0.f157939b     // Catch:{ all -> 0x004c }
            r0[r2] = r1     // Catch:{ all -> 0x004c }
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0037:
            r4.f158047b = r1
        L_0x0039:
            monitor-exit(r4)
            if (r2 == 0) goto L_0x0043
            f.a.h.a.a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0043:
            f.a.l.g<T> r0 = r4.f158046a
            r0.onError(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.l.e.onError(java.lang.Throwable):void");
    }

    @Override // f.a.z
    public final void onNext(T t) {
        MethodCollector.i(10114);
        if (this.f158049d) {
            MethodCollector.o(10114);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f158049d) {
                    if (this.f158047b) {
                        a<Object> aVar = this.f158048c;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f158048c = aVar;
                        }
                        aVar.a(j.next(t));
                        MethodCollector.o(10114);
                        return;
                    }
                    this.f158047b = true;
                    this.f158046a.onNext(t);
                    i();
                    MethodCollector.o(10114);
                }
            } finally {
                MethodCollector.o(10114);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r3.f158046a.onSubscribe(r4);
        i();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(9957);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    @Override // f.a.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSubscribe(f.a.b.b r4) {
        /*
            r3 = this;
            r2 = 9957(0x26e5, float:1.3953E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r3.f158049d
            r1 = 1
            if (r0 != 0) goto L_0x003a
            monitor-enter(r3)
            boolean r0 = r3.f158049d     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0011:
            boolean r0 = r3.f158047b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0029
            f.a.e.j.a<java.lang.Object> r1 = r3.f158048c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0020
            f.a.e.j.a r1 = new f.a.e.j.a     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r3.f158048c = r1     // Catch:{ all -> 0x0032 }
        L_0x0020:
            java.lang.Object r0 = f.a.e.j.j.disposable(r4)     // Catch:{ all -> 0x0032 }
            r1.a(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0029:
            r3.f158047b = r1     // Catch:{ all -> 0x0032 }
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
            r4.dispose()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0041:
            f.a.l.g<T> r0 = r3.f158046a
            r0.onSubscribe(r4)
            r3.i()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.l.e.onSubscribe(f.a.b.b):void");
    }
}
