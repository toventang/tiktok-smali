package com.bytedance.sdk.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.a;
import com.bytedance.sdk.b.f.c;
import com.ss.ugc.live.sdk.message.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(26650);
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("carrier", c.a(a.c(), false));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("params_for_special", "uc_login");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(String str, JSONObject jSONObject) {
        if (a.f() != null) {
            a.f().a(str, jSONObject);
        }
        b(str, jSONObject);
    }

    private static void b(String str, JSONObject jSONObject) {
        a.a("event:" + str + "; content:" + jSONObject.toString());
    }

    public static void a(boolean z, String str, int i2, String str2) {
        int i3;
        JSONObject a2 = a();
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        try {
            a2.put("result", i3);
            if (!z) {
                a2.put("error_code", i2);
                a2.put("error_msg", str2);
            } else {
                a2.put("flow_id", str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("mobile_flow_international_get_free_id_result", a2);
    }

    public static void b(boolean z, String str, int i2, String str2) {
        int i3;
        JSONObject a2 = a();
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        try {
            a2.put("result", i3);
            if (!z) {
                a2.put("error_code", i2);
                a2.put("error_msg", str2);
            } else {
                a2.put("flow_info", str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("mobile_flow_international_get_flow_info_result", a2);
    }
}
