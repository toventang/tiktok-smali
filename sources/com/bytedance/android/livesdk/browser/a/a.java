package com.bytedance.android.livesdk.browser.a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private WebViewClient f14261a = null;

    static {
        Covode.recordClassIndex(7904);
    }

    @Override // com.bytedance.android.livesdk.browser.a.c
    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f14261a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.a.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewClient webViewClient = this.f14261a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.a.c
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        WebViewClient webViewClient = this.f14261a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i2, str, str2);
        }
    }
}
