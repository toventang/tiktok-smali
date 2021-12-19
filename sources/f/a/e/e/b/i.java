package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.c.h;
import f.a.e.i.f;
import f.a.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class i<T, U> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final g<? super T, ? extends org.a.b<? extends U>> f157312c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157313d = false;

    /* renamed from: e  reason: collision with root package name */
    final int f157314e;

    /* renamed from: f  reason: collision with root package name */
    final int f157315f;

    static {
        Covode.recordClassIndex(104506);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, U> extends AtomicReference<d> implements f.a.b.b, l<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final b<T, U> parent;
        long produced;
        volatile f.a.e.c.i<U> queue;

        static {
            Covode.recordClassIndex(104507);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.cancel(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.a.c
        public final void onComplete() {
            this.done = true;
            this.parent.a();
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            if (this.fusionMode != 1) {
                long j3 = this.produced + j2;
                if (j3 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((d) get()).request(j3);
                    return;
                }
                this.produced = j3;
            }
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            lazySet(f.CANCELLED);
            b<T, U> bVar = this.parent;
            if (bVar.errs.addThrowable(th)) {
                this.done = true;
                if (!bVar.delayErrors) {
                    bVar.upstream.cancel();
                    for (a<?, ?> aVar : bVar.subscribers.getAndSet(b.f157317b)) {
                        aVar.dispose();
                    }
                }
                bVar.a();
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.setOnce(this, dVar)) {
                if (dVar instanceof f.a.e.c.f) {
                    f.a.e.c.f fVar = (f.a.e.c.f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = fVar;
                        this.done = true;
                        this.parent.a();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = fVar;
                    }
                }
                dVar.request((long) this.bufferSize);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        @Override // org.a.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(U r9) {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.b.i.a.onNext(java.lang.Object):void");
        }

        a(b<T, U> bVar, long j2) {
            this.id = j2;
            this.parent = bVar;
            int i2 = bVar.bufferSize;
            this.bufferSize = i2;
            this.limit = i2 >> 2;
        }
    }

    static final class b<T, U> extends AtomicInteger implements l<T>, d {

        /* renamed from: a  reason: collision with root package name */
        static final a<?, ?>[] f157316a = new a[0];

        /* renamed from: b  reason: collision with root package name */
        static final a<?, ?>[] f157317b = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super U> downstream;
        final f.a.e.j.c errs = new f.a.e.j.c();
        long lastId;
        int lastIndex;
        final g<? super T, ? extends org.a.b<? extends U>> mapper;
        final int maxConcurrency;
        volatile h<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<a<?, ?>[]> subscribers;
        long uniqueId;
        d upstream;

        private void e() {
            h<U> hVar = this.queue;
            if (hVar != null) {
                hVar.clear();
            }
        }

        static {
            Covode.recordClassIndex(104508);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        private f.a.e.c.i<U> c() {
            h<U> hVar = this.queue;
            if (hVar == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    hVar = new f.a.e.f.c<>(this.bufferSize);
                } else {
                    hVar = new f.a.e.f.b<>(this.maxConcurrency);
                }
                this.queue = hVar;
            }
            return hVar;
        }

        private boolean d() {
            if (this.cancelled) {
                e();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                e();
                Throwable terminate = this.errs.terminate();
                if (terminate != f.a.e.j.h.f157944a) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        @Override // org.a.d
        public final void cancel() {
            h<U> hVar;
            a<?, ?>[] andSet;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                a<?, ?>[] aVarArr = this.subscribers.get();
                a<?, ?>[] aVarArr2 = f157317b;
                if (!(aVarArr == aVarArr2 || (andSet = this.subscribers.getAndSet(aVarArr2)) == aVarArr2)) {
                    for (a<?, ?> aVar : andSet) {
                        aVar.dispose();
                    }
                    Throwable terminate = this.errs.terminate();
                    if (!(terminate == null || terminate == f.a.e.j.h.f157944a)) {
                        f.a.h.a.a(terminate);
                    }
                }
                if (getAndIncrement() == 0 && (hVar = this.queue) != null) {
                    hVar.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            boolean z;
            boolean z2;
            long j2;
            long j3;
            U u;
            c<? super U> cVar = this.downstream;
            int i2 = 1;
            while (!d()) {
                h<U> hVar = this.queue;
                long j4 = this.requested.get();
                if (j4 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j5 = 0;
                long j6 = 0;
                if (hVar != null) {
                    do {
                        long j7 = 0;
                        u = null;
                        while (j4 != 0) {
                            u = hVar.poll();
                            if (!d()) {
                                if (u == null) {
                                    break;
                                }
                                cVar.onNext(u);
                                j6++;
                                j7++;
                                j4--;
                            } else {
                                return;
                            }
                        }
                        if (j7 != 0) {
                            if (z) {
                                j4 = Long.MAX_VALUE;
                                continue;
                            } else {
                                j4 = this.requested.addAndGet(-j7);
                            }
                        }
                        if (j4 == 0) {
                            break;
                        }
                    } while (u != null);
                }
                boolean z3 = this.done;
                h<U> hVar2 = this.queue;
                a<?, ?>[] aVarArr = this.subscribers.get();
                int length = aVarArr.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        long j8 = this.lastId;
                        int i3 = this.lastIndex;
                        if (length <= i3 || aVarArr[i3].id != j8) {
                            if (length <= i3) {
                                i3 = 0;
                            }
                            int i4 = 0;
                            while (aVarArr[i3].id != j8) {
                                i3++;
                                if (i3 == length) {
                                    i3 = 0;
                                }
                                i4++;
                                if (i4 >= length) {
                                    break;
                                }
                            }
                            this.lastIndex = i3;
                            this.lastId = aVarArr[i3].id;
                        }
                        z2 = false;
                        int i5 = 0;
                        while (!d()) {
                            a<T, U> aVar = aVarArr[i3];
                            U u2 = null;
                            while (!d()) {
                                f.a.e.c.i<U> iVar = aVar.queue;
                                if (iVar != null) {
                                    long j9 = 0;
                                    while (j4 != j5) {
                                        try {
                                            u2 = iVar.poll();
                                            if (u2 == null) {
                                                break;
                                            }
                                            cVar.onNext(u2);
                                            if (!d()) {
                                                j4--;
                                                j9++;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            f.a.c.b.a(th);
                                            aVar.dispose();
                                            this.errs.addThrowable(th);
                                            if (!this.delayErrors) {
                                                this.upstream.cancel();
                                            }
                                            if (!d()) {
                                                b(aVar);
                                                i5++;
                                                z2 = true;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (j9 != j5) {
                                        if (!z) {
                                            j4 = this.requested.addAndGet(-j9);
                                        } else {
                                            j4 = Long.MAX_VALUE;
                                        }
                                        aVar.a(j9);
                                        j3 = 0;
                                    } else {
                                        j3 = 0;
                                    }
                                    if (!(j4 == j3 || u2 == null)) {
                                        j5 = 0;
                                    }
                                }
                                boolean z4 = aVar.done;
                                f.a.e.c.i<U> iVar2 = aVar.queue;
                                if (z4 && (iVar2 == null || iVar2.isEmpty())) {
                                    b(aVar);
                                    if (!d()) {
                                        j6++;
                                        z2 = true;
                                    } else {
                                        return;
                                    }
                                }
                                if (j4 == 0) {
                                    this.lastIndex = i3;
                                    this.lastId = aVarArr[i3].id;
                                    j2 = 0;
                                } else {
                                    i3++;
                                    if (i3 == length) {
                                        i3 = 0;
                                    }
                                    i5++;
                                    j5 = 0;
                                    if (i5 >= length) {
                                        this.lastIndex = i3;
                                        this.lastId = aVarArr[i3].id;
                                        j2 = 0;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    j2 = 0;
                    z2 = false;
                    if (j6 != j2 && !this.cancelled) {
                        this.upstream.request(j6);
                    }
                    if (!z2 && (i2 = addAndGet(-i2)) == 0) {
                        return;
                    }
                } else {
                    Throwable terminate = this.errs.terminate();
                    if (terminate == f.a.e.j.h.f157944a) {
                        return;
                    }
                    if (terminate == null) {
                        cVar.onComplete();
                        return;
                    } else {
                        cVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(this.requested, j2);
                a();
            }
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
            } else if (this.errs.addThrowable(th)) {
                this.done = true;
                a();
            } else {
                f.a.h.a.a(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.b.i$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        private boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                if (aVarArr == f157317b) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        private void b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.subscribers.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i2 = 0;
                    while (aVarArr[i2] != aVar) {
                        i2++;
                        if (i2 >= length) {
                            return;
                        }
                    }
                    if (i2 >= 0) {
                        if (length == 1) {
                            aVarArr2 = f157316a;
                        } else {
                            aVarArr2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                            System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i2 = this.maxConcurrency;
                    if (i2 == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                    } else {
                        dVar.request((long) i2);
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
        @Override // org.a.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r12) {
            /*
            // Method dump skipped, instructions count: 247
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.b.i.b.onNext(java.lang.Object):void");
        }

        b(c<? super U> cVar, g<? super T, ? extends org.a.b<? extends U>> gVar, boolean z, int i2, int i3) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i2;
            this.bufferSize = i3;
            this.scalarLimit = Math.max(1, i2 >> 1);
            atomicReference.lazySet(f157316a);
        }
    }

    @Override // f.a.h
    public final void a(c<? super U> cVar) {
        if (!y.a(this.f157263b, cVar, this.f157312c)) {
            this.f157263b.a((l) new b(cVar, this.f157312c, this.f157313d, this.f157314e, this.f157315f));
        }
    }

    public i(f.a.h<T> hVar, g<? super T, ? extends org.a.b<? extends U>> gVar, int i2, int i3) {
        super(hVar);
        this.f157312c = gVar;
        this.f157314e = i2;
        this.f157315f = i3;
    }
}
