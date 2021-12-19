package com.bytedance.lynx.hybrid.webkit.a.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.f;
import com.bytedance.lynx.hybrid.webkit.a.a.f;
import com.bytedance.lynx.hybrid.webkit.d;
import com.bytedance.webx.a;
import com.bytedance.webx.e;
import com.bytedance.webx.e.a.a.a;
import com.bytedance.webx.e.a.a.b;
import h.f.b.l;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public final class a extends com.bytedance.webx.a<com.bytedance.webx.e.a.c> implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1007a f41258a = new C1007a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final c f41259b = new c();

    /* renamed from: j  reason: collision with root package name */
    private final b f41260j = new b();

    public final class b extends com.bytedance.webx.a<com.bytedance.webx.e.a.a.a> {

        /* renamed from: b  reason: collision with root package name */
        private C1008a f41262b = new C1008a(this);

        static {
            Covode.recordClassIndex(25285);
        }

        /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$b$a  reason: collision with other inner class name */
        public static final class C1008a extends a.AbstractC1138a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f41263a;

            static {
                Covode.recordClassIndex(25286);
            }

            @Override // com.bytedance.webx.f.a
            public final com.bytedance.webx.a<?> a() {
                return this.f41263a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1008a(b bVar) {
                this.f41263a = bVar;
            }

            @Override // com.bytedance.webx.e.a.a.a.AbstractC1138a
            public final void a(WebView webView, int i2) {
                super.a(webView, i2);
                n.a().a(webView, i2);
            }
        }

        @Override // com.bytedance.webx.a
        public final boolean a() {
            return a.this.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            a("onProgressChanged", this.f41262b, 8000);
        }
    }

    public final class c extends com.bytedance.webx.a<com.bytedance.webx.e.a.a.b> {

        /* renamed from: b  reason: collision with root package name */
        private C1009a f41265b = new C1009a(this);

        static {
            Covode.recordClassIndex(25287);
        }

        /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$c$a  reason: collision with other inner class name */
        public static final class C1009a extends b.a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f41266a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f41267b;

            static {
                Covode.recordClassIndex(25288);
            }

            @Override // com.bytedance.webx.f.a
            public final com.bytedance.webx.a<?> a() {
                return this.f41267b;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1009a(c cVar) {
                this.f41267b = cVar;
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final boolean a(WebView webView, WebResourceRequest webResourceRequest) {
                return super.a(webView, webResourceRequest);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if ((webView instanceof com.bytedance.lynx.hybrid.webkit.e) && webView != null) {
                    com.bytedance.lynx.hybrid.j.c.a("onRenderProcessGone", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                return super.a(webView, renderProcessGoneDetail);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void c(WebView webView, String str) {
                f bridgeService$hybrid_web_release;
                super.c(webView, str);
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView = null;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView;
                if (eVar != null && str != null && (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) != null) {
                    bridgeService$hybrid_web_release.c(str);
                }
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final boolean b(WebView webView, String str) {
                WebView webView2;
                f bridgeService$hybrid_web_release;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    com.bytedance.lynx.hybrid.j.c.a("shouldOverrideUrlLoading, url:".concat(String.valueOf(str)), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                    if (!(str == null || (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) == null || !bridgeService$hybrid_web_release.b(str))) {
                        com.bytedance.lynx.hybrid.j.c.a("shouldOverrideUrlLoading, intercept by js bridge", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                        return true;
                    }
                }
                return super.b(webView, str);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final WebResourceResponse b(WebView webView, WebResourceRequest webResourceRequest) {
                d initParams$hybrid_web_release;
                Map<String, String> map;
                Map<String, String> requestHeaders;
                Object obj = null;
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e) ? null : webView);
                if (!(eVar == null || (initParams$hybrid_web_release = eVar.getInitParams$hybrid_web_release()) == null || (map = initParams$hybrid_web_release.f41295g) == null)) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        arrayList.add((webResourceRequest == null || (requestHeaders = webResourceRequest.getRequestHeaders()) == null) ? null : requestHeaders.put(entry.getKey(), entry.getValue()));
                    }
                }
                l.c("WEB_RESOURCE_REQUEST", "");
                try {
                    Map map2 = (Map) f.f41279a.get();
                    if (map2 != null) {
                        Object obj2 = map2.get("WEB_RESOURCE_REQUEST");
                        if (obj2 == null) {
                            obj2 = new Stack();
                            map2.put("WEB_RESOURCE_REQUEST", obj2);
                        }
                        obj = ((Stack) obj2).push(webResourceRequest);
                    }
                    q.m223constructorimpl(obj);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                WebResourceResponse b2 = super.b(webView, webResourceRequest);
                f.a.a("WEB_RESOURCE_REQUEST");
                return b2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
                if (r2 != null) goto L_0x00d4;
             */
            @Override // com.bytedance.webx.e.a.a.b.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.webkit.WebResourceResponse d(android.webkit.WebView r13, java.lang.String r14) {
                /*
                // Method dump skipped, instructions count: 232
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.webkit.a.a.a.c.C1009a.d(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, String str) {
                WebView webView2;
                super.a(webView, str);
                n.a().e(webView, str);
                boolean z = webView instanceof com.bytedance.lynx.hybrid.webkit.e;
                if (!z) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    com.bytedance.lynx.hybrid.a.f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        webKitLifeCycle$hybrid_web_release.a(eVar);
                    }
                    com.bytedance.lynx.hybrid.j.c.a("onPageFinished, url:".concat(String.valueOf(str)), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                if (!z) {
                    webView = null;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar2 = (com.bytedance.lynx.hybrid.webkit.e) webView;
                if (eVar2 != null) {
                    eVar2.loadUrl("javascript:(function () {    window.reactId = '" + eVar2.getHybridContext().f40979f + "';})();");
                }
                if (!this.f41266a && str != null) {
                    Uri.parse(str);
                }
                this.f41266a = false;
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                WebView webView2;
                String str;
                String str2;
                this.f41266a = true;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    com.bytedance.lynx.hybrid.a.f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        StringBuilder sb = new StringBuilder("onReceivedSslError, error:");
                        if (sslError != null) {
                            str2 = sslError.toString();
                        } else {
                            str2 = null;
                        }
                        webKitLifeCycle$hybrid_web_release.a(eVar, webUrl$hybrid_web_release, sb.append(str2).toString());
                    }
                    StringBuilder sb2 = new StringBuilder("onReceivedSslError, error:");
                    if (sslError != null) {
                        str = sslError.toString();
                    } else {
                        str = null;
                    }
                    com.bytedance.lynx.hybrid.j.c.a(sb2.append(str).toString(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                super.a(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                WebView webView2;
                Integer num;
                CharSequence charSequence;
                Uri uri;
                Boolean bool;
                com.bytedance.lynx.hybrid.a.f webKitLifeCycle$hybrid_web_release;
                Integer num2;
                CharSequence charSequence2;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    if (!(webResourceRequest == null || !webResourceRequest.isForMainFrame() || (webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release()) == null)) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        StringBuilder sb = new StringBuilder("errorCode:");
                        if (webResourceError != null) {
                            num2 = Integer.valueOf(webResourceError.getErrorCode());
                        } else {
                            num2 = null;
                        }
                        StringBuilder append = sb.append(num2).append(", description:");
                        if (webResourceError != null) {
                            charSequence2 = webResourceError.getDescription();
                        } else {
                            charSequence2 = null;
                        }
                        webKitLifeCycle$hybrid_web_release.a(eVar, webUrl$hybrid_web_release, append.append(charSequence2).append(", ").toString());
                    }
                    StringBuilder sb2 = new StringBuilder("onReceivedError, errorCode:");
                    if (webResourceError != null) {
                        num = Integer.valueOf(webResourceError.getErrorCode());
                    } else {
                        num = null;
                    }
                    StringBuilder append2 = sb2.append(num).append(", description:");
                    if (webResourceError != null) {
                        charSequence = webResourceError.getDescription();
                    } else {
                        charSequence = null;
                    }
                    StringBuilder append3 = append2.append(charSequence).append(", failingUrl:");
                    if (webResourceRequest != null) {
                        uri = webResourceRequest.getUrl();
                    } else {
                        uri = null;
                    }
                    StringBuilder append4 = append3.append(uri).append(", isForMainFrame:");
                    if (webResourceRequest != null) {
                        bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
                    } else {
                        bool = null;
                    }
                    com.bytedance.lynx.hybrid.j.c.a(append4.append(bool).toString(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    this.f41266a = true;
                }
                super.a(webView, webResourceRequest, webResourceError);
                n.a().a(webView, webResourceRequest, webResourceError);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                WebView webView2;
                Integer num;
                String str;
                Uri uri;
                Boolean bool;
                String str2;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        this.f41266a = true;
                        com.bytedance.lynx.hybrid.a.f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release != null) {
                            String uri2 = webResourceRequest.getUrl().toString();
                            l.a((Object) uri2, "");
                            if (webResourceResponse != null) {
                                str2 = webResourceResponse.getReasonPhrase();
                            } else {
                                str2 = null;
                            }
                            webKitLifeCycle$hybrid_web_release.a(eVar, uri2, str2);
                        }
                    }
                    StringBuilder sb = new StringBuilder("onReceivedError, errorCode:");
                    if (webResourceResponse != null) {
                        num = Integer.valueOf(webResourceResponse.getStatusCode());
                    } else {
                        num = null;
                    }
                    StringBuilder append = sb.append(num).append(", reason:");
                    if (webResourceResponse != null) {
                        str = webResourceResponse.getReasonPhrase();
                    } else {
                        str = null;
                    }
                    StringBuilder append2 = append.append(str).append(", failingUrl:");
                    if (webResourceRequest != null) {
                        uri = webResourceRequest.getUrl();
                    } else {
                        uri = null;
                    }
                    StringBuilder append3 = append2.append(uri).append(", isForMainFrame:");
                    if (webResourceRequest != null) {
                        bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
                    } else {
                        bool = null;
                    }
                    com.bytedance.lynx.hybrid.j.c.a(append3.append(bool).toString(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                super.a(webView, webResourceRequest, webResourceResponse);
                n.a().a(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, String str, Bitmap bitmap) {
                WebView webView2;
                com.bytedance.lynx.hybrid.service.f bridgeService$hybrid_web_release;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    if (!(str == null || (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) == null)) {
                        bridgeService$hybrid_web_release.a(str);
                    }
                    com.bytedance.lynx.hybrid.j.c.a("onPageStarted, url:".concat(String.valueOf(str)), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                super.a(webView, str, bitmap);
                n.a().c(webView, str);
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                super.a(webView, httpAuthHandler, str, str2);
                if ((webView instanceof com.bytedance.lynx.hybrid.webkit.e) && webView != null) {
                    com.bytedance.lynx.hybrid.j.c.a("onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
            }

            @Override // com.bytedance.webx.e.a.a.b.a
            public final void a(WebView webView, int i2, String str, String str2) {
                WebView webView2;
                this.f41266a = true;
                if (!(webView instanceof com.bytedance.lynx.hybrid.webkit.e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                com.bytedance.lynx.hybrid.webkit.e eVar = (com.bytedance.lynx.hybrid.webkit.e) webView2;
                if (eVar != null) {
                    String str3 = "onReceivedError, errorCode:" + i2 + ", description:" + str + ", failingUrl:" + str2;
                    com.bytedance.lynx.hybrid.a.f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        webKitLifeCycle$hybrid_web_release.a(eVar, webUrl$hybrid_web_release, str3);
                    }
                    com.bytedance.lynx.hybrid.j.c.a(str3, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                }
                super.a(webView, i2, str, str2);
                n.a().a(webView, i2, str, str2);
            }
        }

        @Override // com.bytedance.webx.a
        public final boolean a() {
            return a.this.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }

        @Override // com.bytedance.webx.a
        public final void a(a.C1134a aVar) {
            a("onPageFinished", this.f41265b, 8000);
            a("onReceivedError", this.f41265b, 8000);
            a("onReceivedHttpError", this.f41265b, 8000);
            a("onReceivedHttpAuthRequest", this.f41265b, 8000);
            a("onReceivedSslError", this.f41265b, 8000);
            a("onPageStarted", this.f41265b, 8000);
            a("shouldOverrideUrlLoading", this.f41265b, 8000);
            a("onLoadResource", this.f41265b, 8000);
            a("shouldInterceptRequest", this.f41265b, 8000);
            a("onRenderProcessGone", this.f41265b, 8000);
        }
    }

    static {
        Covode.recordClassIndex(25283);
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$a  reason: collision with other inner class name */
    public static final class C1007a {
        static {
            Covode.recordClassIndex(25284);
        }

        private C1007a() {
        }

        public /* synthetic */ C1007a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.webx.a
    public final void a(a.C1134a aVar) {
        this.f45904g = "basic";
        if (aVar == null) {
            l.a();
        }
        com.bytedance.webx.e.a.c.a aVar2 = (com.bytedance.webx.e.a.c.a) b();
        l.a((Object) aVar2, "");
        a.C1134a.a(aVar2.getExtendableWebViewClient(), this.f41259b);
        com.bytedance.webx.e.a.c.a aVar3 = (com.bytedance.webx.e.a.c.a) b();
        l.a((Object) aVar3, "");
        a.C1134a.a(aVar3.getExtendableWebChromeClient(), this.f41260j);
    }
}
