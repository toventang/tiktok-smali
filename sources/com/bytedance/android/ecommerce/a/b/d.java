package com.bytedance.android.ecommerce.a.b;

import com.bytedance.android.ecommerce.g.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f6929f;

    /* renamed from: g  reason: collision with root package name */
    public String f6930g;

    /* renamed from: h  reason: collision with root package name */
    public a f6931h;

    /* renamed from: i  reason: collision with root package name */
    public String f6932i;

    /* renamed from: j  reason: collision with root package name */
    public String f6933j;

    /* renamed from: k  reason: collision with root package name */
    public String f6934k;

    static {
        Covode.recordClassIndex(3344);
    }

    public d() {
    }

    @Override // com.bytedance.android.ecommerce.a.b.a
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mStatus", this.f6931h.getStatus());
            jSONObject.put("mErrorCode", this.f6929f);
            jSONObject.put("mErrorMessage", this.f6930g);
            jSONObject.put("mAmount", this.f6932i);
            jSONObject.put("mCurrency", this.f6933j);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public d(String str) {
        super(str);
        try {
            this.f6931h = a.getOrderStatus(this.f6911a.optString("status"));
            this.f6929f = this.f6911a.optString("error_code");
            this.f6930g = this.f6911a.optString("error_message");
            this.f6932i = this.f6911a.optString("amount");
            this.f6933j = this.f6911a.optString("currency");
        } catch (Throwable unused) {
        }
    }

    public d(String str, String str2) {
        this.f6931h = a.getOrderStatus(null);
        this.f6929f = str;
        this.f6930g = str2;
        this.f6932i = null;
        this.f6933j = null;
        this.f6934k = null;
    }
}
