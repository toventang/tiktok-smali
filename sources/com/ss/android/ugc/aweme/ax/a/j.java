package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.android.monitor.webview.f;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ax.a.b.e;
import h.a.z;
import h.f.a.r;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j extends ad implements m {

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f67737g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final h f67738h = i.a(m.NONE, new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f67739i = i.a(m.NONE, new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f67740j = i.a(m.NONE, new c(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f67741k = i.a(m.NONE, new d(this));

    /* renamed from: l  reason: collision with root package name */
    private boolean f67742l;

    /* renamed from: m  reason: collision with root package name */
    private List<String> f67743m = z.INSTANCE;
    private final List<com.bytedance.android.monitor.webview.a> n = new ArrayList();
    private boolean o = true;
    private long p;
    private long q;
    private final Map<Uri, Long> r = new LinkedHashMap();

    static {
        Covode.recordClassIndex(41694);
    }

    private final com.ss.android.ugc.aweme.ax.a.a.a s() {
        return (com.ss.android.ugc.aweme.ax.a.a.a) this.f67739i.getValue();
    }

    private com.bytedance.android.monitor.webview.c t() {
        return (com.bytedance.android.monitor.webview.c) this.f67741k.getValue();
    }

    public final WebView c() {
        return (WebView) this.f67738h.getValue();
    }

    public final c.a d() {
        return (c.a) this.f67740j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.a, com.ss.android.ugc.aweme.ax.a.r
    public final void a(String str, boolean z) {
        l.d(str, "");
        super.a(str, z);
        this.o = true;
        this.p = System.currentTimeMillis();
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null && !com.ss.android.ugc.aweme.ax.a.a.a.a(a().b())) {
            s.a("detailClearWebViewData", s);
            s.a("detailEnableDomData", s);
        }
        com.ss.android.ugc.aweme.ax.a.a.a s2 = s();
        if (s2 != null) {
            String b2 = a().b();
            if (!com.ss.android.ugc.aweme.ax.a.a.a.a(b2)) {
                s2.f67663c.f67682h = b2;
                s2.f67663c.f67681g = s2.f67667g;
                s2.f67663c.f67683i = b2;
                s2.f67663c.f67685k = SystemClock.uptimeMillis();
                s2.f67670j.removeCallbacks(s2.f67672l);
                s2.f67670j.postDelayed(s2.f67672l, 3000);
            }
        }
        t().g(c(), a().b());
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        ad.a(this, "hybrid_app_monitor_load_url_event", a2, jSONObject, null, 24);
        a(a().f67750a, "load_url");
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void a(b bVar, c cVar) {
        l.d(bVar, "");
        w q2 = q();
        JSONObject jSONObject = new JSONObject();
        e.a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            e.a(jSONObject, cVar.getFormatData());
        }
        ad.a(this, "hybrid_app_monitor_fetch_api_error", q2, jSONObject, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(String str) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null && !a(parse, "should_intercept_request")) {
            b(parse, "should_intercept_request");
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        Uri url2;
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (!(s == null || webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || !com.ss.android.ugc.aweme.ax.a.a.a.b(url2.toString()))) {
            s.f67663c.y = -1;
            s.f67663c.p = webResourceRequest.isForMainFrame();
            s.f67663c.B = url2.toString();
            s.f67663c.z = Integer.valueOf(webResourceError != null ? webResourceError.getErrorCode() : 0);
            s.d();
        }
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        if (webResourceError != null) {
            jSONObject.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
            jSONObject.put("received_error_desc", webResourceError.getDescription());
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            jSONObject.put("failing_url", url.toString());
        }
        ad.a(this, "hybrid_app_monitor_h5_received_error", a2, jSONObject, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Uri url;
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (!(s == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
            s.f67663c.y = -2;
            s.f67663c.p = webResourceRequest.isForMainFrame();
            s.f67663c.B = webResourceRequest.getUrl().toString();
            s.f67663c.z = Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0);
            s.d();
        }
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_http_error");
        if (webResourceResponse != null) {
            jSONObject.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            jSONObject.put("failing_url", url.toString());
        }
        ad.a(this, "hybrid_app_monitor_h5_received_error", a2, jSONObject, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        l.d(str, "");
        l.d(str2, "");
        w q2 = q();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            e.a(jSONObject4, jSONObject);
        }
        a(str, q2, jSONObject4, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(String str, String str2, String str3, long j2) {
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("download_url", str);
        }
        if (str2 != null) {
            jSONObject.put("content_disposition", str2);
        }
        if (str3 != null) {
            jSONObject.put("mime_type", str3);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content_length", j2);
        ad.a(this, "hybrid_app_monitor_h5_download", a2, jSONObject, jSONObject2, 16);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.ad
    public final void a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        int i2;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        Iterator<String> keys;
        JSONObject jSONObject3;
        com.ss.android.ugc.aweme.ax.a.b.d a2;
        super.a(str, num, jSONObject, jSONObject2);
        if (!l.a((Object) "ttmt_webview_timing_monitor_custom_service", (Object) str)) {
            if (jSONObject2 != null) {
                try {
                    String optString = jSONObject2.optString("navigation_id");
                    String optString2 = jSONObject2.optString("ev_type");
                    if (optString2 != null) {
                        Double d2 = null;
                        switch (optString2.hashCode()) {
                            case -1077756671:
                                if (optString2.equals("memory")) {
                                    w q2 = q();
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("navigation_id", optString);
                                    ad.a(this, "hybrid_app_monitor_js_memory", q2, jSONObject4, jSONObject2.optJSONObject("event"), 16);
                                    break;
                                }
                                break;
                            case -270976012:
                                if (!(!optString2.equals("performance_interval") || (optJSONObject2 = jSONObject2.optJSONObject("event")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("navigation")) == null || (keys = optJSONObject3.keys()) == null)) {
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        Double valueOf = Double.valueOf(optJSONObject3.optDouble(next, 0.0d));
                                        if (valueOf.doubleValue() > 0.0d && !this.f67737g.contains(next) && valueOf != null) {
                                            valueOf.doubleValue();
                                            List<String> list = this.f67737g;
                                            l.b(next, "");
                                            list.add(next);
                                            w q3 = q();
                                            JSONObject jSONObject5 = new JSONObject();
                                            jSONObject5.put("trigger", next);
                                            jSONObject5.put("navigation_id", optString);
                                            com.ss.android.ugc.aweme.ax.a.b.c cVar = com.ss.android.ugc.aweme.ax.a.b.c.H5_TIMING;
                                            l.d(next, "");
                                            l.d(optJSONObject3, "");
                                            l.d(cVar, "");
                                            com.ss.android.ugc.aweme.ax.a.b.h a3 = e.a(cVar);
                                            if (a3 == null || (a2 = a3.a(next, optJSONObject3)) == null) {
                                                jSONObject3 = null;
                                            } else {
                                                jSONObject3 = new JSONObject();
                                                jSONObject3.put(a2.f67713a, a2.f67714b);
                                            }
                                            ad.a(this, "hybrid_app_monitor_h5_timeline_event", q3, jSONObject5, jSONObject3, 16);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 101609:
                                if (optString2.equals("fps")) {
                                    JSONObject optJSONObject4 = jSONObject2.optJSONObject("event");
                                    if (optJSONObject4 != null) {
                                        d2 = Double.valueOf(optJSONObject4.optDouble("fps"));
                                    }
                                    w q4 = q();
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("navigation_id", optString);
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put("fps", d2);
                                    ad.a(this, "hybrid_app_monitor_js_fps", q4, jSONObject6, jSONObject7, 16);
                                    break;
                                }
                                break;
                            case 1669986551:
                                if (optString2.equals("static_error")) {
                                    JSONObject optJSONObject5 = jSONObject2.optJSONObject("event");
                                    w q5 = q();
                                    JSONObject jSONObject8 = new JSONObject();
                                    jSONObject8.put("navigation_id", optString);
                                    if (optJSONObject5 != null) {
                                        Uri parse = Uri.parse(optJSONObject5.optString("st_url"));
                                        l.b(parse, "");
                                        e.a(jSONObject8, new v(parse, "resource_", null, 4).getFormatData());
                                    }
                                    ad.a(this, "hybrid_app_monitor_load_resource_error", q5, jSONObject8, null, 24);
                                    break;
                                }
                                break;
                            case 1837434847:
                                if (!(!optString2.equals("static_performance") || (optJSONObject = jSONObject2.optJSONObject("event")) == null || (optJSONArray = optJSONObject.optJSONArray("resources")) == null)) {
                                    int length = optJSONArray.length();
                                    for (int i3 = 0; i3 < length; i3++) {
                                        JSONObject optJSONObject6 = optJSONArray.optJSONObject(i3);
                                        if (optJSONObject6 != null) {
                                            String optString3 = optJSONObject6.optString(StringSet.name);
                                            w q6 = q();
                                            JSONObject jSONObject9 = new JSONObject();
                                            jSONObject9.put("trigger", "on_load");
                                            jSONObject9.put("navigation_id", optString);
                                            Uri parse2 = Uri.parse(optString3);
                                            l.b(parse2, "");
                                            e.a(jSONObject9, new v(parse2, "resource_", null, 4).getFormatData());
                                            ad.a(this, "hybrid_app_monitor_load_resource_event", q6, jSONObject9, e.a(optJSONObject6, com.ss.android.ugc.aweme.ax.a.b.c.H5_RESOURCE_TIMING), 16);
                                        }
                                    }
                                    break;
                                }
                        }
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                    e2.printStackTrace();
                    return;
                }
            }
            for (T t : this.n) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                t.a(str, i2, jSONObject, jSONObject2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.ad
    public final void a(String str, t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        l.d(str, "");
        l.d(tVar, "");
        try {
            a(tVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e2) {
            a(e2, tVar.b(), "h5");
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(String str, String str2) {
        l.d(str, "");
        if (str2 != null) {
            c.a d2 = d();
            com.bytedance.android.monitor.l.d.a(d2.z, str, String.valueOf(str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void f() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.r++;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void g() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.v++;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void h() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.u++;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void i() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.s++;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void j() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.f67679e = SystemClock.uptimeMillis();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<WebView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WebView invoke() {
            View view = (View) this.this$0.f67694e.a(View.class);
            if (view == null || !(view instanceof WebView)) {
                return null;
            }
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            return (WebView) view;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.android.monitor.webview.c> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.monitor.webview.c invoke() {
            com.bytedance.android.monitor.webview.c cVar = com.bytedance.android.monitor.webview.i.f23764a;
            c.a d2 = this.this$0.d();
            if (this.this$0.c() != null) {
                cVar.a(d2);
            }
            return cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.a, com.ss.android.ugc.aweme.ax.a.r
    public final void b() {
        super.b();
        com.bytedance.android.monitor.webview.c t = t();
        t.a(t.t(c()));
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void e() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null && s.f67663c.n == 0) {
            s.f67663c.n = SystemClock.uptimeMillis();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ax.a.a.a> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ax.a.a.a invoke() {
            o n = this.this$0.n();
            List<String> list = null;
            if (n == null || !n.d()) {
                return null;
            }
            WebView c2 = this.this$0.c();
            o n2 = this.this$0.n();
            if (n2 != null) {
                list = n2.e();
            }
            return new com.ss.android.ugc.aweme.ax.a.a.a(c2, list, this.this$0.o(), this.this$0.n());
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<c.a> {
        final /* synthetic */ j this$0;

        public final /* synthetic */ class b implements com.bytedance.android.monitor.webview.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ r f67744a;

            static {
                Covode.recordClassIndex(41699);
            }

            public b(r rVar) {
                this.f67744a = rVar;
            }

            @Override // com.bytedance.android.monitor.webview.a
            public final /* synthetic */ void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
                l.b(this.f67744a.a(str, Integer.valueOf(i2), jSONObject, jSONObject2), "");
            }
        }

        static {
            Covode.recordClassIndex(41697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c.a invoke() {
            String str;
            com.bytedance.android.monitor.webview.c cVar = com.bytedance.android.monitor.webview.i.f23764a;
            c.a d2 = cVar.d();
            d2.f23695g = "HybridMonitor";
            d2.y = "mt";
            d2.f23690b = f.a();
            d2.f23694f = new String[]{cVar.t(this.this$0.c())};
            d2.p = true;
            d2.q = true;
            d2.f23699k = true;
            d2.n = true;
            d2.f23701m = true;
            d2.f23700l = true;
            d2.o = true;
            d2.a(new b(new a(this.this$0)));
            if (this.this$0.f67658b) {
                d2.r = true;
                o n = this.this$0.n();
                if (n != null) {
                    str = n.c();
                } else {
                    str = null;
                }
                d2.f23698j = str;
            }
            return d2;
        }

        static final /* synthetic */ class a extends h.f.b.j implements r<String, Integer, JSONObject, JSONObject, h.z> {
            static {
                Covode.recordClassIndex(41698);
            }

            a(j jVar) {
                super(4, jVar, j.class, "monitorStatusAndDuration", "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.r
            public final /* bridge */ /* synthetic */ h.z a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((ad) this.receiver).a(str, num, jSONObject, jSONObject2);
                return h.z.f158842a;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void k() {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            if (!com.ss.android.ugc.aweme.ax.a.a.a.a(s.f67663c.f67682h)) {
                s.f67671k = SystemClock.uptimeMillis();
                s.a("detailGetWebViewData", s);
                s.f67663c.f67680f = SystemClock.uptimeMillis();
                s.f67670j.removeCallbacks(s.f67672l);
                boolean z = false;
                if (!s.f67662b) {
                    s.a(false, true);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (com.ss.android.ugc.aweme.ax.a.b.a.a(s.f67665e).f67706a == 1) {
                    z = true;
                }
                s.f67663c.f67675a = z;
                s.f67663c.f67676b = SystemClock.uptimeMillis() - uptimeMillis;
                s.a(s.f67663c);
                s.a();
                if (s.f67666f != null) {
                    s.f67666f.a("hybrid_ttwebview_monitor", s.b());
                }
            }
            ad.a(this, "hybrid_app_monitor_h5_blank_screen", q(), s.a(), s.c(), 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(boolean z) {
        this.f67742l = z;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(List<String> list) {
        l.d(list, "");
        this.f67743m = list;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(com.bytedance.android.monitor.webview.a aVar) {
        if (aVar != null && !this.n.contains(aVar)) {
            this.n.add(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void b(String str) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null && !a(parse, "should_override_url_loading")) {
            b(parse, "should_override_url_loading");
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void b(Uri uri) {
        Long remove;
        String str;
        l.d(uri, "");
        if ((l.a((Object) uri.getScheme(), (Object) "http") || l.a((Object) uri.getScheme(), (Object) "https")) && 1 != 0 && uri != null && (remove = this.r.remove(uri)) != null) {
            long longValue = remove.longValue();
            com.ss.android.ugc.aweme.ax.a.a.a s = s();
            if (s != null) {
                String b2 = q().f67753b.b();
                if (s.f67663c.f67687m == 0 && !com.ss.android.ugc.aweme.ax.a.a.a.a(b2)) {
                    s.f67663c.f67683i = b2;
                    s.f67663c.f67687m = SystemClock.uptimeMillis();
                    s.a(true, false);
                }
                s.f67670j.removeCallbacks(s.f67672l);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.o) {
                longValue = this.p;
                this.q = currentTimeMillis;
            }
            v a2 = a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "on_load");
            if (this.o) {
                str = "first_screen";
            } else {
                str = "navigation";
            }
            jSONObject.put("is_first_screen", str);
            JSONObject jSONObject2 = new JSONObject();
            if (currentTimeMillis > 0 && longValue > 0) {
                jSONObject2.put("page_load_interval", currentTimeMillis - longValue);
            }
            long j2 = this.q;
            if (j2 > 0 && this.p > 0) {
                jSONObject2.put("first_screen_page_load_interval", j2 - this.p);
            }
            jSONObject2.put("event_ts", currentTimeMillis);
            ad.a(this, "hybrid_app_monitor_load_url_event", a2, jSONObject, jSONObject2, 16);
            this.o = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(Uri uri) {
        l.d(uri, "");
        if ((l.a((Object) uri.getScheme(), (Object) "http") || l.a((Object) uri.getScheme(), (Object) "https")) && 1 != 0 && uri != null) {
            w q2 = q();
            l.d(uri, "");
            q2.f67754c = uri;
            q2.f67753b = new v(q2.f67754c, "page_", null, 4);
            com.ss.android.ugc.aweme.ax.a.a.a s = s();
            if (s != null) {
                s.f67663c.f67683i = q().f67753b.b();
                if (s.f67663c.f67686l == 0) {
                    s.f67663c.f67686l = SystemClock.uptimeMillis();
                }
            }
            t().c(c(), a().b());
            long currentTimeMillis = System.currentTimeMillis();
            this.r.put(uri, Long.valueOf(currentTimeMillis));
            if (!this.o) {
                v a2 = a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trigger", "navigation_start");
                jSONObject.put("is_first_screen", "navigation");
                JSONObject jSONObject2 = new JSONObject();
                long j2 = this.q;
                if (j2 > 0 && this.p > 0) {
                    jSONObject2.put("first_screen_page_load_interval", j2 - this.p);
                }
                jSONObject2.put("event_ts", currentTimeMillis);
                ad.a(this, "hybrid_app_monitor_load_url_event", a2, jSONObject, jSONObject2, 16);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(SslError sslError) {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (!(s == null || sslError == null)) {
            s.f67663c.y = -3;
            s.f67663c.z = Integer.valueOf(sslError.getPrimaryError());
            s.f67663c.B = sslError.getUrl();
            s.f67663c.A = sslError.toString();
            s.d();
        }
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_ssl_error");
        if (sslError != null) {
            jSONObject.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
            jSONObject.put("failing_url", sslError.getUrl());
        }
        ad.a(this, "hybrid_app_monitor_h5_received_error", a2, jSONObject, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(WebView webView, int i2) {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null) {
            s.f67663c.f67684j = i2;
        }
        t().a(webView, i2);
    }

    private final boolean a(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        l.b(scheme, "");
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = scheme.toLowerCase(locale);
        l.b(lowerCase, "");
        if (!l.a((Object) lowerCase, (Object) "file")) {
            return false;
        }
        w q2 = q();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("resource_url", String.valueOf(uri));
        ad.a(this, "hybrid_app_monitor_file_schema_event", q2, jSONObject, jSONObject2, 16);
        return true;
    }

    private final boolean b(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            l.b(scheme, "");
            Locale locale = Locale.getDefault();
            l.b(locale, "");
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = scheme.toLowerCase(locale);
            l.b(lowerCase, "");
            if ((l.a((Object) lowerCase, (Object) "http") || l.a((Object) lowerCase, (Object) "https")) && 1 != 0) {
                v vVar = new v(uri, "resource_", null, 4);
                if (this.f67742l) {
                    if (!this.f67743m.isEmpty()) {
                        Iterator<String> it = this.f67743m.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            String host = uri.getHost();
                            if (host != null) {
                                l.b(host, "");
                                if (p.e((CharSequence) host, (CharSequence) next)) {
                                    break;
                                }
                            }
                        }
                    }
                    w q2 = q();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", str);
                    e.a(jSONObject, vVar.getFormatData());
                    ad.a(this, "hybrid_app_monitor_resource_load_event", q2, jSONObject, null, 24);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.m
    public final void a(int i2, String str) {
        com.ss.android.ugc.aweme.ax.a.a.a s = s();
        if (s != null && com.ss.android.ugc.aweme.ax.a.a.a.b(str)) {
            s.f67663c.y = -1;
            s.f67663c.z = Integer.valueOf(i2);
            s.f67663c.B = str;
            s.d();
        }
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        jSONObject.put("received_error_code", String.valueOf(i2));
        if (str != null) {
            jSONObject.put("failing_url", str);
        }
        ad.a(this, "hybrid_app_monitor_h5_received_error", a2, jSONObject, null, 24);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Uri uri, g gVar, Map<String, String> map) {
        super(uri, gVar, map);
        l.d(uri, "");
        l.d(gVar, "");
        l.d(map, "");
    }

    private final void a(t tVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        com.bytedance.android.monitor.webview.c t = t();
        WebView c2 = c();
        String b2 = tVar.b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(StringSet.type, "h5");
        if (p() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        u p2 = p();
        if (p2 != null) {
            String l2 = p2.l();
            if (l2 != null) {
                jSONObject.put("fallback_reason", l2);
            }
            String m2 = p2.m();
            if (m2 != null) {
                jSONObject.put("fallback_message", m2);
            }
        }
        e.a(jSONObject, tVar.getFormatData());
        v r2 = r();
        if (r2 != null) {
            e.a(jSONObject, r2.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            e.a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            e.a(jSONObject7, jSONObject3);
        }
        t.a(c2, b2, str, jSONObject4, jSONObject6, jSONObject7.toString());
        t().a(c());
    }
}
