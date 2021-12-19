package com.bytedance.apm.k;

import com.bytedance.b.j.c;
import com.bytedance.b.j.e.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f25106a;

    static {
        Covode.recordClassIndex(14656);
    }

    private f() {
    }

    public static f a() {
        if (f25106a == null) {
            synchronized (f.class) {
                if (f25106a == null) {
                    f25106a = new f();
                }
            }
        }
        return f25106a;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            a aVar = (a) c.a(a.class);
            jSONObject.put("process_usage", aVar.a());
            jSONObject.put("stat_speed", aVar.b());
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
