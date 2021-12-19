package com.ss.android.ugc.aweme.commercialize.i;

import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.sdk.webview.h;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.net.monitor.n;
import h.e.j;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f74451a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    static WebView f74452b;

    /* renamed from: c  reason: collision with root package name */
    static a f74453c;

    /* renamed from: d  reason: collision with root package name */
    public static long f74454d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f74455e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final b f74456f = new b();

    private b() {
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f74465a = new e();

        static {
            Covode.recordClassIndex(45927);
        }

        e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            b.a();
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(45922);
    }

    public static void a() {
        f74451a.incrementAndGet();
        if (!l.a(Looper.myLooper(), Looper.getMainLooper())) {
            i.b(e.f74465a, i.f4826c);
            return;
        }
        f74454d = -1;
        WebView webView = f74452b;
        if (webView != null) {
            webView.stopLoading();
        }
        a aVar = f74453c;
        if (aVar != null) {
            aVar.f74457a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$b  reason: collision with other inner class name */
    public static final class C1679b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f74458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f74459b;

        static {
            Covode.recordClassIndex(45924);
        }

        public C1679b(int i2, String str) {
            this.f74458a = i2;
            this.f74459b = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (b.f74451a.get() != this.f74458a) {
                return null;
            }
            File file = new File(this.f74459b);
            if (!file.exists() || !file.isFile()) {
                return null;
            }
            return j.c(file);
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f74464a;

        static {
            Covode.recordClassIndex(45926);
        }

        d(int i2) {
            this.f74464a = i2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (this.f74464a == b.f74451a.get() && b.f74452b != null) {
                a aVar = b.f74453c;
                if (aVar != null) {
                    aVar.f74457a = null;
                }
                b.f74453c = null;
                WebView webView = b.f74452b;
                if (webView != null) {
                    b.f74452b = null;
                    webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                    webView.clearFormData();
                    webView.clearHistory();
                    webView.destroy();
                }
            }
            return z.f158842a;
        }
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f74460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f74461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f74462c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.a f74463d;

        static {
            Covode.recordClassIndex(45925);
        }

        public c(int i2, long j2, String str, h.a aVar) {
            this.f74460a = i2;
            this.f74461b = j2;
            this.f74462c = str;
            this.f74463d = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            boolean z;
            Object obj;
            MethodCollector.i(9374);
            if (b.f74451a.get() == this.f74460a) {
                l.b(iVar, "");
                String str = (String) iVar.d();
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    long j2 = this.f74461b;
                    String str2 = this.f74462c;
                    h.a aVar = this.f74463d;
                    if (b.f74452b == null && b.f74452b == null) {
                        WebView webView = new WebView(com.bytedance.ies.ugc.appcontext.d.a());
                        webView.setNetworkAvailable(false);
                        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                        l.b(iESSettingsProxy, "");
                        WebSettings settings = webView.getSettings();
                        l.b(settings, "");
                        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
                        l.b(adLandingPageConfig, "");
                        settings.setJavaScriptEnabled(adLandingPageConfig.isPrememCacheJsEnable());
                        WebSettings settings2 = webView.getSettings();
                        l.b(settings2, "");
                        settings2.setCacheMode(3);
                        WebSettings settings3 = webView.getSettings();
                        l.b(settings3, "");
                        settings3.setDatabaseEnabled(false);
                        WebSettings settings4 = webView.getSettings();
                        l.b(settings4, "");
                        settings4.setAllowContentAccess(false);
                        WebSettings settings5 = webView.getSettings();
                        l.b(settings5, "");
                        settings5.setAllowFileAccess(false);
                        webView.getSettings().setGeolocationEnabled(false);
                        WebSettings settings6 = webView.getSettings();
                        l.b(settings6, "");
                        settings6.setSaveFormData(false);
                        WebSettings settings7 = webView.getSettings();
                        l.b(settings7, "");
                        settings7.setSavePassword(false);
                        b.f74452b = webView;
                        a aVar2 = new a();
                        WebView webView2 = b.f74452b;
                        if (webView2 != null) {
                            if (com.ss.android.ugc.tiktok.security.c.b.a()) {
                                WebSettings settings8 = webView2.getSettings();
                                String userAgentString = settings8.getUserAgentString();
                                if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                                    StringBuilder sb = new StringBuilder(userAgentString);
                                    if (!TextUtils.isEmpty(sb)) {
                                        sb.append(" ");
                                    }
                                    sb.append("BytedanceWebview/d8a21c6");
                                    settings8.setUserAgentString(sb.toString());
                                }
                            }
                            webView2.setWebViewClient(com.example.a.c.a(aVar2));
                        }
                        b.f74453c = aVar2;
                    }
                    if (b.f74452b != null) {
                        b.f74454d = j2;
                        a aVar3 = b.f74453c;
                        if (aVar3 != null) {
                            aVar3.f74457a = aVar;
                        }
                        try {
                            Uri parse = Uri.parse(str2);
                            Uri.Builder builder = new Uri.Builder();
                            l.b(parse, "");
                            obj = q.m223constructorimpl(builder.scheme(parse.getScheme()).authority(parse.getAuthority()).build().toString());
                        } catch (Throwable th) {
                            obj = q.m223constructorimpl(r.a(th));
                        }
                        if (q.m228isFailureimpl(obj)) {
                            obj = null;
                        }
                        String str3 = (String) obj;
                        WebView webView3 = b.f74452b;
                        if (webView3 != null) {
                            webView3.loadDataWithBaseURL(str3, str, "text/html", "utf-8", str2);
                        }
                        i.a(60000).a(new d(b.f74451a.incrementAndGet()), i.f4826c, null);
                    }
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(9374);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public h.a f74457a = null;

        static {
            Covode.recordClassIndex(45923);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return com.example.a.c.a(webView, renderProcessGoneDetail);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            b.f74455e = System.currentTimeMillis();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            String str2;
            h.a aVar;
            WebResourceResponse a2;
            webResourceRequest.getUrl();
            com.ss.android.ugc.aweme.net.model.e<WebResourceRequest, WebResourceResponse> o = n.f112474e.o(new com.ss.android.ugc.aweme.net.model.e<>(webResourceRequest, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (o.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && o.f112459b != null) {
                return o.f112459b;
            }
            if (o.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || o.f112462e == null) {
                Q q = o.f112458a;
                if (Build.VERSION.SDK_INT < 21) {
                    return null;
                }
                if (q != null) {
                    str = q.getMethod();
                } else {
                    str = null;
                }
                if (!l.a((Object) str, (Object) "GET")) {
                    return null;
                }
                Uri url = q.getUrl();
                if (url != null) {
                    str2 = url.toString();
                } else {
                    str2 = null;
                }
                if ((!URLUtil.isHttpUrl(str2) && !URLUtil.isHttpsUrl(str2)) || (aVar = this.f74457a) == null || (a2 = aVar.a(str2)) == null) {
                    return null;
                }
                return a2;
            }
            throw o.f112462e;
        }
    }
}
