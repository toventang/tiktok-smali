package com.bytedance.globalpayment.iap.google.c;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.j.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends AbsIapChannelOrderData {

    /* renamed from: a  reason: collision with root package name */
    private final String f30397a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f30398b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30399c;

    /* renamed from: d  reason: collision with root package name */
    private String f30400d;

    static {
        Covode.recordClassIndex(17634);
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelUserId() {
        return "";
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getHost() {
        return this.f30400d;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getOriginalJson() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final IapPaymentMethod getPaymentMethod() {
        return IapPaymentMethod.GOOGLE;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSelfToken() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSignature() {
        return this.mSignature;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderFromOtherSystem() {
        return this.f30399c;
    }

    public final String toString() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelToken() {
        JSONObject jSONObject = this.f30398b;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getDeveloperPayload() {
        return this.f30398b.optString("developerPayload");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final int getOrderState() {
        if (this.f30398b.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderStateSuccess() {
        if (getOrderState() == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
        if (!TextUtils.equals(this.mOriginalJson, absIapChannelOrderData.getOriginalJson()) || !TextUtils.equals(this.mSignature, absIapChannelOrderData.getSignature())) {
            return false;
        }
        return true;
    }

    public a(Purchase purchase, boolean z) {
        this(purchase.f5773a, purchase.f5774b);
        this.mIsSubscription = z;
    }

    private static JSONObject a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = e.a(str).split("-");
            String[] split2 = e.a(str2).split("-");
            if (split.length != 0) {
                if (split2.length != 0) {
                    jSONObject.put("trade_no", split2[0]);
                    jSONObject.put("trade_amount", split2[1]);
                    jSONObject.put("app_id", split[0]);
                    jSONObject.put("merchant_id", split[1]);
                    jSONObject.put("uid", split[2]);
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private a(String str, String str2) {
        String str3;
        String str4;
        String[] split;
        this.f30397a = "GoogleOrderData";
        this.mSignature = str2;
        try {
            this.mExtraPayload = "";
            JSONObject jSONObject = new JSONObject(str);
            this.f30398b = jSONObject;
            String optString = jSONObject.optString("obfuscatedAccountId");
            if (optString.startsWith("newstr")) {
                String replace = optString.replace("newstr", "");
                if (TextUtils.isEmpty(replace)) {
                    split = new String[0];
                } else {
                    split = com.bytedance.globalpayment.iap.google.f.a.b(replace).split("\n");
                }
                if (split.length == 3) {
                    this.mSelfOrderId = split[0];
                    this.f30400d = split[1];
                    this.mIsNewSubscription = TextUtils.equals(split[2], "1");
                } else if (split.length == 2) {
                    this.mSelfOrderId = split[0];
                    this.f30400d = split[1];
                }
            } else {
                this.mSelfOrderId = optString;
            }
            String optString2 = this.f30398b.optString("obfuscatedProfileId");
            String[] split2 = optString2.split("\n");
            if (split2.length == 3) {
                str3 = split2[0];
                str4 = split2[1];
                this.mExtraPayload = split2[2];
            } else if (split2.length == 2) {
                str3 = split2[0];
                str4 = split2[1];
            } else {
                JSONObject a2 = a(this.f30398b.optString("obfuscatedAccountId"), optString2);
                if (a2 != null) {
                    str3 = a2.optString("merchant_id");
                    str4 = a2.optString("uid");
                    String optString3 = a2.optString("trade_no");
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(optString3)) {
                        str3 = "";
                        str4 = str3;
                    } else {
                        this.mSelfOrderId = optString3;
                        this.f30399c = true;
                    }
                } else {
                    str3 = split2[0];
                    str4 = "";
                }
            }
            this.f30398b.remove("obfuscatedProfileId");
            this.f30398b.remove("obfuscatedAccountId");
            if (!TextUtils.isEmpty(this.mSelfOrderId) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("orderId", this.mSelfOrderId);
                jSONObject2.put("merchantId", str3);
                jSONObject2.put("userId", str4);
                this.f30398b.put("developerPayload", jSONObject2.toString());
            } else {
                this.f30398b.put("developerPayload", "");
            }
            this.mOriginalJson = this.f30398b.toString();
            this.mChannelOrderId = this.f30398b.optString("orderId");
            this.mProductId = this.f30398b.optString("productId");
            this.mIsAckEd = this.f30398b.optBoolean("acknowledged", true);
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        } catch (JSONException unused) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        }
    }
}
