package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;

public interface f<KEY, RESULT, INFO> {
    static {
        Covode.recordClassIndex(98267);
    }

    void a(KEY key, int i2);

    void a(KEY key, Exception exc, INFO info, long j2);

    void a(KEY key, RESULT result);

    void a(KEY key, RESULT result, INFO info, long j2);
}
