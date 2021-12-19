package com.ss.android.ugc.aweme.multi.maker;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.multi.h;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f110942d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private boolean f110943e;

    /* renamed from: f  reason: collision with root package name */
    private final b f110944f = new b();

    static {
        Covode.recordClassIndex(71173);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71174);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$c  reason: collision with other inner class name */
    public static final class C2836c extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(71176);
        }

        C2836c() {
        }
    }

    public static final class d extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(71177);
        }

        d() {
        }
    }

    public static final class e extends com.google.gson.b.a<String> {
        static {
            Covode.recordClassIndex(71178);
        }

        e() {
        }
    }

    public static final class f extends com.google.gson.b.a<String> {
        static {
            Covode.recordClassIndex(71179);
        }

        f() {
        }
    }

    public static final class g extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(71180);
        }

        g() {
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.TIKTOK_GAME.getTYPE();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean m() {
        return v();
    }

    private final boolean w() {
        List<AnchorCommonStruct> anchors = o().getAnchors();
        if (anchors == null) {
            anchors = z.INSTANCE;
        }
        if (h.a(new ArrayList(anchors)).size() == 1) {
            return true;
        }
        return false;
    }

    private final String y() {
        if (w()) {
            return "0";
        }
        if (x()) {
            return "1";
        }
        return "2";
    }

    private final String z() {
        String schema;
        String queryParameter;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || (queryParameter = Uri.parse(schema).getQueryParameter("global_game_id")) == null) {
            return "";
        }
        return queryParameter;
    }

    private final boolean x() {
        List<AnchorCommonStruct> anchors = o().getAnchors();
        if (anchors == null) {
            anchors = z.INSTANCE;
        }
        ArrayList<AnchorCommonStruct> a2 = h.a(new ArrayList(anchors));
        if (a2.size() > 0 && a2.get(0).getType() == ab.TIKTOK_GAME.getTYPE()) {
            return true;
        }
        return false;
    }

    private String n() {
        String str;
        String str2;
        o oVar = new o();
        try {
            oVar.a("enter_from", p());
            oVar.a("from_source", "item_anchor");
            oVar.a("from_group_id", o().getAid());
            oVar.a("from_author_id", o().getAuthorUid());
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getId();
            } else {
                str = null;
            }
            oVar.a("scene_id", str);
            if (w()) {
                str2 = "item_play";
            } else {
                str2 = "anchor_list";
            }
            oVar.a("position", str2);
            oVar.a("anchor_type", y());
        } catch (Exception unused) {
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }

    private final void u() {
        String str;
        o oVar;
        if (v()) {
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            com.google.gson.l lVar = null;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            com.google.gson.l a2 = q.a(str);
            if (a2 != null) {
                oVar = a2.j();
            } else {
                oVar = null;
            }
            com.google.gson.f fVar = new com.google.gson.f();
            if (oVar != null) {
                lVar = oVar.c("gecko_channel");
            }
            AdLandPagePreloadServiceImpl.f().a().c((List) fVar.a(lVar, new g().type));
        }
    }

    private final boolean v() {
        String str;
        String str2;
        o oVar;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        com.google.gson.l lVar = null;
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
        com.google.gson.l a2 = q.a(str2);
        if (a2 != null) {
            oVar = a2.j();
        } else {
            oVar = null;
        }
        com.google.gson.f fVar = new com.google.gson.f();
        if (oVar != null) {
            lVar = oVar.c("is_schema_lynx");
        }
        Boolean bool = (Boolean) fVar.a(lVar, new d().type);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar) {
        l.d(dVar, "");
        super.a(dVar);
        a("mp_show", y(), "anchor_list");
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        super.c(dVar);
        if (!w()) {
            a("mp_click", y(), "item_play");
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        String str;
        l.d(dVar, "");
        this.f110943e = true;
        u();
        String y = y();
        if (w() || x()) {
            str = "item_play";
        } else {
            str = "anchor_list";
        }
        a("mp_show", y, str);
        super.b(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0104  */
    @Override // com.ss.android.ugc.aweme.multi.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.ss.android.ugc.aweme.app.f.d r19) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.c.d(com.ss.android.ugc.aweme.app.f.d):void");
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        HashMap<String, Boolean> f110945a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        HashMap<String, Boolean> f110946b = new HashMap<>();

        static {
            Covode.recordClassIndex(71175);
        }

        public final boolean a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            Boolean bool = true;
            if (l.a((Object) str, (Object) "mp_show")) {
                Boolean bool2 = this.f110945a.get(str2);
                if (bool2 != null) {
                    bool = bool2;
                }
                this.f110945a.put(str2, false);
                return bool.booleanValue();
            } else if (!l.a((Object) str, (Object) "mp_click")) {
                return true;
            } else {
                Boolean bool3 = this.f110946b.get(str2);
                if (bool3 != null) {
                    bool = bool3;
                }
                this.f110946b.put(str2, false);
                return bool.booleanValue();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar, com.ss.android.ugc.aweme.anchor.multi.a.a aVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        l.d(aVar, "");
        b bVar = this.f110944f;
        bVar.f110945a = new HashMap<>();
        bVar.f110946b = new HashMap<>();
        if (!this.f110943e) {
            u();
        }
    }

    private final void a(String str, String str2, String str3) {
        String extra;
        String str4;
        o oVar;
        com.google.gson.l lVar;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        com.google.gson.l lVar2 = null;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0 && this.f110944f.a(str, str3)) {
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 != null) {
                str4 = anchorCommonStruct2.getExtra();
            } else {
                str4 = null;
            }
            com.google.gson.l a2 = q.a(str4);
            if (a2 != null) {
                oVar = a2.j();
            } else {
                oVar = null;
            }
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            com.google.gson.f fVar = new com.google.gson.f();
            if (oVar != null) {
                lVar = oVar.c("game_id");
            } else {
                lVar = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("game_id", (String) fVar.a(lVar, new e().type));
            com.google.gson.f fVar2 = new com.google.gson.f();
            if (oVar != null) {
                lVar2 = oVar.c("game_name");
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("game_name", (String) fVar2.a(lVar2, new f().type)).a("global_game_id", z()).a("enter_from", p());
            String aid = o().getAid();
            String str5 = "";
            if (aid == null) {
                aid = str5;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", aid);
            String authorUid = o().getAuthorUid();
            if (authorUid != null) {
                str5 = authorUid;
            }
            r.a(str, a5.a("author_id", str5).a("anchor_id", b().a()).a("anchor_type", str2).a("position", str3).a("params_for_special", "game_platform").f66730a);
        }
    }
}
