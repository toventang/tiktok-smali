package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.c.i;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicLong;
import org.a.d;

public final class q<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final aa f157332c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157333d = false;

    /* renamed from: e  reason: collision with root package name */
    final int f157334e;

    static {
        Covode.recordClassIndex(104521);
    }

    static abstract class a<T> extends f.a.e.i.a<T> implements l<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        i<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        d upstream;
        final aa.c worker;

        static {
            Covode.recordClassIndex(104522);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public abstract void c();

        @Override // f.a.e.c.i
        public final void clear() {
            this.queue.clear();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        private void d() {
            if (getAndIncrement() == 0) {
                this.worker.a(this);
            }
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                d();
            }
        }

        @Override // org.a.d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void run() {
            if (this.outputFused) {
                a();
            } else if (this.sourceMode == 1) {
                b();
            } else {
                c();
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(this.requested, j2);
                d();
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            d();
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    d();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new f.a.c.c("Queue is full?!");
                    this.done = true;
                }
                d();
            }
        }

        a(aa.c cVar, boolean z, int i2) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(boolean z, boolean z2, org.a.c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }
    }

    static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final f.a.e.c.a<? super T> downstream;

        static {
            Covode.recordClassIndex(104523);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void a() {
            int i2 = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T t = (T) this.queue.poll();
            if (!(t == null || this.sourceMode == 1)) {
                long j2 = this.consumed + 1;
                if (j2 == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j2);
                } else {
                    this.consumed = j2;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void b() {
            f.a.e.c.a<? super T> aVar = this.downstream;
            i iVar = this.queue;
            long j2 = this.produced;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j2 != j3) {
                    try {
                        Object obj = (Object) iVar.poll();
                        if (!this.cancelled) {
                            if (obj == 0) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.a(obj)) {
                                j2++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void c() {
            boolean z;
            f.a.e.c.a<? super T> aVar = this.downstream;
            i iVar = this.queue;
            long j2 = this.produced;
            long j3 = this.consumed;
            int i2 = 1;
            while (true) {
                long j4 = this.requested.get();
                while (j2 != j4) {
                    boolean z2 = this.done;
                    try {
                        Object obj = (Object) iVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!a(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.a(obj)) {
                                j2++;
                            }
                            j3++;
                            if (j3 == ((long) this.limit)) {
                                this.upstream.request(j3);
                                j3 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j2 != j4 || !a(this.done, iVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j2;
                        this.consumed = j3;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // f.a.l, org.a.c
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof f.a.e.c.f) {
                    f.a.e.c.f fVar = (f.a.e.c.f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new f.a.e.f.b(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        b(f.a.e.c.a<? super T> aVar, aa.c cVar, boolean z, int i2) {
            super(cVar, z, i2);
            this.downstream = aVar;
        }
    }

    static final class c<T> extends a<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final org.a.c<? super T> downstream;

        static {
            Covode.recordClassIndex(104524);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void a() {
            int i2 = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T t = (T) this.queue.poll();
            if (!(t == null || this.sourceMode == 1)) {
                long j2 = this.produced + 1;
                if (j2 == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j2);
                } else {
                    this.produced = j2;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void b() {
            org.a.c<? super T> cVar = this.downstream;
            i iVar = this.queue;
            long j2 = this.produced;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j2 != j3) {
                    try {
                        Object obj = (Object) iVar.poll();
                        if (!this.cancelled) {
                            if (obj == 0) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(obj);
                            j2++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.b.q.a
        public final void c() {
            boolean z;
            org.a.c<? super T> cVar = this.downstream;
            i iVar = this.queue;
            long j2 = this.produced;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j2 != j3) {
                    boolean z2 = this.done;
                    try {
                        Object obj = (Object) iVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(obj);
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                if (j3 != Long.MAX_VALUE) {
                                    j3 = this.requested.addAndGet(-j2);
                                }
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j2 != j3 || !a(this.done, iVar.isEmpty(), cVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // f.a.l, org.a.c
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof f.a.e.c.f) {
                    f.a.e.c.f fVar = (f.a.e.c.f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new f.a.e.f.b(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        c(org.a.c<? super T> cVar, aa.c cVar2, boolean z, int i2) {
            super(cVar2, z, i2);
            this.downstream = cVar;
        }
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        aa.c a2 = this.f157332c.a();
        if (cVar instanceof f.a.e.c.a) {
            this.f157263b.a((l) new b((f.a.e.c.a) cVar, a2, this.f157333d, this.f157334e));
        } else {
            this.f157263b.a((l) new c(cVar, a2, this.f157333d, this.f157334e));
        }
    }

    public q(h<T> hVar, aa aaVar, int i2) {
        super(hVar);
        this.f157332c = aaVar;
        this.f157334e = i2;
    }
}
