package com.ss.android.ugc.aweme.sticker.repository.internals.e;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.aa;
import com.ss.android.ugc.aweme.sticker.repository.a.ad;
import com.ss.android.ugc.aweme.sticker.repository.a.e;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cd;

public final class e implements com.ss.android.ugc.aweme.sticker.repository.internals.c {

    /* renamed from: a  reason: collision with root package name */
    public final List<EffectCategoryModel> f135617a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<Effect>> f135618b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<com.ss.android.ugc.aweme.sticker.repository.c.b> f135619c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public androidx.lifecycle.t<List<String>> f135620d;

    /* renamed from: e  reason: collision with root package name */
    public final h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>>> f135621e;

    /* renamed from: f  reason: collision with root package name */
    public final h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>>> f135622f;

    /* renamed from: g  reason: collision with root package name */
    public final h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>>> f135623g;

    /* renamed from: h  reason: collision with root package name */
    public final h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse>>> f135624h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f135625i;

    /* renamed from: j  reason: collision with root package name */
    public final h.h<com.ss.android.ugc.aweme.sticker.repository.a.r> f135626j;

    /* renamed from: k  reason: collision with root package name */
    public final h.h<com.ss.android.ugc.aweme.sticker.repository.a.j> f135627k;

    /* renamed from: l  reason: collision with root package name */
    public final List<EffectCategoryModel> f135628l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f135629m = h.i.a((h.f.a.a) c.f135633a);
    private final Map<String, Effect> n = new HashMap();
    private final Map<String, Effect> o = new HashMap();
    private com.ss.android.ugc.aweme.sticker.repository.a.w p;
    private final f.a.b.a q;
    private final h.h r;
    private final h.h<LinkedHashMap<String, androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>>> s;
    private final h.h<com.ss.android.ugc.aweme.sticker.repository.a.v> t;

    static {
        Covode.recordClassIndex(88630);
    }

    public final am i() {
        return (am) this.f135629m.getValue();
    }

