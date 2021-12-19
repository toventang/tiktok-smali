package com.ss.android.ugc.aweme.commerce.anywhere;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.keva.Keva;
import com.bytedance.news.common.service.manager.c;
import com.ss.android.a.a.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.application.b;
import com.ss.android.ugc.aweme.local_test.a;
import h.f.b.l;
import java.net.URLEncoder;

public final class AnyDoorDepend {
    static {
        Covode.recordClassIndex(45181);
    }

    public final a getAppType() {
        return a.US;
    }

    public final Context getContext() {
        return d.a();
    }

    public final com.ss.android.a.c.a getRouter() {
        return new a();
    }

    public final void cleanExtraMockCacheIfNeed() {
        ISplashAdService iSplashAdService = (ISplashAdService) c.a(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.b();
        }
    }

    public final com.ss.android.a.d.a getAppInfo() {
        String str;
        String valueOf = String.valueOf(b.f66649a);
        String serverDeviceId = AppLog.getServerDeviceId();
        com.ss.android.ugc.aweme.account.b.a();
        if (com.ss.android.ugc.aweme.account.b.f62864a.p()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            str = g2.getCurUserId();
        } else {
            str = "0";
        }
        String encode = URLEncoder.encode(Build.MODEL, "UTF-8");
        boolean enableBoe = a.C2792a.f108997a.f108996a.enableBoe();
        String str2 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        String str3 = Build.VERSION.RELEASE;
        String string = Keva.getRepo("aweme_network").getString("lastInputEmailPrefix", "");
        l.b(str2, "");
        l.b(encode, "");
        return new com.ss.android.a.d.a(valueOf, str, serverDeviceId, str2, encode, str3, string, enableBoe);
    }
}
