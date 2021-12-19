package com.bytedance.webx.e.a.a.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.d.c;
import com.bytedance.webx.e.a;
import com.bytedance.webx.h;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.tiktok.security.b.i;

public class b extends WebViewClient implements c, com.bytedance.webx.e.b {

    /* renamed from: a  reason: collision with root package name */
    public WebViewClient f45955a;

    /* renamed from: b  reason: collision with root package name */
    private h f45956b;

    /* renamed from: c  reason: collision with root package name */
    private a f45957c = new a();

    static {
        Covode.recordClassIndex(28094);
    }

    @Override // com.bytedance.webx.e.b
    public com.bytedance.webx.d.a getExtendableContext() {
        a aVar = this.f45957c;
        if (aVar == null) {
            return null;
        }
        return aVar.f45951a;
    }

    @Override // com.bytedance.webx.e.b
    public final void a(h hVar) {
        this.f45956b = hVar;
        this.f45957c.f45951a = new com.bytedance.webx.d.a(this.f45956b, this);
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            return com.example.a.c.a(webView, renderProcessGoneDetail);
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return com.example.a.c.a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (i.b(webView, str)) {
            return true;
        }
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e<String, WebResourceResponse> n = n.f112474e.n(new e<>(str, webView, null, d.CONTINUE));
        if (n.f112463f == d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != d.EXCEPTION || n.f112462e == null) {
            WebView webView2 = n.f112460c;
            Q q = n.f112458a;
            WebViewClient webViewClient = this.f45955a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView2, (String) q);
            }
            return super.shouldInterceptRequest(webView2, (String) q);
        }
        throw n.f112462e;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new e<>(webResourceRequest, webView, null, d.CONTINUE));
        if (o.f112463f == d.INTERCEPT && o.f112459b != null) {
            return o.f112459b;
        }
        if (o.f112463f != d.EXCEPTION || o.f112462e == null) {
            WebView webView2 = o.f112460c;
            Q q = o.f112458a;
            WebViewClient webViewClient = this.f45955a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView2, (WebResourceRequest) q);
            }
            return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
        }
        throw o.f112462e;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void onScaleChanged(WebView webView, float f2, float f3) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f2, f3);
        } else {
            super.onScaleChanged(webView, f2, f3);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i2, str, str2);
        } else {
            super.onReceivedError(webView, i2, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f45955a;
        if (webViewClient != null) {
            webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
        } else {
            super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
        }
    }
}
