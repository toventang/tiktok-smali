package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(6532);
    }

    public static final JSONObject a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
