package com.ss.android.ugc.tools.infosticker.view.internal.provider;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.ab;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class InfoStickerProviderListViewModel extends HumbleViewModel implements com.ss.android.ugc.tools.infosticker.view.internal.h<ProviderEffect>, k<ProviderEffect>, k {

    /* renamed from: i  reason: collision with root package name */
    public static final String f149865i = "trending";

    /* renamed from: j  reason: collision with root package name */
    public static final String f149866j = "search";

    /* renamed from: k  reason: collision with root package name */
    public static final a f149867k = new a((byte) 0);
    private final com.ss.android.ugc.tools.infosticker.a.a.b A;
    private final com.ss.android.ugc.tools.f.d B;

    /* renamed from: a  reason: collision with root package name */
    public final t<String> f149868a;

    /* renamed from: b  reason: collision with root package name */
    public final t<List<ProviderEffect>> f149869b;

    /* renamed from: c  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149870c;

    /* renamed from: d  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149871d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Object> f149872e;

    /* renamed from: f  reason: collision with root package name */
    public final t<Map<ProviderEffect, p<com.ss.android.ugc.tools.h.a.c, Integer>>> f149873f;

    /* renamed from: g  reason: collision with root package name */
    public final t<com.bytedance.jedi.arch.d<List<ProviderEffect>>> f149874g;

    /* renamed from: h  reason: collision with root package name */
    public final t<com.bytedance.jedi.arch.d<List<ProviderEffect>>> f149875h;

    /* renamed from: l  reason: collision with root package name */
    private final TrendListViewModel f149876l;

    /* renamed from: m  reason: collision with root package name */
    private final ProviderStateViewModel f149877m;
    private SearchListViewModel n;
    private ProviderStateViewModel o;
    private boolean p;
    private String q;
    private final t<String> r;
    private final u<List<ProviderEffect>> s;
    private final u<com.ss.android.ugc.tools.view.widget.b.a> t;
    private final u<com.ss.android.ugc.tools.view.widget.b.a> u;
    private final u<Object> v;
    private final u<Map<ProviderEffect, p<com.ss.android.ugc.tools.h.a.c, Integer>>> w;
    private final u<com.bytedance.jedi.arch.d<List<ProviderEffect>>> x;
    private final u<com.bytedance.jedi.arch.d<List<ProviderEffect>>> y;
    private final m z;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class SearchListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        public long f149880d;

        /* renamed from: e  reason: collision with root package name */
        public final t<Object> f149881e = new t<>();

        /* renamed from: f  reason: collision with root package name */
        public final String f149882f;

        /* renamed from: g  reason: collision with root package name */
        public final com.ss.android.ugc.tools.f.d f149883g;

        /* renamed from: h  reason: collision with root package name */
        private j<ProviderEffect, ProviderEffectModel> f149884h;

        /* renamed from: i  reason: collision with root package name */
        private final com.ss.android.ugc.tools.infosticker.a.a.b f149885i;

        static {
            Covode.recordClassIndex(98670);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<Object> e() {
            return this.f149881e;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<ProviderEffect>> h() {
            j<ProviderEffect, ProviderEffectModel> a2 = this.f149885i.a(this.f149882f);
            this.f149884h = a2;
            this.f149880d = System.currentTimeMillis();
            com.ss.android.ugc.tools.f.d dVar = this.f149883g;
            if (dVar != null) {
                dVar.b(this.f149882f, "video_shoot_page");
            }
            ab<R> c2 = a2.a().b(new a(this)).c(b.f149887a);
            l.b(c2, "");
            return c2;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<ProviderEffect>> i() {
            ab<p<List<ProviderEffect>, ProviderEffectModel>> a2;
            ab<p<List<ProviderEffect>, ProviderEffectModel>> b2;
            ab<R> c2;
            j<ProviderEffect, ProviderEffectModel> jVar = this.f149884h;
            if (jVar != null && (a2 = jVar.a()) != null && (b2 = a2.b(new c(this))) != null && (c2 = b2.c(d.f149889a)) != null) {
                return c2;
            }
            ab<List<ProviderEffect>> a3 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            l.b(a3, "");
            return a3;
        }

        static final class b<T, R> implements f.a.d.g<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f149887a = new b();

            static {
                Covode.recordClassIndex(98672);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends ProviderEffect> apply(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class c<T> implements f.a.d.f<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchListViewModel f149888a;

            static {
                Covode.recordClassIndex(98673);
            }

            c(SearchListViewModel searchListViewModel) {
                this.f149888a = searchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f149888a.f149881e.setValue(pVar.component2());
            }
        }

        static final class d<T, R> implements f.a.d.g<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f149889a = new d();

            static {
                Covode.recordClassIndex(98674);
            }

            d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends ProviderEffect> apply(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class a<T> implements f.a.d.f<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchListViewModel f149886a;

            static {
                Covode.recordClassIndex(98671);
            }

            a(SearchListViewModel searchListViewModel) {
                this.f149886a = searchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f149886a.f149881e.setValue(pVar.component2());
                com.ss.android.ugc.tools.f.d dVar = this.f149886a.f149883g;
                if (dVar != null) {
                    dVar.a(InfoStickerProviderListViewModel.f149866j, (int) (System.currentTimeMillis() - this.f149886a.f149880d), this.f149886a.f149882f);
                }
                this.f149886a.f149880d = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchListViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar, String str, com.ss.android.ugc.tools.f.d dVar) {
            super(mVar);
            l.d(mVar, "");
            l.d(bVar, "");
            l.d(str, "");
            this.f149885i = bVar;
            this.f149882f = str;
            this.f149883g = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class TrendListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        public long f149890d;

        /* renamed from: e  reason: collision with root package name */
        public final t<Object> f149891e = new t<>();

        /* renamed from: f  reason: collision with root package name */
        public final com.ss.android.ugc.tools.f.d f149892f;

        /* renamed from: g  reason: collision with root package name */
        private j<ProviderEffect, ProviderEffectModel> f149893g;

        /* renamed from: h  reason: collision with root package name */
        private final com.ss.android.ugc.tools.infosticker.a.a.b f149894h;

        static {
            Covode.recordClassIndex(98675);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<Object> e() {
            return this.f149891e;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<ProviderEffect>> h() {
            j<ProviderEffect, ProviderEffectModel> a2 = this.f149894h.a();
            this.f149893g = a2;
            this.f149890d = System.currentTimeMillis();
            ab<R> c2 = a2.a().b(new a(this)).c(b.f149896a);
            l.b(c2, "");
            return c2;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<ProviderEffect>> i() {
            ab<p<List<ProviderEffect>, ProviderEffectModel>> a2;
            ab<p<List<ProviderEffect>, ProviderEffectModel>> b2;
            ab<R> c2;
            j<ProviderEffect, ProviderEffectModel> jVar = this.f149893g;
            if (jVar != null && (a2 = jVar.a()) != null && (b2 = a2.b(new c(this))) != null && (c2 = b2.c(d.f149898a)) != null) {
                return c2;
            }
            ab<List<ProviderEffect>> a3 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            l.b(a3, "");
            return a3;
        }

        static final class b<T, R> implements f.a.d.g<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f149896a = new b();

            static {
                Covode.recordClassIndex(98677);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends ProviderEffect> apply(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class c<T> implements f.a.d.f<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TrendListViewModel f149897a;

            static {
                Covode.recordClassIndex(98678);
            }

            c(TrendListViewModel trendListViewModel) {
                this.f149897a = trendListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f149897a.f149891e.setValue(pVar.component2());
            }
        }

        static final class d<T, R> implements f.a.d.g<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f149898a = new d();

            static {
                Covode.recordClassIndex(98679);
            }

            d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends ProviderEffect> apply(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class a<T> implements f.a.d.f<p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TrendListViewModel f149895a;

            static {
                Covode.recordClassIndex(98676);
            }

            a(TrendListViewModel trendListViewModel) {
                this.f149895a = trendListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f149895a.f149891e.setValue(pVar.component2());
                com.ss.android.ugc.tools.f.d dVar = this.f149895a.f149892f;
                if (dVar != null) {
                    dVar.a(InfoStickerProviderListViewModel.f149865i, (int) (System.currentTimeMillis() - this.f149895a.f149890d), (String) null);
                }
                this.f149895a.f149890d = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TrendListViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar, com.ss.android.ugc.tools.f.d dVar) {
            super(mVar);
            l.d(mVar, "");
            l.d(bVar, "");
            this.f149894h = bVar;
            this.f149892f = dVar;
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98680);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.h
    public final LiveData<String> a() {
        return this.r;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<List<ProviderEffect>> b() {
        return this.f149869b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> c() {
        return this.f149870c;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
        return this.f149871d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<Object> e() {
        return this.f149872e;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.h
    public final LiveData<String> h() {
        return this.f149868a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<Map<ProviderEffect, p<com.ss.android.ugc.tools.h.a.c, Integer>>> j() {
        return this.f149873f;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<com.bytedance.jedi.arch.d<List<ProviderEffect>>> k() {
        return this.f149874g;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<com.bytedance.jedi.arch.d<List<ProviderEffect>>> l() {
        return this.f149875h;
    }

    static {
        Covode.recordClassIndex(98667);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void f() {
        if (this.p) {
            this.f149876l.f();
            return;
        }
        SearchListViewModel searchListViewModel = this.n;
        if (searchListViewModel != null) {
            searchListViewModel.f();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void g() {
        if (this.p) {
            this.f149876l.g();
            return;
        }
        SearchListViewModel searchListViewModel = this.n;
        if (searchListViewModel != null) {
            searchListViewModel.g();
        }
    }

    private final void i() {
        if (!this.p) {
            b(this.n, this.o);
            a(this.f149876l, this.f149877m);
            this.f149868a.setValue(c.a(this.f149876l.f149891e.getValue()));
            this.p = true;
        }
    }

    static final class d<T> implements u<List<? extends ProviderEffect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149901a;

        static {
            Covode.recordClassIndex(98684);
        }

        d(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149901a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends ProviderEffect> list) {
            this.f149901a.f149869b.setValue(list);
        }
    }

    static final class e<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149902a;

        static {
            Covode.recordClassIndex(98685);
        }

        e(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149902a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            this.f149902a.f149871d.setValue(aVar);
        }
    }

    static final class f<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149903a;

        static {
            Covode.recordClassIndex(98686);
        }

        f(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149903a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            this.f149903a.f149870c.setValue(aVar);
        }
    }

    static final class h<T> implements u<Map<ProviderEffect, ? extends p<? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149905a;

        static {
            Covode.recordClassIndex(98689);
        }

        h(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149905a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Map<ProviderEffect, ? extends p<? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer>> map) {
            this.f149905a.f149873f.setValue(map);
        }
    }

    static final class c<T> implements u<com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149900a;

        static {
            Covode.recordClassIndex(98682);
        }

        c(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149900a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>> dVar) {
            com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.a(new h.f.a.b<List<? extends ProviderEffect>, z>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(98683);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(List<? extends ProviderEffect> list) {
                        List<? extends ProviderEffect> list2 = list;
                        l.d(list2, "");
                        InfoStickerProviderListViewModel.a(this.this$0.f149900a.f149875h, (List<ProviderEffect>) list2);
                        return z.f158842a;
                    }
                });
            }
        }
    }

    static final class g<T> implements u<com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149904a;

        static {
            Covode.recordClassIndex(98687);
        }

        g(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149904a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>> dVar) {
            com.bytedance.jedi.arch.d<? extends List<? extends ProviderEffect>> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.a(new h.f.a.b<List<? extends ProviderEffect>, z>(this) {
                    /* class com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(98688);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(List<? extends ProviderEffect> list) {
                        List<? extends ProviderEffect> list2 = list;
                        l.d(list2, "");
                        InfoStickerProviderListViewModel.a(this.this$0.f149904a.f149874g, (List<ProviderEffect>) list2);
                        return z.f158842a;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        l.d(mVar, "");
        l.d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class ProviderStateViewModel extends BaseInfoStickerStateViewModel<ProviderEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        private final com.ss.android.ugc.tools.infosticker.a.a.b f149878d;

        static {
            Covode.recordClassIndex(98668);
        }

        @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* Return type fixed from 'f.a.t' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        public final /* synthetic */ f.a.t<am<ProviderEffect, com.ss.android.ugc.tools.h.a.c, Integer>> b(ProviderEffect providerEffect) {
            ProviderEffect providerEffect2 = providerEffect;
            l.d(providerEffect2, "");
            f.a.t<R> d2 = this.f149878d.a(providerEffect2).d(a.f149879a);
            l.b(d2, "");
            return d2;
        }

        static final class a<T, R> implements f.a.d.g<com.ss.android.ugc.tools.infosticker.a.a.k, am<ProviderEffect, com.ss.android.ugc.tools.h.a.c, Integer>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f149879a = new a();

            static {
                Covode.recordClassIndex(98669);
            }

            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ am<ProviderEffect, com.ss.android.ugc.tools.h.a.c, Integer> apply(com.ss.android.ugc.tools.infosticker.a.a.k kVar) {
                com.ss.android.ugc.tools.h.a.c cVar;
                com.ss.android.ugc.tools.infosticker.a.a.k kVar2 = kVar;
                l.d(kVar2, "");
                ProviderEffect providerEffect = kVar2.f149369a;
                int i2 = b.f149917a[kVar2.f149370b.f149374a.ordinal()];
                if (i2 == 1) {
                    cVar = com.ss.android.ugc.tools.h.a.c.UNKNOWN;
                } else if (i2 == 2) {
                    cVar = com.ss.android.ugc.tools.h.a.c.DOWNLOADING;
                } else if (i2 == 3) {
                    cVar = com.ss.android.ugc.tools.h.a.c.NOT_DOWNLOAD;
                } else if (i2 == 4) {
                    cVar = com.ss.android.ugc.tools.h.a.c.DOWNLOAD_SUCCESS;
                } else if (i2 != 5) {
                    cVar = com.ss.android.ugc.tools.h.a.c.UNKNOWN;
                } else {
                    cVar = com.ss.android.ugc.tools.h.a.c.DOWNLOAD_FAILED;
                }
                return new am(providerEffect, cVar, kVar2.f149371c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProviderStateViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar) {
            super(mVar);
            l.d(mVar, "");
            l.d(bVar, "");
            this.f149878d = bVar;
        }
    }

    static final class b<T> implements u<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerProviderListViewModel f149899a;

        static {
            Covode.recordClassIndex(98681);
        }

        b(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f149899a = infoStickerProviderListViewModel;
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(Object obj) {
            this.f149899a.f149868a.setValue(c.a(obj));
            this.f149899a.f149872e.setValue(obj);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final /* synthetic */ void a(Object obj) {
        l.d(obj, "");
        if (this.p) {
            this.f149877m.a(obj);
            return;
        }
        ProviderStateViewModel providerStateViewModel = this.o;
        if (providerStateViewModel != null) {
            providerStateViewModel.a(obj);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.h
    public final void a(String str) {
        Object obj;
        t<Object> tVar;
        t<com.bytedance.jedi.arch.d<List<DATA>>> tVar2;
        t<com.bytedance.jedi.arch.d<List<DATA>>> tVar3;
        t<com.bytedance.jedi.arch.d<List<DATA>>> tVar4;
        if (str == null || str.length() == 0) {
            i();
        } else if (this.p || !l.a((Object) this.q, (Object) str)) {
            if (this.p) {
                b(this.f149876l, this.f149877m);
            }
            if (!l.a((Object) this.q, (Object) str)) {
                if (!this.p) {
                    b(this.n, this.o);
                }
                ProviderStateViewModel providerStateViewModel = this.o;
                if (!(providerStateViewModel == null || (tVar4 = providerStateViewModel.f149542b) == null)) {
                    tVar4.removeObserver(this.x);
                }
                ProviderStateViewModel providerStateViewModel2 = this.o;
                if (!(providerStateViewModel2 == null || (tVar3 = providerStateViewModel2.f149543c) == null)) {
                    tVar3.removeObserver(this.y);
                }
                SearchListViewModel searchListViewModel = this.n;
                if (searchListViewModel != null) {
                    searchListViewModel.onDestroy();
                }
                ProviderStateViewModel providerStateViewModel3 = this.o;
                if (providerStateViewModel3 != null) {
                    providerStateViewModel3.onDestroy();
                }
                SearchListViewModel searchListViewModel2 = new SearchListViewModel(this.z, this.A, str, this.B);
                searchListViewModel2.f();
                this.n = searchListViewModel2;
                ProviderStateViewModel providerStateViewModel4 = new ProviderStateViewModel(this.z, this.A);
                this.o = providerStateViewModel4;
                t<com.bytedance.jedi.arch.d<List<DATA>>> tVar5 = providerStateViewModel4.f149542b;
                if (tVar5 != null) {
                    tVar5.observe(this.z, this.x);
                }
                ProviderStateViewModel providerStateViewModel5 = this.o;
                if (!(providerStateViewModel5 == null || (tVar2 = providerStateViewModel5.f149543c) == null)) {
                    tVar2.observe(this.z, this.y);
                }
            } else {
                t<String> tVar6 = this.f149868a;
                SearchListViewModel searchListViewModel3 = this.n;
                if (searchListViewModel3 == null || (tVar = searchListViewModel3.f149881e) == null) {
                    obj = null;
                } else {
                    obj = tVar.getValue();
                }
                tVar6.setValue(c.a(obj));
            }
            a(this.n, this.o);
            this.p = false;
            this.q = str;
        }
        this.r.setValue(str);
    }

    public /* synthetic */ InfoStickerProviderListViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar) {
        this(mVar, bVar, null);
    }

    public static void a(t<com.bytedance.jedi.arch.d<List<ProviderEffect>>> tVar, List<ProviderEffect> list) {
        List arrayList;
        List<ProviderEffect> a2;
        if (!list.isEmpty()) {
            com.bytedance.jedi.arch.d<List<ProviderEffect>> value = tVar.getValue();
            if (value == null || (a2 = value.a()) == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = n.g((Collection) a2);
            }
            arrayList.addAll(list);
            tVar.setValue(new com.bytedance.jedi.arch.d<>(arrayList));
        }
    }

    private final void b(com.ss.android.ugc.tools.infosticker.view.internal.e<ProviderEffect> eVar, k<ProviderEffect> kVar) {
        LiveData<Map<ProviderEffect, p<com.ss.android.ugc.tools.h.a.c, Integer>>> j2;
        if (eVar != null) {
            LiveData<List<ProviderEffect>> b2 = eVar.b();
            if (b2 != null) {
                b2.removeObserver(this.s);
            }
            LiveData<com.ss.android.ugc.tools.view.widget.b.a> c2 = eVar.c();
            if (c2 != null) {
                c2.removeObserver(this.t);
            }
            LiveData<com.ss.android.ugc.tools.view.widget.b.a> d2 = eVar.d();
            if (d2 != null) {
                d2.removeObserver(this.u);
            }
            LiveData<Object> e2 = eVar.e();
            if (e2 != null) {
                e2.removeObserver(this.v);
            }
        }
        if (kVar != null && (j2 = kVar.j()) != null) {
            j2.removeObserver(this.w);
        }
    }

    private final void a(com.ss.android.ugc.tools.infosticker.view.internal.e<ProviderEffect> eVar, k<ProviderEffect> kVar) {
        LiveData<Map<ProviderEffect, p<com.ss.android.ugc.tools.h.a.c, Integer>>> j2;
        if (eVar != null) {
            LiveData<List<ProviderEffect>> b2 = eVar.b();
            if (b2 != null) {
                b2.observe(this.z, this.s);
            }
            LiveData<com.ss.android.ugc.tools.view.widget.b.a> c2 = eVar.c();
            if (c2 != null) {
                c2.observe(this.z, this.t);
            }
            LiveData<com.ss.android.ugc.tools.view.widget.b.a> d2 = eVar.d();
            if (d2 != null) {
                d2.observe(this.z, this.u);
            }
            LiveData<Object> e2 = eVar.e();
            if (e2 != null) {
                e2.observe(this.z, this.v);
            }
        }
        if (kVar != null && (j2 = kVar.j()) != null) {
            j2.observe(this.z, this.w);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerProviderListViewModel(m mVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar, com.ss.android.ugc.tools.f.d dVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(bVar, "");
        this.z = mVar;
        this.A = bVar;
        this.B = dVar;
        this.f149868a = new t<>();
        this.f149876l = new TrendListViewModel(mVar, bVar, dVar);
        ProviderStateViewModel providerStateViewModel = new ProviderStateViewModel(mVar, bVar);
        this.f149877m = providerStateViewModel;
        this.q = "";
        this.f149869b = new t<>();
        this.f149870c = new t<>();
        this.f149871d = new t<>();
        this.f149872e = new t<>();
        this.f149873f = new t<>();
        this.f149874g = new t<>();
        this.f149875h = new t<>();
        this.r = new t<>();
        this.s = new d(this);
        this.t = new f(this);
        this.u = new e(this);
        this.v = new b(this);
        this.w = new h(this);
        g gVar = new g(this);
        this.x = gVar;
        c cVar = new c(this);
        this.y = cVar;
        i();
        providerStateViewModel.f149542b.observe(mVar, gVar);
        providerStateViewModel.f149543c.observe(mVar, cVar);
    }
}
