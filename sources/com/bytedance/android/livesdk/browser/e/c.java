package com.bytedance.android.livesdk.browser.e;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static long f14412a;

    static {
        Covode.recordClassIndex(7981);
    }

    private static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_container_type", "webview");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject a(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public static void a(String str, WebView webView, long j2) {
        long currentTimeMillis = System.currentTimeMillis() - j2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        a(jSONObject, "from", str);
        com.bytedance.android.live.core.d.c.a("ttlive_webview_init_all", currentTimeMillis, jSONObject);
        i.f23764a.a(webView, null, "hybrid_container_init_duration", a(), a(currentTimeMillis), null, b(), false);
    }

    public static void a(String str, String str2, int i2) {
        long currentTimeMillis = System.currentTimeMillis() - f14412a;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        a(jSONObject, "from", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        a(jSONObject, "url", str2);
        if (i2 == 0) {
            com.bytedance.android.live.core.d.c.a("ttlive_webview_offline_all", i2, currentTimeMillis, jSONObject);
        } else {
            com.bytedance.android.live.core.d.c.b("ttlive_webview_offline_all", i2, jSONObject);
        }
    }
}
