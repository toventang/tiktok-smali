package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(46078);
    }

    public static void a(Aweme aweme, int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i2));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put("status", String.valueOf(i3));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b.a("aweme_adx_video_error_log", i3, jSONObject);
    }
}
