package com.facebook.a.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.a.m;
import com.facebook.ab;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.kakao.usermgmt.StringSet;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    static final m f46727a = new m(com.facebook.m.f48921g);

    /* renamed from: b  reason: collision with root package name */
    private static final String f46728b = d.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28474);
        ae.a();
    }

    public static boolean a() {
        ae.a();
        q a2 = r.a(com.facebook.m.f48915a);
        if (a2 == null || !ab.b() || !a2.f48650k) {
            return false;
        }
        return true;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        BigDecimal f46729a;

        /* renamed from: b  reason: collision with root package name */
        Currency f46730b;

        /* renamed from: c  reason: collision with root package name */
        Bundle f46731c;

        static {
            Covode.recordClassIndex(28475);
        }

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f46729a = bigDecimal;
            this.f46730b = currency;
            this.f46731c = bundle;
        }
    }

    static a a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(StringSet.type);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, map.get(str3));
            }
            double d2 = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d2);
            return new a(new BigDecimal(d2 / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException unused) {
            return null;
        }
    }
}
