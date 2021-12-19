package f.a.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.b.b;
import f.a.e.j.a;
import f.a.e.j.j;
import f.a.z;

public final class c<T> implements b, z<T> {

    /* renamed from: a  reason: collision with root package name */
    final z<? super T> f157955a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f157956b;

    /* renamed from: c  reason: collision with root package name */
    b f157957c;

    /* renamed from: d  reason: collision with root package name */
    boolean f157958d;

    /* renamed from: e  reason: collision with root package name */
    a<Object> f157959e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f157960f;

    static {
        Covode.recordClassIndex(104884);
    }

    @Override // f.a.b.b
    public final void dispose() {
        this.f157957c.dispose();
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157957c.isDisposed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r4 = r6.f157955a;
        r0 = r1.f157939b;
        r3 = r1.f157938a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r0 == null) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r2 >= r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (f.a.e.j.j.acceptFull(r1, r4) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r0 = r0[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r6 = this;
            r5 = 13677(0x356d, float:1.9166E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
        L_0x0005:
            monitor-enter(r6)
            f.a.e.j.a<java.lang.Object> r1 = r6.f157959e     // Catch:{ all -> 0x0038 }
            r0 = 0
            if (r1 != 0) goto L_0x000f
            r6.f157958d = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r6)     // Catch:{ all -> 0x0038 }
            goto L_0x0034
        L_0x000f:
            r0 = 0
            r6.f157959e = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r6)     // Catch:{ all -> 0x0038 }
            f.a.z<? super T> r4 = r6.f157955a
            java.lang.Object[] r0 = r1.f157939b
            int r3 = r1.f157938a
        L_0x0019:
            if (r0 == 0) goto L_0x0005
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x002f
            r1 = r0[r2]
            if (r1 == 0) goto L_0x002f
            boolean r1 = f.a.e.j.j.acceptFull(r1, r4)
            if (r1 == 0) goto L_0x002c
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002f:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0019
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.g.c.a():void");
    }

    @Override // f.a.z
    public final void onComplete() {
        MethodCollector.i(13676);
        if (this.f157960f) {
            MethodCollector.o(13676);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157960f) {
                    if (this.f157958d) {
                        a<Object> aVar = this.f157959e;
                        if (aVar == null) {
                            aVar = new a<>();
                            this.f157959e = aVar;
                        }
                        aVar.a(j.complete());
                        MethodCollector.o(13676);
                        return;
                    }
                    this.f157960f = true;
                    this.f157958d = true;
                    this.f157955a.onComplete();
                    MethodCollector.o(13676);
                }
            } finally {
                MethodCollector.o(13676);
            }
        }
    }

    public c(z<? super T> zVar) {
        this(zVar, (byte) 0);
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        if (f.a.e.a.b.validate(this.f157957c, bVar)) {
            this.f157957c = bVar;
            this.f157955a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        f.a.h.a.a(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13675);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r5.f157955a.onError(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13675);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    @Override // f.a.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            r4 = 13675(0x356b, float:1.9163E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            boolean r0 = r5.f157960f
            if (r0 == 0) goto L_0x0010
            f.a.h.a.a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0010:
            monitor-enter(r5)
            boolean r0 = r5.f157960f     // Catch:{ all -> 0x0057 }
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r3 = 1
            goto L_0x0044
        L_0x0019:
            boolean r0 = r5.f157958d     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0040
            r5.f157960f = r1     // Catch:{ all -> 0x0057 }
            f.a.e.j.a<java.lang.Object> r2 = r5.f157959e     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x002a
            f.a.e.j.a r2 = new f.a.e.j.a     // Catch:{ all -> 0x0057 }
            r2.<init>()     // Catch:{ all -> 0x0057 }
            r5.f157959e = r2     // Catch:{ all -> 0x0057 }
        L_0x002a:
            java.lang.Object r1 = f.a.e.j.j.error(r6)     // Catch:{ all -> 0x0057 }
            boolean r0 = r5.f157956b     // Catch:{ all -> 0x0057 }
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
            r5.f157960f = r1
            r5.f157958d = r1
        L_0x0044:
            monitor-exit(r5)
            if (r3 == 0) goto L_0x004e
            f.a.h.a.a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x004e:
            f.a.z<? super T> r0 = r5.f157955a
            r0.onError(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.g.c.onError(java.lang.Throwable):void");
    }

    @Override // f.a.z
    public final void onNext(T t) {
        MethodCollector.i(13600);
        if (this.f157960f) {
            MethodCollector.o(13600);
        } else if (t == null) {
            this.f157957c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            MethodCollector.o(13600);
        } else {
            synchronized (this) {
                try {
                    if (!this.f157960f) {
                        if (this.f157958d) {
                            a<Object> aVar = this.f157959e;
                            if (aVar == null) {
                                aVar = new a<>();
                                this.f157959e = aVar;
                            }
                            aVar.a(j.next(t));
                            MethodCollector.o(13600);
                            return;
                        }
                        this.f157958d = true;
                        this.f157955a.onNext(t);
                        a();
                        MethodCollector.o(13600);
                    }
                } finally {
                    MethodCollector.o(13600);
                }
            }
        }
    }

    private c(z<? super T> zVar, byte b2) {
        this.f157955a = zVar;
        this.f157956b = false;
    }
}
