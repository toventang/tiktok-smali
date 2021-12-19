package com.bytedance.android.monitor.webview.b;

import android.webkit.WebView;
import com.bytedance.android.monitor.d.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface g {
    static {
        Covode.recordClassIndex(14049);
    }

    void a(WebView webView, c cVar);

    void a(WebView webView, String str, String str2, String str3, String str4, String str5);

    void a(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z);
}
