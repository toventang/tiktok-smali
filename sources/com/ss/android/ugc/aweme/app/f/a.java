package com.ss.android.ugc.aweme.app.f;

import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(41069);
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            n.a(str, str2, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, int i2, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorCode", String.valueOf(i2));
            jSONObject.put("errorUrl", str4);
            jSONObject.put("from", str5);
            n.a(str, str2, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
