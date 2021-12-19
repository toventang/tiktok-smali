package com.bytedance.android.livesdk.container.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.browser.c.g;
import com.bytedance.android.livesdk.browser.f;
import com.bytedance.android.livesdk.container.i.d;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.tiktok.security.b.h;
import h.f.b.l;
import h.m.p;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c extends com.bytedance.android.livesdk.browser.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16736c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Boolean> f16737a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.android.livesdk.container.c.c f16738b;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f16739e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private long f16740f;

    /* renamed from: g  reason: collision with root package name */
    private final long f16741g;

    /* renamed from: h  reason: collision with root package name */
    private long f16742h;

    /* renamed from: i  reason: collision with root package name */
    private final long f16743i;

    /* renamed from: j  reason: collision with root package name */
    private long f16744j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16745k;

    /* renamed from: l  reason: collision with root package name */
    private String f16746l = "";

    /* renamed from: m  reason: collision with root package name */
    private boolean f16747m = true;
    private boolean n = true;

    static {
        Covode.recordClassIndex(9275);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9276);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(com.bytedance.android.livesdk.container.c.c cVar) {
        l.d(cVar, "");
        this.f16738b = cVar;
    }

    public static final class b extends com.facebook.d.b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f16748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16749b;

        static {
            Covode.recordClassIndex(9277);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(com.facebook.d.c<Boolean> cVar) {
            l.d(cVar, "");
        }

        @Override // com.facebook.d.b
        public final void onNewResultImpl(com.facebook.d.c<Boolean> cVar) {
            l.d(cVar, "");
            if (cVar.b() && cVar.d() != null) {
                Boolean d2 = cVar.d();
                if (d2 == null) {
                    l.b();
                }
                d2.booleanValue();
            }
        }

        b(WebView webView, String str) {
            this.f16748a = webView;
            this.f16749b = str;
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            l.b(path, "");
            if (p.c(path, ".htm", false) || p.c(path, ".html", false) || p.c(path, ".css", false)) {
                return true;
            }
            if (p.c(path, ".js", false)) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.web.a.c
    public final void onLoadResource(WebView webView, String str) {
        l.d(webView, "");
        l.d(str, "");
        if (Logger.debug() && !com.bytedance.android.livesdk.browser.a.b(str)) {
            com.bytedance.android.live.core.c.a.a(3, "MyWebViewClient", "onLoadResource ".concat(String.valueOf(str)));
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        MethodCollector.i(10328);
        d.f16800b.a(webView, this.f16738b.f16752c.getOriginUri(), str, this.n);
        this.n = false;
        this.f16740f = System.currentTimeMillis();
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(2, "MyWebViewClient", "onPageFinished " + str + ", time " + this.f16740f);
        }
        com.bytedance.android.livesdk.container.h.a aVar = this.f16738b.f16754e;
        if (aVar != null) {
            aVar.d();
        }
        if (this.f16747m) {
            if (webView == null) {
                l.b();
            }
            webView.clearHistory();
            this.f16747m = false;
        }
        super.onPageFinished(webView, str);
        if (!(!this.f16745k || this.f16738b.f16767f == null || (webView2 = this.f16738b.f16767f) == null)) {
            String str2 = "about:blank";
            String a2 = h.f149026a.a(webView2, str2);
            if (!TextUtils.isEmpty(a2)) {
                str2 = a2;
            }
            webView2.loadUrl(str2);
        }
        this.f16737a.clear();
        MethodCollector.o(10328);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.web.a.c
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        l.d(webView, "");
        l.d(str, "");
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(3, "MyWebViewClient", "shouldOverrideUrlLoading ".concat(String.valueOf(str)));
        }
        if (g.b().a(str) || super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            String scheme = parse.getScheme();
            if (scheme == null) {
                l.b();
            }
            l.b(scheme, "");
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase();
                l.b(lowerCase, "");
                if (!TextUtils.isEmpty(lowerCase) && !l.a((Object) "about", (Object) lowerCase) && (!l.a((Object) "http", (Object) lowerCase)) && (!l.a((Object) "https", (Object) lowerCase))) {
                    return ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f16738b.f16751b, parse);
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(5, "TAG", "view url " + str + " exception: " + e2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e<String, WebResourceResponse> n2 = n.f112474e.n(new e<>(str, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
        if (n2.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && n2.f112459b != null) {
            return n2.f112459b;
        }
        if (n2.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || n2.f112462e == null) {
            WebView webView2 = n2.f112460c;
            Q q = n2.f112458a;
            String str2 = "";
            l.d(webView2, str2);
            l.d(q, str2);
            com.bytedance.android.livesdk.browser.e.c.f14412a = System.currentTimeMillis();
            if (!TextUtils.isEmpty(q)) {
                WebResourceResponse a2 = com.bytedance.android.livesdk.browser.f.d.a().a(q, webView2);
                if (a2 != null) {
                    if (TextUtils.equals("text/html", a2.getMimeType())) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f16744j = currentTimeMillis;
                        this.f16739e.put("intercept_delay", Long.valueOf((currentTimeMillis - this.f16743i) / 1000));
                    }
                    if (a(q)) {
                        com.bytedance.android.livesdk.browser.e.c.a(this.f16746l, (String) q, 0);
                    }
                    this.f16737a.put(q, true);
                    com.bytedance.android.livesdk.browser.e.b.a(webView2, q, true);
                    Uri parse = Uri.parse(q);
                    l.b(parse, str2);
                    if (parse.getPath() != null) {
                        String path = parse.getPath();
                        if (path == null) {
                            l.b();
                        }
                        l.b(path, str2);
                        str2 = path;
                    }
                    if (p.c(str2, "jpg", false) || p.c(str2, "jpeg", false) || p.c(str2, "png", false) || p.c(str2, "gif", false) || p.c(str2, "ico", false)) {
                        Uri parse2 = Uri.parse(q);
                        com.facebook.imagepipeline.e.h e2 = k.a().e();
                        if (!e2.b(parse2)) {
                            e2.d(parse2).a(new b(webView2, q), AsyncTask.THREAD_POOL_EXECUTOR);
                        }
                    }
                    return a2;
                }
                if (a(q)) {
                    com.bytedance.android.livesdk.browser.e.c.a(this.f16746l, (String) q, 1);
                }
                this.f16737a.put(q, false);
                com.bytedance.android.livesdk.browser.e.b.a(webView2, q, true);
            }
            return super.shouldInterceptRequest(webView2, (String) q);
        }
        throw n2.f112462e;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        l.d(webView, "");
        l.d(str, "");
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(2, "MyWebViewClient", "doUpdateVisitedHistory " + webView.getUrl() + " " + str + " " + z);
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String originUri;
        super.onPageStarted(webView, str, bitmap);
        if (str == null || str.length() == 0) {
            d.f16800b.a(webView, this.f16738b.f16752c.getOriginUri());
        } else {
            d.f16800b.a(webView, this.f16738b.f16752c.getOriginUri(), str);
        }
        this.f16742h = System.currentTimeMillis();
        if (webView != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && com.bytedance.android.livesdk.browser.a.a(str)) {
                boolean a2 = l.a(Boolean.TRUE, this.f16737a.get(str));
                Context context = webView.getContext();
                if (TextUtils.isEmpty(this.f16738b.f16752c.getOriginUri())) {
                    originUri = str;
                } else {
                    originUri = this.f16738b.f16752c.getOriginUri();
                }
                String a3 = com.a.a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", Arrays.copyOf(new Object[]{f.a(context, originUri, this.f16738b.f16753d, a2)}, 1));
                l.b(a3, "");
                webView.evaluateJavascript(a3, null);
            }
        }
        this.f16745k = false;
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(2, "MyWebViewClient", "onPageStarted " + str + ", time " + this.f16742h);
        }
        this.f16739e.put("constrution_duration", Long.valueOf((this.f16742h - this.f16741g) / 1000));
        com.bytedance.android.livesdk.container.h.a aVar = this.f16738b.f16754e;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.a.c, com.bytedance.android.livesdk.browser.a.a
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        this.f16740f = System.currentTimeMillis();
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(2, "MyWebViewClient", "onReceivedError " + str2 + ", time " + this.f16740f);
        }
        this.f16745k = true;
        com.bytedance.android.livesdk.container.h.a aVar = this.f16738b.f16754e;
        if (aVar != null) {
            aVar.e();
        }
        d.f16800b.a(webView, this.f16738b.f16752c.getOriginUri(), i2, str);
        this.n = false;
        if (!TextUtils.isEmpty(null)) {
            com.bytedance.android.live.core.d.c.a((String) null, 1, this.f16739e);
            this.f16739e.clear();
        }
    }
}
