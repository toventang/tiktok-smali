package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.a.d;
import com.bytedance.ies.bullet.kit.web.c;
import com.bytedance.ies.bullet.kit.web.g;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.service.base.web.h;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.net.monitor.n;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e  reason: invalid package */
public final class e extends com.bytedance.ies.bullet.kit.web.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.ies.bullet.c.e.a.b f69507a;

    static {
        Covode.recordClassIndex(42864);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e$a */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f69508a;

        static {
            Covode.recordClassIndex(42865);
        }

        public final void onHideCustomView() {
            d dVar = this.f69508a;
            if (dVar != null) {
                dVar.onHideCustomView();
            }
        }

        public final void onGeolocationPermissionsHidePrompt() {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.onGeolocationPermissionsHidePrompt();
                    return;
                } catch (as unused) {
                }
            }
            super.onGeolocationPermissionsHidePrompt();
        }

        a(d dVar) {
            this.f69508a = dVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.a.d
        public final void a(c cVar) {
            l.d(cVar, "");
            super.a(cVar);
            d dVar = this.f69508a;
            if (dVar != null) {
                dVar.a(cVar);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final void a(ValueCallback<Uri> valueCallback) {
            l.d(valueCallback, "");
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.a(valueCallback);
                    return;
                } catch (as unused) {
                }
            }
            super.a(valueCallback);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final void a(com.bytedance.ies.bullet.service.base.web.c cVar) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.a(cVar);
                    return;
                } catch (as unused) {
                }
            }
            super.a(cVar);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            d dVar = this.f69508a;
            if (dVar != null) {
                dVar.onReceivedTitle(webView, str);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            d dVar = this.f69508a;
            if (dVar != null) {
                dVar.onShowCustomView(view, customViewCallback);
            }
        }

        public final void onProgressChanged(WebView webView, int i2) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.onProgressChanged(webView, i2);
                    return;
                } catch (as unused) {
                }
            }
            super.onProgressChanged(webView, i2);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final void a(ValueCallback<Uri> valueCallback, String str) {
            l.d(valueCallback, "");
            l.d(str, "");
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.a(valueCallback, str);
                    return;
                } catch (as unused) {
                }
            }
            super.a(valueCallback, str);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
                d dVar = this.f69508a;
                if (dVar != null) {
                    try {
                        dVar.onGeolocationPermissionsShowPrompt(str, callback);
                        return;
                    } catch (as unused) {
                    }
                }
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
        }

        public final void onConsoleMessage(String str, int i2, String str2) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.onConsoleMessage(str, i2, str2);
                    return;
                } catch (as unused) {
                }
            }
            super.onConsoleMessage(str, i2, str2);
        }

        public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.onShowCustomView(view, i2, customViewCallback);
                    return;
                } catch (as unused) {
                }
            }
            super.onShowCustomView(view, i2, customViewCallback);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final void a(ValueCallback<Uri> valueCallback, String str, String str2) {
            l.d(valueCallback, "");
            l.d(str, "");
            l.d(str2, "");
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    dVar.a(valueCallback, str, str2);
                    return;
                } catch (as unused) {
                }
            }
            super.a(valueCallback, str, str2);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final boolean a(WebView webView, ValueCallback<Uri[]> valueCallback, com.bytedance.ies.bullet.service.base.web.a aVar) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    return dVar.a(webView, valueCallback, aVar);
                } catch (as unused) {
                }
            }
            return super.a(webView, valueCallback, aVar);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    return dVar.onJsBeforeUnload(webView, str, str2, jsResult);
                } catch (as unused) {
                }
            }
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    return dVar.onJsConfirm(webView, str, str2, jsResult);
                } catch (as unused) {
                }
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            d dVar = this.f69508a;
            if (dVar != null) {
                try {
                    return dVar.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                } catch (as unused) {
                }
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.b, com.bytedance.ies.bullet.kit.web.d
    public final com.bytedance.ies.bullet.kit.web.a.e a() {
        Object c2 = this.f69507a.c(com.bytedance.ies.bullet.ui.common.b.c.class);
        com.bytedance.ies.bullet.kit.web.a.e eVar = null;
        if (!(c2 instanceof com.ss.android.ugc.aweme.bullet.b.a)) {
            c2 = null;
        }
        com.ss.android.ugc.aweme.bullet.b.a aVar = (com.ss.android.ugc.aweme.bullet.b.a) c2;
        if (aVar != null) {
            eVar = aVar.d();
        }
        return new b(eVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.b, com.bytedance.ies.bullet.kit.web.d
    public final d b() {
        Object c2 = this.f69507a.c(com.bytedance.ies.bullet.ui.common.b.c.class);
        d dVar = null;
        if (!(c2 instanceof com.ss.android.ugc.aweme.bullet.b.a)) {
            c2 = null;
        }
        com.ss.android.ugc.aweme.bullet.b.a aVar = (com.ss.android.ugc.aweme.bullet.b.a) c2;
        if (aVar != null) {
            dVar = aVar.c();
        }
        return new a(dVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.b, com.bytedance.ies.bullet.kit.web.d
    public final g d() {
        if (!a.C2792a.f108997a.f108996a.enableBoe()) {
            LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
            l.b(localTestApi, "");
            if (!localTestApi.isPPEEnable()) {
                return new g();
            }
        }
        LocalTestApi localTestApi2 = a.C2792a.f108997a.f108996a;
        l.b(localTestApi2, "");
        return localTestApi2.getWebViewLoadUrlInterceptorDelegate();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e$b */
    public static final class b extends com.bytedance.ies.bullet.kit.web.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.kit.web.a.e f69509a;

        static {
            Covode.recordClassIndex(42866);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final boolean a() {
            return true;
        }

        b(com.bytedance.ies.bullet.kit.web.a.e eVar) {
            this.f69509a = eVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.a.e
        public final void a(c cVar) {
            l.d(cVar, "");
            super.a(cVar);
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.a(cVar);
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onPageFinished(webView, str);
            }
        }

        private WebResourceResponse a(WebView webView, String str) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                try {
                    return eVar.shouldInterceptRequest(webView, str);
                } catch (as unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final WebResourceResponse b(WebView webView, h hVar) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                try {
                    return eVar.b(webView, hVar);
                } catch (as unused) {
                }
            }
            return super.b(webView, hVar);
        }

        public final void onLoadResource(WebView webView, String str) {
            com.ss.android.ugc.aweme.lancet.b.a.b(str);
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            com.ss.android.ugc.aweme.net.model.e<String, WebResourceResponse> n = n.f112474e.n(new com.ss.android.ugc.aweme.net.model.e<>(str, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (n.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && n.f112459b != null) {
                return n.f112459b;
            }
            if (n.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || n.f112462e == null) {
                return a(n.f112460c, (String) n.f112458a);
            }
            throw n.f112462e;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final boolean a(WebView webView, h hVar) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                try {
                    return eVar.a(webView, hVar);
                } catch (as unused) {
                }
            }
            return super.a(webView, hVar);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            String str3;
            WebView n;
            String str4;
            Context context;
            WebView n2;
            WebView n3;
            com.bytedance.ies.bullet.kit.web.b.a m2;
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                try {
                    return eVar.shouldOverrideUrlLoading(webView, str);
                } catch (as unused) {
                }
            }
            if (str != null) {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                String scheme = parse.getScheme();
                Context context2 = null;
                if (scheme != null) {
                    Locale locale = Locale.getDefault();
                    l.b(locale, "");
                    Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                    str2 = scheme.toLowerCase(locale);
                    l.b(str2, "");
                } else {
                    str2 = null;
                }
                if (!(!l.a((Object) "http", (Object) str2)) || !(!l.a((Object) "https", (Object) str2))) {
                    Uri parse2 = Uri.parse(str);
                    l.b(parse2, "");
                    String host = parse2.getHost();
                    if (host != null) {
                        Objects.requireNonNull(host, "null cannot be cast to non-null type java.lang.String");
                        str3 = host.toLowerCase(Locale.ROOT);
                        l.b(str3, "");
                    } else {
                        str3 = null;
                    }
                    List c2 = p.c("m.tngdigital.com.my", new String[]{","});
                    if ((l.a((Object) "http", (Object) str2) || l.a((Object) "https", (Object) str2)) && h.a.n.a((Iterable) c2, (Object) str3)) {
                        c cVar = this.f32407e;
                        if (!(cVar == null || (n = cVar.n()) == null)) {
                            context2 = n.getContext();
                        }
                        if (com.ss.android.newmedia.b.a.a(context2, str)) {
                            return true;
                        }
                    }
                } else {
                    c cVar2 = this.f32407e;
                    com.ss.android.ugc.aweme.lancet.b.a.b(str);
                    if (cVar2 != null && (m2 = cVar2.m()) != null && m2.a(str)) {
                        return true;
                    }
                    if (l.a((Object) "sslocal", (Object) str2) || l.a((Object) "localsdk", (Object) str2)) {
                        str = com.ss.android.newmedia.b.a.a(str);
                        l.b(str, "");
                    }
                    try {
                        Uri parse3 = Uri.parse(str);
                        String queryParameter = parse3.getQueryParameter("url");
                        if (queryParameter != null) {
                            str4 = com.ss.android.ugc.aweme.bullet.utils.c.b(queryParameter);
                        } else {
                            str4 = null;
                        }
                        String valueOf = String.valueOf(com.ss.android.ugc.aweme.bullet.utils.c.a(parse3, "url", str4));
                        c cVar3 = this.f32407e;
                        if (cVar3 == null || (n3 = cVar3.n()) == null) {
                            context = null;
                        } else {
                            context = n3.getContext();
                        }
                        if (!com.ss.android.newmedia.b.a.b(context, valueOf) && l.a((Object) "intent", (Object) str2)) {
                            c cVar4 = this.f32407e;
                            if (!(cVar4 == null || (n2 = cVar4.n()) == null)) {
                                context2 = n2.getContext();
                            }
                            com.ss.android.newmedia.b.a.a(context2, valueOf);
                        }
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void a(WebView webView, h hVar, WebResourceResponse webResourceResponse) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.a(webView, hVar, webResourceResponse);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onPageStarted(webView, str, bitmap);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void a(WebView webView, h hVar, com.bytedance.ies.bullet.service.base.web.g gVar) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.a(webView, hVar, gVar);
            }
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onReceivedError(webView, i2, str, str2);
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            com.bytedance.ies.bullet.kit.web.a.e eVar = this.f69509a;
            if (eVar != null) {
                eVar.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }
    }

    public e(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        this.f69507a = bVar;
    }
}
