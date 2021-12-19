package com.bytedance.ies.bullet.service.base.web;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.service.base.web.l;
import com.example.a.c;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import h.f.b.l;

public class o extends WebViewClient {
    static {
        Covode.recordClassIndex(19411);
    }

    public void a(WebView webView, h hVar, WebResourceResponse webResourceResponse) {
    }

    public void a(WebView webView, h hVar, g gVar) {
    }

    public boolean a() {
        throw new as("An operation is not implemented");
    }

    public WebResourceResponse b(WebView webView, h hVar) {
        throw new as("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        throw new as("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        h hVar;
        if (webResourceRequest != null) {
            hVar = l.a(webResourceRequest);
        } else {
            hVar = null;
        }
        return a(webView, hVar);
    }

    public boolean a(WebView webView, h hVar) {
        throw new as("An operation is not implemented");
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail != null) {
            l.c(renderProcessGoneDetail, "");
            new l.c(renderProcessGoneDetail);
        }
        a();
        return c.a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        h hVar = null;
        e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new e<>(webResourceRequest, webView, null, d.CONTINUE));
        if (o.f112463f == d.INTERCEPT && o.f112459b != null) {
            return o.f112459b;
        }
        if (o.f112463f != d.EXCEPTION || o.f112462e == null) {
            WebView webView2 = o.f112460c;
            Q q = o.f112458a;
            if (q != null) {
                hVar = l.a(q);
            }
            return b(webView2, hVar);
        }
        throw o.f112462e;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, d.CONTINUE));
        if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
            throw new as("An operation is not implemented");
        }
        throw n.f112462e;
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        h hVar;
        if (webResourceRequest != null) {
            hVar = l.a(webResourceRequest);
        } else {
            hVar = null;
        }
        a(webView, hVar, webResourceResponse);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        h hVar;
        l.b bVar = null;
        if (webResourceRequest != null) {
            hVar = l.a(webResourceRequest);
        } else {
            hVar = null;
        }
        if (webResourceError != null) {
            h.f.b.l.c(webResourceError, "");
            bVar = new l.b(webResourceError);
        }
        a(webView, hVar, bVar);
    }
}
