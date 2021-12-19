package com.ss.android.ugc.aweme.sticker.m;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.c.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public int f134949a;

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoContext f134950c;

    static {
        Covode.recordClassIndex(88220);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str) {
        l.d(effect, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str, long j2) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final j a() {
        return k.f134967a;
    }

    public a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f134950c = shortVideoContext;
    }

    private final HashMap<String, String> a(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.f134950c;
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
        a2.put("impr_position", String.valueOf(i2));
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a2.put("prop_rec_id", recId);
        if (this.f134950c.aP) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        a2.put("shoot_page", str3);
        if (this.f134950c.aP) {
            r = "story";
        } else {
            r = this.f134950c.r();
        }
        l.b(r, "");
        a2.put("shoot_tab_name", r);
        a2.put("enter_method", "click_personal_board");
        a2.put("is_original_prop", "1");
        a2.put("prop_author_id", effect.getDesignerId());
        l.a("prop_show", a2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str, String str2, int i2, boolean z2, Bundle bundle) {
        String str3;
        String str4;
        String r;
        l.d(effect, "");
        l.d(str2, "");
        this.f134949a = i2;
        HashMap<String, String> a2 = a(effect, str2);
        if (str == null) {
            str = "";
        }
        a2.put("tab_name", str);
        if (!z) {
            a2.remove("parent_pop_id");
        }
        if (g.t(effect)) {
            a2.put("order", String.valueOf(i2 - 1));
        }
        if (z2) {
            a2.put("prop_selected_from", "outer_rec");
        } else {
            a2.put("prop_selected_from", "other");
        }
        String str5 = "1";
        a2.put("is_original_prop", str5);
        a2.put("prop_author_id", b.P);
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a2.put("prop_rec_id", recId);
        a2.put("impr_position", String.valueOf(i2));
        String str6 = this.f134950c.X;
        if (str6 == null) {
            str6 = "";
        }
        a2.put("from_prop_id", str6);
        if (l.a((Object) this.f134950c.X, (Object) effect.getEffectId())) {
            str3 = str5;
        } else {
            str3 = "0";
        }
        a2.put("is_default_prop", str3);
        if (!effect.isBusiness()) {
            str5 = "0";
        }
        a2.put("is_commercial_prop", str5);
        if (this.f134950c.aP) {
            str4 = "story_shoot_page";
        } else {
            str4 = "video_shoot_page";
        }
        a2.put("shoot_page", str4);
        if (this.f134950c.aP) {
            r = "story";
        } else {
            r = this.f134950c.r();
        }
        l.b(r, "");
        a2.put("shoot_tab_name", r);
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
        }
        l.a("prop_click", a2);
    }
}
