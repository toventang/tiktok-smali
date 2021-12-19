package com.ss.android.sdk.activity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(37150);
    }

    public static JSONObject a(Context context, long j2, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j2 <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (com.ss.android.ugc.aweme.utils.ee.a(r13, android.content.Intent.createChooser(r2, "")) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.uikit.dialog.b a(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, org.json.JSONObject r18) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.activity.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):com.bytedance.ies.uikit.dialog.b");
    }
}
