package com.ss.android.ttve.monitor;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(37679);
    }

    public static k a() {
        try {
            return SDKMonitorUtils.a("1357");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        JSONObject jSONObject;
        k a2 = a();
        if (!(a2 == null || (jSONObject = a2.f29549b) == null)) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void a(String str, int i2, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (a() != null) {
            a().a(str, i2, jSONObject, (JSONObject) null);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        SDKMonitorUtils.a(context, "1357", e.a(context, str, str2, str3), new k.a() {
            /* class com.ss.android.ttve.monitor.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37680);
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
            public final String a() {
                return null;
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
            public final Map<String, String> b() {
                HashMap hashMap = new HashMap();
                hashMap.put("effect_version", "10.6.0_rel_13_mt_202112161409_f7765781541");
                return hashMap;
            }
        });
    }
}
