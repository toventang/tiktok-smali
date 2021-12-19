package com.ss.android.ugc.aweme.ug.praise.b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.ug.praise.a;
import com.ss.android.ugc.aweme.ug.praise.b;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Locale;
import java.util.Map;

public final class b extends a {
    static {
        Covode.recordClassIndex(92773);
    }

    @Override // com.ss.android.ugc.aweme.ug.praise.a
    public final a.C3779a b() {
        String string = this.f141957c.getString(R.string.c54);
        l.b(string, "");
        String string2 = this.f141957c.getString(R.string.c5k);
        l.b(string2, "");
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            l.b(appStoreScore, "");
            String title = appStoreScore.getTitle();
            l.b(title, "");
            if (title.length() > 0) {
                String title2 = appStoreScore.getTitle();
                l.b(title2, "");
                string = title2;
            }
            String text = appStoreScore.getText();
            l.b(text, "");
            if (text.length() > 0) {
                String text2 = appStoreScore.getText();
                l.b(text2, "");
                string2 = text2;
            }
        } catch (com.bytedance.ies.a unused) {
        }
        String string3 = this.f141957c.getString(R.string.d_r);
        l.b(string3, "");
        String string4 = this.f141957c.getString(R.string.byl);
        l.b(string4, "");
        String packageName = this.f141957c.getPackageName();
        l.b(packageName, "");
        return new a.C3779a(string, string2, string3, string4, packageName);
    }

    @Override // com.ss.android.ugc.aweme.ug.praise.a
    public final void c() {
        g gVar;
        Map<String, String> map = new d().a("enter_from", "praise_dialog").f66730a;
        r.a("FAQ", map);
        r.a("click_feedback_entrance", map);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f141957c, "aweme://webview");
        l.b(buildRoute, "");
        if (in.e()) {
            gVar = new g("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    t a2 = t.a();
                    IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                    l.b(iESSettingsProxy, "");
                    FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                    l.b(feedbackConf, "");
                    t.a(a2, feedbackConf.getNormalEntry());
                    return;
                }
                t a3 = t.a();
                IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
                l.b(iESSettingsProxy2, "");
                FeedbackConf feedbackConf2 = iESSettingsProxy2.getFeedbackConf();
                l.b(feedbackConf2, "");
                t.a(a3, feedbackConf2.getNotLoggedIn());
                return;
            } catch (com.bytedance.ies.a unused) {
                gVar = new g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
                Locale a4 = com.ss.android.ugc.aweme.i18n.language.i18n.c.a(this.f141957c);
                l.b(a4, "");
                gVar.a("locale", a4.getLanguage());
            }
        }
        gVar.a("enter_from", "praise_dialog");
        buildRoute.withParam(Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, b.EnumC3781b bVar) {
        super(context, bVar);
        l.d(context, "");
        l.d(bVar, "");
    }
}
