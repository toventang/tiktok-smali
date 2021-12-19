package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import com.bytedance.covode.number.Covode;

public class CreateOrderResponseEntity extends ResponseEntity {
    @JsonName("data")
    public Data data;

    public static class Data {
        @JsonName("request_id")
        public String requestId;
        @JsonName("pay_in_track_id")
        public String trackId;

        static {
            Covode.recordClassIndex(17600);
        }
    }

    static {
        Covode.recordClassIndex(17599);
    }
}
