package com.bytedance.bae.base;

import com.bytedance.bae.base.Logging;
import com.bytedance.covode.number.Covode;

public interface Loggable {
    static {
        Covode.recordClassIndex(15333);
    }

    void onLogMessage(String str, Logging.Severity severity, String str2);
}
