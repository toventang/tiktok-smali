package com.bytedance.globalpayment.iap.google.c;

import com.android.billingclient.api.SkuDetails;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends AbsIapProduct {

    /* renamed from: a  reason: collision with root package name */
    private final String f30401a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30402b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f30403c;

    static {
        Covode.recordClassIndex(17635);
    }

    public b(SkuDetails skuDetails) {
        this(skuDetails.f5780a);
    }

    private b(String str) {
        this.f30401a = "GoogleIapProduct";
        this.f30402b = str;
        try {
            this.f30403c = new JSONObject(str);
        } catch (JSONException unused) {
            a.a().e();
        }
        this.mProductId = this.f30403c.optString("productId");
        this.mProductType = this.f30403c.optString(StringSet.type);
        this.mPrice = this.f30403c.optString("price");
        this.mPriceAmountMicros = this.f30403c.optLong("price_amount_micros");
        this.mPriceCurrencyCode = this.f30403c.optString("price_currency_code");
        this.mFreeTrialPeriod = this.f30403c.optString("freeTrialPeriod");
        this.mTitle = this.f30403c.optString("title");
        this.mSubscriptionPeriod = this.f30403c.optString("subscriptionPeriod");
        this.mDescription = this.f30403c.optString("description");
        this.mChannelUserData = new IapChannelUserData(IapPaymentMethod.GOOGLE, "", "");
    }
}
