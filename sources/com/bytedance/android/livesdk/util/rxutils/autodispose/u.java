package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.c.b;
import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.f;
import f.a.g.a;
import java.util.concurrent.atomic.AtomicReference;

final class u<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<f.a.b.b> f22173a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<f.a.b.b> f22174b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final f f22175c;

    /* renamed from: d  reason: collision with root package name */
    private final ae<? super T> f22176d;

    static {
        Covode.recordClassIndex(13083);
    }

    @Override // f.a.b.b
    public final void dispose() {
        d.a(this.f22174b);
        d.a(this.f22173a);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.f22173a.get() == d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.ae
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f22173a.lazySet(d.DISPOSED);
            d.a(this.f22174b);
            this.f22176d.onError(th);
        }
    }

    @Override // f.a.ae
    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f22173a.lazySet(d.DISPOSED);
            d.a(this.f22174b);
            this.f22176d.onSuccess(t);
        }
    }

    @Override // f.a.ae
    public final void onSubscribe(f.a.b.b bVar) {
        AnonymousClass1 r2 = new a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13084);
            }

            @Override // f.a.d
            public final void onComplete() {
                u.this.f22174b.lazySet(d.DISPOSED);
                d.a(u.this.f22173a);
            }

            @Override // f.a.d
            public final void onError(Throwable th) {
                u.this.f22174b.lazySet(d.DISPOSED);
                u.this.onError(th);
            }
        };
        if (n.a(this.f22174b, r2, getClass())) {
            this.f22176d.onSubscribe(this);
            this.f22175c.a(r2);
            n.a(this.f22173a, bVar, getClass());
        }
    }

    u(f fVar, ae<? super T> aeVar) {
        this.f22175c = fVar;
        this.f22176d = aeVar;
    }
}
