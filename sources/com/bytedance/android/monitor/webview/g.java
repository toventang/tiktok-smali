package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f23759a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f23760b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f23761c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f23762d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f23763e;

    static {
        Covode.recordClassIndex(14073);
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        d.a(jSONObject, "monitors", jSONObject2);
        d.a(jSONObject, "sendCommonParams", this.f23763e);
        a(jSONObject2, this.f23759a);
        a(jSONObject2, this.f23760b);
        a(jSONObject2, this.f23761c);
        a(jSONObject2, this.f23762d);
        return "SlardarHybrid('config', " + jSONObject.toString() + ")";
    }

    public g(String str) {
        JSONObject a2 = d.a(str);
        this.f23759a = d.c(a2, "apmReportConfig");
        this.f23760b = d.c(a2, "performanceReportConfig");
        this.f23761c = d.c(a2, "errorMsgReportConfig");
        this.f23762d = d.c(a2, "resourceTimingReportConfig");
        this.f23763e = d.c(a2, "commonReportConfig");
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                d.a(jSONObject, next, d.d(jSONObject2, next));
            }
        }
    }
}
