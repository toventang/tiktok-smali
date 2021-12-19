package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

public enum az {
    UNKNOWN("unknown"),
    ANCHOR_CLOSED("gift_disable_anchor"),
    SPECIAL_ACCOUNT("special_account"),
    GIFT_FEATURE_DOES_NOT_SUPPORT("country_disable"),
    AGE_GATE("l1_anchor");
    
    public final String description;

    public final String getDescription() {
        return this.description;
    }

    static {
        Covode.recordClassIndex(11330);
    }

    public static az parseEnum(int i2) {
        if (i2 < 0 || i2 >= values().length) {
            return null;
        }
        return values()[i2];
    }

    private az(String str) {
        this.description = str;
    }
}
