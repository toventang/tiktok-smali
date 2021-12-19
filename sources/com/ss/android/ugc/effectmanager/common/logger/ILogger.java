package com.ss.android.ugc.effectmanager.common.logger;

import com.bytedance.covode.number.Covode;

public interface ILogger {
    static {
        Covode.recordClassIndex(95302);
    }

    void d(String str);

    void e(String str, Throwable th);

    void i(String str);

    void w(String str);
}
