package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f6982a;

    /* renamed from: b  reason: collision with root package name */
    public String f6983b;

    /* renamed from: c  reason: collision with root package name */
    public List<g> f6984c;

    static {
        Covode.recordClassIndex(3351);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method_id", this.f6982a);
            jSONObject.put("payment_method_token", this.f6983b);
            JSONArray jSONArray = new JSONArray();
            for (g gVar : this.f6984c) {
                jSONArray.put(gVar.a());
            }
            jSONObject.put("payment_elements", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public i(String str, List<g> list) {
        this.f6982a = str;
        this.f6984c = list;
    }
}
