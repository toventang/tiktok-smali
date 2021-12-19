package com.ss.android.ugc.aweme.compliance.api.a;

import com.bytedance.covode.number.Covode;

public enum a {
    LOGOUT(0),
    INTERNAL_WEB(1),
    EXTERNAL_WEB(2),
    NATIVE(3),
    INTERNAL_APPEAL_WEB(4),
    EXTERNAL_APPEAL_WEB(5);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(47307);
    }

    private a(int i2) {
        this.type = i2;
    }
}
