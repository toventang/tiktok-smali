package com.ss.android.ugc.aweme.sticker.m;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<j> f134957a;

    /* renamed from: c  reason: collision with root package name */
    private final h f134958c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f134959d = i.a((h.f.a.a) C3515b.f134961a);

    /* renamed from: e  reason: collision with root package name */
    private final ShortVideoContext f134960e;

    static {
        Covode.recordClassIndex(88226);
    }

    private final j b() {
        return (j) this.f134958c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str, long j2) {
        l.d(str, "");
        l.a("tool_performance_effect_use_info", l.a(this.f134960e, v.a("duration", String.valueOf(j2)), v.a("effect_id", str)));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.m.b$b  reason: collision with other inner class name */
    static final class C3515b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3515b f134961a = new C3515b();

        static {
            Covode.recordClassIndex(88228);
        }

        C3515b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    static final class a extends m implements h.f.a.a<j> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ j invoke() {
            return this.this$0.f134957a.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final j a() {
        return (d) this.f134959d.getValue();
    }

    private final boolean c() {
        Boolean bool;
        LiveData<Boolean> b2;
        com.ss.android.ugc.aweme.sticker.panel.i v = b().v();
        if (v == null || (b2 = v.b()) == null) {
            bool = null;
        } else {
            bool = b2.getValue();
        }
        return l.a((Object) bool, (Object) true);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str) {
        String r;
        String str2;
        String str3 = "video_shoot_page";
        if (!l.a((Object) str, (Object) "none") || !g.a().A().a()) {
            ShortVideoContext shortVideoContext = this.f134960e;
            p[] pVarArr = new p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = v.a("tab_name", str);
            HashMap<String, String> a2 = l.a(shortVideoContext, pVarArr);
            if (this.f134960e.aP) {
                str3 = "story_shoot_page";
            }
            a2.put("shoot_page", str3);
            if (this.f134960e.aP) {
                r = "story";
            } else {
                r = this.f134960e.r();
            }
            l.b(r, "");
            a2.put("shoot_tab_name", r);
            l.a("click_prop_tab", a2);
            return;
        }
        Effect a3 = e.a(b());
        com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("shoot_way", this.f134960e.r).a("enter_from", str3).a("creation_id", this.f134960e.q);
        String str4 = null;
        if (a3 != null) {
            str2 = a3.getEffectId();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("effect_id", str2);
        if (a3 != null) {
            str4 = a3.getName();
        }
        com.ss.android.ugc.tools.f.b a6 = a5.a("effect_name", str4);
        if (this.f134960e.C != 0) {
            a6.a("draft_id", this.f134960e.C);
        }
        Map<String, String> map = a6.f149193a;
        l.b(map, "");
        l.a("remove_effect", map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.gamora.recorder.sticker.c.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(ShortVideoContext shortVideoContext, h.f.a.a<? extends j> aVar) {
        l.d(shortVideoContext, "");
        l.d(aVar, "");
        this.f134960e = shortVideoContext;
        this.f134957a = aVar;
    }

    private final HashMap<String, String> a(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.f134960e;
        p[] pVarArr = new p[4];
        pVarArr[0] = v.a("enter_method", str);
        pVarArr[1] = v.a("prop_id", effect.getEffectId());
        String parentId = effect.getParentId();
        if (parentId == null) {
            parentId = "";
        }
        pVarArr[2] = v.a("parent_pop_id", parentId);
        pVarArr[3] = v.a("prop_index", effect.getGradeKey());
        return l.a(shortVideoContext, pVarArr);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(long j2, int i2) {
        l.a("tool_performance_enter_prop_tab", l.a(this.f134960e, v.a("duration", String.valueOf(j2)), v.a("status", String.valueOf(i2))));
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str) {
        String str2 = "";
        l.d(effect, str2);
        l.d(str, str2);
        if (g.a().A().a()) {
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("user_id", g.a().A().c()).a("group_id", dv.a()).a("effect_id", effect.getEffectId()).a("creation_id", this.f134960e.q);
            if (this.f134960e.C != 0) {
                a2.a("draft_id", this.f134960e.C);
            }
            Map<String, String> map = a2.f149193a;
            l.b(map, str2);
            l.a("prop_save", map);
            return;
        }
        HashMap<String, String> a3 = a(effect, str);
        if (z) {
            String parentId = effect.getParentId();
            if (parentId != null) {
                str2 = parentId;
            }
            a3.put("parent_pop_id", str2);
        }
        l.a("prop_save", a3);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, String str, String str2, int i2) {
        String str3;
        String r;
        l.d(effect, "");
        l.d(str2, "");
        HashMap<String, String> a2 = a(effect, str2);
        if (str == null) {
            str = "";
        }
        a2.put("tab_name", str);
        a2.put("prop_selected_from", "other");
        if (c()) {
            a2.put("after_search", "1");
        }
        a2.put("impr_position", String.valueOf(i2));
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a2.put("prop_rec_id", recId);
        if (this.f134960e.aP) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        a2.put("shoot_page", str3);
        if (this.f134960e.aP) {
            r = "story";
        } else {
            r = this.f134960e.r();
        }
        l.b(r, "");
        a2.put("shoot_tab_name", r);
        if (com.ss.android.ugc.aweme.sticker.p.g.c(effect)) {
            a2.put("is_original_prop", "1");
            a2.put("prop_author_id", effect.getDesignerId());
        } else {
            a2.put("is_original_prop", "0");
        }
        l.a("prop_show", a2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str, String str2, int i2, boolean z2, Bundle bundle) {
        String str3;
        String str4;
        String str5;
        String r;
        l.d(effect, "");
        l.d(str2, "");
        HashMap<String, String> a2 = a(effect, str2);
        if (str == null) {
            str = "";
        }
        a2.put("tab_name", str);
        if (!z) {
            a2.remove("parent_pop_id");
        }
        if (c()) {
            a2.put("after_search", "1");
        }
        if (com.ss.android.ugc.aweme.sticker.p.g.t(effect)) {
            a2.put("order", String.valueOf(i2 - 1));
        }
        if (z2) {
            a2.put("prop_selected_from", "outer_rec");
        } else {
            a2.put("prop_selected_from", "other");
        }
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a2.put("prop_rec_id", recId);
        a2.put("impr_position", String.valueOf(i2));
        String str6 = this.f134960e.X;
        if (str6 == null) {
            str6 = "";
        }
        a2.put("from_prop_id", str6);
        if (l.a((Object) this.f134960e.X, (Object) effect.getEffectId())) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        a2.put("is_default_prop", str3);
        if (effect.isBusiness()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        a2.put("is_commercial_prop", str4);
        if (this.f134960e.aP) {
            str5 = "story_shoot_page";
        } else {
            str5 = "video_shoot_page";
        }
        a2.put("shoot_page", str5);
        if (this.f134960e.aP) {
            r = "story";
        } else {
            r = this.f134960e.r();
        }
        l.b(r, "");
        a2.put("shoot_tab_name", r);
        if (com.ss.android.ugc.aweme.sticker.p.g.c(effect)) {
            a2.put("is_original_prop", "1");
            a2.put("prop_author_id", effect.getDesignerId());
        } else {
            a2.put("is_original_prop", "0");
        }
        if (bundle != null) {
            String string = bundle.getString("prop_tab_name");
            if (!(string == null || string.length() == 0)) {
                a2.put("prop_selected_from", "prop_panel_".concat(String.valueOf(string)));
            }
            String string2 = bundle.getString("prop_tab_order");
            if (!(string2 == null || string2.length() == 0)) {
                l.b(string2, "");
                a2.put("prop_tab_order", string2);
            }
            String string3 = bundle.getString("enter_method");
            if (!(string3 == null || string3.length() == 0)) {
                l.b(string3, "");
                a2.put("enter_method", string3);
            }
            String string4 = bundle.getString("search_id");
            if (!(string4 == null || string4.length() == 0)) {
                l.b(string4, "");
                a2.put("search_id", string4);
            }
            String string5 = bundle.getString("search_method");
            if (!(string5 == null || string5.length() == 0)) {
                l.b(string5, "");
                a2.put("search_method", string5);
            }
            String string6 = bundle.getString("is_panel_unfold");
            if (!(string6 == null || string6.length() == 0)) {
                l.b(string6, "");
                a2.put("is_panel_unfold", string6);
            }
        }
        l.a("prop_click", a2);
    }
}
