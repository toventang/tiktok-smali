package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

public enum FetchModelType {
    ORIGIN(0),
    ZIP(1);
    
    private int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(95191);
    }

    public static FetchModelType fromValue(int i2) {
        FetchModelType[] values = values();
        for (FetchModelType fetchModelType : values) {
            if (fetchModelType.value == i2) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    private FetchModelType(int i2) {
        this.value = i2;
    }
}
