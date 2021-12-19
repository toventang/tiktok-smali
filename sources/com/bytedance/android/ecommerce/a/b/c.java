package com.bytedance.android.ecommerce.a.b;

import com.bytedance.android.ecommerce.a.j;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public j f6924f;

    /* renamed from: g  reason: collision with root package name */
    public String f6925g;

    /* renamed from: h  reason: collision with root package name */
    public String f6926h;

    /* renamed from: i  reason: collision with root package name */
    public String f6927i;

    /* renamed from: j  reason: collision with root package name */
    public String f6928j;

    static {
        Covode.recordClassIndex(3343);
    }

    public c() {
    }

    @Override // com.bytedance.android.ecommerce.a.b.a
    public final String toString() {
        String jVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mResultCode", this.f6913c);
            jSONObject.put("mErrorCode", this.f6914d);
            jSONObject.put("mErrorMessage", this.f6915e);
            j jVar2 = this.f6924f;
            if (jVar2 == null) {
                jVar = "";
            } else {
                jVar = jVar2.toString();
            }
            jSONObject.put("mRedirectDetails", jVar);
            jSONObject.put("mPaymentMethodDetails", this.f6925g);
            jSONObject.put("mExpirationTime", this.f6926h);
            jSONObject.put("mPaymentMethodToken", this.f6927i);
            jSONObject.put("mPresentToShopperDetails", this.f6928j);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public c(String str) {
        super(str);
        j jVar;
        try {
            this.f6914d = this.f6911a.optString("error_code");
            this.f6915e = this.f6911a.optString("error_message");
            this.f6926h = this.f6911a.optString("expiration_time");
            this.f6925g = this.f6911a.optString("payment_method_details");
            this.f6927i = this.f6911a.optString("payment_method_token");
            JSONObject optJSONObject = this.f6911a.optJSONObject("redirect_details");
            if (optJSONObject == null) {
                jVar = null;
            } else {
                jVar = new j(optJSONObject.optJSONObject("body"), optJSONObject.optJSONObject("header"), optJSONObject.optString("method"), optJSONObject.optString("url"));
            }
            this.f6924f = jVar;
            this.f6913c = this.f6911a.optString("result_code");
            this.f6928j = this.f6911a.optString("present_to_shopper_details");
        } catch (Throwable unused) {
        }
    }
}
