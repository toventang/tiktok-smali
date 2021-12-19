package com.ss.ugc.aweme.performance.core.monitor.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.performance.core.monitor.b.c;

public interface b {
    static {
        Covode.recordClassIndex(101820);
    }

    void flush(c cVar);

    void onJankHappened(String str, long j2, long j3, long j4);

    void onMessageArrive(String str, long j2);

    void onMessageLeave(String str, long j2);

    void setThreshold(long j2);
}
