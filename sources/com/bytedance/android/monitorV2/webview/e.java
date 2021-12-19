package com.bytedance.android.monitorV2.webview;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.d.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.c.a;

public interface e {
    static {
        Covode.recordClassIndex(14245);
    }

    void a(WebView webView, int i2);

    void a(WebView webView, long j2);

    void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail);

    void a(WebView webView, com.bytedance.android.monitorV2.d.e eVar);

    void a(WebView webView, f fVar);

    void a(WebView webView, a.C1137a aVar);

    void a(WebView webView, String str);

    void a(WebView webView, String str, String str2);

    void a(WebView webView, String str, String str2, String str3);

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

    com.bytedance.android.monitorV2.webview.b.a k(WebView webView);
}
