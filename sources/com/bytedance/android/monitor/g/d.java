package com.bytedance.android.monitor.g;

import com.bytedance.android.monitor.a.c;
import com.bytedance.android.monitor.m.a;
import com.bytedance.android.monitor.m.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d extends a implements c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f23512a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, JSONObject> f23513b = new HashMap();

    static {
        Covode.recordClassIndex(13963);
    }

    private d() {
    }

    public static c b() {
        MethodCollector.i(1123);
        if (f23512a == null) {
            synchronized (d.class) {
                try {
                    if (f23512a == null) {
                        f23512a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1123);
                    throw th;
                }
            }
        }
        c cVar = f23512a;
        MethodCollector.o(1123);
        return cVar;
    }

    @Override // com.bytedance.android.monitor.a.c
    public final void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (a() && str.length() != 0) {
            String[] a2 = b.a(str);
            a.a(jSONObject, "url", (Object) str);
            a.a(jSONObject, "host", (Object) a2[0]);
            a.a(jSONObject, "path", (Object) a2[1]);
            String str3 = a2[0];
            String str4 = a2[1];
            a.a(jSONObject3, "event_name", str2);
            JSONObject jSONObject4 = new JSONObject();
            a.a(jSONObject4, "client_category", jSONObject);
            a.a(jSONObject4, "client_metric", jSONObject2);
            a.a(jSONObject4, "client_extra", jSONObject3);
            a.a(jSONObject4, "ev_type", "custom");
            a.a(jSONObject4, "url", str);
            a.a(jSONObject4, "host", str3);
            a.a(jSONObject4, "path", str4);
            a.a(jSONObject4, "platform", (Object) 0);
            b("custom", jSONObject4);
        }
    }
}
