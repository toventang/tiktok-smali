package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class ResponseEntity {
    @JsonName("error_code")
    public int errorCode;
    @JsonName("message")
    public String message;
    private String orderId;

    static {
        Covode.recordClassIndex(17604);
    }

    public String getOrderId() {
        return this.orderId;
    }

    public boolean isFailure() {
        if (!isSuccess()) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.errorCode != 0 || !TextUtils.equals("success", this.message)) {
            return false;
        }
        return true;
    }

    public ResponseEntity setOrderId(String str) {
        this.orderId = str;
        return this;
    }
}
