package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.o;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final c f32426a;

    static {
        Covode.recordClassIndex(19204);
    }

    public i(c cVar) {
        this.f32426a = cVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        c cVar = this.f32426a;
        if (cVar != null) {
            cVar.e(webView, str);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        c cVar = this.f32426a;
        if (cVar != null) {
            cVar.c(webView, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        c cVar = this.f32426a;
        if (cVar != null) {
            cVar.a(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        c cVar = this.f32426a;
        if (cVar != null) {
            cVar.a(webView, webResourceRequest, webResourceError);
        }
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        c cVar = this.f32426a;
        if (cVar != null) {
            cVar.a(webView, i2, str, str2);
        }
    }
}
