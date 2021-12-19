package com.bytedance.android.monitor.webview;

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
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.android.monitor.d.d;
import com.bytedance.android.monitor.d.e;
import com.bytedance.android.monitor.d.f;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements c, e {

    /* renamed from: a  reason: collision with root package name */
    public static c f23764a;

    /* renamed from: b  reason: collision with root package name */
    public static e f23765b;

    /* renamed from: d  reason: collision with root package name */
    private static String f23766d = "ttlive_web_view_tag";

    /* renamed from: e  reason: collision with root package name */
    private static String f23767e = "ttlive_web_view_last_url_tag";

    /* renamed from: f  reason: collision with root package name */
    private static String f23768f = "ttlive_web_view_auto_report_tag";

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, String> f23769j = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.monitor.webview.d.a f23770c;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, c.a> f23771g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, c.a> f23772h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f23773i = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    private b f23774k = new b((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.android.monitor.webview.a.a f23775l = new com.bytedance.android.monitor.webview.a.a();

    /* renamed from: m  reason: collision with root package name */
    private boolean f23776m = false;
    private boolean n = true;
    private boolean o = false;
    private boolean p = false;
    private Handler q = new Handler(Looper.getMainLooper());
    private boolean r = false;

    /* access modifiers changed from: package-private */
    public static class b implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(14079);
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
                i.f23765b.c((WebView) view);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                i.f23765b.d(webView);
                if (i.f23765b.h(webView)) {
                    i.f23764a.a(webView);
                }
            }
        }
    }

    public static c a() {
        return f23764a;
    }

    public final boolean b() {
        boolean z = this.n && e().f23528a;
        if (this.r != z) {
            com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "monitor enabled: ".concat(String.valueOf(z)));
            this.r = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void a(WebView webView, d dVar) {
        c.a v;
        d dVar2;
        try {
            if (!b() || webView == null || !g(webView) || !w(webView) || (v = v(webView)) == null) {
                return;
            }
            if (a(v.n)) {
                if (e().f23530c && (dVar2 = v.f23690b) != null) {
                    dVar2.a(webView, dVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleRequestHttpError: " + com.bytedance.android.monitor.h.b.a(webView) + ", request: " + webResourceRequest);
        if (!c()) {
            b(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        c.a v;
        try {
            if (b() && webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (g(webView) && w(webView) && (v = v(webView)) != null) {
                        if (a(v.f23700l)) {
                            d dVar = v.f23690b;
                            if (dVar != null) {
                                dVar.a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), 0, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.h
    public final void a(WebView webView, e eVar) {
        c.a v;
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleJSBError: " + com.bytedance.android.monitor.h.b.a(webView));
        try {
            if (!b() || webView == null || !g(webView) || !w(webView) || (v = v(webView)) == null) {
                return;
            }
            if (a(v.f23701m)) {
                if (e().f23531d && (dVar = v.f23690b) != null) {
                    dVar.a(webView, eVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.h
    public final void a(WebView webView, f fVar) {
        c.a v;
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleJSBInfo: " + com.bytedance.android.monitor.h.b.a(webView));
        try {
            if (!b() || webView == null || !g(webView) || !w(webView) || (v = v(webView)) == null) {
                return;
            }
            if (a(v.f23701m)) {
                if (e().f23531d && (dVar = v.f23690b) != null) {
                    dVar.a(webView, fVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    public final void a(WebView webView, boolean z) {
        c.a v = v(webView);
        if (v != null && g(webView) && a(v.o) && !C(webView)) {
            String a2 = com.a.a(" javascript: (function () {\n    var target = {}\n    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n    var performacess = SlardarHybrid('getLatestPerformance');\n    var resourcess = SlardarHybrid('getLatestResource');\n    target.performance = performacess;\n    target.resource = resourcess;\n    target.needReport = %s;\n    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n })()", new Object[]{z ? "true" : "false"});
            if (webView != null) {
                int i2 = Build.VERSION.SDK_INT;
                webView.evaluateJavascript(a2, null);
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.c
    public final void b(c.a aVar) {
        try {
            a(aVar);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void b(WebView webView, String str) {
        try {
            c(webView, str);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.g
    public final void a(WebView webView, String str, String str2, String str3, String str4, String str5) {
        a(webView, str, str2, com.bytedance.android.monitor.l.d.a(str3), com.bytedance.android.monitor.l.d.a(str4), com.bytedance.android.monitor.l.d.a(str5), (JSONObject) null, true);
    }

    @Override // com.bytedance.android.monitor.webview.b.g
    public final void a(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        b(webView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    @Override // com.bytedance.android.monitor.webview.b.g
    public final void a(WebView webView, com.bytedance.android.monitor.d.c cVar) {
        com.bytedance.android.monitor.webview.b.b x;
        if (!(webView == null || (x = x(webView)) == null)) {
            if (TextUtils.isEmpty(cVar.f23431b)) {
                cVar.f23431b = x.b();
            }
            if (TextUtils.isEmpty(cVar.f23430a)) {
                cVar.f23430a = x.c();
            }
            if (TextUtils.isEmpty(cVar.f23438i)) {
                cVar.f23438i = x.a();
            }
            c.a v = v(webView);
            if (!(v == null || v.f23697i == null)) {
                cVar.f23440k = v.f23697i;
            }
        }
        com.bytedance.android.monitor.l.d.a(cVar.f23437h, "platform", 0);
        HybridMonitor.getInstance().customReport(cVar);
    }

    @Override // com.bytedance.android.monitor.webview.b.c
    public final void a(String str) {
        try {
            Map<String, c.a> map = this.f23772h;
            if (map != null) {
                map.remove(str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.h
    public final void a(WebView webView, String str, JSONObject jSONObject) {
        c.a v;
        d dVar;
        try {
            if (b() && g(webView) && (v = v(webView)) != null && (dVar = v.f23690b) != null) {
                dVar.a(webView, str, jSONObject);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.a
    public final void a(final WebView webView, final String str, Object obj) {
        final String valueOf = String.valueOf(obj);
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14076);
            }

            public final void run() {
                c.a v;
                d dVar;
                try {
                    if (i.this.b() && i.this.g(webView) && (v = i.this.v(webView)) != null && (dVar = v.f23690b) != null) {
                        dVar.a(webView, str, (Object) valueOf);
                    }
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void a(WebView webView, String str, String str2, String str3) {
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "cover: url: " + str + ", service: " + str2);
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.a(webView, str, str2, str3);
                j(webView, "loc_after_tti");
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void a(WebView webView, String str, String str2) {
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "report direct: eventType: ".concat(String.valueOf(str)));
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.a(webView, str, str2);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void a(WebView webView, String str) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.c(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.d
    public final void a(c.a aVar) {
        d a2;
        String[] c2;
        boolean a3;
        boolean a4;
        try {
            c.a aVar2 = new c.a();
            aVar.y = aVar.y;
            if (aVar.f23690b != null) {
                a2 = aVar.f23690b;
            } else {
                a2 = f.a();
            }
            aVar2.f23690b = a2;
            aVar2.f23695g = aVar.f23695g != null ? aVar.f23695g : "WebViewMonitor";
            aVar2.f23689a = aVar.f23689a;
            aVar2.f23697i = aVar.f23697i;
            aVar2.f23696h = aVar.f23696h;
            aVar2.q = aVar.q;
            aVar2.r = aVar.r;
            aVar2.s = aVar.s;
            aVar2.v = f();
            aVar2.p = aVar.p;
            aVar2.t = aVar.t;
            aVar2.f23694f = aVar.f23694f;
            aVar2.f23693e = aVar.f23693e;
            aVar2.f23691c = aVar.f23691c;
            aVar2.f23692d = aVar.f23692d;
            aVar2.y = aVar.y;
            aVar2.u = TextUtils.isEmpty(aVar.u) ? "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});" : aVar.u;
            aVar2.w = aVar.w;
            aVar2.f23699k = aVar.f23699k;
            aVar2.f23700l = aVar.f23700l;
            aVar2.n = aVar.n;
            aVar2.f23701m = aVar.f23701m;
            aVar2.o = aVar.o;
            aVar2.z = aVar.z;
            if (!TextUtils.isEmpty(aVar.f23698j)) {
                JSONObject a5 = com.bytedance.android.monitor.l.d.a(aVar.f23698j);
                if (com.bytedance.android.monitor.l.d.d(a5, "webview_classes") == null) {
                    c2 = aVar2.f23693e;
                } else {
                    c2 = c(aVar.f23698j);
                }
                aVar2.f23693e = c2;
                if (com.bytedance.android.monitor.l.d.d(a5, "webview_is_need_monitor") == null) {
                    a3 = aVar2.p;
                } else {
                    a3 = com.bytedance.android.monitor.l.d.a(com.bytedance.android.monitor.l.d.a(aVar.f23698j), "webview_is_need_monitor", (Boolean) false);
                }
                aVar2.p = a3;
                aVar2.u = TextUtils.isEmpty(aVar.f23698j) ? aVar2.u : new g(aVar.f23698j).a();
                aVar2.f23699k = com.bytedance.android.monitor.l.d.d(a5, "webview_is_open_blankdetect") == null ? aVar2.f23699k : com.bytedance.android.monitor.l.d.a(a5, "webview_is_open_blankdetect", (Boolean) false);
                aVar2.f23701m = com.bytedance.android.monitor.l.d.d(a5, "webview_is_open_jsb") == null ? aVar2.f23701m : com.bytedance.android.monitor.l.d.a(a5, "webview_is_open_jsb", (Boolean) false);
                aVar2.n = com.bytedance.android.monitor.l.d.d(a5, "webview_is_open_fetch") == null ? aVar2.n : com.bytedance.android.monitor.l.d.a(a5, "webview_is_open_fetch", (Boolean) false);
                aVar2.t = com.bytedance.android.monitor.l.d.d(a5, "webview_is_inject_js") == null ? aVar2.t : com.bytedance.android.monitor.l.d.a(a5, "webview_is_inject_js", (Boolean) false);
                if (com.bytedance.android.monitor.l.d.d(a5, "webview_is_update_page_data") == null) {
                    a4 = aVar2.o;
                } else {
                    a4 = com.bytedance.android.monitor.l.d.a(a5, "webview_is_update_page_data", (Boolean) false);
                }
                aVar2.o = a4;
            }
            String[] strArr = aVar2.f23694f;
            if (!(strArr == null || strArr.length == 0)) {
                for (String str : strArr) {
                    this.f23772h.put(str, aVar2);
                }
            }
            String[] strArr2 = aVar2.f23693e;
            if (!(strArr2 == null || strArr2.length == 0)) {
                for (String str2 : strArr2) {
                    this.f23771g.put(str2, aVar2);
                }
            }
            this.f23773i.clear();
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private WebView f23784b;

        static {
            Covode.recordClassIndex(14078);
        }

        public final void run() {
            i.this.b(this.f23784b);
        }

        private a(WebView webView) {
            this.f23784b = webView;
        }

        /* synthetic */ a(i iVar, WebView webView, byte b2) {
            this(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.d
    public final c.a d() {
        return new c.a();
    }

    private static com.bytedance.android.monitor.j.d e() {
        return HybridMonitor.getInstance().getSettingManager().b();
    }

    public final boolean c() {
        if (!this.o || !this.f23776m) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(14075);
        i iVar = new i();
        f23764a = iVar;
        f23765b = iVar;
    }

    private String f() {
        if (this.f23770c == null) {
            return null;
        }
        try {
            File file = new File(this.f23770c.a() + "/slardar.js");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private i() {
        com.bytedance.android.monitor.k.c.a("web", this);
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            Method declaredMethod = cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2);
            l lVar = new l();
            lVar.f23789a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            lVar.f23790b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
            declaredMethod.invoke(null, Proxy.newProxyInstance(lVar.f23789a.getClassLoader(), new Class[]{lVar.f23789a}, lVar));
            Method declaredMethod2 = cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3);
            k kVar = new k();
            kVar.f23787a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            kVar.f23788b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
            declaredMethod2.invoke(null, Proxy.newProxyInstance(kVar.f23787a.getClassLoader(), new Class[]{kVar.f23787a}, kVar));
            Method declaredMethod3 = cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4);
            j jVar = new j();
            jVar.f23785a = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            jVar.f23786b = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
            declaredMethod3.invoke(null, Proxy.newProxyInstance(jVar.f23785a.getClassLoader(), new Class[]{jVar.f23785a}, jVar));
            this.f23776m = true;
        } catch (Exception unused) {
            this.f23776m = false;
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private void G(WebView webView) {
        b bVar = this.f23774k;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    private static boolean a(boolean z) {
        if (HybridMonitor.isDebuggable() || z) {
            return true;
        }
        return false;
    }

    private static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final String f(WebView webView) {
        c.a v = v(webView);
        if (v != null) {
            return v.f23689a;
        }
        return "";
    }

    private void A(WebView webView) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.f(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private boolean B(WebView webView) {
        try {
            c.a v = v(webView);
            if (v == null) {
                return false;
            }
            return v.t;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    private boolean C(WebView webView) {
        d dVar;
        c.a v = v(webView);
        if (v == null || (dVar = v.f23690b) == null) {
            return false;
        }
        return dVar.g(webView);
    }

    private com.bytedance.android.monitor.webview.b.f D(WebView webView) {
        try {
            c.a v = v(webView);
            if (v == null) {
                return null;
            }
            return v.f23692d;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private void E(WebView webView) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.e(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private boolean w(WebView webView) {
        d dVar;
        c.a v = v(webView);
        if (v == null || (dVar = v.f23690b) == null) {
            return false;
        }
        return dVar.h(webView);
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void c(WebView webView) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.c(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void d(WebView webView) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.d(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final String e(WebView webView) {
        c.a v = v(webView);
        if (v != null) {
            return v.y;
        }
        return "";
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final boolean h(WebView webView) {
        try {
            c.a v = v(webView);
            if (v == null || !v.q) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final com.bytedance.android.monitor.b.e i(WebView webView) {
        try {
            c.a v = v(webView);
            if (v == null) {
                return null;
            }
            return v.f23696h;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void o(WebView webView) {
        try {
            if (b() && g(webView)) {
                n(webView, f23767e);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(WebView webView) {
        try {
            if (b() && g(webView)) {
                a(webView, false);
                D(webView);
                z(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(WebView webView) {
        try {
            if (b() && g(webView)) {
                c(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.c
    public final String t(WebView webView) {
        if (webView == null) {
            return "";
        }
        return new StringBuilder().append(webView.hashCode()).toString();
    }

    private void F(WebView webView) {
        int i2 = Build.VERSION.SDK_INT;
        if (g(webView)) {
            String str = f23766d;
            if (!str.equals(m(webView, str))) {
                WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(webView);
                if (!webView.getSettings().getJavaScriptEnabled()) {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
                String str2 = f23766d;
                b(webView, str2, str2);
            }
        }
    }

    private com.bytedance.android.monitor.webview.b.b x(WebView webView) {
        c.a v;
        d dVar;
        try {
            if (b() && g(webView) && (v = v(webView)) != null && (dVar = v.f23690b) != null) {
                return dVar.k(webView);
            }
            return null;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
        return null;
    }

    private boolean y(WebView webView) {
        c.a v;
        d dVar;
        if (webView == null) {
            return false;
        }
        try {
            if (!g(webView) || (v = v(webView)) == null || (dVar = v.f23690b) == null) {
                return false;
            }
            return dVar.a(webView);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    @Override // com.bytedance.android.monitor.webview.c
    public final void a(final WebView webView) {
        if (webView == null) {
            try {
                b((WebView) null);
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            a aVar = new a(this, webView, (byte) 0);
            if (C(webView)) {
                this.q.post(aVar);
                return;
            }
            this.q.post(new Runnable() {
                /* class com.bytedance.android.monitor.webview.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14077);
                }

                public final void run() {
                    try {
                        i.this.a(webView, true);
                    } catch (Exception unused) {
                    }
                }
            });
            this.q.postDelayed(aVar, 500);
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final boolean g(WebView webView) {
        boolean z = false;
        try {
            c.a v = v(webView);
            if (v != null) {
                z = v.p;
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
        if (this.r != z) {
            com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "isNeedMonitor: ".concat(String.valueOf(z)));
            this.r = z;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void k(WebView webView) {
        d dVar;
        try {
            if (!b() || webView == null) {
                return;
            }
            if (g(webView)) {
                c.a v = v(webView);
                if (v != null && (dVar = v.f23690b) != null) {
                    dVar.b(webView);
                    return;
                }
                return;
            }
            f a2 = f.a();
            if (a2 != null) {
                a2.b(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void l(WebView webView) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "destroy: " + com.bytedance.android.monitor.h.b.a(webView));
        if (!c()) {
            m(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void n(WebView webView) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "reload: " + com.bytedance.android.monitor.h.b.a(webView));
        if (!c()) {
            o(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void p(WebView webView) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "goBack: " + com.bytedance.android.monitor.h.b.a(webView));
        if (!c()) {
            q(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.e
    public final boolean u(WebView webView) {
        try {
            return ((Boolean) Class.forName("com.bytedance.lynx.webview.TTWebSdk").getDeclaredMethod("isTTWebView", WebView.class).invoke(null, webView)).booleanValue();
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    private void H(WebView webView) {
        String str;
        String str2;
        try {
            int i2 = Build.VERSION.SDK_INT;
            String url = webView.getUrl();
            if (url == null || !url.equals("about:blank")) {
                String m2 = m(webView, f23767e);
                if (!TextUtils.isEmpty(url) && !url.equals(m2)) {
                    c.a v = v(webView);
                    if (v == null) {
                        str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                        str2 = "";
                    } else {
                        str = v.u;
                        str2 = v.v;
                        if (a(v.t)) {
                        }
                        b(webView, f23767e, url);
                        com.bytedance.android.monitor.h.b.a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                    }
                    if (e().f23532e) {
                        webView.evaluateJavascript(com.bytedance.android.monitor.webview.e.a.a(webView.getContext(), str2, str), null);
                    }
                    b(webView, f23767e, url);
                    com.bytedance.android.monitor.h.b.a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private static String[] c(String str) {
        JSONArray optJSONArray;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str) || (optJSONArray = com.bytedance.android.monitor.l.d.a(str).optJSONArray("webview_classes")) == null) {
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

    private void z(WebView webView) {
        c.a v;
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleBlankDetect: " + com.bytedance.android.monitor.h.b.a(webView));
        try {
            if (!C(webView) && webView != null && webView.getUrl() != null) {
                if (!webView.getUrl().equals("about:blank")) {
                    if (g(webView) && (v = v(webView)) != null && a(v.f23699k) && e().f23529b && (dVar = v.f23690b) != null && !C(webView)) {
                        dVar.a(webView, com.bytedance.webx.c.a.a(webView));
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void j(WebView webView) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleViewCreate: " + com.bytedance.android.monitor.h.b.a(webView));
        if (!c()) {
            k(webView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void m(WebView webView) {
        try {
            if (b() && g(webView)) {
                a(webView, false);
                D(webView);
                z(webView);
                A(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void r(WebView webView) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", webView.getClass().getSimpleName() + " attachToWindow, container: " + webView.getContext().getClass().getName() + ", isTTWebEnable: " + c());
        if (!c()) {
            s(webView);
        }
    }

    public final c.a v(WebView webView) {
        c.a aVar;
        if (webView == null) {
            return null;
        }
        c.a aVar2 = this.f23772h.get(t(webView));
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        c.a aVar3 = this.f23771g.get(name);
        if (aVar3 != null) {
            return aVar3;
        }
        if (this.f23773i.contains(name)) {
            return null;
        }
        for (String str : new HashSet(this.f23771g.keySet())) {
            if (a(name, str) && (aVar = this.f23771g.get(str)) != null) {
                this.f23771g.put(name, aVar);
                return aVar;
            }
        }
        this.f23773i.add(name);
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.c
    public final void b(WebView webView) {
        try {
            if (!y(webView)) {
                try {
                    c.a v = v(webView);
                    if (v != null) {
                        d dVar = v.f23690b;
                        if (dVar != null) {
                            dVar.j(webView);
                        }
                    }
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
                D(webView);
                z(webView);
                j(webView, "loc_after_detach");
                n(webView, f23767e);
                n(webView, f23768f);
                n(webView, f23766d);
                this.f23772h.remove(t(webView));
                b bVar = this.f23774k;
                if (bVar != null && webView != null) {
                    webView.removeOnAttachStateChangeListener(bVar);
                }
            }
        } catch (Exception unused2) {
            HybridMonitor.getInstance().getExceptionHandler();
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

    private void k(WebView webView, String str) {
        if (g(webView)) {
            String str2 = f23768f;
            if (!str2.equals(m(webView, str2))) {
                G(webView);
                String str3 = f23768f;
                b(webView, str3, str3);
            }
            l(webView, str);
        }
    }

    private void l(WebView webView, String str) {
        d dVar;
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.b(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private void n(WebView webView, String str) {
        f23769j.remove(str + t(webView));
    }

    /* access modifiers changed from: package-private */
    public final void f(WebView webView, String str) {
        try {
            if (!b()) {
                this.f23775l.a(webView, str);
            } else if (g(webView)) {
                E(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void g(WebView webView, String str) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "onLoadUrl: ".concat(String.valueOf(str)));
        if (!c()) {
            h(webView, str);
        }
    }

    private void c(WebView webView, int i2) {
        c.a v;
        d dVar;
        if (webView != null) {
            try {
                if (g(webView) && w(webView) && (v = v(webView)) != null && (dVar = v.f23690b) != null) {
                    dVar.a(webView, i2);
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    private void d(WebView webView, int i2) {
        if (g(webView) && i2 >= 15 && webView != null) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            H(webView);
        }
    }

    private boolean i(WebView webView, String str) {
        c.a v;
        d dVar;
        if ((!TextUtils.isEmpty(str) && !"about:blank".equals(str)) || (v = v(webView)) == null || (dVar = v.f23690b) == null) {
            return false;
        }
        String i2 = dVar.i(webView);
        if (TextUtils.isEmpty(i2) || i2.equals("about:blank")) {
            return false;
        }
        return true;
        return false;
    }

    private void j(WebView webView, String str) {
        d dVar;
        c.a v = v(webView);
        if (v != null && v.s != null && (dVar = v.f23690b) != null) {
            if ("loc_force".equals(str) || "loc_after_detach".equals(str) || v.s.equals(str)) {
                dVar.d(webView, str);
            }
        }
    }

    private String m(WebView webView, String str) {
        String t = t(webView);
        String str2 = f23769j.get(str + t);
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(t, "");
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, int i2) {
        try {
            if (b()) {
                d(webView, i2);
                c(webView, i2);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void e(WebView webView, String str) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "onPageFinished: ".concat(String.valueOf(str)));
        if (!c()) {
            f(webView, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(WebView webView, String str) {
        try {
            if (!b()) {
                this.f23775l.a();
            } else {
                k(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(WebView webView, String str) {
        d dVar;
        try {
            if (b() && g(webView) && !str.contains("javascript:")) {
                n(webView, f23767e);
                com.bytedance.android.monitor.h.b.a("TTLiveWebViewMonitorHelper", "onLoadUrl : ".concat(String.valueOf(str)));
                if (i(webView, str)) {
                    a(webView, false);
                    v(webView);
                    z(webView);
                }
                F(webView);
                c.a v = v(webView);
                if (v != null && (dVar = v.f23690b) != null) {
                    dVar.a(webView, str);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void a(WebView webView, int i2) {
        if (!c()) {
            b(webView, i2);
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void c(WebView webView, String str) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "onPageStarted:".concat(String.valueOf(str)));
        if (!c()) {
            d(webView, str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.e
    public final void a(WebView webView, long j2) {
        d dVar;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "injectJS: " + com.bytedance.android.monitor.h.b.a(webView));
        try {
            c.a v = v(webView);
            if (v != null && (dVar = v.f23690b) != null) {
                dVar.a(webView, j2);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.h
    public final void b(WebView webView, long j2) {
        String str;
        if (j2 > 0 && webView != null) {
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(webView.getUrl());
            com.bytedance.android.monitor.l.d.a(jSONObject, "url", parse.toString());
            com.bytedance.android.monitor.l.d.a(jSONObject, "host", parse.getHost());
            com.bytedance.android.monitor.l.d.a(jSONObject, "path", parse.getPath());
            String str2 = "true";
            if (!b() || !g(webView)) {
                str = "false";
            } else {
                str = str2;
            }
            com.bytedance.android.monitor.l.d.a(jSONObject, "hybrid_monitor_switch", str);
            if (!b() || !B(webView)) {
                str2 = "false";
            }
            com.bytedance.android.monitor.l.d.a(jSONObject, "js_inject_switch", str2);
            com.bytedance.android.monitor.l.d.a(jSONObject, "container_type", "web");
            JSONObject jSONObject2 = new JSONObject();
            com.bytedance.android.monitor.l.d.a(jSONObject2, "web_page_cost", j2);
            a(webView, webView.getUrl(), "performance_test", jSONObject.toString(), jSONObject2.toString(), null);
        }
    }

    private void b(WebView webView, String str, String str2) {
        f23769j.put(str + t(webView), str2);
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleRequestError: " + com.bytedance.android.monitor.h.b.a(webView) + ", error: " + webResourceError);
        if (!c()) {
            b(webView, webResourceRequest, webResourceError);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        c.a v;
        try {
            if (b() && webView != null && webResourceRequest != null && webResourceError != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (g(webView) && w(webView) && (v = v(webView)) != null) {
                        if (a(v.f23700l)) {
                            d dVar = v.f23690b;
                            if (dVar != null) {
                                dVar.a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.b.i
    public final void a(WebView webView, int i2, String str, String str2) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "handleRequestError: " + com.bytedance.android.monitor.h.b.a(webView) + ", errorCode: " + i2);
        if (!c()) {
            b(webView, i2, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, int i2, String str, String str2) {
        c.a v;
        try {
            if (b() && webView != null && str != null && str2 != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    if (g(webView) && w(webView) && (v = v(webView)) != null) {
                        if (a(v.f23700l)) {
                            d dVar = v.f23690b;
                            if (dVar != null) {
                                dVar.a(webView, str2, true, i2, str, 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    private static void a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        a(null, str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    private void b(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        JSONObject jSONObject5 = jSONObject4;
        String str3 = str;
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "customReportInner: url: " + str3 + ", eventName: " + str2);
        if (webView != null) {
            String str4 = "";
            try {
                com.bytedance.android.monitor.webview.b.b x = x(webView);
                if (x != null) {
                    if (jSONObject5 == null) {
                        jSONObject5 = new JSONObject();
                    }
                    com.bytedance.android.monitor.l.d.a(jSONObject5, "virtual_aid", x.a());
                    str4 = x.b();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = x.c();
                    }
                }
                a aVar = null;
                c.a v = v(webView);
                if (v != null) {
                    aVar = v.f23697i;
                }
                a(aVar, str4, str3, str2, jSONObject, jSONObject2, jSONObject3, jSONObject5, z);
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            a("", str3, str2, jSONObject, jSONObject2, jSONObject3, jSONObject5, z);
        }
    }

    private static void a(a aVar, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        com.bytedance.android.monitor.h.b.b("TTLiveWebViewMonitorHelper", "custom final: biz: " + str + ", url: " + str2 + ", eventName: " + str3);
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        com.bytedance.android.monitor.l.d.a(jSONObject4, "platform", 0);
        c.a aVar2 = new c.a(str3);
        aVar2.f23442b = str;
        aVar2.f23441a = str2;
        aVar2.f23443c = jSONObject;
        aVar2.f23444d = jSONObject2;
        aVar2.f23445e = jSONObject3;
        aVar2.f23447g = jSONObject4;
        aVar2.f23448h = z;
        aVar2.f23449i = aVar;
        HybridMonitor.getInstance().customReport(aVar2.a());
    }
}
