package com.bytedance.b.a.b;

import com.bytedance.b.h.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f25846a;

    static {
        Covode.recordClassIndex(15090);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return "tracing";
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        return com.bytedance.b.k.b.a("tracing", this.f25846a);
    }

    public d(JSONArray jSONArray) {
        this.f25846a = jSONArray;
    }

    public d(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.f25846a = jSONArray;
    }
}
