package com.bytedance.globalpayment.iap.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import com.bytedance.globalpayment.payment.common.lib.e.a;
import org.json.JSONObject;

public class TokenInfo {
    @JsonName("amount_value")
    private String amountValue;
    @JsonName("channel_order_id")
    private String channelOrderId;
    @JsonName("channel_user_id")
    private String channelUserId;
    @JsonName("currency")
    private String currency;
    private boolean isNewSubscription;
    private boolean isSubscription;
    @JsonName("order_from_other_system")
    private boolean orderFromOtherSystem;
    @JsonName("order_id")
    private String orderId;
    @JsonName("payment_method")
    private String paymentMethod;
    @JsonName("product_id")
    private String productId;
    @JsonName("token")
    private String token;
    @JsonName("merchant_user_id")
    private String userId;

    static {
        Covode.recordClassIndex(17667);
    }

    public String getAmountValue() {
        return this.amountValue;
    }

    public String getChannelOrderId() {
        return this.channelOrderId;
    }

    public String getChannelUserId() {
        return this.channelUserId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isNewSubscription() {
        return this.isNewSubscription;
    }

    public boolean isOrderFromOtherSystem() {
        return this.orderFromOtherSystem;
    }

    public boolean isSubscription() {
        return this.isSubscription;
    }

    public JSONObject toJson() {
        if (!this.isSubscription || this.isNewSubscription) {
            return toPayJson();
        }
        return toSubscriptionJsonString();
    }

    public JSONObject toSubscriptionJsonString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MerchantSubscriptionID", this.orderId);
        jSONObject.put("ChannelType", 4);
        jSONObject.put("Token", this.token);
        return jSONObject;
    }

    public JSONObject toPayJson() {
        a aVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_id", this.orderId);
        jSONObject.put("product_id", this.productId);
        if (TextUtils.isEmpty(this.userId) && (aVar = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30543e) != null) {
            this.userId = aVar.a();
        }
        jSONObject.put("merchant_user_id", this.userId);
        jSONObject.put("payment_method", this.paymentMethod);
        jSONObject.put("token", this.token);
        jSONObject.put("amount_value", this.amountValue);
        jSONObject.put("currency", this.currency);
        jSONObject.put("channel_order_id", this.channelOrderId);
        jSONObject.put("order_from_other_system", this.orderFromOtherSystem);
        jSONObject.put("channel_user_id", this.channelUserId);
        return jSONObject;
    }

    public TokenInfo setAmountValue(String str) {
        this.amountValue = str;
        return this;
    }

    public TokenInfo setChannelOrderId(String str) {
        this.channelOrderId = str;
        return this;
    }

    public TokenInfo setChannelUserId(String str) {
        this.channelUserId = str;
        return this;
    }

    public TokenInfo setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public TokenInfo setNewSubscription(boolean z) {
        this.isNewSubscription = z;
        return this;
    }

    public TokenInfo setOrderFromOtherSystem(boolean z) {
        this.orderFromOtherSystem = z;
        return this;
    }

    public TokenInfo setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public TokenInfo setPaymentMethod(String str) {
        this.paymentMethod = str;
        return this;
    }

    public TokenInfo setProductId(String str) {
        this.productId = str;
        return this;
    }

    public TokenInfo setSubscription(boolean z) {
        this.isSubscription = z;
        return this;
    }

    public TokenInfo setToken(String str) {
        this.token = str;
        return this;
    }

    public TokenInfo setUserId(String str) {
        this.userId = str;
        return this;
    }
}
