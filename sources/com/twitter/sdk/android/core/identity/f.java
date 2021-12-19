package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.example.a.c;
import com.ss.android.ugc.tiktok.security.b.i;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

final class f extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final String f155937a;

    /* renamed from: b  reason: collision with root package name */
    private final a f155938b;

    interface a {
        static {
            Covode.recordClassIndex(103608);
        }

        void a();

        void a(Bundle bundle);

        void a(WebView webView);
    }

    static {
        Covode.recordClassIndex(103607);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return c.a(webView, renderProcessGoneDetail);
    }

    f(String str, a aVar) {
        this.f155937a = str;
        this.f155938b = aVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f155938b.a(webView);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (i.b(webView, str)) {
            return true;
        }
        if (!str.startsWith(this.f155937a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap<String, String> a2 = com.twitter.sdk.android.core.internal.a.f.a(URI.create(str), false);
        Bundle bundle = new Bundle(a2.size());
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        this.f155938b.a(bundle);
        return true;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f155938b;
        new i(sslError.getPrimaryError(), null, null);
        aVar.a();
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        a aVar = this.f155938b;
        new i(i2, str, str2);
        aVar.a();
    }
}
