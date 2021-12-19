package com.bytedance.globalpayment.iap.common.ability.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;

public class OrderInfo {
    private String mExtraPayload;
    private IapPaymentMethod mIapPaymentMethod;
    private String mOrderId;
    private String mProductId;
    private String mUserId;

    static {
        Covode.recordClassIndex(17598);
    }

    public OrderInfo() {
    }

    public String getExtraPayload() {
        return this.mExtraPayload;
    }

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productId", this.mProductId);
            jSONObject.put("orderId", this.mOrderId);
            jSONObject.put("userId", this.mUserId);
            jSONObject.put("extraPayload", this.mExtraPayload);
            jSONObject.put("paymentMethod", this.mIapPaymentMethod.channelName);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OrderInfo{mProductId='" + this.mProductId + '\'' + ", mOrderId='" + this.mOrderId + '\'' + ", mUserId='" + this.mUserId + '\'' + ", mExtraPayload='" + this.mExtraPayload + '\'' + '}';
    }

    public OrderInfo setExtraPayload(String str) {
        this.mExtraPayload = str;
        return this;
    }

    public OrderInfo setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public OrderInfo setOrderId(String str) {
        this.mOrderId = str;
        return this;
    }

    public OrderInfo setProductId(String str) {
        this.mProductId = str;
        return this;
    }

    public OrderInfo setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public OrderInfo(OrderData orderData) {
        this.mProductId = orderData.getProductId();
        this.mOrderId = orderData.getOrderId();
        this.mUserId = orderData.getUserId();
        this.mExtraPayload = orderData.getIapPayRequest().f30269i;
        this.mIapPaymentMethod = orderData.getIapPaymentMethod();
    }
}
