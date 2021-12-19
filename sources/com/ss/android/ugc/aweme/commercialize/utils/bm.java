package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class bm {
    static {
        Covode.recordClassIndex(46681);
    }

    public static void a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", str);
        } catch (JSONException unused) {
        }
        b.a("aweme_screen_ad_open_media_error_rate", 0, jSONObject);
    }
}
