package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.extensions.n;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.ies.powerlist.page.f;
import h.c.b.a.k;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public abstract class AssemListViewModel<S extends i<S, ITEM>, ITEM extends com.bytedance.ies.powerlist.b.a, Cursor> extends AssemViewModel<S> {

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.ies.powerlist.f<ITEM> f28651j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f28652k = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(16834);
    }

    public abstract Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar);

    public abstract Object a(Cursor cursor, h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar);

    public abstract void a(a<ITEM> aVar);

    public final com.bytedance.ies.powerlist.page.config.b<Cursor> h() {
        return (com.bytedance.ies.powerlist.page.config.b) this.f28652k.getValue();
    }

    public final void a(Collection<? extends ITEM> collection) {
        l.c(collection, "");
        b((h.f.a.b) new h(this, collection));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AssemListViewModel assemListViewModel) {
            super(0);
            this.this$0 = assemListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            return new com.bytedance.ies.powerlist.page.config.b<Cursor>(this, cVar) {
                /* class com.bytedance.ext_power_list.AssemListViewModel.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f28653a;

                static {
                    Covode.recordClassIndex(16836);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$b */
                static final class b extends m implements h.f.a.a<z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16838);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(AnonymousClass1 r2) {
                        super(0);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f28653a.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.a.AnonymousClass1.b.AnonymousClass1 */
                            final /* synthetic */ b this$0;

                            static {
                                Covode.recordClassIndex(16839);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(Object obj) {
                                i iVar = (i) obj;
                                h.f.b.l.c(iVar, "");
                                this.this$0.this$0.f28653a.this$0.a((a) a.a(iVar.a(), null, null, new n(), null, 11));
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$f */
                static final class f extends m implements h.f.a.a<z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16843);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    f(AnonymousClass1 r2) {
                        super(0);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f28653a.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.a.AnonymousClass1.f.AnonymousClass1 */
                            final /* synthetic */ f this$0;

                            static {
                                Covode.recordClassIndex(16844);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(Object obj) {
                                i iVar = (i) obj;
                                h.f.b.l.c(iVar, "");
                                this.this$0.this$0.f28653a.this$0.a((a) a.a(iVar.a(), null, new n(), null, null, 13));
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$j */
                static final class j extends m implements h.f.a.a<z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16848);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    j(AnonymousClass1 r2) {
                        super(0);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f28653a.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                            /* class com.bytedance.ext_power_list.AssemListViewModel.a.AnonymousClass1.j.AnonymousClass1 */
                            final /* synthetic */ j this$0;

                            static {
                                Covode.recordClassIndex(16849);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(Object obj) {
                                i iVar = (i) obj;
                                h.f.b.l.c(iVar, "");
                                this.this$0.this$0.f28653a.this$0.a((a) a.a(iVar.a(), new n(), t.f25669a, t.f25669a, null, 8));
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar) {
                    h.f.b.l.c(dVar, "");
                    this.f28653a.this$0.a(com.bytedance.ies.powerlist.page.e.Refresh, dVar, new i(this, null), new j(this), k.f28658a, l.f28659a);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$a  reason: collision with other inner class name */
                static final class C0615a extends h.c.b.a.k implements h.f.a.b<h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>>, Object> {
                    final /* synthetic */ Object $params;
                    int label;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16837);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0615a(AnonymousClass1 r2, Object obj, h.c.d dVar) {
                        super(1, dVar);
                        this.this$0 = r2;
                        this.$params = obj;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(h.c.d<?> dVar) {
                        h.f.b.l.c(dVar, "");
                        return new C0615a(this.this$0, this.$params, dVar);
                    }

                    @Override // h.f.a.b
                    public final Object invoke(Object obj) {
                        return ((C0615a) create((h.c.d) obj)).invokeSuspend(z.f158842a);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            r.a(obj);
                            this.label = 1;
                            obj = f.a.a(h.a.z.INSTANCE);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i2 == 1) {
                            r.a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$e */
                static final class e extends h.c.b.a.k implements h.f.a.b<h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>>, Object> {
                    final /* synthetic */ Object $params;
                    int label;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16842);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    e(AnonymousClass1 r2, Object obj, h.c.d dVar) {
                        super(1, dVar);
                        this.this$0 = r2;
                        this.$params = obj;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(h.c.d<?> dVar) {
                        h.f.b.l.c(dVar, "");
                        return new e(this.this$0, this.$params, dVar);
                    }

                    @Override // h.f.a.b
                    public final Object invoke(Object obj) {
                        return ((e) create((h.c.d) obj)).invokeSuspend(z.f158842a);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            r.a(obj);
                            AssemListViewModel assemListViewModel = this.this$0.f28653a.this$0;
                            Object obj2 = this.$params;
                            this.label = 1;
                            obj = assemListViewModel.a(obj2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i2 == 1) {
                            r.a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$i */
                static final class i extends h.c.b.a.k implements h.f.a.b<h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>>, Object> {
                    int label;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(16847);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    i(AnonymousClass1 r2, h.c.d dVar) {
                        super(1, dVar);
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(h.c.d<?> dVar) {
                        h.f.b.l.c(dVar, "");
                        return new i(this.this$0, dVar);
                    }

                    @Override // h.f.a.b
                    public final Object invoke(Object obj) {
                        return ((i) create((h.c.d) obj)).invokeSuspend(z.f158842a);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            r.a(obj);
                            AssemListViewModel assemListViewModel = this.this$0.f28653a.this$0;
                            this.label = 1;
                            obj = assemListViewModel.a((h.c.d) this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i2 == 1) {
                            r.a(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj;
                    }
                }

                {
                    this.f28653a = r1;
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$d */
                static final class d extends m implements h.f.a.m<a<ITEM>, Exception, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final d f28655a = new d();

                    static {
                        Covode.recordClassIndex(16841);
                    }

                    d() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        a aVar = (a) obj;
                        Exception exc2 = exc;
                        h.f.b.l.c(aVar, "");
                        h.f.b.l.c(exc2, "");
                        return a.a(aVar, null, null, new com.bytedance.assem.arch.extensions.h(exc2), null, 11);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$h */
                static final class h extends m implements h.f.a.m<a<ITEM>, Exception, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final h f28657a = new h();

                    static {
                        Covode.recordClassIndex(16846);
                    }

                    h() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        a aVar = (a) obj;
                        Exception exc2 = exc;
                        h.f.b.l.c(aVar, "");
                        h.f.b.l.c(exc2, "");
                        return a.a(aVar, null, new com.bytedance.assem.arch.extensions.h(exc2), null, null, 13);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$l */
                static final class l extends m implements h.f.a.m<a<ITEM>, Exception, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final l f28659a = new l();

                    static {
                        Covode.recordClassIndex(16851);
                    }

                    l() {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.m
                    public final /* synthetic */ Object invoke(Object obj, Exception exc) {
                        a aVar = (a) obj;
                        Exception exc2 = exc;
                        h.f.b.l.c(aVar, "");
                        h.f.b.l.c(exc2, "");
                        return a.a(aVar, new com.bytedance.assem.arch.extensions.h(exc2), null, null, null, 14);
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void b(h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar, Cursor cursor) {
                    h.f.b.l.c(dVar, "");
                    this.f28653a.this$0.a(com.bytedance.ies.powerlist.page.e.Next, dVar, new e(this, cursor, null), new f(this), g.f28656a, h.f28657a);
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar, Cursor cursor) {
                    h.f.b.l.c(dVar, "");
                    this.f28653a.this$0.a(com.bytedance.ies.powerlist.page.e.Prev, dVar, new C0615a(this, cursor, null), new b(this), c.f28654a, d.f28655a);
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$c */
                static final class c extends m implements q<a<ITEM>, Boolean, Boolean, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final c f28654a = new c();

                    static {
                        Covode.recordClassIndex(16840);
                    }

                    c() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        a aVar = (a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        h.f.b.l.c(aVar, "");
                        return a.a(aVar, null, null, new o(new l(booleanValue, booleanValue2)), null, 11);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$g */
                static final class g extends m implements q<a<ITEM>, Boolean, Boolean, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final g f28656a = new g();

                    static {
                        Covode.recordClassIndex(16845);
                    }

                    g() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        a aVar = (a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        h.f.b.l.c(aVar, "");
                        return a.a(aVar, null, new o(new l(booleanValue, booleanValue2)), null, null, 13);
                    }
                }

                /* renamed from: com.bytedance.ext_power_list.AssemListViewModel$a$1$k */
                static final class k extends m implements q<a<ITEM>, Boolean, Boolean, a<ITEM>> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final k f28658a = new k();

                    static {
                        Covode.recordClassIndex(16850);
                    }

                    k() {
                        super(3);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // h.f.a.q
                    public final /* synthetic */ Object invoke(Object obj, Boolean bool, Boolean bool2) {
                        a aVar = (a) obj;
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        h.f.b.l.c(aVar, "");
                        return a.a(aVar, new o(new l(booleanValue, booleanValue2)), null, null, null, 14);
                    }
                }
            };
        }
    }

    public final void g() {
        h().f34367c.e();
    }

    public final List<ITEM> i() {
        com.bytedance.ies.powerlist.f<ITEM> fVar = this.f28651j;
        List<ITEM> list = fVar != null ? (List<ITEM>) fVar.c() : null;
        if (!(list instanceof List)) {
            return null;
        }
        return list;
    }

    public final void a(int i2) {
        b((h.f.a.b) new f(this, i2));
    }

    public final ITEM b(int i2) {
        com.bytedance.ies.powerlist.f<ITEM> fVar = this.f28651j;
        if (fVar != null) {
            return fVar.b(i2);
        }
        return null;
    }

    static final class b extends m implements h.f.a.b<S, z> {
        final /* synthetic */ Collection $elements;
        final /* synthetic */ int $index;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AssemListViewModel assemListViewModel, int i2, Collection collection) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$index = i2;
            this.$elements = collection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != null) {
                fVar.a(this.$index, this.$elements);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<S, z> {
        final /* synthetic */ com.bytedance.ies.powerlist.b.a $element;
        final /* synthetic */ int $index;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AssemListViewModel assemListViewModel, int i2, com.bytedance.ies.powerlist.b.a aVar) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$index = i2;
            this.$element = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != 0) {
                fVar.a(this.$index, (ITEM) this.$element);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<S, z> {
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(AssemListViewModel assemListViewModel) {
            super(1);
            this.this$0 = assemListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != null) {
                fVar.a();
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<S, z> {
        final /* synthetic */ com.bytedance.ies.powerlist.b.a $element;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AssemListViewModel assemListViewModel, com.bytedance.ies.powerlist.b.a aVar) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$element = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != 0) {
                fVar.b((ITEM) this.$element);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<S, z> {
        final /* synthetic */ int $index;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AssemListViewModel assemListViewModel, int i2) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != null) {
                fVar.a(this.$index);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<S, z> {
        final /* synthetic */ com.bytedance.ies.powerlist.b.a $element;
        final /* synthetic */ int $index;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AssemListViewModel assemListViewModel, int i2, com.bytedance.ies.powerlist.b.a aVar) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$index = i2;
            this.$element = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.powerlist.f<ITEM extends com.bytedance.ies.powerlist.b.a> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != 0) {
                fVar.b(this.$index, this.$element);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<S, z> {
        final /* synthetic */ Collection $list;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AssemListViewModel assemListViewModel, Collection collection) {
            super(1);
            this.this$0 = assemListViewModel;
            this.$list = collection;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ext_power_list.AssemListViewModel */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            i iVar = (i) obj;
            l.c(iVar, "");
            com.bytedance.ies.powerlist.f<ITEM> fVar = this.this$0.f28651j;
            if (fVar != null) {
                fVar.b(this.$list);
                this.this$0.a(iVar, fVar);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ h.c.d $continuation;
        final /* synthetic */ h.f.a.b $invoker;
        final /* synthetic */ h.f.a.m $onFail;
        final /* synthetic */ h.f.a.a $onLoading;
        final /* synthetic */ q $onSuccess;
        final /* synthetic */ com.bytedance.ies.powerlist.page.e $type;
        Object L$0;
        int label;
        private am p$;
        final /* synthetic */ AssemListViewModel this$0;

        static {
            Covode.recordClassIndex(16859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AssemListViewModel assemListViewModel, h.f.a.a aVar, h.f.a.b bVar, h.c.d dVar, com.bytedance.ies.powerlist.page.e eVar, q qVar, h.f.a.m mVar, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = assemListViewModel;
            this.$onLoading = aVar;
            this.$invoker = bVar;
            this.$continuation = dVar;
            this.$type = eVar;
            this.$onSuccess = qVar;
            this.$onFail = mVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            i iVar = new i(this.this$0, this.$onLoading, this.$invoker, this.$continuation, this.$type, this.$onSuccess, this.$onFail, dVar);
            iVar.p$ = (am) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements h.f.a.m<am, h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>>, Object> {
            Object L$0;
            int label;
            private am p$;
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(16862);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = iVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.c(dVar, "");
                a aVar = new a(this.this$0, dVar);
                aVar.p$ = (am) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, Object obj) {
                return ((a) create(amVar, (h.c.d) obj)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    am amVar = this.p$;
                    h.f.a.b bVar = this.this$0.$invoker;
                    this.L$0 = amVar;
                    this.label = 1;
                    obj = bVar.invoke(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final List list;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                am amVar = this.p$;
                this.$onLoading.invoke();
                h.c.f plus = this.this$0.aH_().a().plus(bf.f159041b);
                a aVar2 = new a(this, null);
                this.L$0 = amVar;
                this.label = 1;
                obj = kotlinx.coroutines.i.a(plus, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final com.bytedance.ies.powerlist.page.f fVar = (com.bytedance.ies.powerlist.page.f) obj;
            if (fVar instanceof f.b) {
                list = ((f.b) fVar).f34372b;
                if (list == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (fVar instanceof f.d) {
                list = ((f.d) fVar).f34376d;
                if (list == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                list = h.a.z.INSTANCE;
            }
            this.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                /* class com.bytedance.ext_power_list.AssemListViewModel.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(16860);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Object obj) {
                    final i iVar = (i) obj;
                    l.c(iVar, "");
                    h.c.d dVar = this.this$0.$continuation;
                    AnonymousClass1 r1 = new h.f.a.a<z>(this) {
                        /* class com.bytedance.ext_power_list.AssemListViewModel.i.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(16861);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            a<ITEM> aVar;
                            boolean z;
                            Object obj = iVar.a().f28670d;
                            ArrayList arrayList = new ArrayList();
                            com.bytedance.ies.powerlist.page.e eVar = this.this$0.this$0.$type;
                            if (obj == null) {
                                obj = h.a.z.INSTANCE;
                            }
                            List list = list;
                            l.c(eVar, "");
                            l.c(obj, "");
                            l.c(list, "");
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = b.f28671a[eVar.ordinal()];
                            boolean z2 = true;
                            if (i2 == 1) {
                                arrayList2.addAll(list);
                            } else if (i2 == 2) {
                                arrayList2.addAll(obj);
                                arrayList2.addAll(list);
                            } else if (i2 == 3) {
                                arrayList2.addAll(list);
                                arrayList2.addAll(obj);
                            }
                            arrayList.addAll(arrayList2);
                            a a2 = a.a(iVar.a(), null, null, null, arrayList, 7);
                            AssemListViewModel assemListViewModel = this.this$0.this$0.this$0;
                            com.bytedance.ies.powerlist.page.f fVar = fVar;
                            if (fVar instanceof f.b) {
                                aVar = (a) this.this$0.this$0.$onSuccess.invoke(a2, false, false);
                            } else if (fVar instanceof f.d) {
                                q qVar = this.this$0.this$0.$onSuccess;
                                if (((f.d) fVar).f34374b != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z);
                                if (((f.d) fVar).f34375c == null) {
                                    z2 = false;
                                }
                                aVar = (a) qVar.invoke(a2, valueOf, Boolean.valueOf(z2));
                            } else if (fVar instanceof f.c) {
                                aVar = (a) this.this$0.this$0.$onFail.invoke(a2, ((f.c) fVar).f34373b);
                            } else {
                                throw new h.n();
                            }
                            assemListViewModel.a((a) aVar);
                            this.this$0.this$0.$continuation.resumeWith(h.q.m223constructorimpl(fVar));
                            return z.f158842a;
                        }
                    };
                    l.c(dVar, "");
                    l.c(r1, "");
                    if (!(dVar instanceof kotlinx.coroutines.m)) {
                        dVar = null;
                    }
                    kotlinx.coroutines.m mVar = (kotlinx.coroutines.m) dVar;
                    if (mVar == null) {
                        r1.invoke();
                    } else if (!mVar.c()) {
                        r1.invoke();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public final void b(Cursor cursor) {
        h().f34367c.a((Object) cursor);
    }

    public final void a(ITEM item) {
        l.c(item, "");
        b((h.f.a.b) new e(this, item));
    }

    public final void a(com.bytedance.ies.powerlist.page.e eVar) {
        l.c(eVar, "");
        h().f34367c.a(eVar);
    }

    public final void a(Cursor cursor) {
        h().f34367c.b(cursor);
    }

    public final void a(int i2, ITEM item) {
        l.c(item, "");
        b((h.f.a.b) new c(this, i2, item));
    }

    public final void b(int i2, ITEM item) {
        l.c(item, "");
        b((h.f.a.b) new g(this, i2, item));
    }

    public final void a(int i2, Collection<? extends ITEM> collection) {
        l.c(collection, "");
        b((h.f.a.b) new b(this, i2, collection));
    }

    public final void a(S s, com.bytedance.ies.powerlist.f<ITEM> fVar) {
        a((a) a.a(s.a(), null, null, null, fVar.c(), 7));
    }

    public final void a(com.bytedance.ies.powerlist.page.e eVar, h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>> dVar, h.f.a.b<? super h.c.d<? super com.bytedance.ies.powerlist.page.f<Cursor>>, ? extends Object> bVar, h.f.a.a<z> aVar, q<? super a<ITEM>, ? super Boolean, ? super Boolean, a<ITEM>> qVar, h.f.a.m<? super a<ITEM>, ? super Exception, a<ITEM>> mVar) {
        bz unused = kotlinx.coroutines.i.a(aH_(), null, null, new i(this, aVar, bVar, dVar, eVar, qVar, mVar, null), 3);
    }
}
