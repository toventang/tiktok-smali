package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class dv {
    static {
        Covode.recordClassIndex(93450);
    }

    private static void a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b.a(str, jSONObject);
    }

    public static void a(Throwable th, String str, String str2) {
        if (th != null && !TextUtils.isEmpty(str)) {
            if ((th instanceof c) || (th instanceof t)) {
                a("aweme_parse_error_log", "", new com.ss.android.ugc.aweme.app.f.c().a("errorUrl", str).a("errorDesc", Log.getStackTraceString(th)).a("errorResponse", str2).a());
            }
        }
    }
}
