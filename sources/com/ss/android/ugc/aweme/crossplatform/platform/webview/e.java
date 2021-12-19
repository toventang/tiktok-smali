package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public interface e {
    static {
        Covode.recordClassIndex(48953);
    }

    void a(WebView webView, int i2, String str, String str2);

    void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void a(WebView webView, String str);

    void a(WebView webView, String str, Bitmap bitmap);

    boolean b(WebView webView, String str);

    void c(WebView webView, String str);
}
