package com.bytedance.android.a.a;

import com.bytedance.android.a.a.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f6609a;

    static {
        Covode.recordClassIndex(3183);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(3546);
        if (f6609a == null) {
            synchronized (c.class) {
                try {
                    if (f6609a == null) {
                        f6609a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3546);
                    throw th;
                }
            }
        }
        c cVar = f6609a;
        MethodCollector.o(3546);
        return cVar;
    }

    public final void a(long j2) {
        a("host_dispatch_track_wait", j2, (JSONObject) null);
    }

    private static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sp", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final void b(String str, long j2) {
        a("host_sp_cost_edit", j2, a(str));
    }

    public final void a(String str, long j2) {
        a("host_sp_cost_init", j2, a(str));
    }
}