    public final androidx.lifecycle.t<List<EffectCategoryModel>> j() {
        return (androidx.lifecycle.t) this.r.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final Map<String, Effect> a() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final LiveData<List<String>> d() {
        return this.f135620d;
    }

    static final class a extends h.f.b.m implements h.f.a.a<LinkedHashMap<String, androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135632a = new a();

        static {
            Covode.recordClassIndex(88635);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedHashMap<String, androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f135634a = new d();

        static {
            Covode.recordClassIndex(88638);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f135646a = new p();

        static {
            Covode.recordClassIndex(88653);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f135647a = new x();

        static {
            Covode.recordClassIndex(88668);
        }

        x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f135648a = new y();

        static {
            Covode.recordClassIndex(88669);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final LiveData<List<EffectCategoryModel>> e() {
        return j();
    }

    static final class c extends h.f.b.m implements h.f.a.a<am> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135633a = new c();

        static {
            Covode.recordClassIndex(88637);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ am invoke() {
            return an.a(bf.f159040a.plus(cd.a(null)));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final Map<String, LiveData<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>> c() {
        return this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final LiveData<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>> f() {
        return this.f135622f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final LiveData<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>> g() {
        return this.f135623g.getValue();
    }

    static final class b extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<List<? extends EffectCategoryModel>>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(88636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<List<? extends EffectCategoryModel>> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.this$0.f135628l);
            this.this$0.f135627k.getValue().a(arrayList);
            tVar.setValue(arrayList);
            return tVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.c
    public final void h() {
        this.q.a();
        am i2 = i();
        bz bzVar = (bz) i2.a().get(bz.f159061c);
        if (bzVar != null) {
            bzVar.o();
            return;
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(i2)).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r0.f69569b == com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR) goto L_0x002f;
     */
    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.LiveData<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>> b() {
        /*
            r2 = this;
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f135621e
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto L_0x002f
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f135621e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x002f
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f135621e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0027
            h.f.b.l.b()
        L_0x0027:
            com.ss.android.ugc.aweme.bw.b.a r0 = (com.ss.android.ugc.aweme.bw.b.a) r0
            com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f69569b
            com.ss.android.ugc.aweme.bw.b.a$a r0 = com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR
            if (r1 != r0) goto L_0x004a
        L_0x002f:
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f135621e
            java.lang.Object r1 = r0.getValue()
            androidx.lifecycle.t r1 = (androidx.lifecycle.t) r1
            com.ss.android.ugc.aweme.bw.b.a r0 = com.ss.android.ugc.aweme.bw.b.a.a()
            r1.setValue(r0)
            com.ss.android.ugc.aweme.sticker.repository.a.w r1 = r2.p
            if (r1 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.sticker.repository.c.d r0 = new com.ss.android.ugc.aweme.sticker.repository.c.d
            r0.<init>()
            r1.a(r0)
        L_0x004a:
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f135621e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.repository.internals.e.e.b():androidx.lifecycle.LiveData");
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.sticker.repository.a.w wVar = this.p;
        if (wVar != null) {
            wVar.a(new com.ss.android.ugc.aweme.sticker.repository.c.a(str, null, true, 30));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
    public final void b(List<? extends Effect> list) {
        h.f.b.l.d(list, "");
        for (T t2 : list) {
            this.o.put(t2.getEffectId(), t2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f<h.p<? extends String, ? extends com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f135640a;

        static {
            Covode.recordClassIndex(88646);
        }

        j(e eVar) {
            this.f135640a = eVar;
        }

        static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            final /* synthetic */ CategoryEffectModel $it;
            int label;
            final /* synthetic */ j this$0;

            static {
                Covode.recordClassIndex(88647);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(CategoryEffectModel categoryEffectModel, h.c.d dVar, j jVar) {
                super(2, dVar);
                this.$it = categoryEffectModel;
                this.this$0 = jVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.$it, dVar, this.this$0);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    h.r.a(obj);
                    e eVar = this.this$0.f135640a;
                    CategoryEffectModel categoryEffectModel = this.$it;
                    h.f.b.l.b(categoryEffectModel, "");
                    this.label = 1;
                    if (eVar.a(categoryEffectModel, this) == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    h.r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(h.p<? extends java.lang.String, ? extends com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>> r6) {
            /*
                r5 = this;
                h.p r6 = (h.p) r6
                java.lang.Object r0 = r6.getSecond()
                com.ss.android.ugc.aweme.bw.b.a r0 = (com.ss.android.ugc.aweme.bw.b.a) r0
                M r4 = r0.f69568a
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = (com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) r4
                if (r4 == 0) goto L_0x004a
                java.util.List r1 = r4.getCollectEffects()
                if (r1 == 0) goto L_0x0019
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f135640a
                r0.a(r1)
            L_0x0019:
                java.util.List r1 = r4.getBindEffects()
                if (r1 == 0) goto L_0x0024
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f135640a
                r0.b(r1)
            L_0x0024:
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f135640a
                java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>> r2 = r0.f135618b
                java.lang.String r1 = r4.getCategoryKey()
                java.util.List r0 = r4.getEffects()
                if (r0 != 0) goto L_0x0034
                h.a.z r0 = h.a.z.INSTANCE
            L_0x0034:
                r2.put(r1, r0)
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f135640a
                kotlinx.coroutines.am r3 = r0.i()
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j$a r2 = new com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j$a
                r1 = 0
                r2.<init>(r4, r1, r5)
                r0 = 3
                kotlinx.coroutines.bz r0 = kotlinx.coroutines.g.b(r3, r1, r2, r0)
                if (r0 != 0) goto L_0x005d
            L_0x004a:
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r1 = r5.f135640a
                java.lang.Object r0 = r6.getFirst()
                java.lang.String r0 = (java.lang.String) r0
                androidx.lifecycle.t r1 = r1.b(r0)
                java.lang.Object r0 = r6.getSecond()
                r1.setValue(r0)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.repository.internals.e.e.j.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$e  reason: collision with other inner class name */
    static final class C3535e<T, R> implements f.a.d.g<aa<?>, com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3535e f135635a = new C3535e();

        static {
            Covode.recordClassIndex(88639);
        }

        C3535e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> apply(aa<?> aaVar) {
            aa<?> aaVar2 = aaVar;
            h.f.b.l.d(aaVar2, "");
            if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.z) {
                return com.ss.android.ugc.aweme.bw.b.a.a();
            }
            if (aaVar2 instanceof ad) {
                T t = aaVar2.f135461b;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel");
                return com.ss.android.ugc.aweme.bw.b.a.a((Object) t);
            } else if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.a) {
                return com.ss.android.ugc.aweme.bw.b.a.a((Throwable) aaVar2.f135461b);
            } else {
                throw new h.n();
            }
        }
    }

    static final class f<T> implements f.a.d.f<com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f135636a;

        static {
            Covode.recordClassIndex(88640);
        }

        f(e eVar) {
            this.f135636a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse> aVar) {
            com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse> aVar2 = aVar;
            M m2 = aVar2.f69568a;
            if (m2 != null) {
                e eVar = this.f135636a;
                h.f.b.l.b(m2, "");
                h.f.b.l.b(aVar2, "");
                bz unused = kotlinx.coroutines.i.a(eVar.i(), null, null, new t(eVar, m2, aVar2, null), 3);
                return;
            }
            this.f135636a.f135624h.getValue().setValue(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f<e.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f135637a;

        static {
            Covode.recordClassIndex(88641);
        }

        g(e eVar) {
            this.f135637a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(e.a aVar) {
            CategoryEffectModel categoryEffectModel;
            e.a aVar2 = aVar;
            if (aVar2 != null && (categoryEffectModel = com.ss.android.ugc.aweme.sticker.repository.b.b(this.f135637a).get(aVar2.a())) != null) {
                bz unused = kotlinx.coroutines.i.a(this.f135637a.i(), null, null, new a(categoryEffectModel, null, aVar2, this), 3);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            final /* synthetic */ e.a $it$inlined;
            final /* synthetic */ CategoryEffectModel $model;
            int label;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(88642);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(CategoryEffectModel categoryEffectModel, h.c.d dVar, e.a aVar, g gVar) {
                super(2, dVar);
                this.$model = categoryEffectModel;
                this.$it$inlined = aVar;
                this.this$0 = gVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.$model, dVar, this.$it$inlined, this.this$0);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    h.r.a(obj);
                    ArrayList arrayList = new ArrayList(this.$model.getEffects());
                    Iterator<T> it = this.$it$inlined.b().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    Map<String, List<Effect>> map = this.this$0.f135637a.f135618b;
                    String a2 = this.$it$inlined.a();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : arrayList) {
                        if (hashSet.add(t.getEffectId())) {
                            arrayList2.add(t);
                        }
                    }
                    map.put(a2, arrayList2);
                    CategoryEffectModel categoryEffectModel = this.$model;
                    List<Effect> list = this.this$0.f135637a.f135618b.get(this.$it$inlined.a());
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    categoryEffectModel.setEffects(list);
                    kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.sticker.p.c.f134992a;
                    AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                        /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.g.a.AnonymousClass1 */
                        int label;
                        final /* synthetic */ a this$0;

                        static {
                            Covode.recordClassIndex(88643);
                        }

                        {
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            h.f.b.l.d(dVar, "");
                            return 
                        }

                        static final class h<T> implements f.a.d.f<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e f135638a;

                            static {
                                Covode.recordClassIndex(88644);
                            }

                            h(e eVar) {
                                this.f135638a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar) {
                                com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar2 = aVar;
                                M m2 = aVar2.f69568a;
                                if (m2 != null) {
                                    e eVar = this.f135638a;
                                    h.f.b.l.b(m2, "");
                                    h.f.b.l.b(aVar2, "");
                                    bz unused = kotlinx.coroutines.i.a(eVar.i(), null, null, new u(eVar, m2, aVar2, null), 3);
                                    return;
                                }
                                this.f135638a.f135621e.getValue().setValue(aVar2);
                            }
                        }

                        static final class k<T, R> implements f.a.d.g<aa<?>, com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>> {

                            /* renamed from: a  reason: collision with root package name */
                            public static final k f135641a = new k();

                            static {
                                Covode.recordClassIndex(88648);
                            }

                            k() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.g
                            public final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2> apply(aa<?> aaVar) {
                                aa<?> aaVar2 = aaVar;
                                h.f.b.l.d(aaVar2, "");
                                if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.z) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a();
                                }
                                if (aaVar2 instanceof ad) {
                                    T t = aaVar2.f135461b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2");
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Object) t);
                                } else if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.a) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Throwable) aaVar2.f135461b);
                                } else {
                                    throw new h.n();
                                }
                            }
                        }

                        static final class l<T> implements f.a.d.f<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>> {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e f135642a;

                            static {
                                Covode.recordClassIndex(88649);
                            }

                            l(e eVar) {
                                this.f135642a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2> aVar) {
                                com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2> aVar2 = aVar;
                                M m2 = aVar2.f69568a;
                                if (m2 != null) {
                                    e eVar = this.f135642a;
                                    h.f.b.l.b(m2, "");
                                    h.f.b.l.b(aVar2, "");
                                    bz unused = kotlinx.coroutines.i.a(eVar.i(), null, null, new w(eVar, m2, aVar2, null), 3);
                                    return;
                                }
                                this.f135642a.f135622f.getValue().setValue(aVar2);
                            }
                        }

                        static final class m<T, R> implements f.a.d.g<aa<?>, com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>> {

                            /* renamed from: a  reason: collision with root package name */
                            public static final m f135643a = new m();

                            static {
                                Covode.recordClassIndex(88650);
                            }

                            m() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.g
                            public final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse> apply(aa<?> aaVar) {
                                aa<?> aaVar2 = aaVar;
                                h.f.b.l.d(aaVar2, "");
                                if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.z) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a();
                                }
                                if (aaVar2 instanceof ad) {
                                    T t = aaVar2.f135461b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse");
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Object) t);
                                } else if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.a) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Throwable) aaVar2.f135461b);
                                } else {
                                    throw new h.n();
                                }
                            }
                        }

                        static final class n<T> implements f.a.d.f<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>> {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e f135644a;

                            static {
                                Covode.recordClassIndex(88651);
                            }

                            n(e eVar) {
                                this.f135644a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse> aVar) {
                                com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse> aVar2 = aVar;
                                if (aVar2.f69568a != null) {
                                    e eVar = this.f135644a;
                                    h.f.b.l.b(aVar2, "");
                                    bz unused = kotlinx.coroutines.i.a(eVar.i(), null, null, new v(eVar, aVar2, null), 3);
                                    return;
                                }
                                this.f135644a.f135623g.getValue().setValue(aVar2);
                            }
                        }

                        static final class o<T, R> implements f.a.d.g<aa<?>, com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse>> {

                            /* renamed from: a  reason: collision with root package name */
                            public static final o f135645a = new o();

                            static {
                                Covode.recordClassIndex(88652);
                            }

                            o() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.g
                            public final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a<FetchHotEffectResponse> apply(aa<?> aaVar) {
                                aa<?> aaVar2 = aaVar;
                                h.f.b.l.d(aaVar2, "");
                                if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.z) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a();
                                }
                                if (aaVar2 instanceof ad) {
                                    T t = aaVar2.f135461b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse");
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Object) t);
                                } else if (aaVar2 instanceof com.ss.android.ugc.aweme.sticker.repository.a.a) {
                                    return com.ss.android.ugc.aweme.bw.b.a.a((Throwable) aaVar2.f135461b);
                                } else {
                                    throw new h.n();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class s extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            final /* synthetic */ CategoryEffectModel $categoryEffectModel;
                            final /* synthetic */ String $categoryKey;
                            int label;
                            final /* synthetic */ e this$0;

                            static {
                                Covode.recordClassIndex(88657);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            s(e eVar, String str, CategoryEffectModel categoryEffectModel, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = eVar;
                                this.$categoryKey = str;
                                this.$categoryEffectModel = categoryEffectModel;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new s(this.this$0, this.$categoryKey, this.$categoryEffectModel, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((s) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                if (this.label == 0) {
                                    h.r.a(obj);
                                    this.this$0.b(this.$categoryKey).setValue(com.ss.android.ugc.aweme.bw.b.a.a(this.$categoryEffectModel));
                                    return z.f158842a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class v extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a $data;
                            int label;
                            final /* synthetic */ e this$0;

                            static {
                                Covode.recordClassIndex(88664);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            v(e eVar, com.ss.android.ugc.aweme.bw.b.a aVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = eVar;
                                this.$data = aVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new v(this.this$0, this.$data, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((v) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    h.r.a(obj);
                                    kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.sticker.p.c.f134992a;
                                    AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                        /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.v.AnonymousClass1 */
                                        int label;
                                        final /* synthetic */ v this$0;

                                        static {
                                            Covode.recordClassIndex(88665);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return 

                                            public final androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> b(String str) {
                                                androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> tVar = this.s.getValue().get(str);
                                                if (tVar != null) {
                                                    return tVar;
                                                }
                                                androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> tVar2 = new androidx.lifecycle.t<>();
                                                this.s.getValue().put(str, tVar2);
                                                return tVar2;
                                            }

                                            static final class i<T, R> implements f.a.d.g<h.p<? extends String, ? extends aa<?>>, h.p<? extends String, ? extends com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>>> {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static final i f135639a = new i();

                                                static {
                                                    Covode.recordClassIndex(88645);
                                                }

                                                i() {
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // f.a.d.g
                                                public final /* synthetic */ h.p<? extends String, ? extends com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> apply(h.p<? extends String, ? extends aa<?>> pVar) {
                                                    h.p<? extends String, ? extends aa<?>> pVar2 = pVar;
                                                    h.f.b.l.d(pVar2, "");
                                                    Object second = pVar2.getSecond();
                                                    if (second instanceof com.ss.android.ugc.aweme.sticker.repository.a.z) {
                                                        return h.v.a(pVar2.getFirst(), com.ss.android.ugc.aweme.bw.b.a.a());
                                                    }
                                                    if (second instanceof ad) {
                                                        Object first = pVar2.getFirst();
                                                        T t = ((aa) pVar2.getSecond()).f135461b;
                                                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel");
                                                        return h.v.a(first, com.ss.android.ugc.aweme.bw.b.a.a((Object) t));
                                                    } else if (second instanceof com.ss.android.ugc.aweme.sticker.repository.a.a) {
                                                        Object first2 = pVar2.getFirst();
                                                        T t2 = ((aa) pVar2.getSecond()).f135461b;
                                                        Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.Throwable");
                                                        return h.v.a(first2, com.ss.android.ugc.aweme.bw.b.a.a((Throwable) t2));
                                                    } else {
                                                        throw new h.n();
                                                    }
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            public static final class t extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                final /* synthetic */ FetchHotEffectResponse $response;
                                                final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a $successLiveData;
                                                int label;
                                                final /* synthetic */ e this$0;

                                                static {
                                                    Covode.recordClassIndex(88658);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                t(e eVar, FetchHotEffectResponse fetchHotEffectResponse, com.ss.android.ugc.aweme.bw.b.a aVar, h.c.d dVar) {
                                                    super(2, dVar);
                                                    this.this$0 = eVar;
                                                    this.$response = fetchHotEffectResponse;
                                                    this.$successLiveData = aVar;
                                                }

                                                @Override // h.c.b.a.a
                                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                    h.f.b.l.d(dVar, "");
                                                    return new t(this.this$0, this.$response, this.$successLiveData, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // h.f.a.m
                                                public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                    return ((t) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                }

                                                @Override // h.c.b.a.a
                                                public final Object invokeSuspend(Object obj) {
                                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                    int i2 = this.label;
                                                    if (i2 == 0) {
                                                        h.r.a(obj);
                                                        List<Effect> g2 = h.a.n.g((Collection) this.$response.getEffects());
                                                        this.this$0.f135626j.getValue().a("", g2);
                                                        this.$response.setEffects(g2);
                                                        List<Effect> collection = this.$response.getCollection();
                                                        if (collection != null && !collection.isEmpty()) {
                                                            this.this$0.a(this.$response.getCollection());
                                                        }
                                                        kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.sticker.p.c.f134992a;
                                                        AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                            /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.t.AnonymousClass1 */
                                                            int label;
                                                            final /* synthetic */ t this$0;

                                                            static {
                                                                Covode.recordClassIndex(88659);
                                                            }

                                                            {
                                                                this.this$0 = r2;
                                                            }

                                                            @Override // h.c.b.a.a
                                                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                h.f.b.l.d(dVar, "");
                                                                return 

                                                                /* access modifiers changed from: package-private */
                                                                public static final class u extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                                    final /* synthetic */ PanelInfoModel $panelInfoModel;
                                                                    final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a $successLiveData;
                                                                    private /* synthetic */ Object L$0;
                                                                    int label;
                                                                    final /* synthetic */ e this$0;

                                                                    static {
                                                                        Covode.recordClassIndex(88660);
                                                                    }

                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                    u(e eVar, PanelInfoModel panelInfoModel, com.ss.android.ugc.aweme.bw.b.a aVar, h.c.d dVar) {
                                                                        super(2, dVar);
                                                                        this.this$0 = eVar;
                                                                        this.$panelInfoModel = panelInfoModel;
                                                                        this.$successLiveData = aVar;
                                                                    }

                                                                    @Override // h.c.b.a.a
                                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                        h.f.b.l.d(dVar, "");
                                                                        u uVar = new u(this.this$0, this.$panelInfoModel, this.$successLiveData, dVar);
                                                                        uVar.L$0 = obj;
                                                                        return uVar;
                                                                    }

                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                    @Override // h.f.a.m
                                                                    public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                                        return ((u) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                                    }

                                                                    @Override // h.c.b.a.a
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                                        int i2 = this.label;
                                                                        if (i2 == 0) {
                                                                            h.r.a(obj);
                                                                            List<EffectCategoryModel> list = this.this$0.f135617a;
                                                                            list.clear();
                                                                            Boolean.valueOf(list.addAll(this.$panelInfoModel.getCategoryList()));
                                                                            final av avVar = kotlinx.coroutines.i.b((am) this.L$0, null, null, new a(this, null), 3);
                                                                            kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.sticker.p.c.f134992a;
                                                                            AnonymousClass1 r0 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                                                /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.u.AnonymousClass1 */
                                                                                int label;
                                                                                final /* synthetic */ u this$0;

                                                                                static {
                                                                                    Covode.recordClassIndex(88661);
                                                                                }

                                                                                {
                                                                                    this.this$0 = r2;
                                                                                }

                                                                                @Override // h.c.b.a.a
                                                                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                                    h.f.b.l.d(dVar, "");
                                                                                    return 

                                                                                    /* access modifiers changed from: package-private */
                                                                                    public static final class w extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                                                        final /* synthetic */ SearchEffectResponseV2 $response;
                                                                                        final /* synthetic */ com.ss.android.ugc.aweme.bw.b.a $successLiveData;
                                                                                        int label;
                                                                                        final /* synthetic */ e this$0;

                                                                                        static {
                                                                                            Covode.recordClassIndex(88666);
                                                                                        }

                                                                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                        w(e eVar, SearchEffectResponseV2 searchEffectResponseV2, com.ss.android.ugc.aweme.bw.b.a aVar, h.c.d dVar) {
                                                                                            super(2, dVar);
                                                                                            this.this$0 = eVar;
                                                                                            this.$response = searchEffectResponseV2;
                                                                                            this.$successLiveData = aVar;
                                                                                        }

                                                                                        @Override // h.c.b.a.a
                                                                                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                                            h.f.b.l.d(dVar, "");
                                                                                            return new w(this.this$0, this.$response, this.$successLiveData, dVar);
                                                                                        }

                                                                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                        @Override // h.f.a.m
                                                                                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                                                            return ((w) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                                                        }

                                                                                        @Override // h.c.b.a.a
                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                            List<Effect> list;
                                                                                            List<Effect> bindEffects;
                                                                                            List<Effect> collectionList;
                                                                                            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                                                            int i2 = this.label;
                                                                                            if (i2 == 0) {
                                                                                                h.r.a(obj);
                                                                                                SearchEffectModel data = this.$response.getData();
                                                                                                if (data == null || (list = data.getEffectList()) == null) {
                                                                                                    list = new ArrayList<>();
                                                                                                }
                                                                                                List<Effect> g2 = h.a.n.g((Collection) list);
                                                                                                this.this$0.f135626j.getValue().a("", g2);
                                                                                                SearchEffectModel data2 = this.$response.getData();
                                                                                                if (data2 != null) {
                                                                                                    data2.setEffectList(g2);
                                                                                                }
                                                                                                SearchEffectModel data3 = this.$response.getData();
                                                                                                if (!(data3 == null || (collectionList = data3.getCollectionList()) == null)) {
                                                                                                    this.this$0.a(collectionList);
                                                                                                }
                                                                                                SearchEffectModel data4 = this.$response.getData();
                                                                                                if (!(data4 == null || (bindEffects = data4.getBindEffects()) == null)) {
                                                                                                    this.this$0.b(bindEffects);
                                                                                                }
                                                                                                kotlinx.coroutines.android.b bVar = com.ss.android.ugc.aweme.sticker.p.c.f134992a;
                                                                                                AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                                                                    /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.w.AnonymousClass1 */
                                                                                                    int label;
                                                                                                    final /* synthetic */ w this$0;

                                                                                                    static {
                                                                                                        Covode.recordClassIndex(88667);
                                                                                                    }

                                                                                                    {
                                                                                                        this.this$0 = r2;
                                                                                                    }

                                                                                                    @Override // h.c.b.a.a
                                                                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                                                        h.f.b.l.d(dVar, "");
                                                                                                        return 

                                                                                                        @Override // com.ss.android.ugc.aweme.sticker.repository.internals.c
                                                                                                        public final void a(com.ss.android.ugc.aweme.sticker.repository.internals.b bVar) {
                                                                                                            h.f.b.l.d(bVar, "");
                                                                                                            this.p = bVar;
                                                                                                            this.q.a(bVar.k().d(C3535e.f135635a).a(f.a.a.b.a.a()).d(new h(this)));
                                                                                                            this.q.a(bVar.l().d(i.f135639a).a(f.a.a.b.a.a()).d(new j(this)));
                                                                                                            this.q.a(bVar.m().d(k.f135641a).a(f.a.a.b.a.a()).d(new l(this)));
                                                                                                            this.q.a(bVar.n().d(m.f135643a).a(f.a.a.b.a.a()).d(new n(this)));
                                                                                                            this.q.a(bVar.o().d(o.f135645a).a(f.a.a.b.a.a()).d(new f(this)));
                                                                                                            this.q.a(bVar.p().a(f.a.a.b.a.a()).a(new g(this), f.a.e.b.a.f157191d));
                                                                                                        }

                                                                                                        @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
                                                                                                        public final void a(List<? extends Effect> list) {
                                                                                                            h.f.b.l.d(list, "");
                                                                                                            for (T t2 : list) {
                                                                                                                this.n.put(t2.getEffectId(), t2);
                                                                                                            }
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        public static final class q extends h.f.b.m implements h.f.a.m<String, List<? extends Effect>, List<? extends Effect>> {
                                                                                                            final /* synthetic */ e this$0;

                                                                                                            static {
                                                                                                                Covode.recordClassIndex(88654);
                                                                                                            }

                                                                                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                            q(e eVar) {
                                                                                                                super(2);
                                                                                                                this.this$0 = eVar;
                                                                                                            }

                                                                                                            public static final class a<T> implements Comparator<T> {
                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88655);
                                                                                                                }

                                                                                                                @Override // java.util.Comparator
                                                                                                                public final int compare(T t, T t2) {
                                                                                                                    return h.b.a.a(Integer.valueOf(t2.f135483c), Integer.valueOf(t.f135483c));
                                                                                                                }
                                                                                                            }

                                                                                                            /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
                                                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                                                            /* renamed from: a */
                                                                                                            public final List<Effect> invoke(String str, List<? extends Effect> list) {
                                                                                                                boolean z;
                                                                                                                h.f.b.l.d(str, "");
                                                                                                                h.f.b.l.d(list, "");
                                                                                                                CopyOnWriteArrayList<com.ss.android.ugc.aweme.sticker.repository.c.b> copyOnWriteArrayList = this.this$0.f135619c;
                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                Iterator<T> it = copyOnWriteArrayList.iterator();
                                                                                                                while (true) {
                                                                                                                    boolean z2 = false;
                                                                                                                    if (!it.hasNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    T next = it.next();
                                                                                                                    try {
                                                                                                                        z2 = h.f.b.l.a((Object) str, (Object) com.ss.android.ugc.aweme.sticker.repository.b.a(this.this$0).get(next.f135482b).getKey());
                                                                                                                    } catch (Exception unused) {
                                                                                                                    }
                                                                                                                    if (z2) {
                                                                                                                        arrayList.add(next);
                                                                                                                    }
                                                                                                                }
                                                                                                                ArrayList arrayList2 = arrayList;
                                                                                                                if (!arrayList2.isEmpty()) {
                                                                                                                    this.this$0.f135619c.removeAll(arrayList2);
                                                                                                                }
                                                                                                                List<com.ss.android.ugc.aweme.sticker.repository.c.b> a2 = h.a.n.a((Iterable) arrayList2, (Comparator) new a());
                                                                                                                ArrayList arrayList3 = new ArrayList();
                                                                                                                for (com.ss.android.ugc.aweme.sticker.repository.c.b bVar : a2) {
                                                                                                                    h.a.n.a((Collection) arrayList3, (Iterable) bVar.f135481a);
                                                                                                                }
                                                                                                                HashSet hashSet = new HashSet();
                                                                                                                ArrayList<com.ss.ugc.effectplatform.model.Effect> arrayList4 = new ArrayList();
                                                                                                                for (Object obj : arrayList3) {
                                                                                                                    if (hashSet.add(((EffectTemplate) obj).getEffectId())) {
                                                                                                                        arrayList4.add(obj);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!(!arrayList4.isEmpty())) {
                                                                                                                    return list;
                                                                                                                }
                                                                                                                ArrayList arrayList5 = new ArrayList(h.a.n.a((Iterable) arrayList4, 10));
                                                                                                                for (com.ss.ugc.effectplatform.model.Effect effect : arrayList4) {
                                                                                                                    arrayList5.add(effect.getId());
                                                                                                                }
                                                                                                                ArrayList arrayList6 = arrayList5;
                                                                                                                ArrayList arrayList7 = new ArrayList();
                                                                                                                for (Object obj2 : list) {
                                                                                                                    com.ss.ugc.effectplatform.model.Effect effect2 = (com.ss.ugc.effectplatform.model.Effect) obj2;
                                                                                                                    if (arrayList6.contains(effect2.getId()) || this.this$0.f135625i.contains(effect2.getId())) {
                                                                                                                        z = true;
                                                                                                                    } else {
                                                                                                                        z = false;
                                                                                                                    }
                                                                                                                    if (!z) {
                                                                                                                        arrayList7.add(obj2);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.this$0.f135625i = h.a.n.g((Collection) arrayList6);
                                                                                                                return h.a.n.d((Collection) arrayList4, (Iterable) arrayList7);
                                                                                                            }
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        public static final class r extends h.f.b.m implements h.f.a.m<String, List<? extends Effect>, List<? extends Effect>> {
                                                                                                            final /* synthetic */ e this$0;

                                                                                                            static {
                                                                                                                Covode.recordClassIndex(88656);
                                                                                                            }

                                                                                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                            r(e eVar) {
                                                                                                                super(2);
                                                                                                                this.this$0 = eVar;
                                                                                                            }

                                                                                                            /* renamed from: a */
                                                                                                            public final List<Effect> invoke(String str, List<? extends Effect> list) {
                                                                                                                h.f.b.l.d(str, "");
                                                                                                                h.f.b.l.d(list, "");
                                                                                                                List<Effect> g2 = h.a.n.g((Collection) list);
                                                                                                                this.this$0.f135626j.getValue().a(str, g2);
                                                                                                                return g2;
                                                                                                            }
                                                                                                        }

                                                                                                        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
                                                                                                            if (r0.f69569b == com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR) goto L_0x0022;
                                                                                                         */
                                                                                                        @Override // com.ss.android.ugc.aweme.sticker.repository.a.y
                                                                                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                                                                                        public final androidx.lifecycle.LiveData<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>> a(java.lang.String r7, boolean r8) {
                                                                                                            /*
                                                                                                                r6 = this;
                                                                                                                java.lang.String r0 = ""
                                                                                                                h.f.b.l.d(r7, r0)
                                                                                                                androidx.lifecycle.t r5 = r6.b(r7)
                                                                                                                if (r8 == 0) goto L_0x0039
                                                                                                                java.lang.Object r0 = r5.getValue()
                                                                                                                if (r0 == 0) goto L_0x0022
                                                                                                                java.lang.Object r0 = r5.getValue()
                                                                                                                if (r0 != 0) goto L_0x001a
                                                                                                                h.f.b.l.b()
                                                                                                            L_0x001a:
                                                                                                                com.ss.android.ugc.aweme.bw.b.a r0 = (com.ss.android.ugc.aweme.bw.b.a) r0
                                                                                                                com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f69569b
                                                                                                                com.ss.android.ugc.aweme.bw.b.a$a r0 = com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR
                                                                                                                if (r1 != r0) goto L_0x0039
                                                                                                            L_0x0022:
                                                                                                                com.ss.android.ugc.aweme.bw.b.a r0 = com.ss.android.ugc.aweme.bw.b.a.a()
                                                                                                                r5.setValue(r0)
                                                                                                                com.ss.android.ugc.aweme.sticker.repository.a.w r4 = r6.p
                                                                                                                if (r4 == 0) goto L_0x0039
                                                                                                                com.ss.android.ugc.aweme.sticker.repository.c.a r3 = new com.ss.android.ugc.aweme.sticker.repository.c.a
                                                                                                                r2 = 0
                                                                                                                r1 = 0
                                                                                                                r0 = 62
                                                                                                                r3.<init>(r7, r2, r1, r0)
                                                                                                                r4.a(r3)
                                                                                                            L_0x0039:
                                                                                                                return r5
                                                                                                            */
                                                                                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.repository.internals.e.e.a(java.lang.String, boolean):androidx.lifecycle.LiveData");
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        public final /* synthetic */ Object a(CategoryEffectModel categoryEffectModel, h.c.d<? super z> dVar) {
                                                                                                            q qVar = new q(this);
                                                                                                            r rVar = new r(this);
                                                                                                            String categoryKey = categoryEffectModel.getCategoryKey();
                                                                                                            List<Effect> list = this.f135618b.get(categoryKey);
                                                                                                            if (list == null) {
                                                                                                                list = h.a.z.INSTANCE;
                                                                                                            }
                                                                                                            List<Effect> a2 = qVar.invoke(categoryKey, list);
                                                                                                            this.f135618b.put(categoryKey, a2);
                                                                                                            categoryEffectModel.setEffects(rVar.invoke(categoryKey, a2));
                                                                                                            Object a3 = kotlinx.coroutines.i.a(com.ss.android.ugc.aweme.sticker.p.c.f134992a, new s(this, categoryKey, categoryEffectModel, null), dVar);
                                                                                                            if (a3 == h.c.a.a.COROUTINE_SUSPENDED) {
                                                                                                                return a3;
                                                                                                            }
                                                                                                            return z.f158842a;
                                                                                                        }

                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.r> */
                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.v> */
                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
                                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                                        public e(h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.r> hVar, h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.v> hVar2, h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> hVar3, List<EffectCategoryModel> list) {
                                                                                                            h.f.b.l.d(hVar, "");
                                                                                                            h.f.b.l.d(hVar2, "");
                                                                                                            h.f.b.l.d(hVar3, "");
                                                                                                            h.f.b.l.d(list, "");
                                                                                                            this.f135626j = hVar;
                                                                                                            this.t = hVar2;
                                                                                                            this.f135627k = hVar3;
                                                                                                            this.f135628l = list;
                                                                                                            f.a.b.a aVar = new f.a.b.a();
                                                                                                            this.q = aVar;
                                                                                                            this.f135620d = new androidx.lifecycle.t<>();
                                                                                                            this.r = h.i.a((h.f.a.a) new b(this));
                                                                                                            this.f135621e = h.i.a((h.f.a.a) p.f135646a);
                                                                                                            this.s = h.i.a((h.f.a.a) a.f135632a);
                                                                                                            this.f135622f = h.i.a((h.f.a.a) y.f135648a);
                                                                                                            this.f135623g = h.i.a((h.f.a.a) x.f135647a);
                                                                                                            this.f135624h = h.i.a((h.f.a.a) d.f135634a);
                                                                                                            this.f135625i = new ArrayList();
                                                                                                            aVar.a(((com.ss.android.ugc.aweme.sticker.repository.a.v) hVar2.getValue()).a().a(f.a.a.b.a.a()).d(new f.a.d.f<com.ss.android.ugc.aweme.sticker.repository.c.b>(this) {
                                                                                                                /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.AnonymousClass1 */

                                                                                                                /* renamed from: a  reason: collision with root package name */
                                                                                                                final /* synthetic */ e f135630a;

                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88631);
                                                                                                                }

                                                                                                                {
                                                                                                                    this.f135630a = r1;
                                                                                                                }

                                                                                                                /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$1$a */
                                                                                                                static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                                                                                    final /* synthetic */ CategoryEffectModel $categoryEffectModel;
                                                                                                                    int label;
                                                                                                                    final /* synthetic */ AnonymousClass1 this$0;

                                                                                                                    static {
                                                                                                                        Covode.recordClassIndex(88632);
                                                                                                                    }

                                                                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                                    a(CategoryEffectModel categoryEffectModel, h.c.d dVar, AnonymousClass1 r4) {
                                                                                                                        super(2, dVar);
                                                                                                                        this.$categoryEffectModel = categoryEffectModel;
                                                                                                                        this.this$0 = r4;
                                                                                                                    }

                                                                                                                    @Override // h.c.b.a.a
                                                                                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                                                                        h.f.b.l.d(dVar, "");
                                                                                                                        return new a(this.$categoryEffectModel, dVar, this.this$0);
                                                                                                                    }

                                                                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                                                    @Override // h.f.a.m
                                                                                                                    public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                                                                                        return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                                                                                    }

                                                                                                                    @Override // h.c.b.a.a
                                                                                                                    public final Object invokeSuspend(Object obj) {
                                                                                                                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                                                                                        int i2 = this.label;
                                                                                                                        if (i2 == 0) {
                                                                                                                            h.r.a(obj);
                                                                                                                            e eVar = this.this$0.f135630a;
                                                                                                                            CategoryEffectModel categoryEffectModel = this.$categoryEffectModel;
                                                                                                                            this.label = 1;
                                                                                                                            if (eVar.a(categoryEffectModel, this) == aVar) {
                                                                                                                                return aVar;
                                                                                                                            }
                                                                                                                        } else if (i2 == 1) {
                                                                                                                            h.r.a(obj);
                                                                                                                        } else {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        return z.f158842a;
                                                                                                                    }
                                                                                                                }

                                                                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                                                                @Override // f.a.d.f
                                                                                                                public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.repository.c.b bVar) {
                                                                                                                    CategoryEffectModel categoryEffectModel;
                                                                                                                    this.f135630a.f135619c.add(bVar);
                                                                                                                    CopyOnWriteArrayList<com.ss.android.ugc.aweme.sticker.repository.c.b> copyOnWriteArrayList = this.f135630a.f135619c;
                                                                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                                                    for (T t : copyOnWriteArrayList) {
                                                                                                                        Integer valueOf = Integer.valueOf(t.f135482b);
                                                                                                                        Object obj = linkedHashMap.get(valueOf);
                                                                                                                        if (obj == null) {
                                                                                                                            obj = new ArrayList();
                                                                                                                            linkedHashMap.put(valueOf, obj);
                                                                                                                        }
                                                                                                                        ((List) obj).add(t);
                                                                                                                    }
                                                                                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                                                        com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.ss.ugc.effectplatform.model.EffectCategoryModel) h.a.n.b((List) com.ss.android.ugc.aweme.sticker.repository.b.a(this.f135630a), ((Number) entry.getKey()).intValue());
                                                                                                                        if (!(effectCategoryModel == null || (categoryEffectModel = com.ss.android.ugc.aweme.sticker.repository.b.b(this.f135630a).get(effectCategoryModel.getKey())) == null)) {
                                                                                                                            bz unused = kotlinx.coroutines.i.a(this.f135630a.i(), null, null, new a(categoryEffectModel, null, this), 3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }));
                                                                                                            aVar.a(((com.ss.android.ugc.aweme.sticker.repository.a.r) hVar.getValue()).b().a(f.a.a.b.a.a()).d(new f.a.d.f<List<? extends com.ss.android.ugc.aweme.sticker.repository.d.a.a>>(this) {
                                                                                                                /* class com.ss.android.ugc.aweme.sticker.repository.internals.e.e.AnonymousClass2 */

                                                                                                                /* renamed from: a  reason: collision with root package name */
                                                                                                                final /* synthetic */ e f135631a;

                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88633);
                                                                                                                }

                                                                                                                {
                                                                                                                    this.f135631a = r1;
                                                                                                                }

                                                                                                                /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$2$a */
                                                                                                                static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                                                                                    final /* synthetic */ CategoryEffectModel $this_run;
                                                                                                                    int label;
                                                                                                                    final /* synthetic */ AnonymousClass2 this$0;

                                                                                                                    static {
                                                                                                                        Covode.recordClassIndex(88634);
                                                                                                                    }

                                                                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                                    a(CategoryEffectModel categoryEffectModel, h.c.d dVar, AnonymousClass2 r4) {
                                                                                                                        super(2, dVar);
                                                                                                                        this.$this_run = categoryEffectModel;
                                                                                                                        this.this$0 = r4;
                                                                                                                    }

                                                                                                                    @Override // h.c.b.a.a
                                                                                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                                                                        h.f.b.l.d(dVar, "");
                                                                                                                        return new a(this.$this_run, dVar, this.this$0);
                                                                                                                    }

                                                                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                                                    @Override // h.f.a.m
                                                                                                                    public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                                                                                        return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                                                                                    }

                                                                                                                    @Override // h.c.b.a.a
                                                                                                                    public final Object invokeSuspend(Object obj) {
                                                                                                                        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                                                                                        int i2 = this.label;
                                                                                                                        if (i2 == 0) {
                                                                                                                            h.r.a(obj);
                                                                                                                            e eVar = this.this$0.f135631a;
                                                                                                                            CategoryEffectModel categoryEffectModel = this.$this_run;
                                                                                                                            this.label = 1;
                                                                                                                            if (eVar.a(categoryEffectModel, this) == aVar) {
                                                                                                                                return aVar;
                                                                                                                            }
                                                                                                                        } else if (i2 == 1) {
                                                                                                                            h.r.a(obj);
                                                                                                                        } else {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        return z.f158842a;
                                                                                                                    }
                                                                                                                }

                                                                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                                                                @Override // f.a.d.f
                                                                                                                public final /* synthetic */ void accept(List<? extends com.ss.android.ugc.aweme.sticker.repository.d.a.a> list) {
                                                                                                                    for (Map.Entry<String, CategoryEffectModel> entry : com.ss.android.ugc.aweme.sticker.repository.b.b(this.f135631a).entrySet()) {
                                                                                                                        CategoryEffectModel value = entry.getValue();
                                                                                                                        if (value != null) {
                                                                                                                            bz unused = kotlinx.coroutines.i.a(this.f135631a.i(), null, null, new a(value, null, this), 3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }));
                                                                                                        }
                                                                                                    }
