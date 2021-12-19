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

public final class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f75795a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f75796b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f75797c;

    /* renamed from: d  reason: collision with root package name */
    public long f75798d;

    /* renamed from: e  reason: collision with root package name */
    public a f75799e;

    public interface a {
        static {
            Covode.recordClassIndex(46745);
        }

        void a();

        void a(long j2);

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(46744);
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
        a aVar;
        this.f75797c = z;
        if (z && !this.f75795a && (aVar = this.f75799e) != null) {
            aVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str) {
        if (!l.a((Object) str, (Object) "about:blank") && !this.f75795a && !this.f75796b && !this.f75797c) {
            this.f75795a = true;
            a aVar = this.f75799e;
            if (aVar != null) {
                aVar.a(System.currentTimeMillis() - this.f75798d);
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
            this.f75796b = true;
            a aVar = this.f75799e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (!l.a((Object) str, (Object) "about:blank")) {
            this.f75795a = false;
            this.f75796b = false;
            a(false);
            this.f75798d = System.currentTimeMillis();
            a aVar = this.f75799e;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
    public final void a(WebView webView, int i2, String str, String str2) {
        if (!l.a((Object) str2, (Object) "about:blank")) {
            this.f75796b = true;
            a aVar = this.f75799e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }
}
