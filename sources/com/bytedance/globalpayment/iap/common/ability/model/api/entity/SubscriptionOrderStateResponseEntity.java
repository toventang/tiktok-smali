package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class SubscriptionOrderStateResponseEntity extends ResponseEntity {
    public Data data;

    public static class Data {
        public SubsInfo subsInfo;

        static {
            Covode.recordClassIndex(17606);
        }
    }

    public static class SubsInfo {
        public int status;

        static {
            Covode.recordClassIndex(17607);
        }
    }

    static {
        Covode.recordClassIndex(17605);
    }

    public static SubscriptionOrderStateResponseEntity fromJson(String str) {
        JSONObject optJSONObject;
        SubscriptionOrderStateResponseEntity subscriptionOrderStateResponseEntity = new SubscriptionOrderStateResponseEntity();
        Data data2 = new Data();
        SubsInfo subsInfo = new SubsInfo();
        subscriptionOrderStateResponseEntity.data = data2;
        data2.subsInfo = subsInfo;
        try {
            JSONObject jSONObject = new JSONObject(str);
            subscriptionOrderStateResponseEntity.errorCode = jSONObject.optInt("error_code");
            subscriptionOrderStateResponseEntity.message = jSONObject.optString("message");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("SubsInfo")) == null)) {
                subsInfo.status = optJSONObject.optInt("Status");
            }
        } catch (Throwable unused) {
        }
        return subscriptionOrderStateResponseEntity;
    }
}
