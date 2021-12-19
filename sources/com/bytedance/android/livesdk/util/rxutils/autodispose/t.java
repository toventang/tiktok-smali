package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.c.a;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.f;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class t<T> extends AtomicInteger implements a<T> {
    private final z<? super T> delegate;
    private final c error = new c();
    final AtomicReference<b> mainDisposable = new AtomicReference<>();
    private final f scope;
    final AtomicReference<b> scopeDisposable = new AtomicReference<>();

    static {
        Covode.recordClassIndex(13081);
    }

    @Override // f.a.b.b
    public final void dispose() {
        d.a(this.scopeDisposable);
        d.a(this.mainDisposable);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.mainDisposable.get() == d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.z
    public final void onComplete() {
        if (!isDisposed()) {
            this.mainDisposable.lazySet(d.DISPOSED);
            d.a(this.scopeDisposable);
            z<? super T> zVar = this.delegate;
            c cVar = this.error;
            if (getAndIncrement() == 0) {
                Throwable a2 = cVar.a();
                if (a2 != null) {
                    zVar.onError(a2);
                } else {
                    zVar.onComplete();
                }
            }
        }
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.mainDisposable.lazySet(d.DISPOSED);
            d.a(this.scopeDisposable);
            z<? super T> zVar = this.delegate;
            c cVar = this.error;
            if (!cVar.a(th)) {
                f.a.h.a.a(th);
            } else if (getAndIncrement() == 0) {
                zVar.onError(cVar.a());
            }
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        if (!isDisposed()) {
            z<? super T> zVar = this.delegate;
            c cVar = this.error;
            if (get() == 0 && compareAndSet(0, 1)) {
                zVar.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable a2 = cVar.a();
                    if (a2 != null) {
                        zVar.onError(a2);
                    } else {
                        zVar.onComplete();
                    }
                    this.mainDisposable.lazySet(d.DISPOSED);
                    d.a(this.scopeDisposable);
                }
            }
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        AnonymousClass1 r2 = new f.a.g.a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.t.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13082);
            }

            @Override // f.a.d
            public final void onComplete() {
                t.this.scopeDisposable.lazySet(d.DISPOSED);
                d.a(t.this.mainDisposable);
            }

            @Override // f.a.d
            public final void onError(Throwable th) {
                t.this.scopeDisposable.lazySet(d.DISPOSED);
                t.this.onError(th);
            }
        };
        if (n.a(this.scopeDisposable, r2, getClass())) {
            this.delegate.onSubscribe(this);
            this.scope.a(r2);
            n.a(this.mainDisposable, bVar, getClass());
        }
    }

    t(f fVar, z<? super T> zVar) {
        this.scope = fVar;
        this.delegate = zVar;
    }
}
