package com.bytedance.globalpayment.iap.common.ability.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import org.json.JSONObject;

public class a extends com.bytedance.globalpayment.payment.common.lib.a {
    static {
        Covode.recordClassIndex(17562);
    }

    public final JSONObject a(OrderData orderData) {
        JSONObject jSONObject = new JSONObject();
        if (orderData != null) {
            add(jSONObject, "request_id", orderData.getOrderId());
            add(jSONObject, "product_id", orderData.getProductId());
            add(jSONObject, "payment_method", orderData.getIapPaymentMethod().channelName);
            if (orderData.getPayType() != null) {
                add(jSONObject, "pay_type", orderData.getPayType().name());
            } else {
                add(jSONObject, "pay_type", "unknown");
            }
            c iapPayRequest = orderData.getIapPayRequest();
            if (iapPayRequest != null) {
                add(jSONObject, "merchant_id", iapPayRequest.f30262b);
                add(jSONObject, "user_id", iapPayRequest.f30265e);
            } else {
                add(jSONObject, "merchant_id", "unknown");
                add(jSONObject, "user_id", "unknown");
            }
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData == null) {
                add(jSONObject, "purchase", "unknown");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                add(jSONObject2, "purchase_gp_order_id", absIapChannelOrderData.getChannelOrderId());
                add(jSONObject2, "purchase_self_order_id", absIapChannelOrderData.getSelfOrderId());
                add(jSONObject2, "purchase_token", absIapChannelOrderData.getChannelToken());
                add(jSONObject2, "purchase_signature", absIapChannelOrderData.getSignature());
                add(jSONObject2, "purchase_sku_id", absIapChannelOrderData.getProductId());
                add(jSONObject2, "purchase_state", (long) absIapChannelOrderData.getOrderState());
                add(jSONObject, "purchase", jSONObject2.toString());
            }
        } else {
            add(jSONObject, "request_id", "unknown");
            add(jSONObject, "product_id", "unknown");
            add(jSONObject, "pay_type", "unknown");
            add(jSONObject, "merchant_id", "unknown");
            add(jSONObject, "user_id", "unknown");
            add(jSONObject, "purchase", "unknown");
        }
        return jSONObject;
    }

    public static void a(String str, JSONObject jSONObject) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().j().a(str, jSONObject);
    }

    public final JSONObject a(JSONObject jSONObject, d dVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
            add(jSONObject, "pay_type", dVar.f30275c.name());
        } else {
            add(jSONObject, "result_code", "unknown");
            add(jSONObject, "result_detail_code", "unknown");
            add(jSONObject, "result_message", "unknown");
            add(jSONObject, "pay_type", "unknown");
        }
        return jSONObject;
    }
}
