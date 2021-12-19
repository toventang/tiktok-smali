package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;
import h.f.b.l;

public final class CommonParams {
    @Serialized(name = "enableProtocolDegrade")
    private boolean enableProtocolDegrade = true;
    @Serialized(name = "sessionId")
    private String sessionId = "";

    static {
        Covode.recordClassIndex(100455);
    }

    public final boolean getEnableProtocolDegrade() {
        return this.enableProtocolDegrade;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setEnableProtocolDegrade(boolean z) {
        this.enableProtocolDegrade = z;
    }

    public final void setSessionId(String str) {
        l.c(str, "");
        this.sessionId = str;
    }
}
