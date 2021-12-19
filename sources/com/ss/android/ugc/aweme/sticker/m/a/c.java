package com.ss.android.ugc.aweme.sticker.m.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.p;
import h.v;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f134953a;

    static {
        Covode.recordClassIndex(88223);
    }

    public c(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f134953a = shortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.a
    public final void a(Effect effect, String str, String str2, String str3) {
        l.d(effect, "");
        l.d(str, "");
        l.d(str3, "");
        ShortVideoContext shortVideoContext = this.f134953a;
        p[] pVarArr = new p[4];
        pVarArr[0] = v.a("picture_source", str);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[1] = v.a("tab_name", str2);
        pVarArr[2] = v.a("prop_id", effect.getEffectId());
        pVarArr[3] = v.a("click_content", str3);
        com.ss.android.ugc.aweme.sticker.m.l.a("prop_customized_click", com.ss.android.ugc.aweme.sticker.m.l.a(shortVideoContext, pVarArr));
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.a
    public final void b(Effect effect, String str, String str2, String str3) {
        l.d(effect, "");
        l.d(str, "");
        l.d(str3, "");
        ShortVideoContext shortVideoContext = this.f134953a;
        p[] pVarArr = new p[4];
        pVarArr[0] = v.a("picture_source", str);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[1] = v.a("tab_name", str2);
        pVarArr[2] = v.a("prop_id", effect.getEffectId());
        pVarArr[3] = v.a("click_content", str3);
        com.ss.android.ugc.aweme.sticker.m.l.a("prop_customized_complete", com.ss.android.ugc.aweme.sticker.m.l.a(shortVideoContext, pVarArr));
    }
}
