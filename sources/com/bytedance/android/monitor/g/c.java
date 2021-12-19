package com.bytedance.android.monitor.g;

import com.bytedance.android.monitor.a.e;
import com.bytedance.android.monitor.m.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class c extends b implements e {

    /* renamed from: a  reason: collision with root package name */
    public String f23511a;

    static {
        Covode.recordClassIndex(13962);
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2);

    @Override // com.bytedance.android.monitor.a.e
    public final void a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            a.a(jSONObject, "tag", "ttlive_sdk");
            a.a(jSONObject2, "aid", this.f23511a);
            a.a(jSONObject2, "extra", jSONObject);
            a(str, 0, null, jSONObject2);
        } catch (Exception unused) {
        }
    }
}
