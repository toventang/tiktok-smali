package com.bytedance.android.monitor.webview;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.b.e;
import com.bytedance.android.monitor.b.f;
import com.bytedance.android.monitor.d.a;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.c.b.b;
import com.bytedance.android.monitor.webview.c.b.c;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    b f23792a;

    /* renamed from: b  reason: collision with root package name */
    public o f23793b;

    /* renamed from: c  reason: collision with root package name */
    Map<String, com.bytedance.android.monitor.webview.c.a.b> f23794c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private c f23795d;

    /* renamed from: e  reason: collision with root package name */
    private a f23796e;

    static {
        Covode.recordClassIndex(14084);
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        if (this.f23795d == null) {
            this.f23795d = new c(this.f23792a, "perf");
        }
        return this.f23795d;
    }

    public final void a(String str) {
        a().a(str);
    }

    public final boolean b(String str) {
        if (!a().f23726m.contains(str)) {
            return true;
        }
        if ("blank".equals(str) || "performance".equals(str) || "resource_performance".equals(str)) {
            return false;
        }
        return true;
    }

    public final void a(WebView webView) {
        c a2 = a();
        a(webView, a2);
        a().m();
        this.f23793b.a(webView, a2);
    }

    public final void a(a aVar) {
        this.f23796e = aVar;
        a().f23708f = aVar;
        for (com.bytedance.android.monitor.webview.c.a.b bVar : this.f23794c.values()) {
            if (bVar instanceof com.bytedance.android.monitor.webview.c.a.c) {
                ((com.bytedance.android.monitor.webview.c.a.c) bVar).f23708f = aVar;
            }
        }
    }

    public final void a(Map<String, Integer> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                int intValue = map.get(str).intValue();
                b bVar = this.f23792a;
                d.a(bVar.o, str, Integer.valueOf(intValue));
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        this.f23792a.b(jSONObject);
    }

    public static void a(WebView webView, com.bytedance.android.monitor.webview.c.a.c cVar) {
        e i2;
        if (webView != null && cVar != null && cVar.l() && (i2 = i.f23765b.i(webView)) != null) {
            i2.a(cVar);
        }
    }

    public final void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, str, jSONObject, null);
    }

    public final void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        b bVar = this.f23792a;
        AnonymousClass1 r1 = new com.bytedance.android.monitor.webview.c.a.c(bVar, str, bVar.f23492c, jSONObject2, str, null) {
            /* class com.bytedance.android.monitor.webview.n.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JSONObject f23797a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f23798b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.monitor.d.b f23799c = null;

            static {
                Covode.recordClassIndex(14085);
            }

            @Override // com.bytedance.android.monitor.b.g
            public final f f() {
                return this.f23799c;
            }

            @Override // com.bytedance.android.monitor.webview.c.a.c
            /* renamed from: k */
            public final com.bytedance.android.monitor.webview.c.a.a e() {
                if (this.f23797a == null) {
                    return null;
                }
                return new com.bytedance.android.monitor.webview.c.a.a(this.f23798b) {
                    /* class com.bytedance.android.monitor.webview.n.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14086);
                    }

                    @Override // com.bytedance.android.monitor.webview.c.a.a
                    public final void b() {
                    }

                    @Override // com.bytedance.android.monitor.b.a
                    public final void a(JSONObject jSONObject) {
                        d.a(jSONObject, AnonymousClass1.this.f23797a);
                    }

                    {
                        this.f23702c = true;
                    }
                };
            }

            {
                this.f23797a = r6;
                this.f23798b = r7;
            }
        };
        r1.f23708f = this.f23796e;
        r1.b(jSONObject);
        a(webView, r1);
    }

    n(WebView webView, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        b bVar = new b();
        this.f23792a = bVar;
        SoftReference<WebView> softReference = new SoftReference<>(webView);
        bVar.f23713l = softReference;
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.c.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14060);
            }

            public final void run() {
                Activity a2;
                WebView webView = b.this.f23713l.get();
                if (webView != null && (a2 = com.bytedance.android.monitor.l.a.a(webView.getContext())) != null) {
                    HybridMonitor.getInstance().wrapTouchTraceCallback(a2);
                    b.this.f23714m = a2.getClass().getName();
                }
            }
        });
        bVar.f23495f = i.f23765b.f(softReference.get());
        this.f23792a.f23492c = str;
        this.f23792a.f23493d = str2;
        this.f23792a.f23490a = str3;
        this.f23792a.f23494e = j2;
        this.f23792a.n = j3;
        this.f23792a.f23491b = com.bytedance.android.monitor.l.f.a();
        b bVar2 = this.f23792a;
        if (bVar2.f23496g == null) {
            bVar2.f23496g = new JSONObject();
        }
        d.a(bVar2.f23496g, jSONObject);
        this.f23794c.put("falconPerf", new com.bytedance.android.monitor.webview.c.b.a(this.f23792a));
    }
}
