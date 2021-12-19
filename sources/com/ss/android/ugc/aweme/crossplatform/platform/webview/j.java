package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.agilelogger.ALog;
import com.ss.android.sdk.webview.h;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.ax.a.ae;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.v;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.av;
import com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.LoadEventBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.aweme.crossplatform.c.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.web.l;
import h.f.a.m;
import h.i;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

public final class j extends com.ss.android.sdk.webview.j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f78888k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f78889a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public m<? super WebView, ? super String, Boolean> f78890b;

    /* renamed from: c  reason: collision with root package name */
    public h f78891c;

    /* renamed from: e  reason: collision with root package name */
    public h f78892e;

    /* renamed from: f  reason: collision with root package name */
    public h f78893f;

    /* renamed from: g  reason: collision with root package name */
    public m f78894g;

    /* renamed from: h  reason: collision with root package name */
    public k f78895h;

    /* renamed from: i  reason: collision with root package name */
    boolean f78896i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.activity.m f78897j;

    /* renamed from: l  reason: collision with root package name */
    private final e f78898l = new e(this);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f78899m = i.a((h.f.a.a) d.f78902a);

    static {
        Covode.recordClassIndex(48960);
    }

    public final com.ss.android.sdk.webview.i a() {
        return (com.ss.android.sdk.webview.i) this.f78899m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48961);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.sdk.webview.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f78902a = new d();

        static {
            Covode.recordClassIndex(48964);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.sdk.webview.i invoke() {
            return com.ss.android.sdk.webview.i.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f78900a;

        static {
            Covode.recordClassIndex(48962);
        }

        b(j jVar) {
            this.f78900a = jVar;
        }

        public final void run() {
            h hVar = this.f78900a.f78893f;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final PassBackWebInfoBusiness b() {
        g crossPlatformBusiness;
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78897j;
        if (mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null) {
            return null;
        }
        return (PassBackWebInfoBusiness) crossPlatformBusiness.a(PassBackWebInfoBusiness.class);
    }

    public j() {
        GeckoXClientManager.a();
        com.ss.android.ugc.aweme.web.k kVar = com.ss.android.ugc.aweme.web.k.f145061a;
        if (kVar != null) {
            h a2 = new h(kVar.a()).a(com.ss.android.ugc.aweme.web.k.f145062b).a(l.b());
            a2.f60220a = new c(this);
            this.f78893f = a2;
        }
    }

    public static final class e implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f78903a;

        static {
            Covode.recordClassIndex(48965);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(j jVar) {
            this.f78903a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            Iterator<T> it = this.f78903a.f78889a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().b(webView, str)) {
                    z = true;
                }
            }
            return z;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().c(webView, str);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().e(webView, str);
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, str);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().a(webView, webResourceRequest, webResourceError);
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().a(webView, webResourceRequest, webResourceResponse);
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().c(webView, str);
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, str, bitmap);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            com.ss.android.ugc.aweme.crossplatform.c.a.a().a(webView, i2, str, str2);
            Iterator<T> it = this.f78903a.f78889a.iterator();
            while (it.hasNext()) {
                it.next().a(webView, i2, str, str2);
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class c implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f78901a;

        static {
            Covode.recordClassIndex(48963);
        }

        c(j jVar) {
            this.f78901a = jVar;
        }

        @Override // com.ss.android.sdk.webview.h.a
        public final WebResourceResponse a(String str) {
            return this.f78901a.a().a(str);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.f78898l.c(webView, str);
    }

    private static void b(WebView webView, String str) {
        MethodCollector.i(12188);
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(12188);
    }

    @Override // com.ss.android.sdk.webview.j, android.webkit.WebViewClient, com.bytedance.ies.web.a.c
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        h.f.b.l.d(webView, "");
        h.f.b.l.d(str, "");
        h hVar = this.f78892e;
        if (hVar != null) {
            hVar.a(str);
        }
        return a(webView, str);
    }

    @Override // com.ss.android.sdk.webview.j
    public final void onPageFinished(WebView webView, String str) {
        g crossPlatformBusiness;
        g crossPlatformBusiness2;
        PlayableBusiness playableBusiness;
        g crossPlatformBusiness3;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onPageFinished(webView, str);
        if (str != null) {
            f.a.a().a(webView, str, 2);
            k kVar = this.f78895h;
            if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                mVar.b(ae.a(str));
            }
        }
        this.f78898l.a(webView, str);
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.f78897j;
        if (!(mVar2 == null || (crossPlatformBusiness3 = mVar2.getCrossPlatformBusiness()) == null || (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness3.a(DouPlusMonitorBusiness.class)) == null)) {
            douPlusMonitorBusiness.b(str);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar3 = this.f78897j;
        if (!(mVar3 == null || (crossPlatformBusiness2 = mVar3.getCrossPlatformBusiness()) == null || (playableBusiness = (PlayableBusiness) crossPlatformBusiness2.a(PlayableBusiness.class)) == null)) {
            playableBusiness.a(this.f35529d);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar4 = this.f78897j;
        if (mVar4 != null) {
            mVar4.getCrossPlatformParams();
        }
        PassBackWebInfoBusiness b2 = b();
        if (b2 != null) {
            b2.a(webView, true);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar5 = this.f78897j;
        if (mVar5 != null && (crossPlatformBusiness = mVar5.getCrossPlatformBusiness()) != null) {
            crossPlatformBusiness.a(LoadEventBusiness.class);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        PassBackWebInfoBusiness b2;
        String str;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        WebResourceResponse a2;
        webResourceRequest.getUrl();
        com.ss.android.ugc.aweme.net.model.e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new com.ss.android.ugc.aweme.net.model.e<>(webResourceRequest, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
        if (o.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && o.f112459b != null) {
            return o.f112459b;
        }
        if (o.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || o.f112462e == null) {
            WebView webView2 = o.f112460c;
            Q q = o.f112458a;
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78897j;
            if (!(mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f78742b) == null || Build.VERSION.SDK_INT < 21 || bVar.f78759a == 0 || q == null)) {
                h.f.b.l.b(bVar, "");
                h.f.b.l.d(q, "");
                h.f.b.l.d(bVar, "");
                if (q.getUrl() != null) {
                    String uri = q.getUrl().toString();
                    h.f.b.l.b(uri, "");
                    if (p.a((CharSequence) uri, (CharSequence) "https://securepubads.g.doubleclick.net/gampad/ads", false) && (a2 = CWebViewInterceptor.a(uri, q, bVar)) != null) {
                        return a2;
                    }
                }
            }
            if (!(Build.VERSION.SDK_INT < 21 || q == null || q.getUrl() == null || q.getRequestHeaders() == null || (b2 = b()) == null)) {
                String uri2 = q.getUrl().toString();
                h.f.b.l.b(uri2, "");
                Map<String, String> requestHeaders = q.getRequestHeaders();
                h.f.b.l.b(requestHeaders, "");
                h.f.b.l.d(uri2, "");
                h.f.b.l.d(requestHeaders, "");
                if (b2.d() && b2.b().size() < b2.f78625c && !p.a((CharSequence) uri2) && !h.f.b.l.a((Object) "about:blank", (Object) uri2) && !p.c(uri2, ".js", false) && !p.c(uri2, ".css", false) && (str = requestHeaders.get("Accept")) != null && p.a((CharSequence) str, (CharSequence) "html", false)) {
                    Map<String, Map<String, String>> c2 = b2.c();
                    String a3 = et.a(uri2);
                    h.f.b.l.b(a3, "");
                    c2.put(a3, requestHeaders);
                }
            }
            return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
        }
        throw o.f112462e;
    }

    private final boolean a(WebView webView, String str) {
        String str2;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        Boolean a2;
        h hVar = this.f78891c;
        String str3 = null;
        if (hVar != null && (a2 = hVar.a(str)) != null) {
            return a2.booleanValue();
        }
        if (this.f78890b == null) {
            try {
                Uri parse = Uri.parse(str);
                h.f.b.l.b(parse, "");
                String scheme = parse.getScheme();
                if (scheme != null) {
                    Locale locale = Locale.getDefault();
                    h.f.b.l.b(locale, "");
                    String lowerCase = scheme.toLowerCase(locale);
                    h.f.b.l.b(lowerCase, "");
                    str3 = lowerCase;
                }
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
            if ((!h.f.b.l.a((Object) "http", (Object) str3)) && (!h.f.b.l.a((Object) "https", (Object) str3)) && (!h.f.b.l.a((Object) "bytedance", (Object) str3)) && SmartRouter.canOpen(str)) {
                SmartRouter.buildRoute(webView.getContext(), str).open();
                return true;
            } else if (a.C2792a.f108997a.f108996a.enableBoe()) {
                b(webView, str);
                return true;
            } else {
                if (TextUtils.isEmpty(str) || !p.e((CharSequence) str, (CharSequence) "__back_url__")) {
                    str2 = str;
                } else {
                    String encode = Uri.encode("snssdk" + com.bytedance.ies.ugc.appcontext.d.n + "://adx");
                    h.f.b.l.b(encode, "");
                    str2 = p.a(str, "__back_url__", encode);
                }
                boolean c2 = c(webView, str2);
                if (!c2) {
                    f.a.a().a(webView, str, 3);
                    k kVar = this.f78895h;
                    if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                        mVar.b(str);
                    }
                }
                return c2;
            }
        } else if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        } else {
            m<? super WebView, ? super String, Boolean> mVar2 = this.f78890b;
            if (mVar2 == null) {
                h.f.b.l.b();
            }
            return mVar2.invoke(webView, str).booleanValue();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        com.ss.android.ugc.aweme.ax.a.m mVar;
        com.ss.android.ugc.aweme.ax.a.m mVar2;
        WebResourceResponse a2;
        com.ss.android.ugc.aweme.ax.a.m mVar3;
        WebResourceResponse a3;
        com.ss.android.ugc.aweme.ax.a.m mVar4;
        com.ss.android.ugc.aweme.ax.a.m mVar5;
        com.ss.android.ugc.aweme.net.model.e<String, WebResourceResponse> n = n.f112474e.n(new com.ss.android.ugc.aweme.net.model.e<>(str, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
        if (n.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && n.f112459b != null) {
            return n.f112459b;
        }
        if (n.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || n.f112462e == null) {
            WebView webView2 = n.f112460c;
            Q q = n.f112458a;
            k kVar = this.f78895h;
            if (!(kVar == null || (mVar5 = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                mVar5.f();
            }
            h hVar = this.f78893f;
            if (hVar == null || (a3 = hVar.a(webView2, q)) == null) {
                m mVar6 = this.f78894g;
                if (mVar6 != null) {
                    String valueOf = String.valueOf(q);
                    h.f.b.l.d(valueOf, "");
                    String str2 = mVar6.f78907a;
                    h.f.b.l.d(str2, "");
                    h.f.b.l.d(valueOf, "");
                    if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(str2) && ((p.a((CharSequence) str2, (CharSequence) "https", false) || p.a((CharSequence) str2, (CharSequence) "http", false)) && ((p.a((CharSequence) valueOf, (CharSequence) "http", false) || p.a((CharSequence) valueOf, (CharSequence) "https", false)) && !p.a((CharSequence) valueOf, (CharSequence) "/v1/list?rdn", false) && !p.a((CharSequence) valueOf, (CharSequence) "google-analytics.com", false) && !p.a((CharSequence) valueOf, (CharSequence) "cdn.polyfill.io", false) && com.bytedance.ies.abmock.b.a().a(true, "is_ttnet_intercept_webview", false)))) {
                        if (com.bytedance.ies.abmock.b.a().a(true, "is_ttnet_intercept_all", false)) {
                            if (!p.a((CharSequence) str2, (CharSequence) "ttnet_intercept=0", false)) {
                                if (!com.ss.android.ugc.aweme.base.utils.d.a(q.f78919d)) {
                                    Iterator<String> it = q.f78919d.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        String next = it.next();
                                        h.f.b.l.b(next, "");
                                        if (p.a((CharSequence) str2, (CharSequence) next, false)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else if (!p.a((CharSequence) str2, (CharSequence) "ttnet_intercept=1", false)) {
                            if (!com.ss.android.ugc.aweme.base.utils.d.a(q.f78918c)) {
                                Iterator<String> it2 = q.f78918c.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String next2 = it2.next();
                                    h.f.b.l.b(next2, "");
                                    if (p.a((CharSequence) str2, (CharSequence) next2, false)) {
                                        break;
                                    }
                                }
                            }
                        }
                        h.f.b.l.d(str2, "");
                        h.f.b.l.d(valueOf, "");
                        if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(str2) && (a2 = l.a(l.a(str2, valueOf))) != null) {
                            k kVar2 = this.f78895h;
                            if (!(kVar2 == null || (mVar3 = (com.ss.android.ugc.aweme.ax.a.m) kVar2.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                                mVar3.h();
                            }
                            return a2;
                        }
                    }
                }
                WebResourceResponse a4 = c.a(q);
                if (a4 != null) {
                    return a4;
                }
                k kVar3 = this.f78895h;
                if (!(kVar3 == null || (mVar2 = (com.ss.android.ugc.aweme.ax.a.m) kVar3.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                    mVar2.i();
                }
                k kVar4 = this.f78895h;
                if (!(kVar4 == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar4.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                    mVar.a((String) q);
                }
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            k kVar5 = this.f78895h;
            if (!(kVar5 == null || (mVar4 = (com.ss.android.ugc.aweme.ax.a.m) kVar5.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                mVar4.g();
            }
            return a3;
        }
        throw n.f112462e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026a, code lost:
        if (r0.h().b(r5) != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0302, code lost:
        if (r0.h().b(r5) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0337, code lost:
        if (r0.h().b(r5) != false) goto L_0x0339;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0189 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0194 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0115 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125 A[ADDED_TO_REGION, Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012e A[ADDED_TO_REGION, Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0173 A[Catch:{ Exception -> 0x04ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c(android.webkit.WebView r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 1200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.j.c(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        k kVar = this.f78895h;
        if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(webResourceRequest, webResourceResponse);
        }
        this.f78898l.a(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        k kVar = this.f78895h;
        if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(sslError);
        }
        this.f78898l.a(webView, sslErrorHandler, sslError);
    }

    private final boolean a(String str, String str2, com.ss.android.ugc.aweme.ad.e.a aVar) {
        String str3;
        List<String> list;
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78897j;
        if (mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f78742b) == null || (str3 = bVar.Q) == null) {
            str3 = "";
        }
        if (aVar != null) {
            list = aVar.getClickJumpAllowList();
        } else {
            list = null;
        }
        if (com.ss.android.newmedia.c.a(str, str2, list) || com.ss.android.newmedia.c.a(str, str2, am.a(str3))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.sdk.webview.j
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        k kVar;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onPageStarted(webView, str, bitmap);
        if (!(str == null || (kVar = this.f78895h) == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(ae.a(str));
        }
        this.f78898l.a(webView, str, bitmap);
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.f78897j;
        if (!(mVar2 == null || (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) == null || (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class)) == null)) {
            douPlusMonitorBusiness.a(str);
        }
        PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(this.f78897j);
        if (a2 != null) {
            com.bytedance.ies.web.a.a aVar = this.f35529d;
            h.f.b.l.b(aVar, "");
            h.f.b.l.d(aVar, "");
            a2.f78648a = aVar;
        }
    }

    @Override // com.ss.android.sdk.webview.j
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        k kVar = this.f78895h;
        if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(webResourceRequest, webResourceError);
        }
        this.f78898l.a(webView, webResourceRequest, webResourceError);
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.f78897j;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class)) != null && douPlusMonitorBusiness.f78619a && webResourceRequest != null && webResourceError != null && webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                douPlusMonitorBusiness.a(webResourceError.getErrorCode(), null, webView);
            } else {
                douPlusMonitorBusiness.a(webResourceError.getErrorCode(), url.toString(), webView);
            }
        }
    }

    private static void a(String str, String str2, com.ss.android.ugc.aweme.ad.settings.c cVar) {
        String shortClassName;
        String packageName;
        String str3;
        String className;
        String str4;
        if (str2 != null && !p.a((CharSequence) str2) && str != null && !p.a((CharSequence) str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scheme", str2);
            jSONObject.put("from", j.class.getSimpleName());
            if (cVar != null) {
                jSONObject.put("pattern", cVar.f66152a);
                jSONObject.put("config_type", cVar.f66153b);
            }
            if (h.f.b.l.a((Object) "intent", (Object) str2)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parseUri != null) {
                        String str5 = parseUri.getPackage();
                        if (str5 != null && !p.a((CharSequence) str5)) {
                            jSONObject.put("package", parseUri.getPackage());
                        }
                        if (a(parseUri) != null) {
                            jSONObject.put("extra", String.valueOf(a(parseUri)));
                        }
                        ComponentName component = parseUri.getComponent();
                        String str6 = null;
                        if (!(component == null || (className = component.getClassName()) == null || !(!p.a((CharSequence) className)))) {
                            ComponentName component2 = parseUri.getComponent();
                            if (component2 != null) {
                                str4 = component2.getClassName();
                            } else {
                                str4 = null;
                            }
                            jSONObject.put("className", str4);
                        }
                        ComponentName component3 = parseUri.getComponent();
                        if (!(component3 == null || (packageName = component3.getPackageName()) == null || !(!p.a((CharSequence) packageName)))) {
                            ComponentName component4 = parseUri.getComponent();
                            if (component4 != null) {
                                str3 = component4.getPackageName();
                            } else {
                                str3 = null;
                            }
                            jSONObject.put("packageName", str3);
                        }
                        ComponentName component5 = parseUri.getComponent();
                        if (!(component5 == null || (shortClassName = component5.getShortClassName()) == null || !(!p.a((CharSequence) shortClassName)))) {
                            ComponentName component6 = parseUri.getComponent();
                            if (component6 != null) {
                                str6 = component6.getShortClassName();
                            }
                            jSONObject.put("shortClassName", str6);
                        }
                        String action = parseUri.getAction();
                        if (action != null && !p.a((CharSequence) action)) {
                            jSONObject.put("action", parseUri.getAction());
                        }
                        Set<String> categories = parseUri.getCategories();
                        if (categories != null && !categories.isEmpty()) {
                            jSONObject.put("categories", parseUri.getCategories().toString());
                        }
                        String dataString = parseUri.getDataString();
                        if (dataString != null && !p.a((CharSequence) dataString)) {
                            jSONObject.put("data", parseUri.getDataString());
                        }
                        String type = parseUri.getType();
                        if (type != null && !p.a((CharSequence) type)) {
                            jSONObject.put(StringSet.type, parseUri.getType());
                        }
                        jSONObject.put("flag", parseUri.getFlags());
                    }
                } catch (Exception e2) {
                    jSONObject.put("exception_name", e2.getClass().getSimpleName());
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    jSONObject.put("exception_message", message);
                }
            }
            com.bytedance.apm.b.a("webview_intent_scheme_log", jSONObject);
        }
    }

    @Override // com.ss.android.sdk.webview.j
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        k kVar;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onReceivedError(webView, i2, str, str2);
        if (!(Build.VERSION.SDK_INT >= 23 || (kVar = this.f78895h) == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(i2, str2);
        }
        this.f78898l.a(webView, i2, str, str2);
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.f78897j;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class)) != null) {
            douPlusMonitorBusiness.a(i2, str2, webView);
        }
    }

    private final void a(Aweme aweme, Uri uri, String str, WebView webView) {
        String str2;
        com.ss.android.ugc.aweme.crossplatform.activity.m mVar = this.f78897j;
        if (!(mVar == null || mVar.getCrossPlatformParams() == null)) {
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar2 = this.f78897j;
            if (mVar2 == null) {
                h.f.b.l.b();
            }
            if (mVar2.getCrossPlatformParams() == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.crossplatform.activity.m mVar3 = this.f78897j;
            if (mVar3 == null) {
                h.f.b.l.b();
            }
            if (mVar3.getCrossPlatformParams() == null) {
                h.f.b.l.b();
            }
        }
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(awemeRawAd, "");
            if (awemeRawAd.getGroupId() != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(awemeRawAd2, "");
                str2 = String.valueOf(awemeRawAd2.getGroupId().longValue());
                ALog.d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
                k kVar = this.f78895h;
                h.f.b.l.d(webView, "");
                h.f.b.l.d(str2, "");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                k.a(str, kVar);
                k.a(webView.getContext(), intent);
            }
        }
        str2 = "";
        ALog.d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
        k kVar2 = this.f78895h;
        h.f.b.l.d(webView, "");
        h.f.b.l.d(str2, "");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        intent2.addFlags(268435456);
        k.a(str, kVar2);
        k.a(webView.getContext(), intent2);
    }

    private final boolean a(Aweme aweme, Uri uri, String str, boolean z, String str2, WebView webView) {
        Intent intent;
        PackageManager packageManager;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        if (uri != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (h.f.b.l.a((Object) "market", (Object) str)) {
                a(aweme, uri, str2, webView);
                return true;
            } else if (h.f.b.l.a((Object) "intent", (Object) str) && z) {
                ALog.d("commerce_jump", "【filterUrl】 = " + str2 + " 【intent】 special handle");
                ICrossPlatformLegacyService f2 = CrossPlatformLegacyServiceImpl.f();
                String str3 = null;
                try {
                    intent = Intent.parseUri(str2, 1);
                } catch (URISyntaxException e2) {
                    e2.printStackTrace();
                    intent = null;
                }
                Activity a2 = o.a(webView.getContext());
                if (a2 != null) {
                    packageManager = a2.getPackageManager();
                } else {
                    packageManager = null;
                }
                if (packageManager == null || intent == null || intent.resolveActivity(packageManager) == null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    h.f.b.l.b(f2, "");
                    k kVar = this.f78895h;
                    h.f.b.l.d(f2, "");
                    h.f.b.l.d(webView, "");
                    h.f.b.l.d(intent2, "");
                    if (intent != null) {
                        if (f2.a(webView.getContext())) {
                            intent2.setData(Uri.parse("market://details?id=" + intent.getPackage()));
                            if (!(packageManager == null || intent2.resolveActivity(packageManager) == null)) {
                                intent.addFlags(268435456);
                                k.a(str2, kVar);
                                k.a(webView.getContext(), intent2);
                                return true;
                            }
                        }
                        String a3 = a(intent, "browser_fallback_url");
                        if (a3 != null && com.ss.android.newmedia.d.a(a3)) {
                            b(webView, a3);
                            return true;
                        }
                    }
                    h.f.b.l.d(f2, "");
                    h.f.b.l.d(webView, "");
                    if (!f2.a(webView.getContext())) {
                        Context context = webView.getContext();
                        if (intent != null) {
                            str3 = intent.getPackage();
                        }
                        return f2.a(context, str3);
                    }
                } else {
                    intent.addFlags(268435456);
                    if (str2 != null) {
                        d.a.a();
                        k kVar2 = this.f78895h;
                        if (kVar2 != null) {
                            mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar2.a(com.ss.android.ugc.aweme.ax.a.m.class);
                        } else {
                            mVar = null;
                        }
                        Uri parse = Uri.parse(str2);
                        h.f.b.l.b(parse, "");
                        com.ss.android.ugc.aweme.crossplatform.c.d.a(mVar, "webview_safe_log", "filter_scheme", new v(parse, "intent_scheme_", null, 4).getFormatData(), null, null);
                    }
                    Context context2 = webView.getContext();
                    h.f.b.l.b(context2, "");
                    String packageName = context2.getPackageName();
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        str3 = component.getPackageName();
                    }
                    if (h.f.b.l.a((Object) packageName, (Object) str3)) {
                        return false;
                    }
                    Context context3 = webView.getContext();
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context3);
                    context3.startActivity(intent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15, boolean r16, java.lang.String r17, android.webkit.WebView r18, com.ss.android.ugc.aweme.ad.e.a r19, boolean r20) {
        /*
            r13 = this;
            r0 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 != 0) goto L_0x0010
            r1 = r17
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            return r4
        L_0x0011:
            java.lang.String r0 = "intent"
            boolean r0 = h.f.b.l.a(r0, r15)
            if (r0 == 0) goto L_0x0010
            if (r16 != 0) goto L_0x0010
            r3 = 1
            r2 = 0
            android.content.Intent r1 = android.content.Intent.parseUri(r1, r3)     // Catch:{ URISyntaxException -> 0x0028 }
            if (r1 == 0) goto L_0x002d
            android.net.Uri r7 = r1.getData()
            goto L_0x002e
        L_0x0028:
            r0 = move-exception
            r0.printStackTrace()
            r1 = r2
        L_0x002d:
            r7 = r2
        L_0x002e:
            r12 = 0
            r5 = r13
            r8 = 0
            r9 = r18
            r11 = r20
            r6 = r14
            r10 = r19
            boolean r0 = r5.a(r6, r7, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L_0x005b
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r2 = a(r1, r0)
        L_0x0046:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x005a
            android.net.Uri r7 = android.net.Uri.parse(r2)
            r12 = 1
            r5 = r13
            r8 = 0
            boolean r0 = r5.a(r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x005a
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.j.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String, android.webkit.WebView, com.ss.android.ugc.aweme.ad.e.a, boolean):boolean");
    }

    private final boolean a(Aweme aweme, Uri uri, boolean z, WebView webView, com.ss.android.ugc.aweme.ad.e.a aVar, boolean z2, boolean z3) {
        String str;
        String str2 = null;
        if (uri != null) {
            str = uri.toString();
            String scheme = uri.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                h.f.b.l.b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str2 = scheme.toLowerCase(locale);
                h.f.b.l.b(str2, "");
            }
        } else {
            str = null;
        }
        boolean a2 = a(str, str2, aVar);
        if (aVar == null ? !z2 || a2 || z : !z2 || !aVar.isJumpControlEnabled() || a2 || z) {
            if (!com.ss.android.newmedia.d.a(str)) {
                if (h.f.b.l.a((Object) "market", (Object) str2)) {
                    a(aweme, uri, str, webView);
                    return true;
                } else if (!CrossPlatformLegacyServiceImpl.f().c(webView.getContext(), Uri.parse(str))) {
                    return false;
                } else {
                    av.b();
                    av.a();
                    try {
                        com.ss.android.newmedia.b.a.b(webView.getContext(), str);
                    } catch (Exception unused) {
                    }
                    ALog.d("commerce_jump", "【filterUrl】 = " + str + " 【open scheme final】");
                    return true;
                }
            }
        }
        if (!z3 || !com.ss.android.newmedia.d.a(str) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str == null) {
            h.f.b.l.b();
        }
        b(webView, str);
        return true;
    }
}
