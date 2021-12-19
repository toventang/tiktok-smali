package com.bytedance.android.monitor.webview.b;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.d.d;
import com.bytedance.covode.number.Covode;

public interface i {
    static {
        Covode.recordClassIndex(14051);
    }

    void a(WebView webView, int i2);

    void a(WebView webView, int i2, String str, String str2);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void a(WebView webView, d dVar);

    void b(WebView webView, String str);

    void c(WebView webView, String str);

    void e(WebView webView, String str);

    void g(WebView webView, String str);

    void j(WebView webView);

    void l(WebView webView);

    void n(WebView webView);

    void p(WebView webView);

    void r(WebView webView);
}
