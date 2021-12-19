package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import com.bytedance.covode.number.Covode;

public class OneTimeOrderStateResponseEntity extends ResponseEntity {
    @JsonName("data")
    public Data data;

    public static class Data {
        @JsonName("status")
        public String status;
        @JsonName("track_id")
        public String trackId;

        static {
            Covode.recordClassIndex(17603);
        }
    }

    static {
        Covode.recordClassIndex(17602);
    }
}
