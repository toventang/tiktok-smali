package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public int f22405a;
    @com.google.gson.a.c(a = "iap_id")

    /* renamed from: b  reason: collision with root package name */
    public String f22406b;
    @com.google.gson.a.c(a = "price")

    /* renamed from: c  reason: collision with root package name */
    public String f22407c;
    @com.google.gson.a.c(a = "diamond_count")

    /* renamed from: d  reason: collision with root package name */
    public int f22408d;
    @com.google.gson.a.c(a = "giving_count")

    /* renamed from: e  reason: collision with root package name */
    public int f22409e;

    /* renamed from: f  reason: collision with root package name */
    public int f22410f;

    /* renamed from: g  reason: collision with root package name */
    public String f22411g = "";

    /* renamed from: h  reason: collision with root package name */
    public long f22412h;

    /* renamed from: i  reason: collision with root package name */
    public String f22413i = "";

    /* renamed from: j  reason: collision with root package name */
    public a f22414j;

    static {
        Covode.recordClassIndex(13228);
    }

    public c() {
    }

    public String toString() {
        return "Diamond{id=" + this.f22405a + ", iapId='" + this.f22406b + '\'' + ", price='" + this.f22407c + '\'' + ", count='" + this.f22408d + '\'' + '}';
    }

    public static JSONObject a(c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", cVar.f22405a);
            jSONObject.put("iapId", cVar.f22406b);
            jSONObject.put("price", cVar.f22407c);
            jSONObject.put("count", cVar.f22408d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public c(String str, String str2, String str3, long j2, String str4) {
        this.f22406b = str;
        this.f22407c = str2;
        this.f22411g = str3;
        this.f22412h = j2;
        this.f22413i = str4;
    }
}
