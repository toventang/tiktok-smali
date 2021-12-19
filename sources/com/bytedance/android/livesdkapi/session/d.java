package com.bytedance.android.livesdkapi.session;

import com.bytedance.android.live.base.b.a;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static List<Integer> f23360a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static String f23361b = "LiveLinkSlardarMonitor";

    static a a() {
        return (a) com.bytedance.android.live.t.a.a(a.class);
    }

    static {
        Covode.recordClassIndex(13889);
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2160");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.a(6, f23361b, e2.getMessage());
        }
        return jSONObject2;
    }

    public static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.a(6, f23361b, e2.getMessage());
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.a(6, f23361b, e2.getMessage());
        }
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (!str.startsWith("ttlive_")) {
                str = "ttlive_".concat(String.valueOf(str));
            }
            a(jSONObject3, "tag", "ttlive_sdk");
            a(jSONObject3, "ttlive_sdk_version", "2160");
            a().a(str, jSONObject, jSONObject2, a(jSONObject3));
        }
    }
}
