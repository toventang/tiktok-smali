package com.bytedance.sdk.b.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f43506a;

    /* renamed from: b  reason: collision with root package name */
    public long f43507b;

    static {
        Covode.recordClassIndex(26640);
    }

    public final boolean a() {
        if (this.f43507b != 0 && System.currentTimeMillis() / 1000 > this.f43507b) {
            return true;
        }
        return false;
    }

    public static b a(String str) {
        b bVar = new b();
        JSONObject jSONObject = new JSONObject(str);
        bVar.f43506a = jSONObject.optString("free_flow_id");
        bVar.f43507b = (long) jSONObject.optInt("expiration_time", -1);
        return bVar;
    }
}
