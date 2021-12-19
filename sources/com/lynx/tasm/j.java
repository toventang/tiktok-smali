package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public int f56744a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f56745b;

    /* renamed from: c  reason: collision with root package name */
    private String f56746c = "";

    static {
        Covode.recordClassIndex(35351);
    }

    public final String a() {
        JSONObject jSONObject = this.f56745b;
        if (jSONObject == null) {
            return this.f56746c;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "{\"code\": " + this.f56744a + ",\"msg\":" + a() + "}";
    }

    public j(String str, int i2) {
        this.f56744a = i2;
        this.f56746c = str;
    }

    public j(JSONObject jSONObject, int i2) {
        this.f56745b = jSONObject;
        this.f56744a = i2;
        try {
            if (jSONObject.has("error")) {
                this.f56746c = this.f56745b.getString("error");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
