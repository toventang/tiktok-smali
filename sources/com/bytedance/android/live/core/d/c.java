package com.bytedance.android.live.core.d;

import android.text.TextUtils;
import com.bytedance.android.live.base.b.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(4574);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
            a().a(str, jSONObject);
        }
    }

    public static void a(String str, int i2, JSONObject jSONObject) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new e(str, jSONObject, i2));
        }
    }

    public static void a(String str, long j2, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new g(j2, jSONObject, str));
        }
    }

    public static void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new m(jSONObject2, str, i2, jSONObject));
        }
    }

    public static void a(Throwable th, String str) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new f(th, str));
        }
    }

    public static a a() {
        return (a) com.bytedance.android.live.t.a.a(a.class);
    }

    static JSONObject a(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2160");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LiveSlardarMonitor", e2.getMessage());
        }
        return jSONObject2;
    }

    public static void b(String str, int i2, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new j(str, i2, jSONObject));
        }
    }

    public static void c(String str, int i2, JSONObject jSONObject) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            a().a(str, i2, jSONObject);
        }
    }

    public static void a(String str, int i2, long j2) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new i(j2, str, i2));
        }
    }

    public static void a(String str, int i2, Map<String, Object> map) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new d(map, str, i2));
        }
    }

    public static void b(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new n(str, i2, jSONObject, jSONObject2));
        }
    }

    public static void a(String str, int i2, long j2, Map<String, Object> map) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new k(j2, map, str, i2));
        }
    }

    public static void a(String str, int i2, long j2, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            g.b(new l(j2, str, i2, jSONObject));
        }
    }
}
