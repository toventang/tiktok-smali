package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.am;
import h.a.n;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends o implements i, j {

    /* renamed from: d  reason: collision with root package name */
    public static final C2835a f110937d = new C2835a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.app.f.d f110938e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f110939f;

    /* renamed from: g  reason: collision with root package name */
    private final h f110940g = h.i.a((h.f.a.a) c.f110941a);

    static {
        Covode.recordClassIndex(71167);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(161, new g(a.class, "onWebViewFinish", com.ss.android.ugc.aweme.crossplatform.b.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.a$a  reason: collision with other inner class name */
    public static final class C2835a {
        static {
            Covode.recordClassIndex(71168);
        }

        private C2835a() {
        }

        public /* synthetic */ C2835a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(71169);
        }

        b() {
        }
    }

    public static final class d extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(71171);
        }

        d() {
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new a();
    }

    private final void n() {
        if (v()) {
            AdLandPagePreloadServiceImpl.f().a().c(u());
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean j() {
        Integer num;
        Set set = (Set) this.f110940g.getValue();
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            num = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            num = null;
        }
        if (!n.a((Iterable) set, (Object) num)) {
            return true;
        }
        return false;
    }

    static final class c extends m implements h.f.a.a<Set<? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f110941a = new c();

        static {
            Covode.recordClassIndex(71170);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<? extends Integer> invoke() {
            return am.a((Object[]) new Integer[]{Integer.valueOf(ab.DUET.getTYPE()), Integer.valueOf(ab.QUIZLET.getTYPE())});
        }
    }

    private final List<String> u() {
        String extra;
        String str;
        o oVar;
        l lVar;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null || extra.length() == 0) {
            return null;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getExtra();
        } else {
            str = null;
        }
        l a2 = q.a(str);
        if (a2 != null) {
            oVar = a2.j();
        } else {
            oVar = null;
        }
        f fVar = new f();
        if (oVar != null) {
            lVar = oVar.c("gecko_channel");
        } else {
            lVar = null;
        }
        List<String> list = (List) fVar.a(lVar, new b().type);
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return list;
        }
        return null;
    }

    private final boolean v() {
        String str;
        String str2;
        o oVar;
        List<String> u;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        l lVar = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        l a2 = q.a(str2);
        if (a2 != null) {
            oVar = a2.j();
        } else {
            oVar = null;
        }
        f fVar = new f();
        if (oVar != null) {
            lVar = oVar.c("is_schema_lynx");
        }
        Boolean bool = (Boolean) fVar.a(lVar, new d().type);
        if (bool == null || !bool.booleanValue() || (u = u()) == null || u.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f110939f = true;
        n();
        super.b(dVar);
    }

    @r
    public final void onWebViewFinish(com.ss.android.ugc.aweme.crossplatform.b.d dVar) {
        Map<String, String> map;
        h.f.b.l.d(dVar, "");
        if (j()) {
            com.ss.android.ugc.aweme.common.r.a("anchor_stay_time", t().a("duration", dVar.f78593a).f66730a);
        }
        com.ss.android.ugc.aweme.app.f.d t = t();
        com.ss.android.ugc.aweme.app.f.d dVar2 = this.f110938e;
        if (dVar2 == null || (map = dVar2.f66730a) == null) {
            map = ag.a();
        }
        com.ss.android.ugc.aweme.common.r.a("multi_anchor_stay_time", t.a(new HashMap<>(map)).a("duration", dVar.f78593a).f66730a);
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final com.ss.android.ugc.aweme.multi.g a(List<AnchorCommonStruct> list) {
        h.f.b.l.d(list, "");
        ArrayList arrayList = new ArrayList();
        String str = "";
        boolean z = false;
        for (T t : list) {
            T t2 = t;
            try {
                WikipediaExtra wikipediaExtra = (WikipediaExtra) new f().a(t2.getExtra(), WikipediaExtra.class);
                Integer num = null;
                if (wikipediaExtra != null) {
                    num = wikipediaExtra.getStatus();
                }
                if (num != null) {
                    if (num.intValue() == 2) {
                        String authorUid = o().getAuthorUid();
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g2, "");
                        if (TextUtils.equals(authorUid, g2.getCurUserId()) && !a(t2.getId())) {
                            b(t2.getId());
                            str = wikipediaExtra.getWarningMsg();
                            z = true;
                        }
                    }
                }
                if (hl.a(t2.getSchema()) && hl.a(t2.getKeyword()) && t2.getGeneralType() == 1) {
                    if (wikipediaExtra != null) {
                        Integer status = wikipediaExtra.getStatus();
                        if (status != null) {
                            if (status.intValue() != 2) {
                            }
                        }
                    }
                    arrayList.add(t);
                }
            } catch (Exception unused) {
                if (hl.a(t2.getSchema())) {
                    if (hl.a(t2.getKeyword())) {
                        if (t2.getGeneralType() != 1) {
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (z) {
            Aweme o = o();
            if (TextUtils.isEmpty(str)) {
                str = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.hf_);
            }
            o.setAnchorWikiOfflineText(str);
        }
        if (arrayList2.size() == 0) {
            return com.ss.android.ugc.aweme.multi.g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) arrayList2.get(0);
        list.remove(anchorCommonStruct);
        b(anchorCommonStruct);
        a(anchorCommonStruct);
        this.f110994h = anchorCommonStruct;
        if (arrayList2.size() == 1) {
            return com.ss.android.ugc.aweme.multi.g.DONE;
        }
        return com.ss.android.ugc.aweme.multi.g.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(com.ss.android.ugc.aweme.app.f.d dVar) {
        String str;
        String str2;
        String str3 = "";
        h.f.b.l.d(dVar, str3);
        if (!this.f110939f) {
            n();
        }
        this.f110938e = dVar;
        Activity e2 = a().e();
        o.a(this, dVar, false, false, 6);
        if (v()) {
            Bundle bundle = new Bundle();
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            if (anchorCommonStruct == null || (str = anchorCommonStruct.getSchema()) == null) {
                str = str3;
            }
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            bundle.putBoolean("need_bottom_out", true);
            String authorUid = a().b().getAuthorUid();
            if (authorUid == null) {
                authorUid = str3;
            }
            bundle.putString("author_id", authorUid);
            String aid = a().b().getAid();
            if (aid == null) {
                aid = str3;
            }
            bundle.putString("group_id", aid);
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 == null || (str2 = anchorCommonStruct2.getId()) == null) {
                str2 = str3;
            }
            bundle.putString("anchor_id", str2);
            Map<String, String> f2 = f(dVar);
            Objects.requireNonNull(f2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            bundle.putSerializable("anchor_event_map", (HashMap) f2);
            Uri parse = Uri.parse(str);
            h.f.b.l.b(parse, str3);
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", com.lynx.tasm.r.PART_ON_LAYOUT.id());
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            o oVar = new o();
            oVar.a("isRTL", Integer.valueOf(gb.a(r()) ? 1 : 0));
            oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
            buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
            String builder = buildUpon.toString();
            h.f.b.l.b(builder, str3);
            com.ss.android.ugc.aweme.bullet.b.a(e2, builder, null, bundle);
            return;
        }
        AnchorCommonStruct anchorCommonStruct3 = this.f110994h;
        if (anchorCommonStruct3 != null) {
            EventBus.a(EventBus.a(), this);
            SmartRoute buildRoute = SmartRouter.buildRoute(e2, anchorCommonStruct3.getSchema());
            Map<String, String> f3 = f(dVar);
            Objects.requireNonNull(f3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            SmartRoute withParam = buildRoute.withParam("anchor_event_map", (HashMap) f3);
            String authorUid2 = a().b().getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str3;
            }
            SmartRoute withParam2 = withParam.withParam("author_id", authorUid2);
            String aid2 = a().b().getAid();
            if (aid2 != null) {
                str3 = aid2;
            }
            withParam2.withParam("group_id", str3).withParam("anchor_id", anchorCommonStruct3.getId()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar, com.ss.android.ugc.aweme.anchor.multi.a.a aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        if (!this.f110939f) {
            n();
        }
    }
}
