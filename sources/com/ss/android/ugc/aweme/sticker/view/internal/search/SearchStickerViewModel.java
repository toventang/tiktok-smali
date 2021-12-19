package com.ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.c.c;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.aweme.sticker.view.internal.search.m;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.e;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.EffectNameModel;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsModel;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class SearchStickerViewModel extends StickerListViewModel implements au, a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f136505k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final t<k> f136506a;

    /* renamed from: b  reason: collision with root package name */
    final t<p<String, List<String>>> f136507b;

    /* renamed from: c  reason: collision with root package name */
    final t<f> f136508c;

    /* renamed from: d  reason: collision with root package name */
    final t<d> f136509d;

    /* renamed from: e  reason: collision with root package name */
    boolean f136510e;

    /* renamed from: f  reason: collision with root package name */
    public c f136511f;

    /* renamed from: g  reason: collision with root package name */
    public long f136512g;

    /* renamed from: h  reason: collision with root package name */
    long f136513h;

    /* renamed from: i  reason: collision with root package name */
    public t<Boolean> f136514i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public t<String> f136515j = new t<>();
    private m t = m.a.f136588a;
    private final LiveData<k> u;
    private final LiveData<p<String, List<String>>> v;
    private final LiveData<f> w;
    private final LiveData<d> x;
    private final LiveData<Boolean> y;
    private String z;

    static {
        Covode.recordClassIndex(89162);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89167);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final String b() {
        return this.z;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final m c() {
        return this.t;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final /* bridge */ /* synthetic */ LiveData d() {
        return this.f136515j;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final LiveData<k> e() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final LiveData<f> f() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final LiveData<d> g() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final LiveData<Boolean> h() {
        return this.y;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final e<Effect> i() {
        return new b();
    }

    public static final class b implements e<Effect> {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, Integer> f136523a = new HashMap<>();

        static {
            Covode.recordClassIndex(89168);
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.e
        public final /* synthetic */ int a(Effect effect) {
            Integer num;
            Effect effect2 = effect;
            if (effect2 == null || (num = this.f136523a.get(effect2.getId())) == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.e
        public final void a(List<? extends Effect> list) {
            l.d(list, "");
            if (list.isEmpty()) {
                this.f136523a.clear();
                return;
            }
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                this.f136523a.put(t.getId(), Integer.valueOf(i2));
                i2 = i3;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final void a() {
        this.f136515j.setValue("");
        a((m) m.a.f136588a);
    }

    public final c j() {
        c cVar = this.f136511f;
        if (cVar == null) {
            return new c(null, "", 0, null, null, 93);
        }
        return cVar;
    }

    public final void a(m mVar) {
        l.d(mVar, "");
        this.t = mVar;
    }

    public final void b(String str) {
        l.d(str, "");
        this.z = str;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public void a(c cVar) {
        l.d(cVar, "");
        this.f136515j.setValue(cVar.f135486b);
        this.f136511f = cVar;
        this.f136512g = System.currentTimeMillis();
        this.o.c().a(cVar);
    }

    static void a(Effect effect, List<Effect> list) {
        if (effect != null) {
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (l.a((Object) it.next().getEffectId(), (Object) effect.getEffectId())) {
                    list.remove(i2);
                    list.add(0, effect);
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchStickerViewModel(final androidx.lifecycle.m mVar, final o oVar, d dVar, g gVar) {
        super(mVar, oVar, dVar, gVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        t<k> tVar = new t<>();
        this.f136506a = tVar;
        t<p<String, List<String>>> tVar2 = new t<>();
        this.f136507b = tVar2;
        t<f> tVar3 = new t<>();
        this.f136508c = tVar3;
        t<d> tVar4 = new t<>();
        this.f136509d = tVar4;
        this.u = tVar;
        this.v = tVar2;
        this.w = tVar3;
        this.x = tVar4;
        this.y = this.f136514i;
        this.z = "";
        oVar.c().j().f().observe(mVar, new u<com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2>>(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchStickerViewModel f136516a;

            static {
                Covode.recordClassIndex(89163);
            }

            {
                this.f136516a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2> aVar) {
                int i2;
                Object obj;
                String str;
                int i3;
                Boolean bool;
                String str2;
                SearchEffectModel data;
                SearchEffectModel data2;
                List<Effect> effectList;
                SearchEffectModel data3;
                String search_id;
                List<Effect> list;
                SearchEffectModel data4;
                String search_id2;
                Boolean bool2;
                String str3;
                String str4;
                String str5;
                Boolean bool3;
                String str6;
                SearchEffectModel data5;
                com.ss.android.ugc.aweme.bw.b.a<SearchEffectResponseV2> aVar2 = aVar;
                SearchStickerViewModel searchStickerViewModel = this.f136516a;
                String str7 = "";
                l.b(aVar2, str7);
                a.EnumC1574a aVar3 = aVar2.f69569b;
                if (aVar3 != null) {
                    int i4 = o.f136594c[aVar3.ordinal()];
                    if (i4 == 1) {
                        i2 = 1;
                    } else if (i4 == 2) {
                        i2 = 0;
                    }
                    com.ss.android.ugc.tools.g.b bVar = com.ss.android.ugc.tools.c.f149150e;
                    com.ss.android.ugc.tools.g.c cVar = com.ss.android.ugc.tools.g.c.SEARCH_PROP;
                    JSONObject jSONObject = new JSONObject();
                    M m2 = aVar2.f69568a;
                    if (m2 != null) {
                        obj = Integer.valueOf(m2.status_code);
                    } else {
                        obj = str7;
                    }
                    jSONObject.put("error_code", obj);
                    M m3 = aVar2.f69568a;
                    if (m3 == null || (str = m3.message) == null) {
                        str = str7;
                    }
                    jSONObject.put("error_desc", str);
                    jSONObject.put("duration", System.currentTimeMillis() - searchStickerViewModel.f136512g);
                    M m4 = aVar2.f69568a;
                    if (!(m4 == null || (data3 = m4.getData()) == null || (search_id = data3.getSearch_id()) == null)) {
                        str7 = search_id;
                    }
                    jSONObject.put("search_id", str7);
                    M m5 = aVar2.f69568a;
                    if (m5 == null || (data2 = m5.getData()) == null || (effectList = data2.getEffectList()) == null) {
                        i3 = 0;
                    } else {
                        i3 = effectList.size();
                    }
                    jSONObject.put("effect_size", i3);
                    M m6 = aVar2.f69568a;
                    if (m6 == null || (data = m6.getData()) == null) {
                        bool = null;
                    } else {
                        bool = data.getUse_hot();
                    }
                    if (l.a((Object) bool, (Object) true)) {
                        str2 = "recommend";
                    } else {
                        str2 = "search";
                    }
                    jSONObject.put("search_method", str2);
                    bVar.a(cVar, i2, jSONObject);
                }
                a.EnumC1574a aVar4 = aVar2.f69569b;
                if (aVar4 != null) {
                    int i5 = o.f136592a[aVar4.ordinal()];
                    if (i5 == 1) {
                        searchStickerViewModel.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                    } else if (i5 == 2) {
                        searchStickerViewModel.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
                    } else if (i5 == 3) {
                        M m7 = aVar2.f69568a;
                        if (m7 == null || (data5 = m7.getData()) == null) {
                            list = null;
                        } else {
                            list = data5.getEffectList();
                        }
                        String str8 = "0";
                        if (m7 == null || list == null || list.isEmpty()) {
                            searchStickerViewModel.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
                            c cVar2 = searchStickerViewModel.f136511f;
                            if (cVar2 != null) {
                                if (!(m7 == null || (data4 = m7.getData()) == null || (search_id2 = data4.getSearch_id()) == null)) {
                                    str8 = search_id2;
                                }
                                searchStickerViewModel.f136508c.setValue(new f.c("", cVar2.f135486b, str8, "0", String.valueOf(System.currentTimeMillis() - searchStickerViewModel.f136512g)));
                                return;
                            }
                            return;
                        }
                        searchStickerViewModel.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                        Effect f2 = searchStickerViewModel.o.f();
                        List<? extends Effect> g2 = n.g((Collection) list);
                        SearchStickerViewModel.a(f2, (List<Effect>) g2);
                        searchStickerViewModel.a(g2);
                        SearchEffectModel data6 = m7.getData();
                        if (data6 != null) {
                            bool2 = data6.getUse_hot();
                        } else {
                            bool2 = null;
                        }
                        if (l.a((Object) bool2, (Object) true)) {
                            t<k> tVar = searchStickerViewModel.f136506a;
                            SearchEffectModel data7 = m7.getData();
                            if (data7 == null || (str6 = data7.getSearch_id()) == null) {
                                str6 = str8;
                            }
                            tVar.setValue(new k(true, g2, str6));
                            searchStickerViewModel.a((m) m.c.f136590a);
                        } else {
                            t<k> tVar2 = searchStickerViewModel.f136506a;
                            SearchEffectModel data8 = m7.getData();
                            if (data8 == null || (str3 = data8.getSearch_id()) == null) {
                                str3 = str8;
                            }
                            tVar2.setValue(new k(false, g2, str3));
                            searchStickerViewModel.a((m) m.b.f136589a);
                        }
                        c cVar3 = searchStickerViewModel.f136511f;
                        if (cVar3 != null) {
                            if (cVar3.f135490f) {
                                str4 = "search_rec";
                            } else {
                                str4 = "search_sug";
                            }
                            SearchEffectModel data9 = m7.getData();
                            if (data9 == null || (str5 = data9.getSearch_id()) == null) {
                                str5 = str8;
                            }
                            SearchEffectModel data10 = m7.getData();
                            if (data10 != null) {
                                bool3 = data10.getUse_hot();
                            } else {
                                bool3 = null;
                            }
                            if (!l.a((Object) bool3, (Object) true)) {
                                str8 = "1";
                            }
                            searchStickerViewModel.f136508c.setValue(new f.c(str4, cVar3.f135486b, str5, str8, String.valueOf(System.currentTimeMillis() - searchStickerViewModel.f136512g)));
                        }
                        SearchEffectModel data11 = m7.getData();
                        if (data11 != null) {
                            data11.setEffectList(g2);
                        }
                    }
                }
            }
        });
        oVar.c().j().g().observe(mVar, new u<com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse>>(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchStickerViewModel f136517a;

            static {
                Covode.recordClassIndex(89164);
            }

            {
                this.f136517a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse> aVar) {
                int i2;
                Integer num;
                String str;
                int i3;
                RecommendSearchWordsModel data;
                List<EffectNameModel> effects;
                RecommendSearchWordsModel data2;
                List<EffectNameModel> effects2;
                RecommendSearchWordsModel data3;
                com.ss.android.ugc.aweme.bw.b.a<RecommendSearchWordsResponse> aVar2 = aVar;
                SearchStickerViewModel searchStickerViewModel = this.f136517a;
                if (aVar2 != null) {
                    a.EnumC1574a aVar3 = aVar2.f69569b;
                    if (aVar3 != null) {
                        int i4 = o.f136595d[aVar3.ordinal()];
                        if (i4 == 1) {
                            i2 = 1;
                        } else if (i4 == 2) {
                            i2 = 0;
                        }
                        com.ss.android.ugc.tools.g.b bVar = com.ss.android.ugc.tools.c.f149150e;
                        com.ss.android.ugc.tools.g.c cVar = com.ss.android.ugc.tools.g.c.SEARCH_PROP_RECOMMEND_LIST;
                        JSONObject jSONObject = new JSONObject();
                        M m2 = aVar2.f69568a;
                        if (m2 != null) {
                            num = Integer.valueOf(m2.getStatus_code());
                        } else {
                            num = "";
                        }
                        jSONObject.put("error_code", num);
                        M m3 = aVar2.f69568a;
                        if (m3 == null || (str = m3.getMessage()) == null) {
                            str = "";
                        }
                        jSONObject.put("error_desc", str);
                        M m4 = aVar2.f69568a;
                        if (m4 == null || (data = m4.getData()) == null || (effects = data.getEffects()) == null) {
                            i3 = 0;
                        } else {
                            i3 = effects.size();
                        }
                        jSONObject.put("recommendation_list_count", i3);
                        jSONObject.put("duration", System.currentTimeMillis() - searchStickerViewModel.f136513h);
                        bVar.a(cVar, i2, jSONObject);
                    }
                    a.EnumC1574a aVar4 = aVar2.f69569b;
                    if (aVar4 != null && o.f136593b[aVar4.ordinal()] == 1) {
                        M m5 = aVar2.f69568a;
                        ArrayList arrayList = null;
                        String search_tips = (m5 == null || (data3 = m5.getData()) == null) ? null : data3.getSearch_tips();
                        M m6 = aVar2.f69568a;
                        if (!(m6 == null || (data2 = m6.getData()) == null || (effects2 = data2.getEffects()) == null)) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : effects2) {
                                String name = t.getName();
                                if (!(name == null || name.length() == 0)) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList<T> arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
                            for (T t2 : arrayList3) {
                                String name2 = t2.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                arrayList4.add(name2);
                            }
                            arrayList = arrayList4;
                        }
                        if (!(search_tips == null || search_tips.length() == 0 || arrayList == null || arrayList.isEmpty())) {
                            searchStickerViewModel.f136507b.setValue(v.a(search_tips, arrayList));
                            searchStickerViewModel.f136510e = true;
                        }
                    }
                }
            }
        });
        oVar.c().j().b().observe(mVar, new u<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>>(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchStickerViewModel f136518a;

            static {
                Covode.recordClassIndex(89165);
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$3$a */
            public static final class a implements u<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CategoryEffectModel f136521a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnonymousClass3 f136522b;

                static {
                    Covode.recordClassIndex(89166);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel> aVar) {
                    M m2;
                    com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel> aVar2 = aVar;
                    if (aVar2 != null && (m2 = aVar2.f69568a) != null) {
                        oVar.c().j().a(this.f136521a.getCategoryKey(), true).removeObserver(this);
                        SearchStickerViewModel searchStickerViewModel = this.f136522b.f136518a;
                        l.b(m2, "");
                        l.d(m2, "");
                        List<Effect> effects = m2.getEffects();
                        if (effects != null && !effects.isEmpty()) {
                            searchStickerViewModel.f136509d.setValue(new d(effects));
                        }
                    }
                }

                a(CategoryEffectModel categoryEffectModel, AnonymousClass3 r2) {
                    this.f136521a = categoryEffectModel;
                    this.f136522b = r2;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar) {
                M m2;
                CategoryEffectModel categoryEffectModel;
                String categoryKey;
                com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar2 = aVar;
                if (aVar2 != null && (m2 = aVar2.f69568a) != null && (categoryEffectModel = m2.getCategoryEffectModel()) != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                    oVar.c().j().b().removeObserver(this);
                    oVar.c().j().a(categoryEffectModel.getCategoryKey(), true).observe(mVar, new a(categoryEffectModel, this));
                }
            }

            {
                this.f136518a = r1;
            }
        });
        this.o.c().a();
        this.f136513h = System.currentTimeMillis();
    }
}
