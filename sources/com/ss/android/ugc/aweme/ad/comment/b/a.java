package com.ss.android.ugc.aweme.ad.comment.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.util.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(40389);
    }

    public static void a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            i.a aVar = new i.a();
            aVar.f74815a = awemeRawAd;
            aVar.f74817c = false;
            e.a("comment_first_ad", "click_message", aVar.a(), awemeRawAd);
        }
    }

    public static void b(AwemeRawAd awemeRawAd) {
        i.a aVar = new i.a();
        aVar.f74815a = awemeRawAd;
        a("click_title", awemeRawAd, aVar.a());
    }

    public static void a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            e.a("comment_first_ad", str, jSONObject, awemeRawAd);
        }
    }
}
