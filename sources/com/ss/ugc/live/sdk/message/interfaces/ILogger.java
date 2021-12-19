package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;

public interface ILogger {
    static {
        Covode.recordClassIndex(102778);
    }

    void log(String str, String str2);

    boolean supportDebugInfo();
}
