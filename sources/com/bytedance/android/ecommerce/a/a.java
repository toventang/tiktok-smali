package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    List<Integer> f6870a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f6871b;

    /* renamed from: c  reason: collision with root package name */
    public String f6872c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f6873d;

    /* renamed from: e  reason: collision with root package name */
    public String f6874e;

    /* renamed from: f  reason: collision with root package name */
    public String f6875f;

    /* renamed from: g  reason: collision with root package name */
    public String f6876g;

    static {
        Covode.recordClassIndex(3335);
    }

    public final List<Integer> a() {
        if (this.f6870a == null) {
            this.f6870a = new ArrayList();
            if (this.f6871b != null) {
                for (int i2 = 0; i2 < this.f6871b.length(); i2++) {
                    try {
                        this.f6870a.add((Integer) this.f6871b.get(i2));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.f6870a;
    }

    public final String toString() {
        return "{mCvvLength=" + this.f6871b + ", mCardBrandRegex='" + this.f6872c + '\'' + ", mCardBrandLength=" + this.f6873d + ", mCardBrandDisplayName='" + this.f6874e + '\'' + ", mCardBrand='" + this.f6875f + '\'' + ", mPaymentMethodId='" + this.f6876g + '\'' + '}';
    }

    public a(JSONObject jSONObject) {
        this.f6871b = jSONObject.optJSONArray("cvv_length");
        this.f6872c = jSONObject.optString("card_brand_regex");
        this.f6873d = jSONObject.optJSONArray("card_brand_length");
        this.f6874e = jSONObject.optString("card_brand_display_name");
        this.f6875f = jSONObject.optString("card_brand");
        this.f6876g = jSONObject.optString("payment_method_id");
    }
}
