package com.ss.android.ugc.awemepushlib.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f145395a = new HashMap<>();

    static {
        Covode.recordClassIndex(95070);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        MethodCollector.i(7701);
        try {
            jSONObject = new JSONObject(this.f145395a);
            MethodCollector.o(7701);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(7701);
            return null;
        }
        return jSONObject;
    }

    public final c a(String str, Long l2) {
        this.f145395a.put(str, l2);
        return this;
    }

    public final c a(String str, String str2) {
        this.f145395a.put(str, str2);
        return this;
    }
}
