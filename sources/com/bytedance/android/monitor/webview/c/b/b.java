package com.bytedance.android.monitor.webview.c.b;

import android.webkit.WebView;
import com.bytedance.android.monitor.d.i;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.json.JSONObject;

public final class b extends i {

    /* renamed from: l  reason: collision with root package name */
    public SoftReference<WebView> f23713l;

    /* renamed from: m  reason: collision with root package name */
    public String f23714m;
    public long n;
    public JSONObject o = new JSONObject();
    private JSONObject p = new JSONObject();

    static {
        Covode.recordClassIndex(14059);
    }

    public final SoftReference<WebView> b() {
        SoftReference<WebView> softReference = this.f23713l;
        if (softReference != null) {
            return softReference;
        }
        return new SoftReference<>(null);
    }

    public final void b(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            d.a(this.p, next, d.d(jSONObject, next));
        }
    }

    @Override // com.bytedance.android.monitor.d.i, com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        d.a(jSONObject, "js_dependency_version", "2.2.1");
        d.a(jSONObject, "native_page", this.f23714m);
        d.a(jSONObject, "webview_type", this.f23493d);
        d.a(jSONObject, this.p);
        d.a(jSONObject, this.o);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            d.a(jSONObject, "debug_context", optJSONObject);
        }
        d.a(optJSONObject, "is_ttweb_enable", (Object) Boolean.valueOf(((com.bytedance.android.monitor.webview.i) com.bytedance.android.monitor.webview.i.f23764a).c()));
    }
}
