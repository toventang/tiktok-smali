package com.bytedance.common.wschannel.b;

import com.bytedance.covode.number.Covode;

public enum c {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    
    final int mTypeValue;

    public final int getTypeValue() {
        return this.mTypeValue;
    }

    public final String toString() {
        return "ConnectionState{State=" + this.mTypeValue + '}';
    }

    static {
        Covode.recordClassIndex(15949);
    }

    private c(int i2) {
        this.mTypeValue = i2;
    }
}
