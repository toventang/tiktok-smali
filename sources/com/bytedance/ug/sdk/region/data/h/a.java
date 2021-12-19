package com.bytedance.ug.sdk.region.data.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(27903);
    }

    public static int a(JSONObject jSONObject, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return jSONObject.optInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String b(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = jSONObject.optString(str);
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static long a(JSONObject jSONObject, String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return j2;
        }
        try {
            return jSONObject.optLong(str, j2);
        } catch (Throwable unused) {
            return j2;
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
