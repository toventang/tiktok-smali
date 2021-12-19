package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.example.a.c;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.tiktok.security.b.i;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<o> f32654a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(19412);
    }

    public final void a(o oVar) {
        l.c(oVar, "");
        this.f32654a.add(oVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (i.b(webView, str)) {
            return true;
        }
        return a(webView, str);
    }

    private WebResourceResponse a(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, webResourceRequest);
            } catch (as unused) {
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    private WebResourceResponse b(WebView webView, String str) {
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, str);
            } catch (as unused) {
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onLoadResource(webView, str);
            } catch (as unused) {
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageFinished(webView, str);
            } catch (as unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (as unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    private boolean a(WebView webView, String str) {
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, str);
            } catch (as unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onRenderProcessGone(webView, renderProcessGoneDetail);
                return c.a(webView, renderProcessGoneDetail);
            } catch (as unused) {
            }
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return c.a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new e<>(webResourceRequest, webView, null, d.CONTINUE));
        if (o.f112463f == d.INTERCEPT && o.f112459b != null) {
            return o.f112459b;
        }
        if (o.f112463f != d.EXCEPTION || o.f112462e == null) {
            return a(o.f112460c, (WebResourceRequest) o.f112458a);
        }
        throw o.f112462e;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, d.CONTINUE));
        if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
            return b(n.f112460c, n.f112458a);
        }
        throw n.f112462e;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageStarted(webView, str, bitmap);
            } catch (as unused) {
            }
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } catch (as unused) {
            }
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
            } catch (as unused) {
            }
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (as unused) {
            }
        }
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, i2, str, str2);
            } catch (as unused) {
            }
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        Iterator<T> it = this.f32654a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } catch (as unused) {
            }
        }
    }
}
