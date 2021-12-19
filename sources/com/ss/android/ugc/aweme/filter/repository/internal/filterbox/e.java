package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.ugc.aweme.filter.repository.internal.g;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import f.a.ab;
import f.a.d.f;
import f.a.e.e.e.v;
import f.a.t;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class e extends com.bytedance.jedi.a.h.e<com.ss.android.ugc.aweme.filter.repository.a.a> implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h<FilterBoxApi> f95614a;

    /* renamed from: b  reason: collision with root package name */
    private final d f95615b;

    /* renamed from: f  reason: collision with root package name */
    private final q<com.ss.android.ugc.tools.b.a.d> f95616f;

    static {
        Covode.recordClassIndex(60588);
    }

    public final void c() {
        String b2 = this.f95615b.f95610e.b();
        l.b(b2, "");
        this.f95616f.b().a(b2, false, false, f.f95623a);
    }

    @Override // com.bytedance.jedi.a.h.a
    public final t<com.ss.android.ugc.aweme.filter.repository.a.a> b() {
        String b2 = this.f95615b.f95613h.b();
        l.b(b2, "");
        String b3 = this.f95615b.f95611f.b();
        l.b(b3, "");
        String b4 = this.f95615b.f95609d.b();
        l.b(b4, "");
        String b5 = this.f95615b.f95608c.b();
        l.b(b5, "");
        String b6 = this.f95615b.f95610e.b();
        l.b(b6, "");
        t<R> d2 = this.f95614a.getValue().listFilterBox(b2, b3, b4, b5, b6).c(C2307e.f95621a).d();
        l.b(d2, "");
        return d2;
    }

    static final class a<T> implements f<BaseNetResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f95617a;

        static {
            Covode.recordClassIndex(60589);
        }

        a(e eVar) {
            this.f95617a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(BaseNetResponse baseNetResponse) {
            this.f95617a.c();
        }
    }

    static final class b<T, R> implements f.a.d.g<BaseNetResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f95618a = new b();

        static {
            Covode.recordClassIndex(60590);
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(BaseNetResponse baseNetResponse) {
            BaseNetResponse baseNetResponse2 = baseNetResponse;
            l.d(baseNetResponse2, "");
            return baseNetResponse2;
        }
    }

    static final class c<T> implements f<BaseNetResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f95619a;

        static {
            Covode.recordClassIndex(60591);
        }

        c(e eVar) {
            this.f95619a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(BaseNetResponse baseNetResponse) {
            this.f95619a.c();
        }
    }

    static final class d<T, R> implements f.a.d.g<BaseNetResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f95620a = new d();

        static {
            Covode.recordClassIndex(60592);
        }

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(BaseNetResponse baseNetResponse) {
            BaseNetResponse baseNetResponse2 = baseNetResponse;
            l.d(baseNetResponse2, "");
            return baseNetResponse2;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.g
    public final ab<Object> b(Set<Integer> set) {
        l.d(set, "");
        if (set.isEmpty()) {
            ab<Object> a2 = ab.a((x) f.a.h.a.a(v.f157740a));
            l.b(a2, "");
            return a2;
        }
        f.a.l.f fVar = new f.a.l.f();
        l.b(fVar, "");
        this.f95614a.getValue().updateFilterBox(a(set, j.REMOVE)).b(new c(this)).c(d.f95620a).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(fVar);
        ab<Object> cF_ = fVar.cF_();
        l.b(cF_, "");
        return cF_;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e  reason: collision with other inner class name */
    static final class C2307e<T, R> implements f.a.d.g<g, com.ss.android.ugc.aweme.filter.repository.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2307e f95621a = new C2307e();

        static {
            Covode.recordClassIndex(60593);
        }

        C2307e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.a.a apply(g gVar) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            ArrayList<T> arrayList = new ArrayList();
            for (T t : gVar2.getData().getCategory()) {
                List<Effect> effects = gVar2.getData().getEffects();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : effects) {
                    T t3 = t2;
                    if ((t3 instanceof FilterEffect) && t.getEffects().contains(t3.getEffectId())) {
                        arrayList2.add(t2);
                    }
                }
                List a2 = n.a((Iterable) arrayList2, (Comparator) new a(t));
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) a2, 10));
                for (T t4 : a2) {
                    Objects.requireNonNull(t4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
                    T t5 = t4;
                    l.d(t5, "");
                    arrayList3.add(new com.ss.android.ugc.aweme.filter.repository.a.b(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a((Effect) t5), t5.getChecked(), t5.getBuildIn()));
                }
                arrayList.add(h.v.a(t, arrayList3));
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t6 : arrayList) {
                n.a((Collection) arrayList4, (Iterable) ((List) t6.getSecond()));
            }
            return new com.ss.android.ugc.aweme.filter.repository.a.a(arrayList4, arrayList);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e$a */
        public static final class a<T> implements Comparator<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EffectCategoryModel f95622a;

            static {
                Covode.recordClassIndex(60594);
            }

            public a(EffectCategoryModel effectCategoryModel) {
                this.f95622a = effectCategoryModel;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(Integer.valueOf(this.f95622a.getEffects().indexOf(t.getEffectId())), Integer.valueOf(this.f95622a.getEffects().indexOf(t2.getEffectId())));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.g
    public final ab<Object> a(Set<Integer> set) {
        l.d(set, "");
        if (set.isEmpty()) {
            ab<Object> a2 = ab.a((x) f.a.h.a.a(v.f157740a));
            l.b(a2, "");
            return a2;
        }
        f.a.l.f fVar = new f.a.l.f();
        l.b(fVar, "");
        this.f95614a.getValue().updateFilterBox(a(set, j.INSERT)).b(new a(this)).c(b.f95618a).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(fVar);
        ab<Object> cF_ = fVar.cF_();
        l.b(cF_, "");
        return cF_;
    }

    private final i a(Set<Integer> set, j jVar) {
        String a2 = n.a(set, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        int i2 = jVar.value;
        String b2 = this.f95615b.f95606a.b();
        l.b(b2, "");
        String b3 = this.f95615b.f95610e.b();
        l.b(b3, "");
        String b4 = this.f95615b.f95611f.b();
        l.b(b4, "");
        String b5 = this.f95615b.f95612g.b();
        l.b(b5, "");
        String b6 = this.f95615b.f95608c.b();
        l.b(b6, "");
        String b7 = this.f95615b.f95613h.b();
        l.b(b7, "");
        String b8 = this.f95615b.f95609d.b();
        l.b(b8, "");
        return new i(a2, i2, b2, b3, b4, b5, b6, b7, b8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends FilterBoxApi> hVar, d dVar, q<com.ss.android.ugc.tools.b.a.d> qVar) {
        l.d(hVar, "");
        l.d(dVar, "");
        l.d(qVar, "");
        this.f95614a = hVar;
        this.f95615b = dVar;
        this.f95616f = qVar;
    }
}
