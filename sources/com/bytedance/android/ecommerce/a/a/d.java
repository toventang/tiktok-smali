package com.bytedance.android.ecommerce.a.a;

import com.bytedance.android.ecommerce.a.k;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public String f6893e;

    /* renamed from: f  reason: collision with root package name */
    public String f6894f;

    /* renamed from: g  reason: collision with root package name */
    public k f6895g;

    /* renamed from: h  reason: collision with root package name */
    public String f6896h;

    /* renamed from: i  reason: collision with root package name */
    public String f6897i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6898j;

    /* renamed from: k  reason: collision with root package name */
    public String f6899k;

    static {
        Covode.recordClassIndex(3339);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.a.a.a
    public final JSONObject b() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str = this.f6893e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject2.put("nonce", str);
            k kVar = this.f6895g;
            if (kVar == null) {
                jSONObject = str2;
            } else {
                jSONObject = kVar.a();
            }
            jSONObject2.put("configuration", jSONObject);
            String str3 = this.f6896h;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject2.put("payment_reference", str3);
            String str4 = this.f6897i;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject2.put("charge_id", str4);
            String str5 = this.f6896h;
            if (str5 == null) {
                str5 = str2;
            }
            jSONObject2.put("payment_reference", str5);
            jSONObject2.put("is_agreement", this.f6898j);
            String str6 = this.f6899k;
            if (str6 == null) {
                str6 = str2;
            }
            jSONObject2.put("merchant_order_id", str6);
            String str7 = this.f6894f;
            if (str7 != null) {
                str2 = str7;
            }
            jSONObject2.put("merchant_user_id", str2);
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    @Override // com.bytedance.android.ecommerce.a.a.a
    public final String toString() {
        return "{mNonce='" + this.f6893e + '\'' + ", mMerchantUserId='" + this.f6894f + '\'' + ", mRequestConfiguration=" + this.f6895g + ", mPaymentReference='" + this.f6896h + '\'' + ", mChargeId='" + this.f6897i + '\'' + ", mIsAgreement=" + this.f6898j + ", mMerchantOrderId='" + this.f6899k + '\'' + ", baseRequest='" + super.toString() + '\'' + '}';
    }
}
