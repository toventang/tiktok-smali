package com.bytedance.android.monitorV2.webview;

import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f24259a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f24260b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f24261c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f24262d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f24263e;

    static {
        Covode.recordClassIndex(14263);
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        f.a(jSONObject, "monitors", jSONObject2);
        f.a(jSONObject, "sendCommonParams", this.f24263e);
        a(jSONObject2, this.f24259a);
        a(jSONObject2, this.f24260b);
        a(jSONObject2, this.f24261c);
        a(jSONObject2, this.f24262d);
        return "SlardarHybrid('config', " + jSONObject.toString() + ")";
    }

    public m(String str) {
        JSONObject a2 = f.a(str);
        this.f24259a = f.d(a2, "apmReportConfig");
        this.f24260b = f.d(a2, "performanceReportConfig");
        this.f24261c = f.d(a2, "errorMsgReportConfig");
        this.f24262d = f.d(a2, "resourceTimingReportConfig");
        this.f24263e = f.d(a2, "commonReportConfig");
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.a(jSONObject, next, f.e(jSONObject2, next));
            }
        }
    }
}
