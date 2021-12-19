package com.bytedance.ies.xelement.defaultimpl.player.engine.api.a;

import com.bytedance.covode.number.Covode;

public enum b {
    NETWORK_ERROR(0, "NETWORK_ERROR"),
    INVALIDATE_PLAYER_MODEL(1, "INVALIDATE_DATA_SOURCE"),
    UNKNOWN(-1, "UNKNOWN");
    
    private final int code;
    private final String msg;

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    static {
        Covode.recordClassIndex(22201);
    }

    private b(int i2, String str) {
        this.code = i2;
        this.msg = str;
    }
}
