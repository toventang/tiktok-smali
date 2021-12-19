package com.bytedance.android.monitorV2.webview;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a implements b {
    static {
        Covode.recordClassIndex(14222);
    }

    @Override // com.bytedance.android.monitorV2.webview.b
    public final void a(String str, JSONObject jSONObject) {
        try {
            b.a(str, (JSONObject) null, (JSONObject) null, jSONObject);
            com.bytedance.android.monitorV2.i.b.b("WebViewMonitorDefault", "apm upload: ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }
}
