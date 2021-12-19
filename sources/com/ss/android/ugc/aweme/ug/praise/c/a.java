package com.ss.android.ugc.aweme.ug.praise.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.setting.services.f;
import com.ss.android.ugc.aweme.ug.praise.a;
import com.ss.android.ugc.aweme.ug.praise.b;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;

public final class a extends com.ss.android.ugc.aweme.ug.praise.a {
    static {
        Covode.recordClassIndex(92776);
    }

    @Override // com.ss.android.ugc.aweme.ug.praise.a
    public final a.C3779a b() {
        String string = this.f141957c.getString(R.string.he5);
        l.b(string, "");
        String string2 = this.f141957c.getString(R.string.he2);
        l.b(string2, "");
        String string3 = this.f141957c.getString(R.string.he3);
        l.b(string3, "");
        String string4 = this.f141957c.getString(R.string.he4);
        l.b(string4, "");
        l.b("com.zhiliao.musically.livewallpaper", "");
        return new a.C3779a(string, string2, string3, string4, "com.zhiliao.musically.livewallpaper");
    }

    @Override // com.ss.android.ugc.aweme.ug.praise.a
    public final void c() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            l.b(feedbackConf, "");
            String feHelp = feedbackConf.getFeHelp();
            l.b(feHelp, "");
            t.a(t.a(), f.f122672a.a(feHelp, ag.a(new p("feedback_id", "15203"))));
        } catch (com.bytedance.ies.a unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, b.EnumC3781b.WALLPAPER);
        l.d(context, "");
    }
}
