package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.MonitorCrash;
import com.bytedance.crash.util.n;
import java.util.Map;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static int f27932a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f27933b;

    /* renamed from: c  reason: collision with root package name */
    private static MonitorCrash f27934c;

    static {
        Covode.recordClassIndex(16345);
    }

    public static MonitorCrash a() {
        if (f27934c == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.bytedance.crash.m.f27724a, "2010", 3010663, "3.1.6-rc.13-ttp", "");
            f27934c = initSDK;
            initSDK.config().setChannel("release");
        }
        return f27934c;
    }

    private static void a(JSONObject... jSONObjectArr) {
        int i2 = 0;
        do {
            JSONObject jSONObject = jSONObjectArr[0];
            if (jSONObject != null) {
                try {
                    for (Map.Entry<String, String> entry : d.a(com.bytedance.crash.m.a().f27905a.getCommonParams(), "aid", "4444", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0").entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Throwable unused) {
                }
            }
            i2++;
        } while (i2 <= 0);
    }

    public static void a(String str, String... strArr) {
        if (com.bytedance.crash.m.f27724a != null) {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            do {
                n.a(jSONObject, strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            } while (i2 < 6);
            a(str, jSONObject, null);
        }
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        if (com.bytedance.crash.m.f27724a != null) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            a(jSONObject3);
            a().reportEvent(str, 1, jSONObject3, jSONObject2, null);
        }
    }
}
