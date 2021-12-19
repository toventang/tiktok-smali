package com.bytedance.jedi.arch.internal;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ad;
import f.a.c.e;
import f.a.d.f;
import f.a.e.d.o;
import f.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class LifecycleAwareObserver<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, z<T>, z {
    private final boolean alwaysDeliverLastValueWhenActivate;
    private final boolean force;
    private final AtomicBoolean isActive;
    private T lastValue;
    private m owner;
    private z<T> sourceObserver;
    private T undeliveredValue;

    static {
        Covode.recordClassIndex(24281);
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        onLifecycleEvent(mVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // f.a.z
    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == b.f39470a) {
            return true;
        }
        return false;
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LifecycleAwareObserver f39462a;

        static {
            Covode.recordClassIndex(24282);
        }

        public a(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f39462a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f39462a.requireOwner().getLifecycle().a(this.f39462a);
            this.f39462a.requireSourceObserver().onSubscribe(this.f39462a);
        }
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.b.b bVar;
        Object obj = get();
        f.a.b.b bVar2 = b.f39470a;
        if (obj != bVar2 && (bVar = (f.a.b.b) getAndSet(bVar2)) != bVar2 && bVar != null) {
            bVar.dispose();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        requireOwner().getLifecycle().b(this);
        if (!isDisposed()) {
            dispose();
        }
        this.owner = null;
        this.sourceObserver = null;
    }

    public final m requireOwner() {
        m mVar = this.owner;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    public final z<T> requireSourceObserver() {
        z<T> zVar = this.sourceObserver;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    static final class b<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39463a;

        static {
            Covode.recordClassIndex(24283);
        }

        b(h.f.a.b bVar) {
            this.f39463a = bVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            this.f39463a.invoke(t);
        }
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        l.c(th, "");
        if (!isDisposed()) {
            lazySet(b.f39470a);
            requireSourceObserver().onError(th);
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        if (this.force) {
            requireSourceObserver().onNext(t);
        } else if (this.isActive.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.undeliveredValue = t;
        }
        this.lastValue = t;
    }

    @v(a = i.a.ON_ANY)
    public final void onLifecycleEvent(m mVar) {
        boolean z;
        T t;
        l.c(mVar, "");
        i lifecycle = mVar.getLifecycle();
        l.a((Object) lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.STARTED)) {
            if (mVar instanceof ad) {
                z = ((ad) mVar).a();
            } else {
                z = true;
            }
            if (!this.isActive.getAndSet(true) && !isDisposed()) {
                if (z || !this.alwaysDeliverLastValueWhenActivate || (t = this.lastValue) == null) {
                    t = this.undeliveredValue;
                }
                this.undeliveredValue = null;
                if (t != null) {
                    onNext(t);
                    return;
                }
                return;
            }
            return;
        }
        this.isActive.set(false);
    }

    @Override // f.a.z
    public final void onSubscribe(f.a.b.b bVar) {
        l.c(bVar, "");
        if (!compareAndSet(null, bVar)) {
            bVar.dispose();
            if (get() != b.f39470a) {
                f.a.h.a.a(new e("Disposable already set!"));
            }
        } else if (g.a()) {
            requireOwner().getLifecycle().a(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            g.f39499a.post(new a(this));
        }
    }

    public LifecycleAwareObserver(m mVar, boolean z, boolean z2, h.f.a.b<? super T, h.z> bVar) {
        l.c(mVar, "");
        l.c(bVar, "");
        this.alwaysDeliverLastValueWhenActivate = z;
        this.force = z2;
        this.owner = mVar;
        this.sourceObserver = new o(new b(bVar), f.a.e.b.a.f157193f, f.a.e.b.a.f157190c, f.a.e.b.a.f157191d);
        this.isActive = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleAwareObserver(m mVar, boolean z, boolean z2, h.f.a.b bVar, int i2, g gVar) {
        this(mVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, bVar);
    }
}
