package com.bytedance.assem.jedi_vm.viewModel;

import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.n;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.t;
import f.a.x;
import h.z;
import java.util.concurrent.Executor;
import kotlinx.coroutines.am;

public final class b<S extends com.bytedance.assem.arch.viewModel.j> implements com.bytedance.assem.arch.viewModel.g<S> {

    /* renamed from: a  reason: collision with root package name */
    public am f25760a;

    /* renamed from: b  reason: collision with root package name */
    public S f25761b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25762c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a.b.a f25763d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f25764e;

    static {
        Covode.recordClassIndex(15031);
    }

    public b(byte b2) {
        this();
    }

    private final com.bytedance.assem.jedi_vm.a.e<S> c() {
        return (com.bytedance.assem.jedi_vm.a.e) this.f25764e.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void a(am amVar) {
        h.f.b.l.c(amVar, "");
        this.f25760a = amVar;
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final <R> void a(h.k.k<S, ? extends com.bytedance.assem.arch.extensions.f<? extends R>> kVar, com.bytedance.assem.arch.viewModel.k<p<com.bytedance.assem.arch.extensions.f<R>>> kVar2, h.f.a.a<Boolean> aVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.a<z> aVar2, h.f.a.b<? super R, z> bVar2) {
        aa aaVar;
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        boolean z = com.bytedance.assem.arch.extensions.j.f25648c && kVar2.f25727f;
        t<R> a2 = d().a(new k(aVar, kVar2)).d(new a(kVar)).a(kVar2.f25723b);
        if (kVar2.f25722a) {
            a2 = a2.f();
        }
        Executor a3 = com.bytedance.assem.arch.extensions.j.a(kVar2.f25727f);
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        h.f.b.l.a((Object) a2, "");
        boolean z2 = kVar2.f25724c;
        if (kVar2.f25728g || z) {
            aaVar = f.a.k.a.a(a3);
        } else {
            aaVar = com.bytedance.assem.jedi_vm.a.d.f25751b;
        }
        a(a2, (m) null, z2, aaVar, kVar2.f25727f, (h.f.a.b<? super Throwable, z>) null, new C0545b(lVar, this, kVar2, null, z, null, aVar2, bVar, bVar2));
    }

    public /* synthetic */ b() {
        this(false);
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void b() {
        this.f25763d.a();
    }

    private t<S> d() {
        return c().a();
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final S a() {
        return c().b();
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.a.a<S>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            Executor a2 = com.bytedance.assem.arch.extensions.j.a(this.this$0.f25762c);
            S s = this.this$0.f25761b;
            if (s == null) {
                h.f.b.l.a("defaultState");
            }
            aa a3 = f.a.k.a.a(a2);
            h.f.b.l.a((Object) a3, "");
            return new com.bytedance.assem.jedi_vm.a.a(s, a3);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void a(S s) {
        h.f.b.l.c(s, "");
        this.f25761b = s;
    }

    private f.a.b.b a(f.a.b.b bVar) {
        h.f.b.l.c(bVar, "");
        this.f25763d.a(bVar);
        return bVar;
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void b(h.f.a.b<? super S, z> bVar) {
        h.f.b.l.c(bVar, "");
        c().a(bVar);
    }

    public static final class a<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f25765a;

        static {
            Covode.recordClassIndex(15032);
        }

        public a(h.k.k kVar) {
            this.f25765a = kVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new p(this.f25765a.get(obj));
        }
    }

    public static final class c<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f25767a;

        static {
            Covode.recordClassIndex(15036);
        }

        public c(h.k.k kVar) {
            this.f25767a = kVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new p(this.f25767a.get(obj));
        }
    }

    public static final class e<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f25769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.k.k f25770b;

        static {
            Covode.recordClassIndex(15040);
        }

        public e(h.k.k kVar, h.k.k kVar2) {
            this.f25769a = kVar;
            this.f25770b = kVar2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new q(this.f25769a.get(obj), this.f25770b.get(obj));
        }
    }

    public static final class g<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f25772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.k.k f25773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f25774c;

        static {
            Covode.recordClassIndex(15044);
        }

        public g(h.k.k kVar, h.k.k kVar2, h.k.k kVar3) {
            this.f25772a = kVar;
            this.f25773b = kVar2;
            this.f25774c = kVar3;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new r(this.f25772a.get(obj), this.f25773b.get(obj), this.f25774c.get(obj));
        }
    }

    public static final class k<T> implements f.a.d.k<S> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k f25782b;

        static {
            Covode.recordClassIndex(15052);
        }

        public k(h.f.a.a aVar, com.bytedance.assem.arch.viewModel.k kVar) {
            this.f25781a = aVar;
            this.f25782b = kVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            Boolean bool;
            h.f.b.l.c(obj, "");
            h.f.a.a aVar = this.f25781a;
            if (aVar == null || !(!this.f25782b.f25729h) || (bool = (Boolean) aVar.invoke()) == null) {
                return true;
            }
            return bool.booleanValue();
        }
    }

    public b(boolean z) {
        this.f25762c = z;
        this.f25763d = new f.a.b.a();
        this.f25764e = h.i.a((h.f.a.a) new l(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void c(h.f.a.b<? super S, ? extends S> bVar) {
        h.f.b.l.c(bVar, "");
        c().c(bVar);
    }

    public static final class d extends h.f.b.m implements h.f.a.b<p<A>, z> {
        final /* synthetic */ boolean $asyncObserve$inlined;
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k $config$inlined;
        final /* synthetic */ com.bytedance.assem.arch.extensions.l $interceptDispatch;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ m $owner$inlined;
        final /* synthetic */ h.f.a.b $subscriber$inlined$1;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.assem.arch.extensions.l lVar, b bVar, com.bytedance.assem.arch.viewModel.k kVar, m mVar, boolean z, h.f.a.b bVar2, h.f.a.b bVar3) {
            super(1);
            this.$interceptDispatch = lVar;
            this.this$0 = bVar;
            this.$config$inlined = kVar;
            this.$owner$inlined = mVar;
            this.$asyncObserve$inlined = z;
            this.$onError$inlined = bVar2;
            this.$subscriber$inlined$1 = bVar3;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.p<A> */
        @Override // h.f.a.b
        public final void invoke(final p<A> pVar) {
            if (!this.$asyncObserve$inlined || this.$config$inlined.f25728g) {
                this.$subscriber$inlined$1.invoke(pVar.f25659a);
                return;
            }
            final AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.jedi_vm.viewModel.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(15038);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final void invoke() {
                    this.this$0.$subscriber$inlined$1.invoke(((p) pVar).f25659a);
                }
            };
            com.bytedance.assem.arch.extensions.l lVar = this.$interceptDispatch;
            if (lVar != null && lVar.a(1, this.$config$inlined.f25730i, r3)) {
                return;
            }
            if (com.bytedance.assem.jedi_vm.a.d.a()) {
                r3.invoke();
            } else {
                com.bytedance.assem.jedi_vm.a.d.f25750a.post(new Runnable() {
                    /* class com.bytedance.assem.jedi_vm.viewModel.b.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15039);
                    }

                    public final void run() {
                        r3.invoke();
                    }
                });
            }
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<q<A, B>, z> {
        final /* synthetic */ boolean $asyncObserve$inlined;
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k $config$inlined;
        final /* synthetic */ com.bytedance.assem.arch.extensions.l $interceptDispatch;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ m $owner$inlined;
        final /* synthetic */ h.f.a.m $subscriber$inlined$1;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.assem.arch.extensions.l lVar, b bVar, com.bytedance.assem.arch.viewModel.k kVar, m mVar, boolean z, h.f.a.b bVar2, h.f.a.m mVar2) {
            super(1);
            this.$interceptDispatch = lVar;
            this.this$0 = bVar;
            this.$config$inlined = kVar;
            this.$owner$inlined = mVar;
            this.$asyncObserve$inlined = z;
            this.$onError$inlined = bVar2;
            this.$subscriber$inlined$1 = mVar2;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.q<A, B> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.q<A, B> */
        @Override // h.f.a.b
        public final void invoke(final q<A, B> qVar) {
            if (!this.$asyncObserve$inlined || this.$config$inlined.f25728g) {
                q<A, B> qVar2 = qVar;
                this.$subscriber$inlined$1.invoke(qVar2.f25660a, qVar2.f25661b);
                return;
            }
            final AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.jedi_vm.viewModel.b.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(15042);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final void invoke() {
                    q qVar = (q) qVar;
                    this.this$0.$subscriber$inlined$1.invoke(qVar.f25660a, qVar.f25661b);
                }
            };
            com.bytedance.assem.arch.extensions.l lVar = this.$interceptDispatch;
            if (lVar != null && lVar.a(1, this.$config$inlined.f25730i, r3)) {
                return;
            }
            if (com.bytedance.assem.jedi_vm.a.d.a()) {
                r3.invoke();
            } else {
                com.bytedance.assem.jedi_vm.a.d.f25750a.post(new Runnable() {
                    /* class com.bytedance.assem.jedi_vm.viewModel.b.f.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15043);
                    }

                    public final void run() {
                        r3.invoke();
                    }
                });
            }
        }
    }

    public static final class i<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f25776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.k.k f25777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f25778c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.k.k f25779d;

        static {
            Covode.recordClassIndex(15048);
        }

        public i(h.k.k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4) {
            this.f25776a = kVar;
            this.f25777b = kVar2;
            this.f25778c = kVar3;
            this.f25779d = kVar4;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new s(this.f25776a.get(obj), this.f25777b.get(obj), this.f25778c.get(obj), this.f25779d.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$b  reason: collision with other inner class name */
    public static final class C0545b extends h.f.b.m implements h.f.a.b<p<com.bytedance.assem.arch.extensions.f<? extends R>>, z> {
        final /* synthetic */ boolean $asyncObserve$inlined;
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k $config$inlined;
        final /* synthetic */ com.bytedance.assem.arch.extensions.l $interceptDispatch;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ h.f.a.b $onError$inlined$1;
        final /* synthetic */ h.f.a.a $onLoading$inlined;
        final /* synthetic */ h.f.a.b $onSuccess$inlined;
        final /* synthetic */ m $owner$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0545b(com.bytedance.assem.arch.extensions.l lVar, b bVar, com.bytedance.assem.arch.viewModel.k kVar, m mVar, boolean z, h.f.a.b bVar2, h.f.a.a aVar, h.f.a.b bVar3, h.f.a.b bVar4) {
            super(1);
            this.$interceptDispatch = lVar;
            this.this$0 = bVar;
            this.$config$inlined = kVar;
            this.$owner$inlined = mVar;
            this.$asyncObserve$inlined = z;
            this.$onError$inlined = bVar2;
            this.$onLoading$inlined = aVar;
            this.$onError$inlined$1 = bVar3;
            this.$onSuccess$inlined = bVar4;
        }

        /* JADX WARN: Unknown type variable: R in type: com.bytedance.assem.arch.extensions.p<com.bytedance.assem.arch.extensions.f<? extends R>> */
        @Override // h.f.a.b
        public final void invoke(final p<com.bytedance.assem.arch.extensions.f<? extends R>> pVar) {
            h.f.a.b bVar;
            if (!this.$asyncObserve$inlined || this.$config$inlined.f25728g) {
                A a2 = pVar.f25659a;
                if (a2 instanceof n) {
                    h.f.a.a aVar = this.$onLoading$inlined;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (a2 instanceof com.bytedance.assem.arch.extensions.h) {
                    h.f.a.b bVar2 = this.$onError$inlined$1;
                    if (bVar2 != null) {
                        bVar2.invoke(a2.f25642a);
                    }
                } else if ((a2 instanceof o) && (bVar = this.$onSuccess$inlined) != null) {
                    bVar.invoke(a2.f25658a);
                }
            } else {
                final AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.b.C0545b.AnonymousClass1 */
                    final /* synthetic */ C0545b this$0;

                    static {
                        Covode.recordClassIndex(15034);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.a
                    public final void invoke() {
                        h.f.a.b bVar;
                        A a2 = ((p) pVar).f25659a;
                        if (a2 instanceof n) {
                            h.f.a.a aVar = this.this$0.$onLoading$inlined;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                        } else if (a2 instanceof com.bytedance.assem.arch.extensions.h) {
                            h.f.a.b bVar2 = this.this$0.$onError$inlined$1;
                            if (bVar2 != null) {
                                bVar2.invoke(a2.f25642a);
                            }
                        } else if ((a2 instanceof o) && (bVar = this.this$0.$onSuccess$inlined) != null) {
                            bVar.invoke(a2.f25658a);
                        }
                    }
                };
                com.bytedance.assem.arch.extensions.l lVar = this.$interceptDispatch;
                if (lVar != null && lVar.a(1, this.$config$inlined.f25730i, r3)) {
                    return;
                }
                if (com.bytedance.assem.jedi_vm.a.d.a()) {
                    r3.invoke();
                } else {
                    com.bytedance.assem.jedi_vm.a.d.f25750a.post(new Runnable() {
                        /* class com.bytedance.assem.jedi_vm.viewModel.b.C0545b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(15035);
                        }

                        public final void run() {
                            r3.invoke();
                        }
                    });
                }
            }
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<r<A, B, C>, z> {
        final /* synthetic */ boolean $asyncObserve$inlined;
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k $config$inlined;
        final /* synthetic */ com.bytedance.assem.arch.extensions.l $interceptDispatch;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ m $owner$inlined;
        final /* synthetic */ h.f.a.q $subscriber$inlined$1;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.assem.arch.extensions.l lVar, b bVar, com.bytedance.assem.arch.viewModel.k kVar, m mVar, boolean z, h.f.a.b bVar2, h.f.a.q qVar) {
            super(1);
            this.$interceptDispatch = lVar;
            this.this$0 = bVar;
            this.$config$inlined = kVar;
            this.$owner$inlined = mVar;
            this.$asyncObserve$inlined = z;
            this.$onError$inlined = bVar2;
            this.$subscriber$inlined$1 = qVar;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.r<A, B, C> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.r<A, B, C> */
        /* JADX WARN: Unknown type variable: C in type: com.bytedance.assem.arch.extensions.r<A, B, C> */
        @Override // h.f.a.b
        public final void invoke(final r<A, B, C> rVar) {
            if (!this.$asyncObserve$inlined || this.$config$inlined.f25728g) {
                r<A, B, C> rVar2 = rVar;
                this.$subscriber$inlined$1.invoke(rVar2.f25662a, rVar2.f25663b, rVar2.f25664c);
                return;
            }
            final AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.jedi_vm.viewModel.b.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(15046);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final void invoke() {
                    r rVar = (r) rVar;
                    this.this$0.$subscriber$inlined$1.invoke(rVar.f25662a, rVar.f25663b, rVar.f25664c);
                }
            };
            com.bytedance.assem.arch.extensions.l lVar = this.$interceptDispatch;
            if (lVar != null && lVar.a(1, this.$config$inlined.f25730i, r3)) {
                return;
            }
            if (com.bytedance.assem.jedi_vm.a.d.a()) {
                r3.invoke();
            } else {
                com.bytedance.assem.jedi_vm.a.d.f25750a.post(new Runnable() {
                    /* class com.bytedance.assem.jedi_vm.viewModel.b.h.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15047);
                    }

                    public final void run() {
                        r3.invoke();
                    }
                });
            }
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<s<A, B, C, D>, z> {
        final /* synthetic */ boolean $asyncObserve$inlined;
        final /* synthetic */ com.bytedance.assem.arch.viewModel.k $config$inlined;
        final /* synthetic */ com.bytedance.assem.arch.extensions.l $interceptDispatch;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ m $owner$inlined;
        final /* synthetic */ h.f.a.r $subscriber$inlined$1;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(15049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(com.bytedance.assem.arch.extensions.l lVar, b bVar, com.bytedance.assem.arch.viewModel.k kVar, m mVar, boolean z, h.f.a.b bVar2, h.f.a.r rVar) {
            super(1);
            this.$interceptDispatch = lVar;
            this.this$0 = bVar;
            this.$config$inlined = kVar;
            this.$owner$inlined = mVar;
            this.$asyncObserve$inlined = z;
            this.$onError$inlined = bVar2;
            this.$subscriber$inlined$1 = rVar;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.s<A, B, C, D> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.s<A, B, C, D> */
        /* JADX WARN: Unknown type variable: C in type: com.bytedance.assem.arch.extensions.s<A, B, C, D> */
        /* JADX WARN: Unknown type variable: D in type: com.bytedance.assem.arch.extensions.s<A, B, C, D> */
        @Override // h.f.a.b
        public final void invoke(final s<A, B, C, D> sVar) {
            if (!this.$asyncObserve$inlined || this.$config$inlined.f25728g) {
                s<A, B, C, D> sVar2 = sVar;
                this.$subscriber$inlined$1.a(sVar2.f25665a, sVar2.f25666b, sVar2.f25667c, sVar2.f25668d);
                return;
            }
            final AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.jedi_vm.viewModel.b.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(15050);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final void invoke() {
                    s sVar = (s) sVar;
                    this.this$0.$subscriber$inlined$1.a(sVar.f25665a, sVar.f25666b, sVar.f25667c, sVar.f25668d);
                }
            };
            com.bytedance.assem.arch.extensions.l lVar = this.$interceptDispatch;
            if (lVar != null && lVar.a(1, this.$config$inlined.f25730i, r3)) {
                return;
            }
            if (com.bytedance.assem.jedi_vm.a.d.a()) {
                r3.invoke();
            } else {
                com.bytedance.assem.jedi_vm.a.d.f25750a.post(new Runnable() {
                    /* class com.bytedance.assem.jedi_vm.viewModel.b.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15051);
                    }

                    public final void run() {
                        r3.invoke();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final void a(h.f.a.b<? super S, ? extends S> bVar) {
        h.f.b.l.c(bVar, "");
        c().b(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.g
    public final void a(m mVar, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.b<? super S, z> bVar2) {
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(bVar2, "");
        t<S> a2 = d().a(kVar.f25723b);
        if (kVar.f25722a) {
            a2 = a2.f();
        }
        h.f.b.l.a((Object) a2, "");
        a(a2, mVar, kVar.f25724c, com.bytedance.assem.jedi_vm.a.d.f25751b, kVar.f25727f, bVar, bVar2);
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final <A> void a(m mVar, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.a<Boolean> aVar, h.f.a.b<? super A, z> bVar) {
        boolean z;
        aa aaVar;
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        h.f.b.l.c(bVar, "");
        if (!com.bytedance.assem.arch.extensions.j.f25648c || !kVar2.f25727f) {
            z = false;
        } else {
            z = true;
        }
        t<R> a2 = d().a(new k(aVar, kVar2)).d(new c(kVar)).a(kVar2.f25723b);
        x xVar = a2;
        if (kVar2.f25722a) {
            xVar = (t<T>) a2.f();
        }
        Executor a3 = com.bytedance.assem.arch.extensions.j.a(kVar2.f25727f);
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        h.f.b.l.a((Object) xVar, "");
        boolean z2 = kVar2.f25724c;
        if (kVar2.f25728g || z) {
            aaVar = f.a.k.a.a(a3);
        } else {
            aaVar = com.bytedance.assem.jedi_vm.a.d.f25751b;
        }
        a((t) xVar, mVar, z2, aaVar, kVar2.f25727f, (h.f.a.b<? super Throwable, z>) null, new d(lVar, this, kVar2, mVar, z, null, bVar));
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final <A, B> void a(m mVar, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.a<Boolean> aVar, h.f.a.m<? super A, ? super B, z> mVar2) {
        boolean z;
        aa aaVar;
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        h.f.b.l.c(kVar3, "");
        h.f.b.l.c(mVar2, "");
        if (!com.bytedance.assem.arch.extensions.j.f25648c || !kVar3.f25727f) {
            z = false;
        } else {
            z = true;
        }
        t<R> a2 = d().a(new k(aVar, kVar3)).d(new e(kVar, kVar2)).a(kVar3.f25723b);
        x xVar = a2;
        if (kVar3.f25722a) {
            xVar = (t<T>) a2.f();
        }
        Executor a3 = com.bytedance.assem.arch.extensions.j.a(kVar3.f25727f);
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        h.f.b.l.a((Object) xVar, "");
        boolean z2 = kVar3.f25724c;
        if (kVar3.f25728g || z) {
            aaVar = f.a.k.a.a(a3);
        } else {
            aaVar = com.bytedance.assem.jedi_vm.a.d.f25751b;
        }
        a((t) xVar, mVar, z2, aaVar, kVar3.f25727f, (h.f.a.b<? super Throwable, z>) null, new f(lVar, this, kVar3, mVar, z, null, mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.assem.jedi_vm.viewModel.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> f.a.b.b a(f.a.t<T> r10, androidx.lifecycle.m r11, boolean r12, f.a.aa r13, boolean r14, h.f.a.b<? super java.lang.Throwable, h.z> r15, h.f.a.b<? super T, h.z> r16) {
        /*
            r9 = this;
            r7 = r16
            java.lang.String r1 = ""
            r3 = r11
            if (r3 != 0) goto L_0x0023
            if (r13 == 0) goto L_0x000d
            f.a.t r10 = r10.a(r13)
        L_0x000d:
            if (r7 == 0) goto L_0x0015
            com.bytedance.assem.jedi_vm.viewModel.c r0 = new com.bytedance.assem.jedi_vm.viewModel.c
            r0.<init>(r7)
            r7 = r0
        L_0x0015:
            f.a.d.f r7 = (f.a.d.f) r7
            f.a.b.b r0 = r10.d(r7)
            h.f.b.l.a(r0, r1)
            f.a.b.b r0 = r9.a(r0)
            return r0
        L_0x0023:
            if (r13 == 0) goto L_0x0029
            f.a.t r10 = r10.a(r13)
        L_0x0029:
            com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver r2 = new com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver
            r4 = r12 ^ 1
            r5 = 0
            r6 = r14
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            f.a.z r0 = r10.c(r2)
            h.f.b.l.a(r0, r1)
            f.a.b.b r0 = (f.a.b.b) r0
            f.a.b.b r0 = r9.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.jedi_vm.viewModel.b.a(f.a.t, androidx.lifecycle.m, boolean, f.a.aa, boolean, h.f.a.b, h.f.a.b):f.a.b.b");
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final <A, B, C> void a(m mVar, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<r<A, B, C>> kVar4, h.f.a.a<Boolean> aVar, h.f.a.q<? super A, ? super B, ? super C, z> qVar) {
        boolean z;
        aa aaVar;
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        h.f.b.l.c(kVar3, "");
        h.f.b.l.c(kVar4, "");
        h.f.b.l.c(qVar, "");
        if (!com.bytedance.assem.arch.extensions.j.f25648c || !kVar4.f25727f) {
            z = false;
        } else {
            z = true;
        }
        t<R> a2 = d().a(new k(aVar, kVar4)).d(new g(kVar, kVar2, kVar3)).a(kVar4.f25723b);
        x xVar = a2;
        if (kVar4.f25722a) {
            xVar = (t<T>) a2.f();
        }
        Executor a3 = com.bytedance.assem.arch.extensions.j.a(kVar4.f25727f);
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        h.f.b.l.a((Object) xVar, "");
        boolean z2 = kVar4.f25724c;
        if (kVar4.f25728g || z) {
            aaVar = f.a.k.a.a(a3);
        } else {
            aaVar = com.bytedance.assem.jedi_vm.a.d.f25751b;
        }
        a((t) xVar, mVar, z2, aaVar, kVar4.f25727f, (h.f.a.b<? super Throwable, z>) null, new h(lVar, this, kVar4, mVar, z, null, qVar));
    }

    @Override // com.bytedance.assem.arch.viewModel.g
    public final <A, B, C, D> void a(m mVar, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.a<Boolean> aVar, h.f.a.r<? super A, ? super B, ? super C, ? super D, z> rVar) {
        boolean z;
        aa aaVar;
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(kVar2, "");
        h.f.b.l.c(kVar3, "");
        h.f.b.l.c(kVar4, "");
        h.f.b.l.c(kVar5, "");
        h.f.b.l.c(rVar, "");
        if (!com.bytedance.assem.arch.extensions.j.f25648c || !kVar5.f25727f) {
            z = false;
        } else {
            z = true;
        }
        t<R> a2 = d().a(new k(aVar, kVar5)).d(new i(kVar, kVar2, kVar3, kVar4)).a(kVar5.f25723b);
        x xVar = a2;
        if (kVar5.f25722a) {
            xVar = (t<T>) a2.f();
        }
        Executor a3 = com.bytedance.assem.arch.extensions.j.a(kVar5.f25727f);
        com.bytedance.assem.arch.extensions.l lVar = com.bytedance.assem.arch.extensions.j.f25651f;
        h.f.b.l.a((Object) xVar, "");
        boolean z2 = kVar5.f25724c;
        if (kVar5.f25728g || z) {
            aaVar = f.a.k.a.a(a3);
        } else {
            aaVar = com.bytedance.assem.jedi_vm.a.d.f25751b;
        }
        a((t) xVar, mVar, z2, aaVar, kVar5.f25727f, (h.f.a.b<? super Throwable, z>) null, new j(lVar, this, kVar5, mVar, z, null, rVar));
    }
}
