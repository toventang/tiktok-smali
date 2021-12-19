package com.bytedance.android.livesdk.browser.e;

import android.webkit.WebView;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14409a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(7980);
    }

    private static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("offline", i2);
            jSONObject.put("live_container_type", "webview");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(WebView webView, String str, boolean z) {
        l.d(webView, "");
        l.d(str, "");
        i.f23764a.a(webView, str, "template_offline", a(z), null, null, a(), false);
    }
}
