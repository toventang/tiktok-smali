package com.bytedance.android.monitorV2.webview;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.d.e;
import com.bytedance.android.monitorV2.d.f;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.webview.d;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n implements d, f {

    /* renamed from: a  reason: collision with root package name */
    public static d f24264a;

    /* renamed from: b  reason: collision with root package name */
    public static f f24265b;

    /* renamed from: d  reason: collision with root package name */
    private static String f24266d = "[?&]bd_hybrid_monitor_bid=([^&#]+)";

    /* renamed from: e  reason: collision with root package name */
    private static String f24267e = "webview_tag";

    /* renamed from: f  reason: collision with root package name */
    private static String f24268f = "webview_last_url_tag";

    /* renamed from: g  reason: collision with root package name */
    private static String f24269g = "webview_auto_report_tag";

    /* renamed from: k  reason: collision with root package name */
    private static Map<String, String> f24270k = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.monitorV2.webview.d.a f24271c;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, d.a> f24272h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Map<String, d.a> f24273i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private Set<String> f24274j = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    private b f24275l = new b((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.android.monitorV2.webview.a.a f24276m = new com.bytedance.android.monitorV2.webview.a.a();
    private boolean n = false;
    private boolean o = true;
    private boolean p = false;
    private boolean q = false;
    private Handler r = new Handler(Looper.getMainLooper());
    private boolean s = false;

    @Override // com.bytedance.android.monitorV2.k.c
    public final void a(String str, Object obj) {
    }

    /* access modifiers changed from: package-private */
    public static class b implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(14267);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (view instanceof WebView) {
                n.f24265b.c((WebView) view);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                n.f24265b.d(webView);
                if (n.f24265b.h(webView)) {
                    n.f24264a.a(webView);
                }
            }
        }
    }

    public static d a() {
        return f24264a;
    }

    public final boolean b() {
        boolean z = this.o && e().a() && e().b();
        if (this.q != z) {
            com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "monitor enabled: ".concat(String.valueOf(z)));
            this.q = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleRequestError: " + com.bytedance.android.monitorV2.i.b.a(webView) + ", error: " + webResourceError);
        if (!c()) {
            b(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleRequestHttpError: " + com.bytedance.android.monitorV2.i.b.a(webView) + ", request: " + webResourceRequest);
        if (!c()) {
            b(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        d.a w;
        e eVar;
        try {
            if (b() && webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (g(webView) && x(webView) && (w = w(webView)) != null) {
                        if (a(w.f24200j)) {
                            if (s(webView) != null && (eVar = w.f24192b) != null) {
                                eVar.a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), 0, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.f
    public final void a(WebView webView, e eVar) {
        d.a w;
        e eVar2;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleJSBError: " + com.bytedance.android.monitorV2.i.b.a(webView));
        try {
            if (b() && webView != null && g(webView) && x(webView) && e().d() && (w = w(webView)) != null && s(webView) != null && (eVar2 = w.f24192b) != null) {
                eVar2.a(webView, eVar);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.f
    public final void a(WebView webView, f fVar) {
        d.a w;
        e eVar;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleJSBInfo: " + com.bytedance.android.monitorV2.i.b.a(webView));
        try {
            if (b() && webView != null && g(webView) && x(webView) && e().d() && (w = w(webView)) != null && s(webView) != null && (eVar = w.f24192b) != null) {
                eVar.a(webView, fVar);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    public final void a(WebView webView, boolean z) {
        if (w(webView) != null && g(webView)) {
            l.a().m(webView);
            if (e().j()) {
                String a2 = com.a.a(" javascript: (function () {\n    var target = {}\n    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n    var performacess = SlardarHybrid('getLatestPerformance');\n    var resourcess = SlardarHybrid('getLatestResource');\n    var cacheData = SlardarHybrid('flushCacheData');\n    target.performance = performacess;\n    target.resource = resourcess;\n    target.cacheData = cacheData;\n    target.needReport = %s;\n    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n })()", new Object[]{z ? "true" : "false"});
                if (webView != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    webView.evaluateJavascript(a2, null);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.e
    public final void a(WebView webView, com.bytedance.android.monitorV2.d.d dVar) {
        JSONObject jSONObject;
        if (webView != null) {
            com.bytedance.android.monitorV2.webview.b.a y = y(webView);
            if (y != null) {
                if (TextUtils.isEmpty(dVar.f23848b)) {
                    dVar.f23848b = y.b();
                }
                if (TextUtils.isEmpty(dVar.f23847a)) {
                    dVar.f23847a = y.c();
                }
                if (TextUtils.isEmpty(dVar.f23859m)) {
                    dVar.f23859m = y.a();
                }
            }
            d.a w = w(webView);
            if (!(w == null || w.f24198h == null)) {
                dVar.o = w.f24198h;
            }
            if (TextUtils.isEmpty(dVar.f23848b)) {
                dVar.f23848b = e(webView);
            }
        }
        k l2 = l.a().l(webView);
        JSONObject jSONObject2 = null;
        if (l2 != null) {
            jSONObject = l2.f24222a != null ? l2.f24222a.a() : null;
            if (l2.f24225d != null) {
                jSONObject2 = l2.f24225d.a();
            }
        } else {
            jSONObject = null;
        }
        dVar.f23857k = jSONObject2;
        dVar.f23856j = jSONObject;
        a.C0514a a2 = a(dVar.f23848b);
        JSONObject jSONObject3 = new JSONObject();
        com.bytedance.android.monitorV2.l.f.a(jSONObject3, "bid", dVar.f23848b);
        com.bytedance.android.monitorV2.l.f.a(jSONObject3, "setting_bid", a2.f23925a);
        com.bytedance.android.monitorV2.l.f.a(jSONObject3, "hit_sample", a2.f23926b);
        com.bytedance.android.monitorV2.l.f.a(jSONObject3, "setting_id", a2.f23927c);
        com.bytedance.android.monitorV2.l.f.a(jSONObject3, "can_sample", dVar.n);
        dVar.f23853g = jSONObject3;
        com.bytedance.android.monitorV2.l.f.a(dVar.f23855i, "platform", 0);
        HybridMultiMonitor.getInstance().customReportInner(dVar);
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void a(WebView webView, String str, String str2, String str3) {
        e eVar;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "cover: url: " + str + ", service: " + str2);
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.a(webView, str, str2, str3);
                j(webView, "loc_after_tti");
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void a(WebView webView, String str, String str2) {
        e eVar;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "report direct: eventType: ".concat(String.valueOf(str)));
        try {
            d.a w = w(webView);
            if (w != null && s(webView) != null && (eVar = w.f24192b) != null) {
                eVar.a(webView, str, str2);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void a(WebView webView, String str) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.c(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void a(WebView webView, long j2) {
        e eVar;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "injectJS: " + com.bytedance.android.monitorV2.i.b.a(webView));
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.a(webView, j2);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.b
    public final void a(d.a aVar) {
        e a2;
        String[] c2;
        boolean optBoolean;
        String a3;
        try {
            d.a aVar2 = new d.a();
            aVar.s = aVar.s;
            if (aVar.f24192b != null) {
                a2 = aVar.f24192b;
            } else {
                a2 = l.a();
            }
            aVar2.f24192b = a2;
            aVar2.f24191a = aVar.f24191a;
            aVar2.f24198h = aVar.f24198h;
            aVar2.f24197g = aVar.f24197g;
            aVar2.f24202l = aVar.f24202l;
            aVar2.f24203m = aVar.f24203m;
            aVar2.p = f();
            aVar2.f24201k = aVar.f24201k;
            aVar2.f24196f = aVar.f24196f;
            aVar2.f24195e = aVar.f24195e;
            aVar2.f24193c = aVar.f24193c;
            aVar2.s = aVar.s;
            aVar2.f24194d = aVar.f24194d;
            aVar2.o = TextUtils.isEmpty(aVar.o) ? "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});" : aVar.o;
            aVar2.q = aVar.q;
            aVar2.f24200j = aVar.f24200j;
            aVar2.t = aVar.t;
            if (!TextUtils.isEmpty(aVar.f24199i)) {
                JSONObject a4 = com.bytedance.android.monitorV2.l.f.a(aVar.f24199i);
                if (com.bytedance.android.monitorV2.l.f.e(a4, "webview_classes") == null) {
                    c2 = aVar2.f24195e;
                } else {
                    c2 = c(aVar.f24199i);
                }
                aVar2.f24195e = c2;
                if (com.bytedance.android.monitorV2.l.f.e(a4, "webview_is_need_monitor") == null) {
                    optBoolean = aVar2.f24201k;
                } else {
                    Boolean bool = false;
                    optBoolean = com.bytedance.android.monitorV2.l.f.a(aVar.f24199i).optBoolean("webview_is_need_monitor", bool.booleanValue());
                }
                aVar2.f24201k = optBoolean;
                if (TextUtils.isEmpty(aVar.f24199i)) {
                    a3 = aVar2.o;
                } else {
                    a3 = new m(aVar.f24199i).a();
                }
                aVar2.o = a3;
            }
            String[] strArr = aVar2.f24196f;
            if (!(strArr == null || strArr.length == 0)) {
                for (String str : strArr) {
                    this.f24273i.put(str, aVar2);
                }
            }
            String[] strArr2 = aVar2.f24195e;
            if (!(strArr2 == null || strArr2.length == 0)) {
                for (String str2 : strArr2) {
                    this.f24272h.put(str2, aVar2);
                }
            }
            this.f24274j.clear();
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.e
    public final void b(WebView webView, String str, String str2, String str3) {
        String str4;
        JSONObject jSONObject;
        JSONObject a2 = com.bytedance.android.monitorV2.l.f.a(str);
        JSONObject a3 = com.bytedance.android.monitorV2.l.f.a(str2);
        JSONObject a4 = com.bytedance.android.monitorV2.l.f.a(str3);
        if (w(webView) != null && s(webView) != null) {
            b bVar = null;
            com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "customReportInner: url: " + ((String) null) + ", eventName: " + ((String) null));
            if (webView != null) {
                String str5 = "";
                try {
                    com.bytedance.android.monitorV2.webview.b.a y = y(webView);
                    if (y != null) {
                        jSONObject = new JSONObject();
                        com.bytedance.android.monitorV2.l.f.a(jSONObject, "virtual_aid", y.a());
                        str5 = y.b();
                        str4 = TextUtils.isEmpty(null) ? y.c() : null;
                    } else {
                        str4 = null;
                        jSONObject = null;
                    }
                    d.a w = w(webView);
                    if (w != null) {
                        bVar = w.f24198h;
                    }
                    a(webView, bVar, str5, str4, null, a2, a3, a4, jSONObject, 0);
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            } else {
                a(null, null, "", null, null, a2, a3, a4, null, 0);
            }
        }
    }

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private WebView f24280b;

        static {
            Covode.recordClassIndex(14266);
        }

        public final void run() {
            n.this.b(this.f24280b);
        }

        private a(WebView webView) {
            this.f24280b = webView;
        }

        /* synthetic */ a(n nVar, WebView webView, byte b2) {
            this(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.b
    public final d.a d() {
        return new d.a();
    }

    private static com.bytedance.android.monitorV2.h.a.e e() {
        return HybridMultiMonitor.getInstance().getHybridSettingManager().c();
    }

    public final boolean c() {
        if (!this.p || !this.n) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(14264);
        n nVar = new n();
        f24264a = nVar;
        f24265b = nVar;
    }

    private String f() {
        if (this.f24271c == null) {
            return null;
        }
        try {
            File file = new File(this.f24271c.a() + "/slardar.js");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private n() {
        com.bytedance.android.monitorV2.k.d.a("web", this);
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            Method declaredMethod = cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2);
            i iVar = new i();
            iVar.f24217a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            iVar.f24218b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
            declaredMethod.invoke(null, Proxy.newProxyInstance(iVar.f24217a.getClassLoader(), new Class[]{iVar.f24217a}, iVar));
            Method declaredMethod2 = cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3);
            h hVar = new h();
            hVar.f24215a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            hVar.f24216b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
            declaredMethod2.invoke(null, Proxy.newProxyInstance(hVar.f24215a.getClassLoader(), new Class[]{hVar.f24215a}, hVar));
            Method declaredMethod3 = cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4);
            g gVar = new g();
            gVar.f24213a = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            gVar.f24214b = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
            declaredMethod3.invoke(null, Proxy.newProxyInstance(gVar.f24213a.getClassLoader(), new Class[]{gVar.f24213a}, gVar));
            this.n = true;
        } catch (Exception unused) {
            this.n = false;
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private void H(WebView webView) {
        b bVar = this.f24275l;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    static boolean a(boolean z) {
        if (HybridMultiMonitor.isDebuggable() || z) {
            return true;
        }
        return false;
    }

    private static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final String f(WebView webView) {
        d.a w = w(webView);
        if (w != null) {
            return w.f24191a;
        }
        return "";
    }

    public final a.C0514a s(WebView webView) {
        if (webView == null) {
            return null;
        }
        return a(e(webView));
    }

    private void C(WebView webView) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.f(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private boolean D(WebView webView) {
        e eVar;
        d.a w = w(webView);
        if (w == null || (eVar = w.f24192b) == null) {
            return false;
        }
        return eVar.g(webView);
    }

    private com.bytedance.android.monitorV2.webview.b.d E(WebView webView) {
        try {
            d.a w = w(webView);
            if (w == null) {
                return null;
            }
            return w.f24194d;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private void F(WebView webView) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.e(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private static a.C0514a a(String str) {
        return HybridMultiMonitor.getInstance().getHybridSettingManager().b().a(str);
    }

    public static JSONObject r(WebView webView) {
        return l.a().a(l.a().i(webView));
    }

    private boolean x(WebView webView) {
        e eVar;
        d.a w = w(webView);
        if (w == null || (eVar = w.f24192b) == null) {
            return false;
        }
        return eVar.h(webView);
    }

    private static String z(WebView webView) {
        if (webView == null) {
            return "";
        }
        return new StringBuilder().append(webView.hashCode()).toString();
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void c(WebView webView) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.c(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final void d(WebView webView) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && (eVar = w.f24192b) != null) {
                eVar.d(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final com.bytedance.android.monitorV2.a.e i(WebView webView) {
        try {
            d.a w = w(webView);
            if (w == null) {
                return null;
            }
            return w.f24197g;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void o(WebView webView) {
        try {
            if (b() && g(webView)) {
                n(webView, f24268f);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(WebView webView) {
        try {
            if (b() && g(webView)) {
                a(webView, false);
                E(webView);
                B(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void u(WebView webView) {
        try {
            if (b() && g(webView)) {
                c(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private boolean A(WebView webView) {
        d.a w;
        e eVar;
        if (webView == null) {
            return false;
        }
        try {
            if (!g(webView) || (w = w(webView)) == null || (eVar = w.f24192b) == null) {
                return false;
            }
            return eVar.a(webView);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    private void G(WebView webView) {
        int i2 = Build.VERSION.SDK_INT;
        if (g(webView)) {
            String str = f24267e;
            if (!str.equals(m(webView, str))) {
                WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(webView);
                if (!webView.getSettings().getJavaScriptEnabled()) {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
                String str2 = f24267e;
                b(webView, str2, str2);
            }
        }
    }

    private com.bytedance.android.monitorV2.webview.b.a y(WebView webView) {
        d.a w;
        e eVar;
        try {
            if (b() && g(webView) && (w = w(webView)) != null && (eVar = w.f24192b) != null) {
                return eVar.k(webView);
            }
            return null;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final boolean g(WebView webView) {
        boolean z = false;
        try {
            d.a w = w(webView);
            if (w != null) {
                z = w.f24201k;
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
        if (this.s != z) {
            com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "isNeedMonitor: ".concat(String.valueOf(z)));
            this.s = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final boolean h(WebView webView) {
        try {
            if (w(webView) != null) {
                com.bytedance.android.monitorV2.h.a.e e2 = e();
                com.bytedance.android.monitorV2.i.b.c("HybridMonitor", com.a.a("switch webEnableAutoReport: %b", new Object[]{Boolean.valueOf(e2.f23977l)}));
                if (e2.f23977l) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(WebView webView) {
        e eVar;
        try {
            if (!b() || webView == null) {
                return;
            }
            if (g(webView)) {
                d.a w = w(webView);
                if (w != null && s(webView) != null && (eVar = w.f24192b) != null) {
                    eVar.b(webView);
                    return;
                }
                return;
            }
            l a2 = l.a();
            if (a2 != null) {
                a2.b(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void l(WebView webView) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "destroy: " + com.bytedance.android.monitorV2.i.b.a(webView));
        if (!c()) {
            m(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void n(WebView webView) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "reload: " + com.bytedance.android.monitorV2.i.b.a(webView));
        if (!c()) {
            o(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void p(WebView webView) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "goBack: " + com.bytedance.android.monitorV2.i.b.a(webView));
        if (!c()) {
            q(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.c
    public final boolean v(WebView webView) {
        try {
            return ((Boolean) Class.forName("com.bytedance.lynx.webview.TTWebSdk").getDeclaredMethod("isTTWebView", WebView.class).invoke(null, webView)).booleanValue();
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    private void B(WebView webView) {
        d.a w;
        e eVar;
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleBlankDetect: " + com.bytedance.android.monitorV2.i.b.a(webView));
        try {
            if (!D(webView) && webView != null && webView.getUrl() != null) {
                if (!webView.getUrl().equals("about:blank")) {
                    if (g(webView) && (w = w(webView)) != null && e().c() && s(webView) != null && s(webView) != null && (eVar = w.f24192b) != null && !D(webView)) {
                        eVar.a(webView, com.bytedance.webx.c.a.a(webView));
                    }
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private void I(WebView webView) {
        String str;
        String str2;
        try {
            int i2 = Build.VERSION.SDK_INT;
            String url = webView.getUrl();
            if (url == null || !url.equals("about:blank")) {
                String m2 = m(webView, f24268f);
                if (!TextUtils.isEmpty(url) && !url.equals(m2)) {
                    d.a w = w(webView);
                    if (w == null) {
                        str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                        str2 = "";
                    } else {
                        str = w.o;
                        str2 = w.p;
                    }
                    boolean a2 = a(e().e());
                    if (a2 && e().e()) {
                        webView.evaluateJavascript(com.bytedance.android.monitorV2.webview.e.a.a(webView.getContext(), str2, str, a2), null);
                    }
                    b(webView, f24268f, url);
                    com.bytedance.android.monitorV2.i.b.a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private static String[] c(String str) {
        JSONArray optJSONArray;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str) || (optJSONArray = com.bytedance.android.monitorV2.l.f.a(str).optJSONArray("webview_classes")) == null) {
            return strArr;
        }
        String[] strArr2 = new String[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                strArr2[i2] = optJSONArray.getString(i2);
            } catch (JSONException unused) {
            }
        }
        return strArr2;
    }

    @Override // com.bytedance.android.monitorV2.webview.d
    public final void b(WebView webView) {
        try {
            if (!A(webView)) {
                try {
                    d.a w = w(webView);
                    if (w != null) {
                        e eVar = w.f24192b;
                        if (eVar != null) {
                            eVar.j(webView);
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
                E(webView);
                B(webView);
                j(webView, "loc_after_detach");
                n(webView, f24268f);
                n(webView, f24269g);
                n(webView, f24267e);
                this.f24273i.remove(z(webView));
                b bVar = this.f24275l;
                if (bVar != null && webView != null) {
                    webView.removeOnAttachStateChangeListener(bVar);
                }
            }
        } catch (Exception unused2) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.f
    public final String e(WebView webView) {
        String str;
        d.a w = w(webView);
        String i2 = l.a().i(webView);
        o oVar = l.a().f24233a;
        if (oVar.f24289i.containsKey(i2)) {
            str = oVar.f24289i.get(i2);
        } else {
            str = "";
        }
        com.bytedance.android.monitorV2.i.b.a("WebViewMonitorHelper", "getBid: " + i2 + ", match " + str);
        if (!str.isEmpty()) {
            return str;
        }
        if (w != null) {
            return w.s;
        }
        return "";
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void j(WebView webView) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleViewCreate: " + com.bytedance.android.monitorV2.i.b.a(webView));
        if (!c()) {
            k(webView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void m(WebView webView) {
        try {
            if (b() && g(webView)) {
                a(webView, false);
                E(webView);
                B(webView);
                C(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void t(WebView webView) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", webView.getClass().getSimpleName() + " attachToWindow, container: " + webView.getContext().getClass().getName() + ", isTTWebEnable: " + c());
        if (!c()) {
            u(webView);
        }
    }

    /* access modifiers changed from: package-private */
    public final d.a w(WebView webView) {
        d.a aVar;
        if (webView == null) {
            return null;
        }
        d.a aVar2 = this.f24273i.get(z(webView));
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        d.a aVar3 = this.f24272h.get(name);
        if (aVar3 != null) {
            return aVar3;
        }
        if (this.f24274j.contains(name)) {
            return null;
        }
        for (String str : new HashSet(this.f24272h.keySet())) {
            if (a(name, str) && (aVar = this.f24272h.get(str)) != null) {
                this.f24272h.put(name, aVar);
                return aVar;
            }
        }
        this.f24274j.add(name);
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.d
    public final void a(final WebView webView) {
        if (webView == null) {
            try {
                b((WebView) null);
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        } else {
            a aVar = new a(this, webView, (byte) 0);
            if (D(webView)) {
                this.r.post(aVar);
                return;
            }
            this.r.post(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.n.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14265);
                }

                public final void run() {
                    try {
                        n.this.a(webView, true);
                    } catch (Exception unused) {
                    }
                }
            });
            this.r.postDelayed(aVar, 500);
        }
    }

    static void b(WebView webView, String str) {
        l.a().a(l.a().i(webView), str);
    }

    private void k(WebView webView, String str) {
        if (g(webView)) {
            String str2 = f24269g;
            if (!str2.equals(m(webView, str2))) {
                H(webView);
                String str3 = f24269g;
                b(webView, str3, str3);
            }
            l(webView, str);
        }
    }

    private void l(WebView webView, String str) {
        e eVar;
        try {
            d.a w = w(webView);
            if (w != null && s(webView) != null && (eVar = w.f24192b) != null) {
                eVar.b(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    private static void n(WebView webView, String str) {
        f24270k.remove(str + z(webView));
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void e(WebView webView, String str) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "onPageFinished: ".concat(String.valueOf(str)));
        if (!c()) {
            f(webView, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(WebView webView, String str) {
        try {
            if (!b()) {
                this.f24276m.a(webView, str);
            } else if (g(webView)) {
                F(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void g(WebView webView, String str) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "onLoadUrl: ".concat(String.valueOf(str)));
        if (!c()) {
            h(webView, str);
        }
    }

    private static boolean a(String str, String str2) {
        Class<?> b2 = b(str);
        Class<?> b3 = b(str2);
        if (b2 == null || b3 == null) {
            return false;
        }
        return b3.isAssignableFrom(b2);
    }

    private void c(WebView webView, int i2) {
        d.a w;
        e eVar;
        if (webView != null) {
            try {
                if (g(webView) && x(webView) && (w = w(webView)) != null && (eVar = w.f24192b) != null) {
                    eVar.a(webView, i2);
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    private void d(WebView webView, int i2) {
        if (g(webView) && i2 >= 15 && webView != null) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            I(webView);
        }
    }

    private boolean i(WebView webView, String str) {
        d.a w;
        e eVar;
        if ((!TextUtils.isEmpty(str) && !"about:blank".equals(str)) || (w = w(webView)) == null || (eVar = w.f24192b) == null) {
            return false;
        }
        String i2 = eVar.i(webView);
        if (TextUtils.isEmpty(i2) || i2.equals("about:blank")) {
            return false;
        }
        return true;
        return false;
    }

    private void j(WebView webView, String str) {
        e eVar;
        d.a w = w(webView);
        if (w != null && w.f24203m != null && s(webView) != null && (eVar = w.f24192b) != null) {
            if ("loc_force".equals(str) || "loc_after_detach".equals(str) || w.f24203m.equals(str)) {
                eVar.d(webView, str);
            }
        }
    }

    private static String m(WebView webView, String str) {
        String z = z(webView);
        String str2 = f24270k.get(str + z);
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(z, "");
    }

    /* access modifiers changed from: package-private */
    public final void d(WebView webView, String str) {
        String str2 = null;
        try {
            Matcher matcher = Pattern.compile(f24266d).matcher(webView.getUrl());
            if (matcher.find()) {
                str2 = matcher.group(1).trim();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.android.monitorV2.d.a(str, HybridMultiMonitor.getInstance().getHybridSettingManager().d());
                com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "regexMatcher: ".concat(String.valueOf(str2)));
            }
            if (!TextUtils.isEmpty(str2)) {
                l.a().a(str, str2);
            }
            if (!b()) {
                this.f24276m.a();
            } else {
                k(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(WebView webView, String str) {
        e eVar;
        try {
            if (b() && g(webView) && !str.contains("javascript:")) {
                n(webView, f24268f);
                com.bytedance.android.monitorV2.i.b.a("WebViewMonitorHelper", "onLoadUrl : ".concat(String.valueOf(str)));
                if (i(webView, str)) {
                    a(webView, false);
                    w(webView);
                    B(webView);
                }
                G(webView);
                d.a w = w(webView);
                if (w != null && (eVar = w.f24192b) != null) {
                    eVar.a(webView, str);
                    b(webView, w.s);
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, int i2) {
        try {
            if (b()) {
                d(webView, i2);
                c(webView, i2);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void c(WebView webView, String str) {
        com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "onPageStarted:".concat(String.valueOf(str)));
        if (!c()) {
            d(webView, str);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.g
    public final void a(WebView webView, int i2) {
        if (!c()) {
            b(webView, i2);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.b.f
    public final void b(WebView webView, long j2) {
        String str;
        if (j2 > 0 && webView != null) {
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(webView.getUrl());
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "url", parse.toString());
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "host", parse.getHost());
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "path", parse.getPath());
            String str2 = "true";
            if (!b() || !g(webView)) {
                str = "false";
            } else {
                str = str2;
            }
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "hybrid_monitor_switch", str);
            if (!b() || !e().e()) {
                str2 = "false";
            }
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "js_inject_switch", str2);
            com.bytedance.android.monitorV2.l.f.a(jSONObject, "container_type", "web");
            com.bytedance.android.monitorV2.l.f.a(new JSONObject(), "web_page_cost", j2);
            b(webView, webView.getUrl(), "performance_test", jSONObject.toString());
        }
    }

    private static void b(WebView webView, String str, String str2) {
        f24270k.put(str + z(webView), str2);
    }

    @Override // com.bytedance.android.monitorV2.k.c
    public final void a(View view, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.k.b bVar) {
        try {
            if (b()) {
                com.bytedance.android.monitorV2.f.a.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                      (wrap: com.bytedance.android.monitorV2.webview.l$4 : 0x000e: CONSTRUCTOR  (r0v2 com.bytedance.android.monitorV2.webview.l$4) = 
                      (wrap: com.bytedance.android.monitorV2.webview.l : 0x0007: INVOKE  (r2v0 com.bytedance.android.monitorV2.webview.l) =  type: STATIC call: com.bytedance.android.monitorV2.webview.l.a():com.bytedance.android.monitorV2.webview.l)
                      (null android.webkit.WebView)
                      (r6v0 'bVar' com.bytedance.android.monitorV2.k.b)
                      (r5v0 'aVar' com.bytedance.android.monitorV2.d.a)
                     call: com.bytedance.android.monitorV2.webview.l.4.<init>(com.bytedance.android.monitorV2.webview.l, android.webkit.WebView, com.bytedance.android.monitorV2.k.b, com.bytedance.android.monitorV2.d.a):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.android.monitorV2.f.a.a(java.lang.Runnable):void in method: com.bytedance.android.monitorV2.webview.n.a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r0v2 com.bytedance.android.monitorV2.webview.l$4) = 
                      (wrap: com.bytedance.android.monitorV2.webview.l : 0x0007: INVOKE  (r2v0 com.bytedance.android.monitorV2.webview.l) =  type: STATIC call: com.bytedance.android.monitorV2.webview.l.a():com.bytedance.android.monitorV2.webview.l)
                      (null android.webkit.WebView)
                      (r6v0 'bVar' com.bytedance.android.monitorV2.k.b)
                      (r5v0 'aVar' com.bytedance.android.monitorV2.d.a)
                     call: com.bytedance.android.monitorV2.webview.l.4.<init>(com.bytedance.android.monitorV2.webview.l, android.webkit.WebView, com.bytedance.android.monitorV2.k.b, com.bytedance.android.monitorV2.d.a):void type: CONSTRUCTOR in method: com.bytedance.android.monitorV2.webview.n.a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.monitorV2.webview.l, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                    this = this;
                    boolean r0 = r3.b()     // Catch:{ Exception -> 0x0015 }
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    com.bytedance.android.monitorV2.webview.l r2 = com.bytedance.android.monitorV2.webview.l.a()     // Catch:{ Exception -> 0x0015 }
                    r1 = 0
                    com.bytedance.android.monitorV2.webview.l$4 r0 = new com.bytedance.android.monitorV2.webview.l$4     // Catch:{ Exception -> 0x0015 }
                    r0.<init>(r1, r6, r5)     // Catch:{ Exception -> 0x0015 }
                    com.bytedance.android.monitorV2.f.a.a(r0)     // Catch:{ Exception -> 0x0015 }
                    return
                L_0x0015:
                    com.bytedance.android.monitorV2.HybridMultiMonitor r0 = com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance()
                    r0.getExceptionHandler()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.n.a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void");
            }

            /* access modifiers changed from: package-private */
            public final void b(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                d.a w;
                e eVar;
                try {
                    if (b() && webView != null && webResourceRequest != null && webResourceError != null) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            if (g(webView) && x(webView) && (w = w(webView)) != null) {
                                if (a(w.f24200j)) {
                                    if (s(webView) != null && (eVar = w.f24192b) != null) {
                                        eVar.a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), 0);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }

            /* access modifiers changed from: package-private */
            public final void b(WebView webView, int i2, String str, String str2) {
                d.a w;
                e eVar;
                try {
                    if (b() && webView != null && str != null && str2 != null) {
                        if (Build.VERSION.SDK_INT < 23) {
                            if (g(webView) && x(webView) && (w = w(webView)) != null) {
                                if (a(w.f24200j)) {
                                    if (s(webView) != null && (eVar = w.f24192b) != null) {
                                        eVar.a(webView, str2, true, i2, str, 0);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }

            @Override // com.bytedance.android.monitorV2.webview.b.g
            public final void a(WebView webView, int i2, String str, String str2) {
                com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "handleRequestError: " + com.bytedance.android.monitorV2.i.b.a(webView) + ", errorCode: " + i2);
                if (!c()) {
                    b(webView, i2, str, str2);
                }
            }

            private void a(WebView webView, b bVar, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i2) {
                JSONObject jSONObject5;
                JSONObject jSONObject6;
                JSONObject jSONObject7 = jSONObject4;
                com.bytedance.android.monitorV2.i.b.b("WebViewMonitorHelper", "custom final: bid: " + str + ", url: " + str2 + ", eventName: " + ((String) null));
                if (jSONObject7 == null) {
                    jSONObject7 = new JSONObject();
                }
                if (TextUtils.isEmpty(str) && webView != null) {
                    str = e(webView);
                }
                k l2 = l.a().l(webView);
                if (l2 != null) {
                    if (l2.f24222a != null) {
                        jSONObject6 = l2.f24222a.a();
                    } else {
                        jSONObject6 = null;
                    }
                    if (l2.f24225d != null) {
                        jSONObject5 = l2.f24225d.a();
                    } else {
                        jSONObject5 = null;
                    }
                } else {
                    jSONObject5 = null;
                    jSONObject6 = null;
                }
                a.C0514a a2 = a(str);
                JSONObject jSONObject8 = new JSONObject();
                com.bytedance.android.monitorV2.l.f.a(jSONObject8, "bid", str);
                com.bytedance.android.monitorV2.l.f.a(jSONObject8, "setting_bid", a2.f23925a);
                com.bytedance.android.monitorV2.l.f.a(jSONObject8, "hit_sample", a2.f23926b);
                com.bytedance.android.monitorV2.l.f.a(jSONObject8, "setting_id", a2.f23927c);
                com.bytedance.android.monitorV2.l.f.a(jSONObject8, "can_sample", 0);
                com.bytedance.android.monitorV2.l.f.a(jSONObject7, "platform", 0);
                d.a aVar = new d.a(null);
                aVar.f23861b = str;
                aVar.f23865f = jSONObject8;
                aVar.f23860a = str2;
                aVar.f23862c = jSONObject;
                aVar.f23863d = jSONObject2;
                aVar.f23864e = jSONObject3;
                aVar.f23867h = jSONObject7;
                d.a a3 = aVar.a(0);
                a3.f23871l = bVar;
                a3.f23868i = jSONObject6;
                a3.f23869j = jSONObject5;
                HybridMultiMonitor.getInstance().customReportInner(a3.a());
            }
        }
