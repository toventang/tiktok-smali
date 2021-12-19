package com.ss.android.ugc.tools.infosticker.view.internal.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.f;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.i;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.android.ugc.tools.view.widget.b.a;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class InfoStickerSearchListViewModel extends HumbleViewModel implements i<InfoStickerEffect>, k<InfoStickerEffect>, k {

    /* renamed from: a  reason: collision with root package name */
    public final t<String> f149918a;

    /* renamed from: b  reason: collision with root package name */
    public final t<List<InfoStickerEffect>> f149919b;

    /* renamed from: c  reason: collision with root package name */
    public final t<a> f149920c;

    /* renamed from: d  reason: collision with root package name */
    public final t<a> f149921d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Map<InfoStickerEffect, p<c, Integer>>> f149922e;

    /* renamed from: f  reason: collision with root package name */
    public final t<d<List<InfoStickerEffect>>> f149923f;

    /* renamed from: g  reason: collision with root package name */
    public final t<d<List<InfoStickerEffect>>> f149924g;

    /* renamed from: h  reason: collision with root package name */
    private final RecommendListModel f149925h;

    /* renamed from: i  reason: collision with root package name */
    private final SearchStateViewModel f149926i;

    /* renamed from: j  reason: collision with root package name */
    private PersonalizedSearchListViewModel f149927j;

    /* renamed from: k  reason: collision with root package name */
    private SearchStateViewModel f149928k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f149929l;

    /* renamed from: m  reason: collision with root package name */
    private final t<String> f149930m;
    private final u<List<InfoStickerEffect>> n;
    private final u<a> o;
    private final u<a> p;
    private final u<Object> q;
    private final u<Map<InfoStickerEffect, p<c, Integer>>> r;
    private final m s;

    static {
        Covode.recordClassIndex(98700);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<Object> e() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class PersonalizedSearchListViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        public final t<Object> f149931d;

        /* renamed from: e  reason: collision with root package name */
        public final t<com.ss.android.ugc.tools.view.widget.b.a> f149932e;

        /* renamed from: f  reason: collision with root package name */
        public final h.f.a.b<InfoStickerEffect, Boolean> f149933f;

        /* renamed from: g  reason: collision with root package name */
        private j<InfoStickerEffect, InfoStickerListModel> f149934g;

        /* renamed from: h  reason: collision with root package name */
        private final f f149935h;

        /* renamed from: i  reason: collision with root package name */
        private final String f149936i;

        /* renamed from: j  reason: collision with root package name */
        private final String f149937j;

        /* renamed from: k  reason: collision with root package name */
        private final String f149938k;

        static {
            Covode.recordClassIndex(98701);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
            return this.f149932e;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<Object> e() {
            return this.f149931d;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<InfoStickerEffect>> h() {
            f fVar = this.f149935h;
            String str = this.f149937j;
            if (str == null) {
                str = "";
            }
            String str2 = this.f149938k;
            if (str2 == null) {
                str2 = "";
            }
            j<InfoStickerEffect, InfoStickerListModel> a2 = fVar.a(str, str2, this.f149936i);
            this.f149934g = a2;
            ab<R> c2 = a2.a().b(new a(this)).c(new b(this));
            l.b(c2, "");
            return c2;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<InfoStickerEffect>> i() {
            ab<p<List<InfoStickerEffect>, InfoStickerListModel>> a2;
            ab<p<List<InfoStickerEffect>, InfoStickerListModel>> b2;
            ab<R> c2;
            j<InfoStickerEffect, InfoStickerListModel> jVar = this.f149934g;
            if (jVar != null && (a2 = jVar.a()) != null && (b2 = a2.b(new c(this))) != null && (c2 = b2.c(d.f149942a)) != null) {
                return c2;
            }
            ab<List<InfoStickerEffect>> a3 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            l.b(a3, "");
            return a3;
        }

        static final class d<T, R> implements g<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f149942a = new d();

            static {
                Covode.recordClassIndex(98705);
            }

            d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class a<T> implements f.a.d.f<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PersonalizedSearchListViewModel f149939a;

            static {
                Covode.recordClassIndex(98702);
            }

            a(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f149939a = personalizedSearchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f149939a.f149931d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f149939a.f149932e.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                }
            }
        }

        static final class b<T, R> implements g<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PersonalizedSearchListViewModel f149940a;

            static {
                Covode.recordClassIndex(98703);
            }

            b(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f149940a = personalizedSearchListViewModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                l.d(pVar2, "");
                h.f.a.b<InfoStickerEffect, Boolean> bVar = this.f149940a.f149933f;
                ArrayList arrayList = new ArrayList();
                for (T t : (List) pVar2.component1()) {
                    if (bVar.invoke(t).booleanValue()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        }

        static final class c<T> implements f.a.d.f<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PersonalizedSearchListViewModel f149941a;

            static {
                Covode.recordClassIndex(98704);
            }

            c(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f149941a = personalizedSearchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f149941a.f149931d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f149941a.f149932e.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                }
            }
        }
    }

    static final class RecommendListModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        public final t<Object> f149943d;

        /* renamed from: e  reason: collision with root package name */
        public final t<com.ss.android.ugc.tools.view.widget.b.a> f149944e;

        /* renamed from: f  reason: collision with root package name */
        private j<InfoStickerEffect, InfoStickerListModel> f149945f;

        /* renamed from: g  reason: collision with root package name */
        private final f f149946g;

        /* renamed from: h  reason: collision with root package name */
        private final String f149947h;

        /* renamed from: i  reason: collision with root package name */
        private final String f149948i;

        static {
            Covode.recordClassIndex(98706);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
            return this.f149944e;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
        public final LiveData<Object> e() {
            return this.f149943d;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<InfoStickerEffect>> h() {
            f fVar = this.f149946g;
            String str = this.f149947h;
            if (str == null) {
                str = "";
            }
            String str2 = this.f149948i;
            if (str2 == null) {
                str2 = "";
            }
            j<InfoStickerEffect, InfoStickerListModel> a2 = fVar.a(2, str, str2);
            this.f149945f = a2;
            ab<R> c2 = a2.a().b(new a(this)).c(b.f149950a);
            l.b(c2, "");
            return c2;
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        public final ab<List<InfoStickerEffect>> i() {
            ab<p<List<InfoStickerEffect>, InfoStickerListModel>> a2;
            ab<p<List<InfoStickerEffect>, InfoStickerListModel>> b2;
            ab<R> c2;
            j<InfoStickerEffect, InfoStickerListModel> jVar = this.f149945f;
            if (jVar != null && (a2 = jVar.a()) != null && (b2 = a2.b(new c(this))) != null && (c2 = b2.c(d.f149952a)) != null) {
                return c2;
            }
            ab<List<InfoStickerEffect>> a3 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            l.b(a3, "");
            return a3;
        }

        static final class b<T, R> implements g<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f149950a = new b();

            static {
                Covode.recordClassIndex(98708);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class d<T, R> implements g<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f149952a = new d();

            static {
                Covode.recordClassIndex(98710);
            }

            d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                l.d(pVar2, "");
                return pVar2.component1();
            }
        }

        static final class a<T> implements f.a.d.f<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecommendListModel f149949a;

            static {
                Covode.recordClassIndex(98707);
            }

            a(RecommendListModel recommendListModel) {
                this.f149949a = recommendListModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f149949a.f149943d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f149949a.f149944e.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                }
            }
        }

        static final class c<T> implements f.a.d.f<p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecommendListModel f149951a;

            static {
                Covode.recordClassIndex(98709);
            }

            c(RecommendListModel recommendListModel) {
                this.f149951a = recommendListModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f149951a.f149943d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f149951a.f149944e.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.i
    public final LiveData<String> a() {
        return this.f149930m;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<List<InfoStickerEffect>> b() {
        return this.f149919b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<a> c() {
        return this.f149920c;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<a> d() {
        return this.f149921d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.i
    public final LiveData<String> h() {
        return this.f149918a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<Map<InfoStickerEffect, p<c, Integer>>> j() {
        return this.f149922e;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<d<List<InfoStickerEffect>>> k() {
        return this.f149923f;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<d<List<InfoStickerEffect>>> l() {
        return this.f149924g;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void f() {
        if (this.f149929l) {
            this.f149925h.f();
            return;
        }
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f149927j;
        if (personalizedSearchListViewModel != null) {
            personalizedSearchListViewModel.f();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void g() {
        if (this.f149929l) {
            this.f149925h.g();
            return;
        }
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f149927j;
        if (personalizedSearchListViewModel != null) {
            personalizedSearchListViewModel.g();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.i
    public final void i() {
        String str;
        LiveData j2;
        LiveData j3;
        this.f149929l = true;
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f149927j;
        SearchStateViewModel searchStateViewModel = this.f149928k;
        if (personalizedSearchListViewModel != null) {
            LiveData b2 = personalizedSearchListViewModel.b();
            if (b2 != null) {
                b2.removeObserver(this.n);
            }
            LiveData<a> c2 = personalizedSearchListViewModel.c();
            if (c2 != null) {
                c2.removeObserver(this.o);
            }
            LiveData<a> d2 = personalizedSearchListViewModel.d();
            if (d2 != null) {
                d2.removeObserver(this.p);
            }
            LiveData<Object> e2 = personalizedSearchListViewModel.e();
            if (e2 != null) {
                e2.removeObserver(this.q);
            }
        }
        if (!(searchStateViewModel == null || (j3 = searchStateViewModel.j()) == null)) {
            j3.removeObserver(this.r);
        }
        RecommendListModel recommendListModel = this.f149925h;
        SearchStateViewModel searchStateViewModel2 = this.f149926i;
        if (recommendListModel != null) {
            LiveData b3 = recommendListModel.b();
            if (b3 != null) {
                b3.observe(this.s, this.n);
            }
            LiveData<a> c3 = recommendListModel.c();
            if (c3 != null) {
                c3.observe(this.s, this.o);
            }
            LiveData<a> d3 = recommendListModel.d();
            if (d3 != null) {
                d3.observe(this.s, this.p);
            }
            LiveData<Object> e3 = recommendListModel.e();
            if (e3 != null) {
                e3.observe(this.s, this.q);
            }
        }
        if (!(searchStateViewModel2 == null || (j2 = searchStateViewModel2.j()) == null)) {
            j2.observe(this.s, this.r);
        }
        t<String> tVar = this.f149918a;
        Object value = this.f149925h.f149943d.getValue();
        if (!(value instanceof InfoStickerListModel)) {
            value = null;
        }
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) value;
        if (infoStickerListModel == null || (str = infoStickerListModel.getSubtitle()) == null) {
            str = "";
        }
        tVar.setValue(str);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        l.d(mVar, "");
        l.d(mVar, "");
    }

    static final class SearchStateViewModel extends BaseInfoStickerStateViewModel<InfoStickerEffect> implements au {

        /* renamed from: d  reason: collision with root package name */
        private final f f149953d;

        static {
            Covode.recordClassIndex(98711);
        }

        @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* Return type fixed from 'f.a.t' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        public final /* synthetic */ f.a.t<am<InfoStickerEffect, c, Integer>> b(InfoStickerEffect infoStickerEffect) {
            InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
            l.d(infoStickerEffect2, "");
            f.a.t<R> d2 = this.f149953d.a(infoStickerEffect2).d(a.f149954a);
            l.b(d2, "");
            return d2;
        }

        static final class a<T, R> implements g<com.ss.android.ugc.tools.infosticker.a.a.i, am<InfoStickerEffect, c, Integer>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f149954a = new a();

            static {
                Covode.recordClassIndex(98712);
            }

            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ am<InfoStickerEffect, c, Integer> apply(com.ss.android.ugc.tools.infosticker.a.a.i iVar) {
                c cVar;
                com.ss.android.ugc.tools.infosticker.a.a.i iVar2 = iVar;
                l.d(iVar2, "");
                InfoStickerEffect infoStickerEffect = iVar2.f149361a;
                int i2 = c.f149967a[iVar2.f149362b.f149377a.ordinal()];
                if (i2 == 1) {
                    cVar = c.UNKNOWN;
                } else if (i2 == 2) {
                    cVar = c.DOWNLOADING;
                } else if (i2 == 3) {
                    cVar = c.NOT_DOWNLOAD;
                } else if (i2 == 4) {
                    cVar = c.DOWNLOAD_SUCCESS;
                } else if (i2 != 5) {
                    cVar = c.UNKNOWN;
                } else {
                    cVar = c.DOWNLOAD_FAILED;
                }
                return new am(infoStickerEffect, cVar, iVar2.f149363c);
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final /* synthetic */ void a(Object obj) {
        l.d(obj, "");
        if (this.f149929l) {
            this.f149926i.a(obj);
            return;
        }
        SearchStateViewModel searchStateViewModel = this.f149928k;
        if (searchStateViewModel != null) {
            searchStateViewModel.a(obj);
        }
    }
}
