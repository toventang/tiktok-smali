package com.ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(59160);
    }

    public static String a(int i2, String str, boolean z) {
        if (TextUtils.equals(str, "following_window")) {
            return "following_window";
        }
        if (i2 == 0) {
            return "homepage_hot";
        }
        if (i2 == 1) {
            return "homepage_follow";
        }
        if (i2 == 2) {
            return "homepage_fresh";
        }
        String str2 = "personal_homepage";
        if (!(i2 == 1000 || i2 == 1001)) {
            str2 = "others_homepage";
            if (!(i2 == 2000 || i2 == 2001)) {
                if (i2 == 3002) {
                    return "challenge";
                }
                if (i2 == 3003) {
                    return "challenge_fresh";
                }
                if (i2 != 4000) {
                    if (i2 == 4001) {
                        return "single_Msong_fresh";
                    }
                    if (i2 == 9000) {
                        return "discovery";
                    }
                    if (i2 == 9001) {
                        return "playlist";
                    }
                    if (TextUtils.equals(str, "upload")) {
                        return "release";
                    }
                    return str;
                } else if (z) {
                    return "single_song";
                } else {
                    return "single_song_hot";
                }
            }
        }
        return str2;
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2, Aweme aweme) {
        if (str != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!"update_tips".equals(str2)) {
                    jSONObject.put("enter_from", str2);
                }
                if ("like_banner".equals(str)) {
                    jSONObject.put("previous_page", str);
                } else {
                    jSONObject.put("enter_method", str);
                }
                if (aweme.getAwemeType() == 2) {
                    jSONObject.put("is_photo", 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }
}
