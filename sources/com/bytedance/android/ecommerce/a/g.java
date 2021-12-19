package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f6968a;

    /* renamed from: b  reason: collision with root package name */
    public String f6969b;

    /* renamed from: c  reason: collision with root package name */
    public String f6970c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6971d;

    static {
        Covode.recordClassIndex(3349);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("element", this.f6968a);
            jSONObject.put("param_name", this.f6969b);
            jSONObject.put("param_value", this.f6970c);
            jSONObject.put("is_encrypted", this.f6971d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public g(String str, String str2, String str3) {
        this.f6968a = str;
        this.f6969b = str2;
        this.f6970c = str3;
    }
}
