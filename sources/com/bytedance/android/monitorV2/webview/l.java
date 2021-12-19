package com.bytedance.android.monitorV2.webview;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.d.e;
import com.bytedance.android.monitorV2.g.a;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.l.j;
import com.bytedance.android.monitorV2.webview.c.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.c.a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public class l implements e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile l f24232c;

    /* renamed from: a  reason: collision with root package name */
    public o f24233a = new o();

    /* renamed from: b  reason: collision with root package name */
    private final String f24234b = "terminated_pre_collect";

    /* renamed from: d  reason: collision with root package name */
    private j f24235d = new j();

    /* renamed from: e  reason: collision with root package name */
    private Map<WebView, List<k>> f24236e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    private a f24237f = new a();

    static {
        Covode.recordClassIndex(14255);
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final boolean a(WebView webView) {
        Boolean bool = this.f24233a.f24288h.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, String str) {
        o oVar = this.f24233a;
        if (oVar.f24282b.get(webView) != null) {
            oVar.f24283c.put(webView, true);
        }
        oVar.f24282b.put(webView, Long.valueOf(System.currentTimeMillis()));
        oVar.f24281a.put(webView, str);
        b.a("WebviewCache", "handleLoadUrl: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(final WebView webView, final String str, final boolean z, final int i2, final String str2, final int i3) {
        com.bytedance.android.monitorV2.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14256);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                f.a(jSONObject, "event_type", "nativeError");
                f.a(jSONObject, "error_code", i2);
                f.a(jSONObject, "error_msg", str2);
                if (z) {
                    str = "main_frame";
                } else {
                    str = "child_resource";
                }
                f.a(jSONObject, "scene", str);
                f.a(jSONObject, "error_url", str);
                f.a(jSONObject, "http_status", i3);
                l.this.a(webView, "nativeError", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleRequestError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, a.C1137a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            f.a(jSONObject, "event_type", "blank");
            boolean z = false;
            f.a(jSONObject, "is_blank", aVar.f45928a == 1 ? 1 : 0);
            f.a(jSONObject, "detect_type", 0);
            f.a(jSONObject, "cost_time", aVar.f45930c);
            if (aVar.f45928a == 3) {
                f.a(jSONObject, "error_code", aVar.f45931d);
                f.a(jSONObject, "error_msg", aVar.f45932e);
            }
            k e2 = e(webView, webView.getUrl());
            if (e2 == null) {
                e2 = f(webView, webView.getUrl());
                z = true;
            }
            f.a(jSONObject, "enter_page_time", e2.a().f24179a);
            f.a(jSONObject, "detect_start_time", System.currentTimeMillis() - aVar.f45930c);
            a(webView, "blank", jSONObject);
            if (z) {
                a(webView, e2);
            }
            b.a("MonitorCacheInfoHandler", "handleBlankDetect: ");
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, String str, String str2, String str3) {
        k e2 = e(webView, str);
        if (e2 != null && !TextUtils.isEmpty(str2)) {
            e2.a().a(f.a(str3));
        }
        b.a("MonitorCacheInfoHandler", "cover: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, String str, String str2) {
        String c2 = f.c(f.a(str2), "url");
        a.C0514a s = ((n) n.f24265b).s(webView);
        String e2 = n.f24265b.e(webView);
        if (TextUtils.isEmpty(c2)) {
            k l2 = l(webView);
            if (l2 != null && g(webView, str)) {
                l2.a(a(webView, s, e2));
                l2.a(webView, str, f.a(str2));
                l2.a(str);
                return;
            }
            return;
        }
        k e3 = e(webView, c2);
        if (e3 != null && e3.b(str) && g(webView, str)) {
            e3.a(a(webView, s, e2));
            e3.a(webView, str, f.a(str2));
            e3.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(WebView webView, JSONObject jSONObject) {
        k l2 = l(webView);
        if (l2 != null) {
            String str = l2.f24222a.f23903b;
            if (!b(str, "terminated_pre_collect")) {
                this.f24235d.a(str, jSONObject);
                return;
            }
            List<JSONObject> a2 = this.f24235d.a(str);
            if (a2 == null || a2.size() <= 0) {
                b(webView, jSONObject);
                return;
            }
            for (JSONObject jSONObject2 : a2) {
                b(webView, jSONObject2);
            }
        }
    }

    public final void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, str, jSONObject, (com.bytedance.android.monitorV2.d.b) null);
    }

    public final void a(WebView webView, String str, JSONObject jSONObject, com.bytedance.android.monitorV2.d.b bVar) {
        k l2 = l(webView);
        a.C0514a s = ((n) n.f24265b).s(webView);
        String e2 = n.f24265b.e(webView);
        if (l2 != null) {
            String str2 = l2.f24222a.f23903b;
            if (!b(str2, "terminated_pre_collect")) {
                this.f24235d.a(str2, str, jSONObject);
                return;
            }
            Map<String, JSONObject> b2 = this.f24235d.b(str2);
            if (b2 != null && b2.size() > 0) {
                for (Map.Entry<String, JSONObject> entry : b2.entrySet()) {
                    if (l2.b(str) && g(webView, entry.getKey())) {
                        l2.a(a(webView, s, e2));
                        l2.a(webView, entry.getKey(), null, entry.getValue(), bVar);
                        l2.a(str);
                    }
                }
            } else if (l2.b(str) && g(webView, str)) {
                l2.a(a(webView, s, e2));
                l2.a(webView, str, null, jSONObject, bVar);
                l2.a(str);
            }
        }
    }

    public final void a(String str, String str2) {
        o oVar = this.f24233a;
        if (str != null && !str.isEmpty() && str2 != null) {
            oVar.f24289i.put(str, str2);
        }
    }

    private l() {
    }

    public static l a() {
        MethodCollector.i(5317);
        if (f24232c == null) {
            synchronized (l.class) {
                try {
                    if (f24232c == null) {
                        f24232c = new l();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5317);
                    throw th;
                }
            }
        }
        l lVar = f24232c;
        MethodCollector.o(5317);
        return lVar;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final com.bytedance.android.monitorV2.webview.b.a k(final WebView webView) {
        return new com.bytedance.android.monitorV2.webview.b.a() {
            /* class com.bytedance.android.monitorV2.webview.l.AnonymousClass5 */

            static {
                Covode.recordClassIndex(14262);
            }

            @Override // com.bytedance.android.monitorV2.webview.b.a
            public final String a() {
                return n.f24265b.f(webView);
            }

            @Override // com.bytedance.android.monitorV2.webview.b.a
            public final String b() {
                return n.f24265b.e(webView);
            }

            @Override // com.bytedance.android.monitorV2.webview.b.a
            public final String c() {
                k l2 = l.this.l(webView);
                if (l2 != null) {
                    return l2.f24222a.f23902a;
                }
                o oVar = l.this.f24233a;
                return oVar.f24281a.get(webView);
            }
        };
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void f(WebView webView) {
        this.f24233a.f24287g.put(webView, true);
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final boolean h(WebView webView) {
        if (l(webView) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final String i(WebView webView) {
        k l2 = l(webView);
        if (l2 != null) {
            return l2.f24222a.f23902a;
        }
        return null;
    }

    private synchronized List<k> n(WebView webView) {
        List<k> remove;
        MethodCollector.i(5322);
        remove = this.f24236e.remove(webView);
        MethodCollector.o(5322);
        return remove;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void b(WebView webView) {
        this.f24233a.f24284d.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewCreate: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void c(WebView webView) {
        this.f24233a.f24285e.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewAttach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void d(WebView webView) {
        this.f24233a.f24286f.put(webView, Long.valueOf(System.currentTimeMillis()));
        b.a("WebviewCache", "handleViewDetach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final boolean g(WebView webView) {
        Boolean bool = this.f24233a.f24287g.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void j(WebView webView) {
        k l2 = l(webView);
        if (l2 != null) {
            l2.b();
        }
        b.a("MonitorCacheInfoHandler", "handlePageExit: ".concat(String.valueOf(webView)));
    }

    /* access modifiers changed from: package-private */
    public final void m(WebView webView) {
        k l2 = l(webView);
        if (l2 != null) {
            this.f24237f.a(l2.f24222a.f23903b, "terminated_pre_collect");
            a(webView, (JSONObject) null);
            a(webView, "", (JSONObject) null);
        }
    }

    public final synchronized k l(WebView webView) {
        MethodCollector.i(5318);
        List<k> list = this.f24236e.get(webView);
        if (list == null || list.size() <= 0) {
            MethodCollector.o(5318);
            return null;
        }
        k kVar = list.get(list.size() - 1);
        MethodCollector.o(5318);
        return kVar;
    }

    public final JSONObject a(String str) {
        o oVar = this.f24233a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return oVar.f24293m.get(str);
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void e(WebView webView) {
        SoftReference<WebView> softReference;
        k l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (a2.f24180b == 0) {
                a2.f24180b = System.currentTimeMillis();
                a2.f24182d = a2.f24180b - a2.f24179a;
                if (a2.f24182d < 0) {
                    a2.f24182d = 0;
                }
                if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
                    d dVar = n.f24264a;
                    com.bytedance.android.monitorV2.webview.c.b.b bVar = a2.f24170e;
                    if (bVar.f24175k != null) {
                        softReference = bVar.f24175k;
                    } else {
                        softReference = new SoftReference<>(null);
                    }
                    dVar.b(softReference.get(), a2.f24182d);
                }
            }
        }
        b.a("MonitorCacheInfoHandler", "handlePageFinish: ".concat(String.valueOf(webView)));
    }

    private boolean b(String str, String str2) {
        return this.f24237f.b(str, str2);
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, long j2) {
        k l2 = l(webView);
        if (l2 != null) {
            l2.a().f24183g = j2;
        }
    }

    private synchronized void a(WebView webView, k kVar) {
        MethodCollector.i(5330);
        List<k> list = this.f24236e.get(webView);
        if (list != null) {
            list.remove(kVar);
        }
        MethodCollector.o(5330);
    }

    private synchronized k e(WebView webView, String str) {
        MethodCollector.i(5320);
        List<k> list = this.f24236e.get(webView);
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                k kVar = list.get(size);
                if (kVar != null && kVar.f24222a.f23902a.equals(str)) {
                    MethodCollector.o(5320);
                    return kVar;
                }
            }
        }
        MethodCollector.o(5320);
        return null;
    }

    private static boolean g(WebView webView, String str) {
        String str2;
        a.C0514a s = ((n) n.f24265b).s(webView);
        if (s == null || !com.bytedance.android.monitorV2.l.b.b(str, s)) {
            StringBuilder append = new StringBuilder().append(str).append("_web not hit,  use bid: ");
            if (s != null) {
                str2 = s.f23925a;
            } else {
                str2 = "null";
            }
            b.b("MonitorCacheInfoHandler", append.append(str2).toString());
            return false;
        }
        b.b("MonitorCacheInfoHandler", str + "_web hit, use bid: " + s.f23925a);
        return true;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void c(WebView webView, String str) {
        k l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (a2.f24170e.f24177m != 0) {
                a2.f24187k = true;
                a2.f24186j = Long.parseLong(str) - a2.f24170e.f24177m;
                if (a2.f24186j < 0) {
                    a2.f24186j = 0;
                }
                b.a("WebPerfReportData", " updateMonitorInitTimeData : " + a2.f24186j);
            }
        }
    }

    private static void b(WebView webView, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject != null) {
            String jSONObject4 = jSONObject.toString();
            String c2 = f.c(jSONObject, "serviceType");
            if (c2.equals("")) {
                JSONObject a2 = f.a(f.c(jSONObject, "category"));
                JSONObject a3 = f.a(f.c(jSONObject, "metrics"));
                JSONObject a4 = f.a(f.c(jSONObject, "timing"));
                JSONObject a5 = f.a(f.c(jSONObject, "extra"));
                k l2 = a().l(webView);
                JSONObject r = n.r(webView);
                JSONObject jSONObject5 = null;
                if (l2 != null) {
                    if (l2.f24222a != null) {
                        jSONObject3 = l2.f24222a.a();
                    } else {
                        jSONObject3 = null;
                    }
                    if (l2.f24225d != null) {
                        jSONObject5 = l2.f24225d.a();
                    }
                    jSONObject2 = jSONObject5;
                    jSONObject5 = jSONObject3;
                } else {
                    jSONObject2 = null;
                }
                d.a aVar = new d.a(f.c(jSONObject, "eventName"));
                aVar.f23862c = a2;
                aVar.f23864e = a5;
                aVar.f23866g = a4;
                aVar.f23863d = a3;
                aVar.f23868i = jSONObject5;
                aVar.f23870k = r;
                aVar.f23869j = jSONObject2;
                n.f24264a.a(webView, aVar.a(f.a(jSONObject, "level")).a());
            } else if (c2.equals("perf")) {
                n.f24265b.a(webView, f.c(jSONObject, "url"), c2, jSONObject4);
            } else {
                n.f24265b.a(webView, c2, jSONObject4);
            }
        }
    }

    private k f(WebView webView, String str) {
        String str2;
        b.a("MonitorCacheInfoHandler", "buildNewNavigation cache new url : ".concat(String.valueOf(str)));
        if (((com.bytedance.android.monitorV2.webview.b.c) n.f24265b).v(webView)) {
            str2 = "ttweb";
        } else {
            str2 = "web";
        }
        JSONObject jSONObject = new JSONObject();
        if (((n) n.f24264a).w(webView) != null) {
            jSONObject = ((n) n.f24264a).w(webView).t;
        }
        k kVar = new k(webView, "web", str2, str, j.a(), this.f24233a.f24282b.get(webView).longValue(), jSONObject);
        kVar.a(this.f24233a.f24291k.remove(webView));
        kVar.a(com.bytedance.android.monitorV2.k.a.a(webView));
        kVar.a().o = com.bytedance.android.monitorV2.k.a.b(webView);
        kVar.f24223b = this.f24233a;
        List<k> list = this.f24236e.get(webView);
        if (list == null) {
            list = new ArrayList<>();
            this.f24236e.put(webView, list);
        }
        list.add(kVar);
        return kVar;
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, int i2) {
        k l2 = l(webView);
        if (l2 != null) {
            c a2 = l2.a();
            if (i2 == 100 && a2.f24181c == 0) {
                a2.f24181c = System.currentTimeMillis();
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void d(WebView webView, String str) {
        k l2;
        a.C0514a s = ((n) n.f24265b).s(webView);
        String e2 = n.f24265b.e(webView);
        if ("loc_after_detach".equals(str)) {
            List<k> list = this.f24236e.get(webView);
            if (list != null && g(webView, "perf")) {
                for (k kVar : list) {
                    kVar.a(a(webView, s, e2));
                    kVar.a(webView);
                    for (com.bytedance.android.monitorV2.webview.c.a.b bVar : kVar.f24224c.values()) {
                        if (bVar.k() && (bVar instanceof com.bytedance.android.monitorV2.webview.c.a.c)) {
                            k.a(webView, (com.bytedance.android.monitorV2.webview.c.a.c) bVar);
                            bVar.l();
                        }
                    }
                }
            }
            n(webView);
        } else if (("loc_after_tti".equals(str) || "loc_force".equals(str)) && (l2 = l(webView)) != null && g(webView, "perf")) {
            l2.a(a(webView, s, e2));
            l2.a(webView);
        }
        this.f24233a.f24288h.put(webView, true);
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        String url = webView.getUrl();
        if (!TextUtils.isEmpty(url)) {
            String str2 = null;
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb = new StringBuilder("cause by ");
                if (renderProcessGoneDetail.didCrash()) {
                    str = "crash";
                } else {
                    str = "system";
                }
                str2 = sb.append(str).toString();
            }
            JSONObject jSONObject = new JSONObject();
            f.a(jSONObject, "event_type", "nativeError");
            f.a(jSONObject, "error_code", -10000);
            f.a(jSONObject, "error_msg", str2);
            f.a(jSONObject, "scene", "web_process_terminate");
            f.a(jSONObject, "error_url", url);
            k e2 = e(webView, webView.getUrl());
            boolean z = false;
            if (e2 == null) {
                e2 = f(webView, webView.getUrl());
                z = true;
            }
            a(webView, "nativeError", jSONObject);
            if (z) {
                a(webView, e2);
            }
            b.a("MonitorCacheInfoHandler", "handleRenderProcessGone: ");
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void b(WebView webView, String str) {
        Boolean bool;
        String i2 = i(webView);
        if (!TextUtils.isEmpty(i2)) {
            j(webView);
        }
        if (str.equals(i2) && l(webView).f24222a.f23905d == j.a()) {
            b.a("MonitorCacheInfoHandler", "handlePageStart : clickStart is same");
        } else if (!str.equals("about:blank")) {
            f(webView, str);
            o oVar = this.f24233a;
            List<String> list = oVar.f24290j.get(webView);
            if (list == null) {
                list = new ArrayList<>();
                oVar.f24290j.put(webView, list);
            }
            list.add(str);
            o oVar2 = this.f24233a;
            boolean z = true;
            if (oVar2.f24290j.get(webView) != null) {
                if (oVar2.f24290j.get(webView).size() > 1) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = true;
            }
            boolean booleanValue = bool.booleanValue();
            k l2 = l(webView);
            if (l2 != null) {
                l2.a().f24184h = System.currentTimeMillis();
                c a2 = l2.a();
                if (a2.f24179a == 0) {
                    a2.f24179a = System.currentTimeMillis();
                }
                a2.f24188l = booleanValue;
            }
            JSONObject jSONObject = new JSONObject();
            f.a(jSONObject, "invoke_ts", System.currentTimeMillis());
            a(webView, "navigationStart", jSONObject);
            b.a("MonitorCacheInfoHandler", "handlePv");
            b.a("MonitorCacheInfoHandler", "handlePageStart: " + webView + "   url : " + str);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(final WebView webView, final e eVar) {
        com.bytedance.android.monitorV2.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.l.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14257);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                f.a(jSONObject, "event_type", "jsbError");
                f.a(jSONObject, "bridge_name", eVar.f23875c);
                f.a(jSONObject, "error_activity", eVar.f23879g);
                f.a(jSONObject, "error_code", eVar.f23873a);
                f.a(jSONObject, "error_message", eVar.f23874b);
                f.a(jSONObject, "js_type", eVar.f23876d);
                f.a(jSONObject, "error_url", eVar.f23878f);
                f.a(jSONObject, "is_sync", eVar.f23877e);
                l.this.a(webView, "jsbError", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleJSBError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitorV2.webview.e
    public final void a(final WebView webView, final com.bytedance.android.monitorV2.d.f fVar) {
        com.bytedance.android.monitorV2.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.l.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14258);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                f.a(jSONObject, "event_type", "jsbPerf");
                f.a(jSONObject, "bridge_name", fVar.f23880a);
                f.a(jSONObject, "status_code", fVar.f23881b);
                f.a(jSONObject, "status_description", fVar.f23882c);
                f.a(jSONObject, "protocol_version", fVar.f23883d);
                f.a(jSONObject, "cost_time", fVar.f23884e);
                f.a(jSONObject, "invoke_ts", fVar.f23885f);
                f.a(jSONObject, "callback_ts", fVar.f23886g);
                f.a(jSONObject, "fireEvent_ts", fVar.f23887h);
                l.this.a(webView, "jsbPerf", jSONObject);
                b.a("MonitorCacheInfoHandler", "handleJSBInfo: ");
            }
        });
    }

    private JSONObject a(WebView webView, a.C0514a aVar, String str) {
        return this.f24233a.a(webView, aVar, str);
    }
}
