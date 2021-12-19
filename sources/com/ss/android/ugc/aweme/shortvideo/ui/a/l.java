package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.utils.p;
import f.a.t;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class l extends com.bytedance.als.j<k> implements com.bytedance.o.a, k {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f131336a = {new y(l.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(l.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.creativex.recorder.filter.a.a f131337b = ((com.bytedance.creativex.recorder.filter.a.a) getDiContainer().b(com.bytedance.creativex.recorder.filter.a.a.class, null));

    /* renamed from: c  reason: collision with root package name */
    public boolean f131338c = true;

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f131339d = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f131340e = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.filter.a.d f131341f = ((com.bytedance.creativex.recorder.filter.a.d) getDiContainer().b(com.bytedance.creativex.recorder.filter.a.d.class, null));

    /* renamed from: g  reason: collision with root package name */
    private final f.a.b.a f131342g = new f.a.b.a();

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.o.f f131343h;

    static {
        Covode.recordClassIndex(86041);
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContext a() {
        return (ShortVideoContext) this.f131339d.a(this, f131336a[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.recorder.sticker.c.j b() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f131340e.a(this, f131336a[1]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ k getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f131343h;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.f $event;

        static {
            Covode.recordClassIndex(86045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
            super(0);
            this.$event = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("is_panel_infold", ((f.a) this.$event).f136528a);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.f $event;

        static {
            Covode.recordClassIndex(86046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
            super(0);
            this.$event = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("is_panel_infold", ((f.d) this.$event).f136535a);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.f $event;

        static {
            Covode.recordClassIndex(86042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
            super(0);
            this.$event = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            if (h.f.b.l.a((Object) ((f.b) this.$event).f136529a, (Object) "click_icon")) {
                hashMap.put("enter_method", "click");
            } else {
                hashMap.put("enter_method", ((f.b) this.$event).f136529a);
            }
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.f $event;

        static {
            Covode.recordClassIndex(86043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
            super(0);
            this.$event = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("search_id", ((f.c) this.$event).f136532c);
            hashMap.put("enter_method", "search_nomal");
            hashMap.put("is_success", ((f.c) this.$event).f136533d);
            hashMap.put("duration", ((f.c) this.$event).f136534e);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.f $event;

        static {
            Covode.recordClassIndex(86044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
            super(0);
            this.$event = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("search_id", ((f.e) this.$event).f136537b);
            hashMap.put("search_method", ((f.e) this.$event).f136536a);
            hashMap.put("is_panel_infold", ((f.e) this.$event).f136538c);
            hashMap.put("prop_id", ((f.e) this.$event).f136539d.getEffect_id());
            hashMap.put("impr_position", String.valueOf(((f.e) this.$event).f136540e));
            String recId = ((f.e) this.$event).f136539d.getRecId();
            if (recId == null) {
                recId = "0";
            }
            hashMap.put("prop_rec_id", recId);
            return hashMap;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        com.ss.android.ugc.gamora.recorder.sticker.c.j b2;
        o t;
        com.ss.android.ugc.aweme.sticker.presenter.j n;
        LiveData<com.ss.android.ugc.aweme.sticker.presenter.b> g2;
        com.bytedance.als.g<Boolean> d2;
        t<com.ss.android.ugc.aweme.filter.view.a.c> b3;
        f.a.b.b a2;
        LiveData<com.bytedance.creativex.recorder.filter.a.k> a3;
        super.onCreate();
        com.bytedance.creativex.recorder.filter.a.d dVar = this.f131341f;
        if (!(dVar == null || (a3 = dVar.a()) == null)) {
            a3.observe(this, new h(this));
        }
        com.bytedance.creativex.recorder.filter.a.d dVar2 = this.f131341f;
        if (!(dVar2 == null || (b3 = dVar2.b()) == null || (a2 = b3.a(new i(this), p.f150012a)) == null)) {
            this.f131342g.a(a2);
        }
        com.ss.android.ugc.gamora.recorder.sticker.c.j b4 = b();
        if (!(b4 == null || (d2 = b4.d()) == null)) {
            d2.a(this, new j(this));
        }
        com.ss.android.ugc.aweme.sticker.p.d dVar3 = (com.ss.android.ugc.aweme.sticker.p.d) getDiContainer().b(com.ss.android.ugc.aweme.sticker.p.d.class, null);
        if (dVar3 != null && (b2 = b()) != null && (t = b2.t()) != null && (n = t.n()) != null && (g2 = n.g()) != null) {
            g2.observe(this, new k(dVar3));
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f131344a;

        static {
            Covode.recordClassIndex(86047);
        }

        f(l lVar) {
            this.f131344a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar = (com.ss.android.ugc.aweme.sticker.view.internal.search.f) obj;
            l lVar = this.f131344a;
            h.f.b.l.b(fVar, "");
            lVar.a(fVar);
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f131345a;

        static {
            Covode.recordClassIndex(86048);
        }

        g(l lVar) {
            this.f131345a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar = (com.ss.android.ugc.aweme.sticker.view.internal.search.f) obj;
            l lVar = this.f131345a;
            h.f.b.l.b(fVar, "");
            lVar.a(fVar);
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.p.d f131350a;

        static {
            Covode.recordClassIndex(86053);
        }

        k(com.ss.android.ugc.aweme.sticker.p.d dVar) {
            this.f131350a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            com.ss.android.ugc.aweme.sticker.presenter.b bVar = (com.ss.android.ugc.aweme.sticker.presenter.b) obj;
            com.ss.android.ugc.aweme.sticker.p.d dVar = this.f131350a;
            if (bVar != null) {
                effect = bVar.f135273a;
            } else {
                effect = null;
            }
            dVar.a(effect);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f131348a;

        static {
            Covode.recordClassIndex(86051);
        }

        j(l lVar) {
            this.f131348a = lVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.panel.i v;
            com.ss.android.ugc.aweme.sticker.view.internal.search.c e2;
            LiveData<com.ss.android.ugc.aweme.sticker.view.internal.search.f> f2;
            if (h.f.b.l.a(obj, (Object) true)) {
                b.i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.a.l.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f131349a;

                    static {
                        Covode.recordClassIndex(86052);
                    }

                    {
                        this.f131349a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        FaceStickerBean i2;
                        l lVar = this.f131349a.f131348a;
                        if (TextUtils.isEmpty(lVar.a().aG)) {
                            lVar.a().aG = "normal";
                        }
                        if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
                            bVar.a("shoot_way", lVar.a().r);
                            bVar.a("creation_id", lVar.a().q);
                            bVar.a("enter_from", "video_shoot_page");
                            com.ss.android.ugc.gamora.recorder.sticker.c.j b2 = lVar.b();
                            if (!(b2 == null || (i2 = b2.i()) == null)) {
                                bVar.a("effect_id", i2.getId());
                                bVar.a("effect_name", i2.getName());
                            }
                            if (lVar.a().C != 0) {
                                bVar.a("draft_id", lVar.a().C);
                            }
                            String str = lVar.a().D;
                            h.f.b.l.b(str, "");
                            if (str.length() > 0) {
                                bVar.a("new_draft_id", lVar.a().D);
                            }
                            r.a("click_prop_entrance", bVar.f149193a);
                        } else {
                            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", lVar.a().q).a("shoot_way", lVar.a().r).a("enter_from", "video_shoot_page").a("enter_method", lVar.a().aG).a("content_type", lVar.a().j().getContentType()).a("content_source", lVar.a().j().getContentSource()).a("from_group_id", dv.a());
                            if (lVar.a().C != 0) {
                                a2.a("draft_id", lVar.a().C);
                            }
                            String str2 = lVar.a().D;
                            h.f.b.l.b(str2, "");
                            if (str2.length() > 0) {
                                a2.a("new_draft_id", lVar.a().D);
                            }
                            a2.a("shoot_page", "video_shoot_page");
                            a2.a("shoot_tab_name", lVar.a().r());
                            com.ss.android.ugc.aweme.utils.d.a("click_prop_entrance", a2.f149193a);
                            lVar.a().aG = "";
                        }
                        lVar.a().aG = "";
                        return z.f158842a;
                    }
                }, b.i.f4824a);
            }
            if (this.f131348a.f131338c && h.f.b.l.a(obj, (Object) true)) {
                this.f131348a.f131338c = false;
                l lVar = this.f131348a;
                com.ss.android.ugc.gamora.recorder.sticker.c.j b2 = lVar.b();
                if (!(b2 == null || (v = b2.v()) == null || (e2 = v.e()) == null || (f2 = e2.f()) == null)) {
                    f2.observe(lVar, new g(lVar));
                }
                com.ss.android.ugc.aweme.sticker.view.a.b bVar = (com.ss.android.ugc.aweme.sticker.view.a.b) lVar.getDiContainer().a((Type) com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null);
                if (bVar.a("sticker_category:search") instanceof com.ss.android.ugc.aweme.sticker.view.internal.search.j) {
                    com.ss.android.ugc.aweme.sticker.view.a.a a2 = bVar.a("sticker_category:search");
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerCategoryTabView");
                    ((com.ss.android.ugc.aweme.sticker.view.internal.search.j) a2).a().f136483k.observe(lVar, new f(lVar));
                }
            }
        }
    }

    public l(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.f131343h = fVar;
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f131346a;

        static {
            Covode.recordClassIndex(86049);
        }

        h(l lVar) {
            this.f131346a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.als.h<FilterBean> curSelectedFilter;
            T value;
            com.ss.android.ugc.aweme.filter.repository.a.m mVar;
            LiveData<com.bytedance.creativex.recorder.filter.a.e> currentFilterSource;
            com.bytedance.creativex.recorder.filter.a.e value2;
            if (obj == com.bytedance.creativex.recorder.filter.a.k.ON_SHOWN) {
                l lVar = this.f131346a;
                ShortVideoContext a2 = lVar.a();
                r.a("click_modify_entrance", new com.ss.android.ugc.tools.f.b().a("creation_id", a2.q).a("shoot_way", a2.r).a("content_source", a2.j().getContentSource()).a("content_type", a2.j().getContentType()).a("enter_from", "video_shoot_page").a("scene_id", "1004").a("shoot_page", "video_shoot_page").a("shoot_tab_name", lVar.a().r()).f149193a);
            } else if (obj == com.bytedance.creativex.recorder.filter.a.k.ON_DISMISSED) {
                l lVar2 = this.f131346a;
                com.bytedance.creativex.recorder.filter.a.a aVar = lVar2.f131337b;
                Float f2 = null;
                if (aVar != null && (curSelectedFilter = aVar.getCurSelectedFilter()) != null && (value = curSelectedFilter.f6468a.getValue()) != null) {
                    com.bytedance.creativex.recorder.filter.a.a aVar2 = lVar2.f131337b;
                    if (aVar2 == null || (currentFilterSource = aVar2.getCurrentFilterSource()) == null || (value2 = currentFilterSource.getValue()) == null) {
                        mVar = null;
                    } else {
                        mVar = value2.f28228c;
                    }
                    com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("creation_id", lVar2.a().q).a("shoot_way", lVar2.a().r).a("draft_id", lVar2.a().C).a("filter_id", value.getId()).a("filter_name", value.getEnName());
                    if (mVar != null) {
                        f2 = Float.valueOf(mVar.a(value));
                    }
                    Map<String, String> map = a3.a("value", f2).f149193a;
                    h.f.b.l.b(map, "");
                    r.a("adjust_filter_complete", map);
                }
            }
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f131347a;

        static {
            Covode.recordClassIndex(86050);
        }

        i(l lVar) {
            this.f131347a = lVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.filter.view.a.c cVar = (com.ss.android.ugc.aweme.filter.view.a.c) obj;
            int i2 = m.f131351a[cVar.f95756a.ordinal()];
            if (i2 == 1) {
                EffectCategoryResponse effectCategoryResponse = cVar.f95757b;
                if (effectCategoryResponse != null) {
                    l lVar = this.f131347a;
                    AVETParameter j2 = lVar.a().j();
                    if (j2 != null) {
                        com.ss.android.ugc.aweme.utils.d.a("click_filter_tab", new com.ss.android.ugc.tools.f.b().a("creation_id", j2.getCreationId()).a("shoot_way", j2.getShootWay()).a("tab_name", effectCategoryResponse.getName()).a("content_source", j2.getContentSource()).a("content_type", j2.getContentType()).a("enter_from", "video_shoot_page").a("scene_id", "1002").a("shoot_page", "video_shoot_page").a("shoot_tab_name", lVar.a().r()).f149193a);
                    }
                }
            } else if (i2 == 2) {
                AVETParameter j3 = this.f131347a.a().j();
                if (j3 != null) {
                    r.a("filter_deleted", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", j3.getShootWay()).a("creation_id", j3.getCreationId()).a("filter_id", "-1").f149193a);
                }
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.port.in.g.a().I().a("click_filter_box", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").f149193a);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.search.f fVar) {
        if (fVar instanceof f.b) {
            a("click_prop_search_icon", new a(fVar));
        } else if (fVar instanceof f.c) {
            a("prop_search", new b(fVar));
        } else if (fVar instanceof f.e) {
            a("prop_show", new c(fVar));
        } else if (fVar instanceof f.a) {
            a("clear_prop_search_text", new d(fVar));
        } else if (fVar instanceof f.d) {
            a("prop_search_cancel", new e(fVar));
        }
    }

    private final void a(String str, h.f.a.a<? extends HashMap<String, String>> aVar) {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", a().q).a("shoot_way", a().r).a("music_id", a().f124762g).a("shoot_tab_name", a().r()).a("enter_from", "video_shoot_page");
        a2.a((Map) aVar.invoke());
        com.ss.android.ugc.aweme.utils.d.a(str, a2.f149193a);
    }
}
