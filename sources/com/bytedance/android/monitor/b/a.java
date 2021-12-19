package com.bytedance.android.monitor.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class a implements f {
    static {
        Covode.recordClassIndex(13936);
    }

    public abstract void a(JSONObject jSONObject);

    @Override // com.bytedance.android.monitor.b.f
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        return jSONObject;
    }
}
