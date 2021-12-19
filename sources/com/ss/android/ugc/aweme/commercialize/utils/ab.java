package com.ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import h.f.b.l;

public class ab implements e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f75540a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f75541b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f75542c;

    /* renamed from: d  reason: collision with root package name */
    public long f75543d;

    /* renamed from: e  reason: collision with root package name */
    public a f75544e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f75545f = true;

    public interface a {
        static {
            Covode.recordClassIndex(46606);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(46605);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final boolean b(WebView webView, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void c(WebView webView, String str) {
    }

    public final void a(boolean z) {
        this.f75542c = z;
        if (z && !this.f75540a && this.f75544e != null) {
            System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
        if (!l.a((Object) str, (Object) "about:blank")) {
            if (this.f75545f) {
                this.f75545f = false;
                if (webView != null) {
                    webView.clearHistory();
                }
            }
            if (!this.f75540a && !this.f75541b && !this.f75542c) {
                this.f75540a = true;
            }
            a aVar = this.f75544e;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (!l.a((Object) str, (Object) "about:blank") && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.f75541b = true;
            a aVar = this.f75544e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (!l.a((Object) str, (Object) "about:blank")) {
            this.f75540a = false;
            this.f75541b = false;
            a(false);
            this.f75543d = System.currentTimeMillis();
            a aVar = this.f75544e;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
        if (!l.a((Object) str2, (Object) "about:blank")) {
            this.f75541b = true;
            a aVar = this.f75544e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }
}
