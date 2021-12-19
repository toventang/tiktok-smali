package com.ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp_api.d;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.c;

public final class a {
    static {
        Covode.recordClassIndex(70190);
    }

    public static int a(String str) {
        if (d.b(str)) {
            return 1;
        }
        return 2;
    }

    public static boolean a(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!d.c(microAppUrl)) {
            return false;
        }
        a.C2810a aVar = new a.C2810a();
        aVar.f109681c = "025002";
        aVar.f109682d = "mp_url";
        c.a.f109704a.a().openMiniApp(context, microAppUrl, aVar.a());
        return true;
    }
}
