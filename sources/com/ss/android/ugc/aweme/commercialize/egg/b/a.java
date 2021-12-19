package com.ss.android.ugc.aweme.commercialize.egg.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.egg.e.b;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private CrossPlatformWebView f73928a;

    /* renamed from: b  reason: collision with root package name */
    private final e f73929b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73930c;

    static {
        Covode.recordClassIndex(45546);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.e.b
    public final View a() {
        CrossPlatformWebView crossPlatformWebView = this.f73928a;
        if (crossPlatformWebView == null) {
            l.a("mWebView");
        }
        return crossPlatformWebView;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.e.b
    public final void b() {
        CrossPlatformWebView crossPlatformWebView = this.f73928a;
        if (crossPlatformWebView == null) {
            l.a("mWebView");
        }
        CrossPlatformWebView.a(crossPlatformWebView, this.f73930c, false, null, 6);
    }

    private static SingleWebView a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a2 = ((j) crossPlatformWebView.a(j.class)).a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.e.b
    public final void a(com.ss.android.ugc.aweme.commercialize.egg.a.b bVar) {
        l.d(bVar, "");
        CrossPlatformWebView crossPlatformWebView = this.f73928a;
        if (crossPlatformWebView == null) {
            l.a("mWebView");
        }
        int i2 = Build.VERSION.SDK_INT;
        WebSettings settings = a(crossPlatformWebView).getSettings();
        l.b(settings, "");
        settings.setMediaPlaybackRequiresUserGesture(false);
        a(crossPlatformWebView).setCanTouch(false);
        C1662a aVar = new C1662a(this, bVar);
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f73930c);
        e eVar = this.f73929b;
        if (eVar != null) {
            CommercializeWebViewHelper.a(crossPlatformWebView, aVar, eVar, eVar, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.a$a  reason: collision with other inner class name */
    public static final class C1662a implements com.ss.android.ugc.aweme.crossplatform.platform.webview.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.a.b f73932b;

        static {
            Covode.recordClassIndex(45547);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
        }

        C1662a(a aVar, com.ss.android.ugc.aweme.commercialize.egg.a.b bVar) {
            this.f73931a = aVar;
            this.f73932b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
            this.f73932b.a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence charSequence;
            String str = null;
            if (Build.VERSION.SDK_INT >= 23) {
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (charSequence instanceof String) {
                    str = charSequence;
                }
                str = str;
            }
            this.f73932b.a(str);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            this.f73932b.a(str);
        }
    }

    public a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        this.f73930c = str;
        e eVar = (e) (!(context instanceof e) ? null : context);
        this.f73929b = eVar;
        if (eVar != null) {
            this.f73928a = new CrossPlatformWebView(eVar, (AttributeSet) null, 6);
        }
    }
}
