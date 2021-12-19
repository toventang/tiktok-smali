package com.bytedance.android.monitorV2.webview.a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.webview.n;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f24164a;

    static {
        Covode.recordClassIndex(14223);
    }

    public final void a() {
        if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
            this.f24164a = System.currentTimeMillis();
        }
    }

    public final void a(WebView webView, String str) {
        if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
            long j2 = this.f24164a;
            if (j2 != 0) {
                long currentTimeMillis = System.currentTimeMillis() - j2;
                if (currentTimeMillis > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        Uri parse = Uri.parse(str);
                        f.a(jSONObject, "url", parse.toString());
                        f.a(jSONObject, "host", parse.getHost());
                        f.a(jSONObject, "path", parse.getPath());
                        f.a(jSONObject, "hybrid_monitor_switch", "false");
                        f.a(jSONObject, "js_inject_switch", "false");
                        f.a(jSONObject, "container_type", "web");
                        f.a(new JSONObject(), "web_page_cost", currentTimeMillis);
                        n.f24264a.b(webView, str, "performance_test", jSONObject.toString());
                        n.f24264a.a(webView);
                        this.f24164a = 0;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
