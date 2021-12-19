package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f6985a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f6986b;

    /* renamed from: c  reason: collision with root package name */
    public String f6987c;

    /* renamed from: d  reason: collision with root package name */
    public String f6988d;

    static {
        Covode.recordClassIndex(3352);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mBody", this.f6985a);
            jSONObject.put("mHeader", this.f6986b);
            jSONObject.put("mMethod", this.f6987c);
            jSONObject.put("mUrl", this.f6988d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public j(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        this.f6985a = jSONObject;
        this.f6986b = jSONObject2;
        this.f6987c = str;
        this.f6988d = str2;
    }
}
