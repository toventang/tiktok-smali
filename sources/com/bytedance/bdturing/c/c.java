package com.bytedance.bdturing.c;

import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    int f26444a;

    /* renamed from: b  reason: collision with root package name */
    String f26445b;

    /* renamed from: c  reason: collision with root package name */
    String f26446c;

    /* renamed from: d  reason: collision with root package name */
    String f26447d;

    /* renamed from: e  reason: collision with root package name */
    String f26448e;

    /* renamed from: f  reason: collision with root package name */
    b f26449f;

    static {
        Covode.recordClassIndex(15547);
    }

    public final void a(int i2, JSONObject jSONObject) {
        b bVar = this.f26449f;
        if (bVar != null) {
            try {
                bVar.a(a(i2, "callback", jSONObject, this).toString());
            } catch (JSONException unused) {
            }
        }
    }

    c(b bVar, String str) {
        this.f26449f = bVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f26444a = jSONObject.getInt("JSSDK");
            this.f26445b = jSONObject.getString("func");
            this.f26446c = jSONObject.getString("params");
            this.f26447d = jSONObject.getString("__msg_type");
            this.f26448e = jSONObject.getString("__callback_id");
        } catch (JSONException e2) {
            g.a(e2);
        }
    }

    public static String a(String str, String str2, JSONObject jSONObject, String str3) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", str2);
            jSONObject2.put("data", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str3);
            return jSONObject3.toString();
        } catch (JSONException e2) {
            g.a(e2);
            return null;
        }
    }

    private static JSONObject a(int i2, String str, JSONObject jSONObject, c cVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i2);
        jSONObject2.put("func", cVar.f26445b);
        jSONObject2.put("__msg_type", str);
        Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "{}";
        }
        jSONObject2.put("data", obj);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__params", jSONObject2);
        jSONObject3.put("__callback_id", cVar.f26448e);
        return jSONObject3;
    }
}
