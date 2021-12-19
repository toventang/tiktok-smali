package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public String f6993a;

    /* renamed from: b  reason: collision with root package name */
    public String f6994b;

    /* renamed from: c  reason: collision with root package name */
    public String f6995c;

    /* renamed from: d  reason: collision with root package name */
    public String f6996d;

    /* renamed from: e  reason: collision with root package name */
    public String f6997e;

    /* renamed from: f  reason: collision with root package name */
    public String f6998f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6999g;

    /* renamed from: h  reason: collision with root package name */
    public String f7000h;

    /* renamed from: i  reason: collision with root package name */
    public String f7001i;

    /* renamed from: j  reason: collision with root package name */
    public String f7002j;

    /* renamed from: k  reason: collision with root package name */
    public List<c> f7003k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, c> f7004l;

    static {
        Covode.recordClassIndex(3354);
    }

    public l(JSONObject jSONObject) {
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        this.f7003k = new ArrayList();
        this.f7004l = new HashMap();
        this.f6993a = jSONObject.optString("payment_method_id");
        this.f6994b = jSONObject.optString("payment_method_type");
        this.f6995c = jSONObject.optString("payment_method");
        this.f6996d = jSONObject.optString("masked_identity");
        this.f6997e = jSONObject.optString("icon_url");
        this.f6998f = jSONObject.optString("dark_mode_icon_url");
        this.f6999g = jSONObject.optBoolean("is_primary");
        this.f7000h = jSONObject.optString("payment_method_token");
        this.f7001i = jSONObject.optString("bind_time");
        this.f7002j = jSONObject.optString("recent_used_time");
        JSONArray optJSONArray = jSONObject.optJSONArray("needed_elements");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    c cVar = new c((JSONObject) optJSONArray.get(i2));
                    this.f7003k.add(cVar);
                    this.f7003k.addAll(cVar.f6947m);
                    for (c cVar2 : cVar.f6947m) {
                        this.f7004l.put(cVar2.f6935a, cVar2);
                    }
                    this.f7004l.put(cVar.f6935a, cVar);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
