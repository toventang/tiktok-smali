package com.bytedance.jedi.arch;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import f.a.aa;
import f.a.t;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.k.k;
import h.w;
import h.z;

public abstract class JediViewModel<S extends af> extends ac {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ i[] f39361h = {new y(ab.a(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/internal/StoreOwner;")};

    /* renamed from: a  reason: collision with root package name */
    private final h f39362a = h.i.a((h.f.a.a) new g(this));

    /* renamed from: b  reason: collision with root package name */
    private final f.a.b.a f39363b = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    S f39364i;

    /* renamed from: j  reason: collision with root package name */
    public final z f39365j = new aa();

    static final class a extends m implements h.f.a.b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39366a = new a();

        static {
            Covode.recordClassIndex(24146);
        }

        a() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // h.f.a.b
        public final T invoke(T t) {
            return t;
        }
    }

    static final class b extends m implements h.f.a.b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39367a = new b();

        static {
            Covode.recordClassIndex(24147);
        }

        b() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // h.f.a.b
        public final T invoke(T t) {
            return t;
        }
    }

    public final com.bytedance.jedi.arch.internal.h<S> bf_() {
        return (com.bytedance.jedi.arch.internal.h) this.f39362a.getValue();
    }

    public void bg_() {
    }

    /* access modifiers changed from: protected */
    public abstract S d();

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.f39363b.a();
    }

    public final S at_() {
        return bf_().a();
    }

    static {
        Covode.recordClassIndex(24145);
    }

    static final class g extends m implements h.f.a.a<com.bytedance.jedi.arch.internal.h<S>> {
        final /* synthetic */ JediViewModel this$0;

        static {
            Covode.recordClassIndex(24153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(JediViewModel jediViewModel) {
            super(0);
            this.this$0 = jediViewModel;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            JediViewModel jediViewModel = this.this$0;
            S s = jediViewModel.f39364i;
            if (s != null) {
                Object invoke = j.f39537c.invoke(jediViewModel, s);
                if (invoke != null) {
                    return new com.bytedance.jedi.arch.internal.h((ag) invoke);
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalArgumentException(("Cannot visit store before ViewModel(" + jediViewModel.getClass() + ") is initialized").toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39368a;

        static {
            Covode.recordClassIndex(24149);
        }

        d(h.f.a.b bVar) {
            this.f39368a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return new aj(this.f39368a.invoke(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g<Throwable, a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f39369a = new e();

        static {
            Covode.recordClassIndex(24150);
        }

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            return new f(th2);
        }
    }

    private void g(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        bf_().c(bVar);
    }

    public final void b_(h.f.a.b<? super S, z> bVar) {
        l.c(bVar, "");
        e(bVar);
    }

    public final void c(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        f(bVar);
    }

    public final void d(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        g(bVar);
    }

    public final void e(h.f.a.b<? super S, z> bVar) {
        l.c(bVar, "");
        bf_().a(bVar);
    }

    public final void f(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        bf_().b(bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<S, S> {
        final /* synthetic */ h.f.a.m $stateReducer;

        static {
            Covode.recordClassIndex(24148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.m mVar) {
            super(1);
            this.$stateReducer = mVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return this.$stateReducer.invoke(obj, new w());
        }
    }

    public final void a_(h.f.a.b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        if (this.f39364i == null) {
            this.f39364i = (S) ((af) bVar.invoke(d()));
            bg_();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f<a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f39371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f39372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f39373d;

        static {
            Covode.recordClassIndex(24151);
        }

        f(JediViewModel jediViewModel, boolean z, Thread thread, h.f.a.m mVar) {
            this.f39370a = jediViewModel;
            this.f39371b = z;
            this.f39372c = thread;
            this.f39373d = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final a aVar = (a) obj;
            if (!this.f39371b || this.f39372c != Thread.currentThread()) {
                this.f39370a.c(new h.f.a.b<S, S>(this) {
                    /* class com.bytedance.jedi.arch.JediViewModel.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(24152);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.b
                    public final /* synthetic */ Object invoke(Object obj) {
                        l.c(obj, "");
                        h.f.a.m mVar = this.this$0.f39373d;
                        a aVar = aVar;
                        l.a((Object) aVar, "");
                        return mVar.invoke(obj, aVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)".toString());
        }
    }

    public final f.a.b.b a(f.a.b.b bVar) {
        l.c(bVar, "");
        this.f39363b.a(bVar);
        return bVar;
    }

    public final <PROP, MW extends x<S, PROP>> void a(MW mw) {
        l.c(mw, "");
        f.a.b.a aVar = this.f39363b;
        l.c(aVar, "");
        l.c(this, "");
        mw.f39550a = aVar;
        mw.f39551b = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super S extends com.bytedance.jedi.arch.af, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends S extends com.bytedance.jedi.arch.af> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public final <T> f.a.b.b a(f.a.ab<T> abVar, h.f.a.m<? super S, ? super a<? extends T>, ? extends S> mVar) {
        l.c(abVar, "");
        l.c(mVar, "");
        t<T> d2 = abVar.d();
        l.a((Object) d2, "");
        return a(d2, a.f39366a, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super S extends com.bytedance.jedi.arch.af, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends S extends com.bytedance.jedi.arch.af> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> f.a.b.b a(t<T> tVar, h.f.a.m<? super S, ? super a<? extends T>, ? extends S> mVar) {
        l.c(tVar, "");
        l.c(mVar, "");
        return a(tVar, b.f39367a, mVar);
    }

    private <T, V> f.a.b.b a(t<T> tVar, h.f.a.b<? super T, ? extends V> bVar, h.f.a.m<? super S, ? super a<? extends V>, ? extends S> mVar) {
        boolean z;
        Thread thread;
        l.c(tVar, "");
        l.c(bVar, "");
        l.c(mVar, "");
        if (!j.f39535a || j.f39536b) {
            z = false;
            thread = null;
        } else {
            z = true;
            thread = Thread.currentThread();
        }
        c(new c(mVar));
        f.a.b.b d2 = tVar.d(new d(bVar)).f(e.f39369a).d(new f(this, z, thread, mVar));
        l.a((Object) d2, "");
        return a(d2);
    }

    /* access modifiers changed from: protected */
    public final <A> f.a.b.b a(k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.b<? super A, z> bVar) {
        l.c(kVar, "");
        l.c(ahVar, "");
        l.c(bVar, "");
        return com.bytedance.jedi.arch.internal.i.a(this, null, kVar, ahVar, bVar);
    }

    public final <T> f.a.b.b a(t<T> tVar, androidx.lifecycle.m mVar, boolean z, boolean z2, aa aaVar, h.f.a.b<? super T, z> bVar) {
        l.c(tVar, "");
        l.c(bVar, "");
        if (mVar == null) {
            if (aaVar != null) {
                tVar = tVar.a(aaVar);
            }
            f.a.b.b d2 = tVar.d(new r(bVar));
            l.a((Object) d2, "");
            return a(d2);
        }
        if (aaVar != null) {
            tVar = tVar.a(aaVar);
        }
        f.a.z c2 = tVar.c(new LifecycleAwareObserver(mVar, !z, z2, bVar));
        l.a((Object) c2, "");
        return a((f.a.b.b) c2);
    }
}
