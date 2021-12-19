package com.ss.android.ugc.aweme.account.n;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.main.service.ILanguageService;

public final class g {
    static {
        Covode.recordClassIndex(40068);
    }

    public static void a(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            r.a("click_feedback_entrance", new a().a("enter_method", str2).a("enter_from", str).f62575a);
            try {
                SmartRouter.buildRoute(context, c.f99077a.f99078b.getFeedbackConf().getNotLoggedIn()).open();
            } catch (com.bytedance.ies.a unused) {
                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?id=5678&hide_nav_bar=1");
                gVar.a("enter_from", str);
                gVar.a("locale", ((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a());
                ((IWebViewService) com.ss.android.ugc.aweme.a.a(IWebViewService.class)).a(context, gVar.toString());
            }
        }
    }

    public static void b(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            r.a("click_feedback_entrance", new a().a("enter_method", str2).a("enter_from", str).f62575a);
            try {
                t.a(t.a(), c.f99077a.f99078b.getFeedbackConf().getNormalEntry());
            } catch (Exception unused) {
                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
                gVar.a("enter_from", str);
                gVar.a("locale", ((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a());
                ((IWebViewService) com.ss.android.ugc.aweme.a.a(IWebViewService.class)).a(context, gVar.toString());
            }
        }
    }

    public static String a(String str, Uri uri, String str2, String str3, String str4, String str5) {
        Uri.Builder buildUpon = Uri.parse(uri.getQueryParameter(str)).buildUpon();
        buildUpon.appendQueryParameter("username", str2);
        buildUpon.appendQueryParameter("has_mobile", str3);
        buildUpon.appendQueryParameter("has_email", str4);
        Uri parse = Uri.parse(str5);
        for (String str6 : parse.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str6, parse.getQueryParameter(str6));
        }
        return buildUpon.toString();
    }
}
