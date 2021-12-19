package com.ss.android.ugc.aweme.ad.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(40424);
    }

    public static void a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            e.a("background_ad", str, jSONObject, awemeRawAd);
        }
    }

    public static void a(AwemeRawAd awemeRawAd, String str, String str2, Long l2) {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str, awemeRawAd).b("refer", str2).a("duration", l2).b();
    }
}
