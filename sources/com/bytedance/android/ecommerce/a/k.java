package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public String f6989a;

    /* renamed from: b  reason: collision with root package name */
    public String f6990b;

    /* renamed from: c  reason: collision with root package name */
    public String f6991c;

    /* renamed from: d  reason: collision with root package name */
    public String f6992d;

    static {
        Covode.recordClassIndex(3353);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("environment", this.f6989a);
            jSONObject.put("locale", this.f6990b);
            jSONObject.put("origin_key", this.f6991c);
            jSONObject.put("platform", this.f6992d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
