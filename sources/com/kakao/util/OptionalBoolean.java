package com.kakao.util;

import com.bytedance.covode.number.Covode;

public enum OptionalBoolean {
    TRUE(true),
    FALSE(false),
    NONE(null);
    
    final Boolean bool;

    public final Boolean getBoolean() {
        return this.bool;
    }

    static {
        Covode.recordClassIndex(34471);
    }

    public static OptionalBoolean getOptionalBoolean(Boolean bool2) {
        if (bool2 == null) {
            return NONE;
        }
        if (bool2.booleanValue()) {
            return TRUE;
        }
        return FALSE;
    }

    private OptionalBoolean(Boolean bool2) {
        this.bool = bool2;
    }
}
