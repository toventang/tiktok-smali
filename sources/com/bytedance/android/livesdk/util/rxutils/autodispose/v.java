package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.c.c;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.f;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

final class v<T> extends AtomicInteger implements c<T> {
    private final org.a.c<? super T> delegate;
    private final c error = new c();
    final AtomicReference<d> mainSubscription = new AtomicReference<>();
    private final AtomicReference<d> ref = new AtomicReference<>();
    private final AtomicLong requested = new AtomicLong();
    private final f scope;
    final AtomicReference<b> scopeDisposable = new AtomicReference<>();

    static {
        Covode.recordClassIndex(13085);
    }

    @Override // f.a.b.b
    public final void dispose() {
        cancel();
    }

    @Override // org.a.d
    public final void cancel() {
        d.a(this.scopeDisposable);
        w.a(this.mainSubscription);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.mainSubscription.get() == w.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.a.c
    public final void onComplete() {
        if (!isDisposed()) {
            this.mainSubscription.lazySet(w.CANCELLED);
            d.a(this.scopeDisposable);
            org.a.c<? super T> cVar = this.delegate;
            c cVar2 = this.error;
            if (getAndIncrement() == 0) {
                Throwable a2 = cVar2.a();
                if (a2 != null) {
                    cVar.onError(a2);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    @Override // org.a.c
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.mainSubscription.lazySet(w.CANCELLED);
            d.a(this.scopeDisposable);
            org.a.c<? super T> cVar = this.delegate;
            c cVar2 = this.error;
            if (!cVar2.a(th)) {
                a.a(th);
            } else if (getAndIncrement() == 0) {
                cVar.onError(cVar2.a());
            }
        }
    }

    @Override // org.a.c
    public final void onNext(T t) {
        if (!isDisposed()) {
            org.a.c<? super T> cVar = this.delegate;
            c cVar2 = this.error;
            if (get() == 0 && compareAndSet(0, 1)) {
                cVar.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable a2 = cVar2.a();
                    if (a2 != null) {
                        cVar.onError(a2);
                    } else {
                        cVar.onComplete();
                    }
                    this.mainSubscription.lazySet(w.CANCELLED);
                    d.a(this.scopeDisposable);
                }
            }
        }
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        AnonymousClass1 r2 = new f.a.g.a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13086);
            }

            @Override // f.a.d
            public final void onComplete() {
                v.this.scopeDisposable.lazySet(d.DISPOSED);
                w.a(v.this.mainSubscription);
            }

            @Override // f.a.d
            public final void onError(Throwable th) {
                v.this.scopeDisposable.lazySet(d.DISPOSED);
                v.this.onError(th);
            }
        };
        if (n.a(this.scopeDisposable, r2, getClass())) {
            this.delegate.onSubscribe(this);
            this.scope.a(r2);
            AtomicReference<d> atomicReference = this.mainSubscription;
            Class<?> cls = getClass();
            s.a(dVar, "next is null");
            if (!atomicReference.compareAndSet(null, dVar)) {
                dVar.cancel();
                if (atomicReference.get() != w.CANCELLED) {
                    n.a(cls);
                    return;
                }
                return;
            }
            AtomicReference<d> atomicReference2 = this.ref;
            AtomicLong atomicLong = this.requested;
            s.a(dVar, "s is null");
            if (!atomicReference2.compareAndSet(null, dVar)) {
                dVar.cancel();
                if (atomicReference2.get() != w.CANCELLED) {
                    a.a(new IllegalStateException("Subscription already set!"));
                    return;
                }
                return;
            }
            long andSet = atomicLong.getAndSet(0);
            if (andSet != 0) {
                dVar.request(andSet);
            }
        }
    }

    @Override // org.a.d
    public final void request(long j2) {
        AtomicReference<d> atomicReference = this.ref;
        AtomicLong atomicLong = this.requested;
        d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j2);
        } else if (j2 <= 0) {
            a.a(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j2))));
        } else {
            l.a(atomicLong, j2);
            d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    v(f fVar, org.a.c<? super T> cVar) {
        this.scope = fVar;
        this.delegate = cVar;
    }
}
