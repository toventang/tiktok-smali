package com.ss.android.ugc.aweme.commercialize.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(46565);
    }

    private static long a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    private static String b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    public static void a(String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        JSONObject jSONObject2;
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str3, "background_ad")) {
                str3 = "background_ads";
            } else {
                str3 = "topic_ads";
            }
        }
        if (TextUtils.equals("click", str2)) {
            h.a(awemeRawAd);
        }
        if (b.b(awemeRawAd)) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(optString);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        a(str3, str2, jSONObject, b(awemeRawAd), a(awemeRawAd));
    }

    private static void a(String str, String str2, JSONObject jSONObject, String str3, long j2) {
        i.a(str, str2, jSONObject, str3, j2);
    }
}
