package com.ss.android.ugc.aweme.ax.a.b;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f67715a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f67716b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<b> f67717c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<b> f67718d;

    /* renamed from: e  reason: collision with root package name */
    private static final h f67719e;

    /* renamed from: f  reason: collision with root package name */
    private static final h f67720f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f67721g;

    private e() {
    }

    static {
        Covode.recordClassIndex(41679);
        List<b> c2 = n.c(new b("PageStartTime", "StartLoadTime", "rn_load_interval"), new b("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new b("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new b("FirstDrawTime", "PageFinishTime", "page_finish_interval"));
        f67716b = c2;
        List<b> c3 = n.c(new b("redirectStart", "redirectEnd", "redirect_interval"), new b("fetchStart", "domainLookupStart", "app_cache_interval"), new b("domainLookupStart", "domainLookupEnd", "dns_interval"), new b("connectStart", "connectEnd", "tcp_interval"), new b("requestStart", "responseStart", "request_interval"), new b("responseStart", "responseEnd", "response_interval"), new b("domLoading", "domInteractive", "dom_load_interval"), new b("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new b("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));
        f67717c = c3;
        List<b> c4 = n.c(new b("redirectStart", "redirectEnd", "redirect_interval"), new b("fetchStart", "domainLookupStart", "app_cache_interval"), new b("domainLookupStart", "domainLookupEnd", "dns_interval"), new b("connectStart", "connectEnd", "tcp_interval"), new b("requestStart", "responseStart", "request_interval"), new b("responseStart", "responseEnd", "response_interval"));
        f67718d = c4;
        f67719e = new h(c2);
        f67720f = new h(c3);
        f67721g = new h(c4);
    }

    public static h a(c cVar) {
        int i2 = f.f67722a[cVar.ordinal()];
        if (i2 == 1) {
            return f67719e;
        }
        if (i2 == 2) {
            return f67720f;
        }
        if (i2 == 3) {
            return f67721g;
        }
        throw new h.n();
    }

    public static JSONObject a(JSONObject jSONObject, c cVar) {
        l.d(jSONObject, "");
        l.d(cVar, "");
        h a2 = a(cVar);
        if (a2 == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(next));
            if (!(valueOf.longValue() == 0 || valueOf == null)) {
                valueOf.longValue();
                l.b(next, "");
                d a3 = a2.a(next, jSONObject);
                if (a3 != null) {
                    jSONObject2.put(a3.f67713a, a3.f67714b);
                }
            }
        }
        return jSONObject2;
    }
}
