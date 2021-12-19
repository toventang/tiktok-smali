package com.bytedance.android.monitor.webview.b;

import android.webkit.WebView;
import com.bytedance.android.monitor.d.e;
import com.bytedance.android.monitor.d.f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface h {
    static {
        Covode.recordClassIndex(14050);
    }

    void a(WebView webView, e eVar);

    void a(WebView webView, f fVar);

    void a(WebView webView, String str, JSONObject jSONObject);

    void b(WebView webView, long j2);
}
