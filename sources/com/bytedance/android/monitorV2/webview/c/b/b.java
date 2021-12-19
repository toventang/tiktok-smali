package com.bytedance.android.monitorV2.webview.c.b;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.d.i;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.webview.n;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

public final class b extends i {

    /* renamed from: k  reason: collision with root package name */
    public SoftReference<WebView> f24175k;

    /* renamed from: l  reason: collision with root package name */
    public String f24176l;

    /* renamed from: m  reason: collision with root package name */
    public long f24177m;
    public String n = "web";
    public JSONObject o = new JSONObject();
    public JSONObject p = new JSONObject();

    static {
        Covode.recordClassIndex(14238);
    }

    @Override // com.bytedance.android.monitorV2.d.i, com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        f.a(jSONObject, "js_dependency_version", "2.2.1");
        f.a(jSONObject, "native_page", this.f24176l);
        f.a(jSONObject, "webview_type", this.n);
        f.a(jSONObject, this.o);
        f.a(jSONObject, this.p);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            f.a(jSONObject, "debug_context", optJSONObject);
        }
        f.a(optJSONObject, "is_ttweb_enable", String.valueOf(((n) n.f24264a).c()));
    }
}
