package com.bytedance.assem.jedi_vm.viewModel;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.g;
import f.a.d.f;
import f.a.e.d.o;
import f.a.z;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class LifecycleAwareObserver<T> extends AtomicReference<f.a.b.b> implements k, f.a.b.b, z<T> {
    private final boolean alwaysDeliverLastValueWhenActivate;
    private final boolean force;
    private final AtomicBoolean isActive;
    private final boolean isUsedInReusedScene;
    private T lastValue;
    public m owner;
    public z<T> sourceObserver;
    private T undeliveredValue;

    static {
        Covode.recordClassIndex(15023);
    }

    @Override // f.a.z
    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == a.f25759a) {
            return true;
        }
        return false;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LifecycleAwareObserver f25753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f25754b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i.a f25755c;

        static {
            Covode.recordClassIndex(15025);
        }

        b(LifecycleAwareObserver lifecycleAwareObserver, m mVar, i.a aVar) {
            this.f25753a = lifecycleAwareObserver;
            this.f25754b = mVar;
            this.f25755c = aVar;
        }

        public final void run() {
            this.f25753a.onLifecycleEvent(this.f25754b);
            if (this.f25755c == i.a.ON_DESTROY) {
                this.f25753a.onDestroy();
            }
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LifecycleAwareObserver f25756a;

        static {
            Covode.recordClassIndex(15026);
        }

        public c(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f25756a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f25756a.requireOwner().getLifecycle().a(this.f25756a);
            this.f25756a.requireSourceObserver().onSubscribe(this.f25756a);
        }
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.b.b bVar;
        Object obj = get();
        f.a.b.b bVar2 = a.f25759a;
        if (obj != bVar2 && (bVar = (f.a.b.b) getAndSet(bVar2)) != bVar2 && bVar != null) {
            bVar.dispose();
        }
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

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LifecycleAwareObserver f25752a;

        static {
            Covode.recordClassIndex(15024);
        }

        public a(LifecycleAwareObserver lifecycleAwareObserver) {
            this.f25752a = lifecycleAwareObserver;
        }

        public final void run() {
            this.f25752a.requireOwner().getLifecycle().b(this.f25752a);
            if (!this.f25752a.isDisposed()) {
                this.f25752a.dispose();
            }
            this.f25752a.owner = null;
            this.f25752a.sourceObserver = null;
        }
    }

    public final void onDestroy() {
        if (com.bytedance.assem.jedi_vm.a.d.a()) {
            requireOwner().getLifecycle().b(this);
            if (!isDisposed()) {
                dispose();
            }
            this.owner = null;
            this.sourceObserver = null;
            return;
        }
        com.bytedance.assem.jedi_vm.a.d.f25750a.post(new a(this));
    }

    static final class d<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f25757a;

        static {
            Covode.recordClassIndex(15027);
        }

        d(h.f.a.b bVar) {
            this.f25757a = bVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            this.f25757a.invoke(t);
        }
    }

    static final class e<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f25758a;

        static {
            Covode.recordClassIndex(15028);
        }

        e(h.f.a.b bVar) {
            this.f25758a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            h.f.a.b bVar = this.f25758a;
            if (bVar != null) {
                bVar.invoke(th2);
            } else {
                f.a.h.a.a(th2);
            }
        }
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        l.c(th, "");
        if (!isDisposed()) {
            lazySet(a.f25759a);
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

    public final void onLifecycleEvent(m mVar) {
        boolean z;
        T t;
        i lifecycle = mVar.getLifecycle();
        l.a((Object) lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.STARTED)) {
            if (mVar instanceof g) {
                z = ((g) mVar).h();
            } else {
                z = true;
            }
            if (!this.isActive.getAndSet(true) && !isDisposed()) {
                if (z || !this.alwaysDeliverLastValueWhenActivate) {
                    t = this.undeliveredValue;
                } else {
                    t = this.undeliveredValue;
                    if (t == null) {
                        t = this.lastValue;
                    }
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
            if (get() != a.f25759a) {
                f.a.h.a.a(new f.a.c.e("Disposable already set!"));
            }
        } else if (com.bytedance.assem.jedi_vm.a.d.a()) {
            requireOwner().getLifecycle().a(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            com.bytedance.assem.jedi_vm.a.d.f25750a.post(new c(this));
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (!j.f25648c || !this.isUsedInReusedScene) {
            onLifecycleEvent(mVar);
            if (aVar == i.a.ON_DESTROY) {
                onDestroy();
                return;
            }
            return;
        }
        j.a(true).execute(new b(this, mVar, aVar));
    }

    public LifecycleAwareObserver(m mVar, boolean z, boolean z2, boolean z3, h.f.a.b<? super T, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        l.c(mVar, "");
        l.c(bVar, "");
        this.alwaysDeliverLastValueWhenActivate = z;
        this.force = z2;
        this.isUsedInReusedScene = z3;
        this.owner = mVar;
        this.sourceObserver = new o(new d(bVar), new e(bVar2), f.a.e.b.a.f157190c, f.a.e.b.a.f157191d);
        this.isActive = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleAwareObserver(m mVar, boolean z, boolean z2, boolean z3, h.f.a.b bVar, h.f.a.b bVar2, int i2, h.f.b.g gVar) {
        this(mVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, bVar, (i2 & 32) != 0 ? null : bVar2);
    }
}
