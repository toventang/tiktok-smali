package com.bytedance.android.monitorV2.lynx.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, JSONObject> f24074a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14186);
    }

    public final JSONObject a(String str) {
        return this.f24074a.get(str);
    }

    public final void a(String str, JSONObject jSONObject) {
        l.c(jSONObject, "");
        if (str != null && str.length() != 0) {
            this.f24074a.put(str, jSONObject);
        }
    }
}
