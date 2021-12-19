package com.bytedance.android.ecommerce.a.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public String f6881e;

    /* renamed from: f  reason: collision with root package name */
    public String f6882f;

    /* renamed from: g  reason: collision with root package name */
    public String f6883g;

    static {
        Covode.recordClassIndex(3337);
    }

    public b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.ecommerce.a.a.a
    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f6881e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("merchant_user_id", str);
            String str3 = this.f6882f;
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("nonce", str3);
            String str4 = this.f6883g;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("image_base64", str2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.a.a.a
    public final String toString() {
        return "BankCardRequest{mMerchantUserId='" + this.f6881e + '\'' + ", mNonce='" + this.f6882f + '}';
    }

    public b(String str, String str2) {
        this.f6881e = str;
        this.f6882f = str2;
    }
}
