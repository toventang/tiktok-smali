package com.bytedance.android.monitorV2.webview.b;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public interface g {
    static {
        Covode.recordClassIndex(14231);
    }

    void a(WebView webView, int i2);

    void a(WebView webView, int i2, String str, String str2);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void c(WebView webView, String str);

    void e(WebView webView, String str);

    void g(WebView webView, String str);

    void j(WebView webView);

    void l(WebView webView);

    void n(WebView webView);

    void p(WebView webView);

    void t(WebView webView);
}
