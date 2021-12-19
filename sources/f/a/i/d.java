package f.a.i;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.e.f.c;
import f.a.e.i.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    final c<T> f157983b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Runnable> f157984c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157985d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f157986e;

    /* renamed from: f  reason: collision with root package name */
    Throwable f157987f;

    /* renamed from: g  reason: collision with root package name */
    final AtomicReference<org.a.c<? super T>> f157988g;

    /* renamed from: h  reason: collision with root package name */
    volatile boolean f157989h;

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f157990i;

    /* renamed from: j  reason: collision with root package name */
    final f.a.e.i.a<T> f157991j;

    /* renamed from: k  reason: collision with root package name */
    final AtomicLong f157992k;

    /* renamed from: l  reason: collision with root package name */
    boolean f157993l;

    static {
        Covode.recordClassIndex(104892);
    }

    final class a extends f.a.e.i.a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        static {
            Covode.recordClassIndex(104893);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            d.this.f157983b.clear();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return d.this.f157983b.isEmpty();
        }

        @Override // f.a.e.c.i
        public final T poll() {
            return d.this.f157983b.poll();
        }

        @Override // org.a.d
        public final void cancel() {
            if (!d.this.f157989h) {
                d.this.f157989h = true;
                d.this.g();
                if (!d.this.f157993l && d.this.f157991j.getAndIncrement() == 0) {
                    d.this.f157983b.clear();
                    d.this.f157988g.lazySet(null);
                }
            }
        }

        a() {
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            d.this.f157993l = true;
            return 2;
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(d.this.f157992k, j2);
                d.this.h();
            }
        }
    }

    public d() {
        this(8);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        Runnable andSet = this.f157984c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    @Override // org.a.c
    public final void onComplete() {
        if (!this.f157986e && !this.f157989h) {
            this.f157986e = true;
            g();
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        boolean z;
        if (this.f157991j.getAndIncrement() == 0) {
            org.a.c<? super T> cVar = this.f157988g.get();
            int i2 = 1;
            int i3 = 1;
            while (cVar == null) {
                i3 = this.f157991j.addAndGet(-i3);
                if (i3 != 0) {
                    cVar = this.f157988g.get();
                    i2 = 1;
                } else {
                    return;
                }
            }
            if (this.f157993l) {
                c<T> cVar2 = this.f157983b;
                int i4 = (this.f157985d ? 1 : 0) ^ i2;
                while (!this.f157989h) {
                    boolean z2 = this.f157986e;
                    if (i4 == 0 || !z2 || this.f157987f == null) {
                        cVar.onNext(null);
                        if (z2) {
                            this.f157988g.lazySet(null);
                            Throwable th = this.f157987f;
                            if (th != null) {
                                cVar.onError(th);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        } else {
                            i2 = this.f157991j.addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    } else {
                        cVar2.clear();
                        this.f157988g.lazySet(null);
                        cVar.onError(this.f157987f);
                        return;
                    }
                }
                cVar2.clear();
                this.f157988g.lazySet(null);
                return;
            }
            c<T> cVar3 = this.f157983b;
            boolean z3 = !this.f157985d;
            int i5 = 1;
            do {
                long j2 = this.f157992k.get();
                long j3 = 0;
                while (j2 != j3) {
                    boolean z4 = this.f157986e;
                    T poll = cVar3.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!a(z3, z4, z, cVar, cVar3)) {
                        if (z) {
                            break;
                        }
                        cVar.onNext(poll);
                        j3++;
                    } else {
                        return;
                    }
                }
                if (j2 != j3 || !a(z3, this.f157986e, cVar3.isEmpty(), cVar, cVar3)) {
                    if (!(j3 == 0 || j2 == Long.MAX_VALUE)) {
                        this.f157992k.addAndGet(-j3);
                    }
                    i5 = this.f157991j.addAndGet(-i5);
                } else {
                    return;
                }
            } while (i5 != 0);
        }
    }

    @Override // org.a.c
    public final void onError(Throwable th) {
        b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f157986e || this.f157989h) {
            f.a.h.a.a(th);
            return;
        }
        this.f157987f = th;
        this.f157986e = true;
        g();
        h();
    }

    @Override // org.a.c
    public final void onNext(T t) {
        b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f157986e && !this.f157989h) {
            this.f157983b.offer(t);
            h();
        }
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(org.a.d dVar) {
        if (this.f157986e || this.f157989h) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    private d(int i2) {
        this.f157983b = new c<>(b.a(8, "capacityHint"));
        this.f157984c = new AtomicReference<>(null);
        this.f157985d = true;
        this.f157988g = new AtomicReference<>();
        this.f157990i = new AtomicBoolean();
        this.f157991j = new a();
        this.f157992k = new AtomicLong();
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        if (this.f157990i.get() || !this.f157990i.compareAndSet(false, true)) {
            f.a.e.i.c.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f157991j);
        this.f157988g.set(cVar);
        if (this.f157989h) {
            this.f157988g.lazySet(null);
        } else {
            h();
        }
    }

    private boolean a(boolean z, boolean z2, boolean z3, org.a.c<? super T> cVar, c<T> cVar2) {
        if (this.f157989h) {
            cVar2.clear();
            this.f157988g.lazySet(null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.f157987f != null) {
                cVar2.clear();
                this.f157988g.lazySet(null);
                cVar.onError(this.f157987f);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.f157987f;
                this.f157988g.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }
}
