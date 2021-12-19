package com.bytedance.webx.e.a.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStructure;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.d.c;
import com.bytedance.webx.e.a.d;
import com.bytedance.webx.e.b;
import com.bytedance.webx.h;
import java.util.concurrent.Executor;

public class a extends WebView implements c, com.bytedance.webx.e.a.a, b {

    /* renamed from: a  reason: collision with root package name */
    private h f45971a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.webx.e.a f45972b = new com.bytedance.webx.e.a();

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.webx.e.a.a.b f45973c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.webx.e.a.a.a f45974d;

    static {
        Covode.recordClassIndex(28106);
    }

    public com.bytedance.webx.e.a.a.a getExtendableWebChromeClient() {
        return this.f45974d;
    }

    public com.bytedance.webx.e.a.a.b getExtendableWebViewClient() {
        return this.f45973c;
    }

    public WebMessagePort[] createWebMessageChannel() {
        return super.createWebMessageChannel();
    }

    public WebChromeClient getWebChromeClientCompat() {
        return this.f45974d.f45952a;
    }

    public WebViewClient getWebViewClientCompat() {
        return this.f45973c.f45955a;
    }

    public WebViewRenderProcess getWebViewRenderProcess() {
        return super.getWebViewRenderProcess();
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return super.getWebViewRenderProcessClient();
    }

    @Override // com.bytedance.webx.e.b
    public com.bytedance.webx.d.a getExtendableContext() {
        com.bytedance.webx.e.a aVar = this.f45972b;
        if (aVar == null) {
            return null;
        }
        return aVar.f45951a;
    }

    public WebChromeClient getWebChromeClient() {
        if (!d.b.f45978a) {
            return super.getWebChromeClient();
        }
        if (this.f45971a == null) {
            return super.getWebChromeClient();
        }
        return this.f45974d;
    }

    public WebViewClient getWebViewClient() {
        if (!d.b.f45978a) {
            return super.getWebViewClient();
        }
        if (this.f45971a == null) {
            return super.getWebViewClient();
        }
        return this.f45973c;
    }

    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public void zoomBy(float f2) {
        super.zoomBy(f2);
    }

    /* access modifiers changed from: protected */
    public void setExtendableWebViewClient(com.bytedance.webx.e.a.a.a aVar) {
        this.f45974d = aVar;
        super.setWebChromeClient(aVar);
    }

    /* access modifiers changed from: protected */
    public void setExtendableWebViewClient(com.bytedance.webx.e.a.a.b bVar) {
        this.f45973c = bVar;
        a(this, bVar);
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(11364);
        MethodCollector.o(11364);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (!d.b.f45978a) {
            super.setWebChromeClient(webChromeClient);
        } else if (this.f45971a == null) {
            super.setWebChromeClient(webChromeClient);
        } else {
            this.f45974d.f45952a = webChromeClient;
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (!d.b.f45978a) {
            a(this, webViewClient);
        } else if (this.f45971a == null) {
            a(this, webViewClient);
        } else {
            this.f45973c.f45955a = webViewClient;
        }
    }

    @Override // com.bytedance.webx.e.b
    public final void a(h hVar) {
        if (h.f45997a.f46015a) {
            hashCode();
            getClass().getCanonicalName();
            new Throwable();
            com.bytedance.webx.b.a.a.a("WebX");
        }
        if (d.b.f45978a) {
            this.f45971a = hVar;
            this.f45972b.f45951a = new com.bytedance.webx.d.a(this.f45971a, this);
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    private static void a(WebView webView, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        super.setWebViewClient(webViewClient);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(11532);
        MethodCollector.o(11532);
    }
}
