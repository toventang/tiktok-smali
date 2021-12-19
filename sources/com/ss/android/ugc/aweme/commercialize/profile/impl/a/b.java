package com.ss.android.ugc.aweme.commercialize.profile.impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(46388);
    }

    public static void a(AwemeRawAd awemeRawAd) {
        i.a aVar = new i.a();
        aVar.f74815a = awemeRawAd;
        a("button_show", awemeRawAd, aVar.a());
    }

    private static void a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            e.a("homepage_ad", str, jSONObject, awemeRawAd);
        }
    }
}
