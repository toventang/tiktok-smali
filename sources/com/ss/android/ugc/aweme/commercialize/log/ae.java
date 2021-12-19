package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f74724a = new ae();

    private ae() {
    }

    static {
        Covode.recordClassIndex(46086);
    }

    public static final long a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        l.d(aweme, "");
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return g.a().a(awemeRawAd);
        }
        return 0;
    }

    public static final JSONObject a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            g.a().a(context, jSONObject, str);
        } catch (JSONException e2) {
            a.a((Exception) e2);
        }
        return jSONObject;
    }

    public static final JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("ad_extra_data");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("poll_click_area", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e2) {
            a.a((Exception) e2);
        }
        return jSONObject;
    }

    public static final void a(Context context, String str, String str2, JSONObject jSONObject, String str3, String str4, long j2) {
        String str5 = str;
        if (TextUtils.equals(str3, "challenge") || TextUtils.equals(str3, "challenge_fresh")) {
            if (TextUtils.equals(str5, "background_ad")) {
                str5 = "background_ads";
            } else {
                str5 = "topic_ads";
            }
        }
        g.a().a(context, str5, str2, jSONObject, str4, j2);
    }
}
