package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.d.e;
import com.bytedance.android.monitor.d.f;
import com.bytedance.android.monitor.webview.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.c.a;
import org.json.JSONObject;

public interface d {
    static {
        Covode.recordClassIndex(14063);
    }

    void a(WebView webView, int i2);

    void a(WebView webView, long j2);

    void a(WebView webView, com.bytedance.android.monitor.d.d dVar);

    void a(WebView webView, e eVar);

    void a(WebView webView, f fVar);

    void a(WebView webView, a.C1137a aVar);

    void a(WebView webView, String str);

    void a(WebView webView, String str, Object obj);

    void a(WebView webView, String str, String str2);

    void a(WebView webView, String str, String str2, String str3);

    void a(WebView webView, String str, JSONObject jSONObject);

    void a(WebView webView, String str, boolean z, int i2, String str2, int i3);

    boolean a(WebView webView);

    void b(WebView webView);

    void b(WebView webView, String str);

    void c(WebView webView);

    void c(WebView webView, String str);

    void d(WebView webView);

    void d(WebView webView, String str);

    void e(WebView webView);

    void f(WebView webView);

    boolean g(WebView webView);

    boolean h(WebView webView);

    String i(WebView webView);

    void j(WebView webView);

    b k(WebView webView);
}
