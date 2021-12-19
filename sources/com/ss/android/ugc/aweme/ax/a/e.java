package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(41686);
    }

    public static final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }
}
