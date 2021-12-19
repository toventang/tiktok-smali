package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(102818);
    }

    public static final void a(ILogger iLogger, String str) {
        l.c(iLogger, "");
        l.c(str, "");
        iLogger.log("MessageManagerV2", str);
    }
}
