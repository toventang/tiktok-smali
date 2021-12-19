package f.a.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.e.i.f;
import f.a.e.j.a;
import f.a.e.j.j;
import f.a.l;
import org.a.c;
import org.a.d;

public final class b<T> implements l<T>, d {

    /* renamed from: a  reason: collision with root package name */
    final c<? super T> f158057a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f158058b;

    /* renamed from: c  reason: collision with root package name */
    d f158059c;

    /* renamed from: d  reason: collision with root package name */
    boolean f158060d;

    /* renamed from: e  reason: collision with root package name */
    a<Object> f158061e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f158062f;

    static {
        Covode.recordClassIndex(104933);
    }

    @Override // org.a.d
    public final void cancel() {
        this.f158059c.cancel();
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: org.a.c<? super T>, org.a.c<? super U> */
    private void a() {
        a<Object> aVar;
        MethodCollector.i(13430);
        do {
            synchronized (this) {
                try {
                    aVar = this.f158061e;
                    if (aVar == null) {
                        this.f158060d = false;
                        MethodCollector.o(13430);
                        return;
                    }
                    this.f158061e = null;
                } finally {
                    MethodCollector.o(13430);
                }
            }
        } while (!aVar.a((c<? super T>) this.f158057a));
    }

    @Override // org.a.c
    public final void onComplete() {
        MethodCollector.i(13429);
        if (this.f158062f) {
            MethodCollector.o(13429);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f158062f) {
                    if (this.f158060d) {
                        a<Object> aVar = this.f158061e;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f158061e = aVar;
                        }
                        aVar.a(j.complete());
                        MethodCollector.o(13429);
                        return;
                    }
                    this.f158062f = true;
                    this.f158060d = true;
                    this.f158057a.onComplete();
                    MethodCollector.o(13429);
                }
            } finally {
                MethodCollector.o(13429);
            }
        }
    }

    public b(c<? super T> cVar) {
        this(cVar, (byte) 0);
    }

    @Override // org.a.d
    public final void request(long j2) {
        this.f158059c.request(j2);
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        if (f.validate(this.f158059c, dVar)) {
            this.f158059c = dVar;
            this.f158057a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        f.a.h.a.a(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13428);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r5.f158057a.onError(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13428);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    @Override // org.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            r4 = 13428(0x3474, float:1.8817E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            boolean r0 = r5.f158062f
            if (r0 == 0) goto L_0x0010
            f.a.h.a.a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0010:
            monitor-enter(r5)
            boolean r0 = r5.f158062f     // Catch:{ all -> 0x0057 }
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r3 = 1
            goto L_0x0044
        L_0x0019:
            boolean r0 = r5.f158060d     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0040
            r5.f158062f = r1     // Catch:{ all -> 0x0057 }
            f.a.e.j.a<java.lang.Object> r2 = r5.f158061e     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x002a
            f.a.e.j.a r2 = new f.a.e.j.a     // Catch:{ all -> 0x0057 }
            r2.<init>()     // Catch:{ all -> 0x0057 }
            r5.f158061e = r2     // Catch:{ all -> 0x0057 }
        L_0x002a:
            java.lang.Object r1 = f.a.e.j.j.error(r6)     // Catch:{ all -> 0x0057 }
            boolean r0 = r5.f158058b     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0037
            r2.a(r1)     // Catch:{ all -> 0x0057 }
        L_0x0035:
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x003c
        L_0x0037:
            java.lang.Object[] r0 = r2.f157939b     // Catch:{ all -> 0x0057 }
            r0[r3] = r1     // Catch:{ all -> 0x0057 }
            goto L_0x0035
        L_0x003c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0040:
            r5.f158062f = r1
            r5.f158060d = r1
        L_0x0044:
            monitor-exit(r5)
            if (r3 == 0) goto L_0x004e
            f.a.h.a.a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x004e:
            org.a.c<? super T> r0 = r5.f158057a
            r0.onError(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.m.b.onError(java.lang.Throwable):void");
    }

    @Override // org.a.c
    public final void onNext(T t) {
        MethodCollector.i(13427);
        if (this.f158062f) {
            MethodCollector.o(13427);
        } else if (t == null) {
            this.f158059c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            MethodCollector.o(13427);
        } else {
            synchronized (this) {
                try {
                    if (!this.f158062f) {
                        if (this.f158060d) {
                            a<Object> aVar = this.f158061e;
                            if (aVar == null) {
                                aVar = new a<>();
                                this.f158061e = aVar;
                            }
                            aVar.a(j.next(t));
                            MethodCollector.o(13427);
                            return;
                        }
                        this.f158060d = true;
                        this.f158057a.onNext(t);
                        a();
                        MethodCollector.o(13427);
                    }
                } finally {
                    MethodCollector.o(13427);
                }
            }
        }
    }

    private b(c<? super T> cVar, byte b2) {
        this.f158057a = cVar;
        this.f158058b = false;
    }
}
