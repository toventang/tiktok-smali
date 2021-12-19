package com.ss.android.sdk.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.c;
import com.ss.android.ugc.aweme.lancet.b.a;

public class j extends c {

    /* renamed from: a  reason: collision with root package name */
    private WebViewClient f60227a;

    static {
        Covode.recordClassIndex(37199);
    }

    @Override // com.bytedance.ies.web.a.c
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        a.b(str);
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f60227a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.web.a.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a.b(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.bytedance.ies.web.a.c
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "onRenderProcessGone");
        return com.example.a.c.a(webView, renderProcessGoneDetail);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f60227a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f60227a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        WebViewClient webViewClient = this.f60227a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i2, str, str2);
        }
    }
}
