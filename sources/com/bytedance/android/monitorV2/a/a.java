package com.bytedance.android.monitorV2.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class a implements f {
    static {
        Covode.recordClassIndex(14098);
    }

    public abstract void a(JSONObject jSONObject);

    @Override // com.bytedance.android.monitorV2.a.f
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        return jSONObject;
    }
}
