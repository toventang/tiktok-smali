package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class h implements a {
    static {
        Covode.recordClassIndex(14074);
    }

    @Override // com.bytedance.android.monitor.webview.a
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            b.a(str, (JSONObject) null, (JSONObject) null, jSONObject2);
            com.bytedance.android.monitor.h.b.b("WebViewMonitorDefault", "apm upload: ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }
}
