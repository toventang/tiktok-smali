package com.bytedance.android.ecommerce.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public enum a {
    CLOSED("closed"),
    EXPIRED("expired"),
    INIT("init"),
    SUCCESS("success"),
    FAILED("failed"),
    UNKNOW("unknow");
    
    private String mStatus;

    public final String getStatus() {
        return this.mStatus;
    }

    static {
        Covode.recordClassIndex(3400);
    }

    public static a getOrderStatus(String str) {
        a[] values = values();
        for (a aVar : values) {
            if (TextUtils.equals(aVar.mStatus, str)) {
                return aVar;
            }
        }
        return UNKNOW;
    }

    private a(String str) {
        this.mStatus = str;
    }
}
