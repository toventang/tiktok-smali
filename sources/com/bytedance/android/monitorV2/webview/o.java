package com.bytedance.android.monitorV2.webview;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    Map<WebView, String> f24281a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<WebView, Long> f24282b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<WebView, Boolean> f24283c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    Map<WebView, Long> f24284d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    Map<WebView, Long> f24285e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    Map<WebView, Long> f24286f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    Map<WebView, Boolean> f24287g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    Map<WebView, Boolean> f24288h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    Map<String, String> f24289i = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    Map<WebView, List<String>> f24290j = new WeakHashMap();

    /* renamed from: k  reason: collision with root package name */
    Map<WebView, Map<String, Integer>> f24291k = new WeakHashMap();

    /* renamed from: l  reason: collision with root package name */
    public Map<WebView, List<Object>> f24292l = new WeakHashMap();

    /* renamed from: m  reason: collision with root package name */
    Map<String, JSONObject> f24293m = new WeakHashMap();

    static {
        Covode.recordClassIndex(14268);
    }

    private boolean a(WebView webView) {
        Boolean bool = this.f24283c.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final JSONObject a(WebView webView, a.C0514a aVar, String str) {
        JSONObject jSONObject = new JSONObject();
        f.a(jSONObject, "attach_ts", this.f24285e.get(webView));
        f.a(jSONObject, "detach_ts", this.f24286f.get(webView));
        f.a(jSONObject, "container_init_ts", this.f24284d.get(webView));
        JSONObject jSONObject2 = new JSONObject();
        f.a(jSONObject2, "bid", str);
        f.a(jSONObject2, "setting_bid", aVar.f23925a);
        f.a(jSONObject2, "hit_sample", aVar.f23926b);
        f.a(jSONObject2, "setting_id", aVar.f23927c);
        f.a(jSONObject, "bid_info", jSONObject2);
        f.a(jSONObject, "container_reuse", Boolean.valueOf(a(webView)));
        return jSONObject;
    }
}
