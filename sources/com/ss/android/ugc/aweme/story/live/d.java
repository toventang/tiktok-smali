package com.ss.android.ugc.aweme.story.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(90243);
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        r.a("livesdk_live_merge_show", hashMap);
    }

    public static void b(String str, String str2) {
        r.a("livesdk_push_click", new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", str2).a("room_id", str).f66730a);
    }

    public static void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gd_label", str2);
        }
        r.a("livesdk_enter_live_merge", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (android.text.TextUtils.equals(r3, "message") != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.live.d.a(java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    public static void a(String str, long j2, String str2) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", str).a("anchor_status", str2);
        if (j2 <= 0) {
            j2 = 0;
        }
        r.a("livesdk_push_click_lookup_anchor", a2.a("room_id", String.valueOf(j2)).f66730a);
    }

    public static void a(String str, String str2, long j2) {
        a(1, str2, j2, a("push", "push", str));
    }

    public static void a(int i2, String str, long j2, JSONObject jSONObject) {
        if (i2 == 0) {
            r.a("impression", "live", str, j2, jSONObject);
        } else if (i2 == 1 && jSONObject != null) {
            r.a("enter_detail", "live_aud", str, j2, jSONObject);
        }
    }

    public static void b(String str, String str2, long j2, String str3) {
        JSONObject a2 = a("homepage_hot", "video", str);
        try {
            a2.put("video_value", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(1, str2, j2, a2);
    }

    public static void a(String str, String str2, long j2, String str3) {
        JSONObject a2 = a("homepage_follow", "video", str);
        try {
            a2.put("video_value", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(1, str2, j2, a2);
    }

    public static final void a(int i2, String str, String str2, String str3, long j2) {
        a(i2, str3, j2, a(str, "head", str2));
    }

    public static void a(boolean z, int i2, String str, String str2, long j2) {
        String str3;
        if (z) {
            str3 = "homepage";
        } else {
            str3 = "others_homepage";
        }
        a(i2, str2, j2, a(str3, "head", str));
    }
}
