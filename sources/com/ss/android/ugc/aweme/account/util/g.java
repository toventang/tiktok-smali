package com.ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.e;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.in;

public final class g {
    static {
        Covode.recordClassIndex(40270);
    }

    public static void a(Context context) {
        String str;
        String str2;
        String b2 = e.b();
        String a2 = e.a();
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(a2)) {
            if (in.d()) {
                str2 = "https://www.tiktok.com/account/confirm";
            } else {
                str2 = "https://www.tiktok.com/account/check";
            }
            str = str2 + "?locale=" + SettingServiceImpl.v().h();
        } else {
            if (in.d()) {
                b2 = a2;
            }
            str = b2 + "locale=" + SettingServiceImpl.v().h();
        }
        SmartRouter.buildRoute(context, "//webview/").withParam("url", str).withParam("hide_status_bar", true).withParam("hide_nav_bar", true).open();
    }
}
