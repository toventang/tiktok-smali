package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public abstract class a implements e {
    static {
        Covode.recordClassIndex(48947);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public void a(WebView webView, String str) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
    }
}
