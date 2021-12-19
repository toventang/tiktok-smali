package com.bytedance.android.livesdk.ac.a;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.ILogger;

public final class b implements ILogger {
    static {
        Covode.recordClassIndex(7533);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final boolean supportDebugInfo() {
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final void log(String str, String str2) {
        a.a(4, str, str2);
    }
}
