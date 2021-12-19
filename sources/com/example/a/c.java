package com.example.a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f46463a;

    static {
        Covode.recordClassIndex(28361);
    }

    public static WebViewClient a(WebViewClient webViewClient) {
        if (webViewClient == null || !"android.webkit.WebViewClient".equals(webViewClient.getClass().getName())) {
            return webViewClient;
        }
        return new b();
    }

    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        a aVar = f46463a;
        if (aVar != null) {
            return aVar.a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
