package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.internal.i;
import f.a.t;
import h.f.a.m;
import h.z;

public class x<S extends af, PROP extends af> {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.a f39550a;

    /* renamed from: b  reason: collision with root package name */
    public JediViewModel<S> f39551b;

    /* renamed from: c  reason: collision with root package name */
    public h.k.k<S, ? extends PROP> f39552c;

    /* renamed from: d  reason: collision with root package name */
    public m<? super S, ? super PROP, ? extends S> f39553d;

    static final class d extends h.f.b.m implements h.f.a.b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39554a = new d();

        static {
            Covode.recordClassIndex(24346);
        }

        d() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // h.f.a.b
        public final T invoke(T t) {
            return t;
        }
    }

    static {
        Covode.recordClassIndex(24342);
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $block;
        final /* synthetic */ ae $holder$inlined;

        static {
            Covode.recordClassIndex(24344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.b bVar, ae aeVar) {
            super(0);
            this.$block = bVar;
            this.$holder$inlined = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            g receiver = this.$holder$inlined.getReceiver();
            if (receiver != null) {
                this.$block.invoke(receiver);
            }
            return z.f158842a;
        }
    }

    public final JediViewModel<S> a() {
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        return jediViewModel;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.k.k<S extends com.bytedance.jedi.arch.af, ? extends PROP extends com.bytedance.jedi.arch.af>, h.k.k<S extends com.bytedance.jedi.arch.af, PROP extends com.bytedance.jedi.arch.af> */
    public final h.k.k<S, PROP> b() {
        h.k.k kVar = (h.k.k<S, ? extends PROP>) this.f39552c;
        if (kVar == null) {
            h.f.b.l.a("substate");
        }
        return kVar;
    }

    static final class c extends h.f.b.m implements h.f.a.b<T, z> {
        final /* synthetic */ m $block;
        final /* synthetic */ ae $holder$inlined;

        static {
            Covode.recordClassIndex(24345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, ae aeVar) {
            super(1);
            this.$block = mVar;
            this.$holder$inlined = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            g receiver = this.$holder$inlined.getReceiver();
            if (receiver != null) {
                this.$block.invoke(receiver, obj);
            }
            return z.f158842a;
        }
    }

    static final class f<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39555a;

        static {
            Covode.recordClassIndex(24348);
        }

        f(h.f.a.b bVar) {
            this.f39555a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return new aj(this.f39555a.invoke(obj));
        }
    }

    static final class g<T, R> implements f.a.d.g<Throwable, a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f39556a = new g();

        static {
            Covode.recordClassIndex(24349);
        }

        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.c(th2, "");
            return new f(th2);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<A, z> {
        final /* synthetic */ boolean $force$inlined;
        final /* synthetic */ ae $holder;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ m $subscriber$inlined;
        final /* synthetic */ h $this_selectSubscribe$inlined;
        final /* synthetic */ boolean $uniqueOnly$inlined;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(24352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ae aeVar, x xVar, h hVar, h.k.k kVar, boolean z, boolean z2, m mVar) {
            super(1);
            this.$holder = aeVar;
            this.this$0 = xVar;
            this.$this_selectSubscribe$inlined = hVar;
            this.$prop1$inlined = kVar;
            this.$uniqueOnly$inlined = z;
            this.$force$inlined = z2;
            this.$subscriber$inlined = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            g receiver = this.$holder.getReceiver();
            if (receiver != null) {
                this.$subscriber$inlined.invoke(receiver, obj);
            }
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ m $block;
        final /* synthetic */ ae $holder$inlined;

        static {
            Covode.recordClassIndex(24343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, ae aeVar) {
            super(1);
            this.$block = mVar;
            this.$holder$inlined = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.c(th, "");
            g receiver = this.$holder$inlined.getReceiver();
            if (receiver != null) {
                this.$block.invoke(receiver, th);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<PROP, PROP> {
        final /* synthetic */ m $stateReducer;

        static {
            Covode.recordClassIndex(24347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(m mVar) {
            super(1);
            this.$stateReducer = mVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            h.f.b.l.c(obj, "");
            return this.$stateReducer.invoke(obj, new w());
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<S, z> {
        final /* synthetic */ m $block;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(24354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(x xVar, m mVar) {
            super(1);
            this.this$0 = xVar;
            this.$block = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.b.l.c(obj, "");
            this.$block.invoke(obj, this.this$0.b().invoke(obj));
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<S, z> {
        final /* synthetic */ h.f.a.b $block;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(24355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(x xVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = xVar;
            this.$block = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            h.f.b.l.c(obj, "");
            this.$block.invoke(this.this$0.b().invoke(obj));
            return z.f158842a;
        }
    }

    public final void a(h.f.a.b<? super PROP, z> bVar) {
        h.f.b.l.c(bVar, "");
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        jediViewModel.e(new l(this, bVar));
    }

    /* access modifiers changed from: protected */
    public final void b(h.f.a.b<? super PROP, ? extends PROP> bVar) {
        h.f.b.l.c(bVar, "");
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        jediViewModel.f(new j(this, bVar));
    }

    static final class h<T> implements f.a.d.f<a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f39557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f39558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f39559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f39560d;

        static {
            Covode.recordClassIndex(24350);
        }

        h(x xVar, boolean z, Thread thread, m mVar) {
            this.f39557a = xVar;
            this.f39558b = z;
            this.f39559c = thread;
            this.f39560d = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final a aVar = (a) obj;
            if (!this.f39558b || this.f39559c != Thread.currentThread()) {
                this.f39557a.b(new h.f.a.b<PROP, PROP>(this) {
                    /* class com.bytedance.jedi.arch.x.h.AnonymousClass1 */
                    final /* synthetic */ h this$0;

                    static {
                        Covode.recordClassIndex(24351);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.b
                    public final /* synthetic */ Object invoke(Object obj) {
                        h.f.b.l.c(obj, "");
                        m mVar = this.this$0.f39560d;
                        a aVar = aVar;
                        h.f.b.l.a((Object) aVar, "");
                        return mVar.invoke(obj, aVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)".toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<S, S> {
        final /* synthetic */ h.f.a.b $reducer;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(24353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(x xVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = xVar;
            this.$reducer = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            h.f.b.l.c(obj, "");
            m<? super S, ? super PROP, ? extends S> mVar = this.this$0.f39553d;
            if (mVar == null) {
                h.f.b.l.a("mainStateReducer");
            }
            return mVar.invoke(obj, (Object) this.$reducer.invoke(this.this$0.b().invoke(obj)));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(m<? super S, ? super PROP, z> mVar) {
        h.f.b.l.c(mVar, "");
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        jediViewModel.e(new k(this, mVar));
    }

    public final <T> f.a.b.b a(t<T> tVar, m<? super PROP, ? super a<? extends T>, ? extends PROP> mVar) {
        boolean z;
        Thread thread;
        h.f.b.l.c(tVar, "");
        h.f.b.l.c(mVar, "");
        d dVar = d.f39554a;
        h.f.b.l.c(tVar, "");
        h.f.b.l.c(dVar, "");
        h.f.b.l.c(mVar, "");
        if (!j.f39535a || j.f39536b) {
            z = false;
            thread = null;
        } else {
            z = true;
            thread = Thread.currentThread();
        }
        b(new e(mVar));
        f.a.b.b d2 = tVar.d(new f(dVar)).f(g.f39556a).d(new h(this, z, thread, mVar));
        h.f.b.l.a((Object) d2, "");
        h.f.b.l.c(d2, "");
        f.a.b.a aVar = this.f39550a;
        if (aVar == null) {
            h.f.b.l.a("disposables");
        }
        aVar.a(d2);
        return d2;
    }

    public final void a(h.k.k<S, ? extends PROP> kVar, m<? super S, ? super PROP, ? extends S> mVar) {
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(mVar, "");
        this.f39552c = kVar;
        this.f39553d = mVar;
    }

    public final <RECEIVER extends g, A> f.a.b.b a(h<? extends RECEIVER> hVar, h.k.k<PROP, ? extends A> kVar, boolean z, boolean z2, m<? super RECEIVER, ? super A, z> mVar) {
        h.f.b.l.c(hVar, "");
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(mVar, "");
        ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
        h.k.k<S, ? extends PROP> kVar2 = this.f39552c;
        if (kVar2 == null) {
            h.f.b.l.a("substate");
        }
        i iVar = new i(receiverHolder, this, hVar, kVar, z, z2, mVar);
        h.f.b.l.c(jediViewModel, "");
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        h.f.b.l.c(iVar, "");
        t<R> a2 = jediViewModel.bf_().b().d(new i.c(kVar2)).a(f.a.e.b.a.f157188a);
        h.f.b.l.a((Object) a2, "");
        t<R> a3 = a2.d(new i.d(kVar)).a(f.a.e.b.a.f157188a);
        h.f.b.l.a((Object) a3, "");
        return jediViewModel.a(a3, lifecycleOwner, z, z2, com.bytedance.jedi.arch.internal.g.f39500b, new i.e(jediViewModel, lifecycleOwner, z, z2, iVar));
    }

    public final <RECEIVER extends g, T> f.a.b.b a(h<? extends RECEIVER> hVar, h.k.k<PROP, ? extends a<? extends T>> kVar, boolean z, boolean z2, m<? super RECEIVER, ? super Throwable, z> mVar, h.f.a.b<? super RECEIVER, z> bVar, m<? super RECEIVER, ? super T, z> mVar2) {
        h.f.b.l.c(hVar, "");
        h.f.b.l.c(kVar, "");
        ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.f39551b;
        if (jediViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
        h.k.k<S, ? extends PROP> kVar2 = this.f39552c;
        if (kVar2 == null) {
            h.f.b.l.a("substate");
        }
        a aVar = new a(mVar, receiverHolder);
        b bVar2 = new b(bVar, receiverHolder);
        c cVar = new c(mVar2, receiverHolder);
        h.f.b.l.c(jediViewModel, "");
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        t<R> a2 = jediViewModel.bf_().b().d(new i.c(kVar2)).a(f.a.e.b.a.f157188a);
        h.f.b.l.a((Object) a2, "");
        t<R> a3 = a2.d(new i.a(kVar)).a(f.a.e.b.a.f157188a);
        h.f.b.l.a((Object) a3, "");
        return jediViewModel.a(a3, lifecycleOwner, z, z2, com.bytedance.jedi.arch.internal.g.f39500b, new i.b(jediViewModel, lifecycleOwner, z, z2, cVar, aVar, bVar2));
    }
}
