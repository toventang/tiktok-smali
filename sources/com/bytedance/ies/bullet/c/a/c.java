package com.bytedance.ies.bullet.c.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(18714);
    }

    public static final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.c(jSONObject, "");
        l.c(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }
}
