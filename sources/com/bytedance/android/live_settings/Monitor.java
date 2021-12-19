package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;

public interface Monitor {
    static {
        Covode.recordClassIndex(7357);
    }

    void performanceMonitor(String str, long j2);

    void reportException(String str, String str2);
}
