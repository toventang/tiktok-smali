package com.bytedance.android.livesdk.container.i;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class d extends a<WebView> {

    /* renamed from: b  reason: collision with root package name */
    public static final d f16800b = new d();

    private d() {
        super("webview");
    }

    static {
        Covode.recordClassIndex(9323);
    }

    @Override // com.bytedance.android.livesdk.container.i.b
    public final /* synthetic */ void a(View view, String str, JSONObject jSONObject) {
        c cVar = i.f23764a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        cVar.a((WebView) view, null, str, jSONObject, null, null, jSONObject2, false);
    }
}
