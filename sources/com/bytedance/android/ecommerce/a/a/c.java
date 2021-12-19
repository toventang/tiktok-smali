package com.bytedance.android.ecommerce.a.a;

import com.bytedance.android.ecommerce.a.i;
import com.bytedance.android.ecommerce.a.k;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public String f6884e;

    /* renamed from: f  reason: collision with root package name */
    public String f6885f;

    /* renamed from: g  reason: collision with root package name */
    public k f6886g;

    /* renamed from: h  reason: collision with root package name */
    public String f6887h;

    /* renamed from: i  reason: collision with root package name */
    public i f6888i;

    /* renamed from: j  reason: collision with root package name */
    public String f6889j;

    /* renamed from: k  reason: collision with root package name */
    public String f6890k;

    /* renamed from: l  reason: collision with root package name */
    public String f6891l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6892m;
    public String n;
    public String o;
    public String p;
    public String q;

    static {
        Covode.recordClassIndex(3338);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.a.a.a
    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f6884e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("amount", str);
            String str3 = this.f6885f;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("charge_id", str3);
            k kVar = this.f6886g;
            if (kVar != null) {
                jSONObject.put("configuration", kVar.a());
            }
            String str4 = this.f6887h;
            if (str4 == null) {
                str4 = str2;
            }
            jSONObject.put("currency", str4);
            i iVar = this.f6888i;
            if (iVar != null) {
                jSONObject.put("payment_method", iVar.a());
            }
            String str5 = this.f6889j;
            if (str5 == null) {
                str5 = str2;
            }
            jSONObject.put("payment_reference", str5);
            String str6 = this.f6890k;
            if (str6 == null) {
                str6 = str2;
            }
            jSONObject.put("return_url", str6);
            String str7 = this.f6891l;
            if (str7 == null) {
                str7 = str2;
            }
            jSONObject.put("risk_info", str7);
            jSONObject.put("store_payment_method", this.f6892m);
            String str8 = this.n;
            if (str8 == null) {
                str8 = str2;
            }
            jSONObject.put("sub_merchant_id", str8);
            String str9 = this.o;
            if (str9 == null) {
                str9 = str2;
            }
            jSONObject.put("nonce", str9);
            String str10 = this.p;
            if (str10 == null) {
                str10 = str2;
            }
            jSONObject.put("merchant_user_id", str10);
            String str11 = this.q;
            if (str11 != null) {
                str2 = str11;
            }
            jSONObject.put("deeplink", str2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.a.a.a
    public final String toString() {
        return "{mAmount='" + this.f6884e + '\'' + ", mChargeId='" + this.f6885f + '\'' + ", mRequestConfiguration=" + this.f6886g + ", mCurrency='" + this.f6887h + '\'' + ", mPaymentMethodInfo=" + this.f6888i + ", mPaymentReference='" + this.f6889j + '\'' + ", mReturnUrl='" + this.f6890k + '\'' + ", mRiskInfo='" + this.f6891l + '\'' + ", mNeedStorePaymentMethod=" + this.f6892m + ", mSubMerchantId='" + this.n + '\'' + ", mNonce='" + this.o + '\'' + ", baseRequest='" + super.toString() + '\'' + '}';
    }
}
