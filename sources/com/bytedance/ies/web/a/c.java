package com.bytedance.ies.web.a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.b.i;

public class c extends WebViewClient {

    /* renamed from: d  reason: collision with root package name */
    public a f35529d;

    static {
        Covode.recordClassIndex(21242);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return com.example.a.c.a(webView, renderProcessGoneDetail);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        a aVar = this.f35529d;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (i.b(webView, str)) {
            return true;
        }
        a aVar = this.f35529d;
        if (aVar == null || !aVar.b(str)) {
            return false;
        }
        return true;
    }
}
