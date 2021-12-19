package com.benchmark;

import com.bytedance.covode.number.Covode;

public interface IBTCHSlardar {
    static {
        Covode.recordClassIndex(2932);
    }

    void onException(Throwable th);
}
