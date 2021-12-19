package com.bytedance.android.livesdk.browser.a;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;

public class c extends com.bytedance.ies.web.a.c {
    static {
        Covode.recordClassIndex(7906);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        i.f23764a.e(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        i.f23764a.b(webView, str);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        i.f23764a.a(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        i.f23764a.a(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        i.f23764a.a(webView, i2, str, str2);
    }
}
