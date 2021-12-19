package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.f.a;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.c.a.c;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    Map<WebView, String> f23802a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<WebView, Long> f23803b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<WebView, Boolean> f23804c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    Map<WebView, Long> f23805d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    Map<WebView, Long> f23806e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    Map<WebView, Long> f23807f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    Map<WebView, Boolean> f23808g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    Map<WebView, Boolean> f23809h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    Map<WebView, Map<String, Integer>> f23810i = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    public Map<WebView, List<Object>> f23811j = new WeakHashMap();

    static {
        Covode.recordClassIndex(14087);
    }

    private boolean b(WebView webView) {
        Boolean bool = this.f23804c.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final JSONObject a(WebView webView) {
        JSONObject jSONObject = new JSONObject();
        d.a(jSONObject, "attach_ts", this.f23806e.get(webView));
        d.a(jSONObject, "detach_ts", this.f23807f.get(webView));
        d.a(jSONObject, "container_init_ts", this.f23805d.get(webView));
        d.a(jSONObject, "container_reuse", (Object) Boolean.valueOf(b(webView)));
        return jSONObject;
    }

    public final void a(final WebView webView, final c cVar) {
        a.a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14088);
            }

            public final void run() {
                List<Object> list = o.this.f23811j.get(webView);
                if (list != null) {
                    Iterator<Object> it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        });
    }
}
