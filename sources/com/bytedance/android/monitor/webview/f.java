package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.f.a;
import com.bytedance.android.monitor.h.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.l.i;
import com.bytedance.android.monitor.webview.b.e;
import com.bytedance.android.monitor.webview.c.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.c.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public class f implements d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f23737b;

    /* renamed from: a  reason: collision with root package name */
    public o f23738a = new o();

    /* renamed from: c  reason: collision with root package name */
    private m f23739c = new m();

    /* renamed from: d  reason: collision with root package name */
    private Map<WebView, List<n>> f23740d = new WeakHashMap();

    static {
        Covode.recordClassIndex(14067);
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final boolean a(WebView webView) {
        Boolean bool = this.f23738a.f23809h.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, String str) {
        o oVar = this.f23738a;
        if (oVar.f23803b.get(webView) != null) {
            oVar.f23804c.put(webView, true);
        }
        oVar.f23803b.put(webView, Long.valueOf(System.currentTimeMillis()));
        oVar.f23802a.put(webView, str);
        b.a("WebviewCache", "handleLoadUrl: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(final WebView webView, final String str, final boolean z, final int i2, final String str2, final int i3) {
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14068);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                d.a(jSONObject, "event_type", "nativeError");
                d.a(jSONObject, "error_code", i2);
                d.a(jSONObject, "error_msg", str2);
                if (z) {
                    str = "main_frame";
                } else {
                    str = "child_resource";
                }
                d.a(jSONObject, "scene", str);
                d.a(jSONObject, "error_url", str);
                d.a(jSONObject, "http_status", i3);
                f.this.b(webView, "nativeError", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleRequestError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, String str, String str2, String str3) {
        n e2 = e(webView, str);
        if (e2 != null && !TextUtils.isEmpty(str2)) {
            e2.a().b(d.a(str3));
        }
        b.a("MonitorCacheInfoHandler", "cover: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, String str, String str2) {
        String b2 = d.b(d.a(str2), "url");
        if (TextUtils.isEmpty(b2)) {
            n l2 = l(webView);
            if (l2 != null) {
                l2.a(webView, str, d.a(str2));
                l2.a(str);
                return;
            }
            return;
        }
        n e2 = e(webView, b2);
        if (e2 != null && e2.b(str)) {
            e2.a(webView, str, d.a(str2));
            e2.a(str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, String str, JSONObject jSONObject) {
        com.bytedance.android.monitor.webview.c.a.b bVar;
        n l2 = l(webView);
        if (l2 != null && (bVar = l2.f23794c.get(str)) != null) {
            bVar.a(jSONObject);
        }
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, String str, Object obj) {
        n l2 = l(webView);
        if (l2 != null) {
            l2.f23792a.a(str, obj);
        }
    }

    private f() {
    }

    public static f a() {
        MethodCollector.i(6637);
        if (f23737b == null) {
            synchronized (f.class) {
                try {
                    if (f23737b == null) {
                        f23737b = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6637);
                    throw th;
                }
            }
        }
        f fVar = f23737b;
        MethodCollector.o(6637);
        return fVar;
    }

    private JSONObject n(WebView webView) {
        return this.f23738a.a(webView);
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final com.bytedance.android.monitor.webview.b.b k(final WebView webView) {
        return new com.bytedance.android.monitor.webview.b.b() {
            /* class com.bytedance.android.monitor.webview.f.AnonymousClass5 */

            static {
                Covode.recordClassIndex(14072);
            }

            @Override // com.bytedance.android.monitor.webview.b.b
            public final String a() {
                return i.f23765b.f(webView);
            }

            @Override // com.bytedance.android.monitor.webview.b.b
            public final String b() {
                return i.f23765b.e(webView);
            }

            @Override // com.bytedance.android.monitor.webview.b.b
            public final String c() {
                n l2 = f.this.l(webView);
                if (l2 != null) {
                    return l2.f23792a.f23490a;
                }
                o oVar = f.this.f23738a;
                return oVar.f23802a.get(webView);
            }
        };
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void f(WebView webView) {
        this.f23738a.f23808g.put(webView, true);
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final boolean h(WebView webView) {
        if (l(webView) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final String i(WebView webView) {
        n l2 = l(webView);
        if (l2 != null) {
            return l2.f23792a.f23490a;
        }
        return null;
    }

    private synchronized List<n> m(WebView webView) {
        List<n> remove;
        MethodCollector.i(6866);
        remove = this.f23740d.remove(webView);
        MethodCollector.o(6866);
        return remove;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void b(WebView webView) {
        this.f23738a.f23805d.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewCreate: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void c(WebView webView) {
        this.f23738a.f23806e.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewAttach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void d(WebView webView) {
        this.f23738a.f23807f.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewDetach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final boolean g(WebView webView) {
        Boolean bool = this.f23738a.f23808g.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void j(WebView webView) {
        n l2 = l(webView);
        if (l2 != null) {
            l2.a().n();
        }
        b.a("MonitorCacheInfoHandler", "handlePageExit: ".concat(String.valueOf(webView)));
    }

    public final synchronized n l(WebView webView) {
        MethodCollector.i(6642);
        List<n> list = this.f23740d.get(webView);
        if (list == null || list.size() <= 0) {
            MethodCollector.o(6642);
            return null;
        }
        n nVar = list.get(list.size() - 1);
        MethodCollector.o(6642);
        return nVar;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void e(WebView webView) {
        n l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (a2.f23717b == 0) {
                a2.f23717b = System.currentTimeMillis();
                a2.f23719d = a2.f23717b - a2.f23716a;
                if (a2.f23719d < 0) {
                    a2.f23719d = 0;
                }
                if (HybridMonitor.getInstance().isAbTestEnable()) {
                    i.f23764a.b(a2.f23707e.b().get(), a2.f23719d);
                }
            }
        }
        b.a("MonitorCacheInfoHandler", "handlePageFinish: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, long j2) {
        n l2 = l(webView);
        if (l2 != null) {
            l2.a().f23720g = j2;
        }
    }

    private synchronized void a(WebView webView, n nVar) {
        MethodCollector.i(6961);
        List<n> list = this.f23740d.get(webView);
        if (list != null) {
            list.remove(nVar);
        }
        MethodCollector.o(6961);
    }

    private synchronized n e(WebView webView, String str) {
        MethodCollector.i(6711);
        List<n> list = this.f23740d.get(webView);
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n nVar = list.get(size);
                if (nVar != null && nVar.f23792a.f23490a.equals(str)) {
                    MethodCollector.o(6711);
                    return nVar;
                }
            }
        }
        MethodCollector.o(6711);
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, int i2) {
        n l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (i2 == 100 && a2.f23718c == 0) {
                a2.f23718c = System.currentTimeMillis();
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void c(WebView webView, String str) {
        n l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (a2.f23707e.n != 0) {
                a2.f23724k = true;
                a2.f23723j = Long.parseLong(str) - a2.f23707e.n;
                if (a2.f23723j < 0) {
                    a2.f23723j = 0;
                }
                b.a("WebPerfReportData", " updateMonitorInitTimeData : " + a2.f23723j);
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void d(WebView webView, String str) {
        n l2;
        if ("loc_after_detach".equals(str)) {
            List<n> m2 = m(webView);
            if (m2 != null) {
                for (n nVar : m2) {
                    nVar.a(n(webView));
                    nVar.a(webView);
                    for (com.bytedance.android.monitor.webview.c.a.b bVar : nVar.f23794c.values()) {
                        if (bVar.l() && (bVar instanceof com.bytedance.android.monitor.webview.c.a.c)) {
                            n.a(webView, (com.bytedance.android.monitor.webview.c.a.c) bVar);
                            bVar.m();
                        }
                    }
                }
            }
        } else if (("loc_after_tti".equals(str) || "loc_force".equals(str)) && (l2 = l(webView)) != null) {
            l2.a(n(webView));
            l2.a(webView);
        }
        this.f23738a.f23809h.put(webView, true);
    }

    private n f(WebView webView, String str) {
        String str2;
        b.a("MonitorCacheInfoHandler", "buildNewNavigation cache new url : ".concat(String.valueOf(str)));
        e eVar = (e) i.f23765b;
        JSONObject jSONObject = new JSONObject();
        if (((i) i.f23764a).v(webView) != null) {
            jSONObject = ((i) i.f23764a).v(webView).z;
        }
        if (eVar.u(webView)) {
            str2 = "ttweb";
        } else {
            str2 = "web";
        }
        n nVar = new n(webView, "web", str2, str, i.a(), this.f23738a.f23803b.get(webView).longValue(), jSONObject);
        nVar.a(this.f23738a.f23810i.remove(webView));
        nVar.a(com.bytedance.android.monitor.k.a.a(webView));
        nVar.a().n = com.bytedance.android.monitor.k.a.b(webView);
        nVar.f23793b = this.f23738a;
        List<n> list = this.f23740d.get(webView);
        if (list == null) {
            list = new ArrayList<>();
            this.f23740d.put(webView, list);
        }
        list.add(nVar);
        return nVar;
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(final WebView webView, final com.bytedance.android.monitor.d.d dVar) {
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.f.AnonymousClass4 */

            static {
                Covode.recordClassIndex(14071);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                d.a(jSONObject, "event_type", "fetchError");
                d.a(jSONObject, "error_no", dVar.f23459h);
                d.a(jSONObject, "error_msg", dVar.f23458g);
                d.a(jSONObject, "method", dVar.f23452a);
                d.a(jSONObject, "url", dVar.f23453b);
                d.a(jSONObject, "status_code", dVar.f23454c);
                d.a(jSONObject, "request_error_code", dVar.f23455d);
                d.a(jSONObject, "request_error_msg", dVar.f23456e);
                d.a(jSONObject, "jsb_ret", dVar.f23460i);
                d.a(jSONObject, "hit_prefetch", dVar.f23457f);
                f.this.b(webView, "fetchError", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleFetchError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void b(WebView webView, String str) {
        String i2 = i(webView);
        if (!TextUtils.isEmpty(i2)) {
            j(webView);
        }
        if (str.equals(i2) && l(webView).f23792a.f23494e == i.a()) {
            b.a("MonitorCacheInfoHandler", "handlePageStart : clickStart is same");
        } else if (!str.equals("about:blank")) {
            f(webView, str);
            n l2 = l(webView);
            if (l2 != null) {
                l2.a().f23721h = System.currentTimeMillis();
                c a2 = l2.a();
                if (a2.f23716a == 0) {
                    a2.f23716a = System.currentTimeMillis();
                }
            }
            JSONObject jSONObject = new JSONObject();
            d.a(jSONObject, "invoke_ts", System.currentTimeMillis());
            b(webView, "navigationStart", jSONObject);
            b.a("MonitorCacheInfoHandler", "handlePv");
            b.a("MonitorCacheInfoHandler", "handlePageStart: " + webView + "   url : " + str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(final WebView webView, final com.bytedance.android.monitor.d.e eVar) {
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14069);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                d.a(jSONObject, "event_type", "jsbError");
                d.a(jSONObject, "bridge_name", eVar.f23463c);
                d.a(jSONObject, "error_activity", eVar.f23467g);
                d.a(jSONObject, "error_code", eVar.f23461a);
                d.a(jSONObject, "error_message", eVar.f23462b);
                d.a(jSONObject, "js_type", eVar.f23464d);
                d.a(jSONObject, "error_url", eVar.f23466f);
                d.a(jSONObject, "is_sync", eVar.f23465e);
                f.this.b(webView, "jsbError", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleJSBError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(final WebView webView, final com.bytedance.android.monitor.d.f fVar) {
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.f.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14070);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                d.a(jSONObject, "event_type", "jsbPerf");
                d.a(jSONObject, "bridge_name", fVar.f23468a);
                d.a(jSONObject, "status_code", fVar.f23469b);
                d.a(jSONObject, "status_description", fVar.f23470c);
                d.a(jSONObject, "protocol_version", fVar.f23471d);
                d.a(jSONObject, "cost_time", fVar.f23472e);
                d.a(jSONObject, "invoke_ts", fVar.f23473f);
                d.a(jSONObject, "callback_ts", fVar.f23474g);
                d.a(jSONObject, "fireEvent_ts", fVar.f23475h);
                f.this.b(webView, "jsbPerf", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleJSBInfo: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.d
    public final void a(WebView webView, a.C1137a aVar) {
        int i2;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            d.a(jSONObject, "event_type", "blank");
            boolean z = false;
            if (aVar.f45928a == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            d.a(jSONObject, "is_blank", i2);
            d.a(jSONObject, "detect_type", 0);
            d.a(jSONObject, "cost_time", aVar.f45930c);
            if (aVar.f45928a == 3) {
                d.a(jSONObject, "error_code", aVar.f45931d);
                d.a(jSONObject, "error_msg", aVar.f45932e);
            }
            n e2 = e(webView, webView.getUrl());
            if (e2 == null) {
                e2 = f(webView, webView.getUrl());
                z = true;
            }
            b(webView, "blank", jSONObject);
            if (z) {
                a(webView, e2);
            }
            b.a("MonitorCacheInfoHandler", "handleBlankDetect: ");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(WebView webView, String str, JSONObject jSONObject) {
        n l2 = l(webView);
        if (l2 != null && l2.b(str)) {
            l2.a(n(webView));
            l2.a(webView, str, null, jSONObject);
            l2.a(str);
        }
    }
}
