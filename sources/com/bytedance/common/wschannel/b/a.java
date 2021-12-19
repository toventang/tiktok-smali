package com.bytedance.common.wschannel.b;

import com.bytedance.covode.number.Covode;

public enum a {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);
    
    int mTypeValue;

    public final int getVal() {
        return this.mTypeValue;
    }

    public final String toString() {
        return "ChannelType{Type=" + this.mTypeValue + '}';
    }

    static {
        Covode.recordClassIndex(15947);
    }

    public static a of(int i2) {
        if (i2 == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    private a(int i2) {
        this.mTypeValue = i2;
    }
}
