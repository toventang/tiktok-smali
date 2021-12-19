package com.bytedance.android.monitor.webview.a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f23688a;

    static {
        Covode.recordClassIndex(14041);
    }

    public final void a() {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            this.f23688a = System.currentTimeMillis();
        }
    }

    public final void a(WebView webView, String str) {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            long j2 = this.f23688a;
            if (j2 != 0) {
                long currentTimeMillis = System.currentTimeMillis() - j2;
                if (currentTimeMillis > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        Uri parse = Uri.parse(str);
                        d.a(jSONObject, "url", parse.toString());
                        d.a(jSONObject, "host", parse.getHost());
                        d.a(jSONObject, "path", parse.getPath());
                        d.a(jSONObject, "hybrid_monitor_switch", "false");
                        d.a(jSONObject, "js_inject_switch", "false");
                        d.a(jSONObject, "container_type", "web");
                        JSONObject jSONObject2 = new JSONObject();
                        d.a(jSONObject2, "web_page_cost", currentTimeMillis);
                        i.f23764a.a(webView, str, "performance_test", jSONObject.toString(), jSONObject2.toString(), null);
                        i.f23764a.a(webView);
                        this.f23688a = 0;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
