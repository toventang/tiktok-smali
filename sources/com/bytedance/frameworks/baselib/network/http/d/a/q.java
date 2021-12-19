package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;

enum q {
    UNKNOWN(-1),
    SOURCE_HTTPDNS(3),
    SOURCE_PROC(6),
    SOURCE_PRELOAD_BATCH_HTTPDNS(7),
    SOURCE_ASYNC_BATCH_HTTPDNS(8);
    
    final int mValue;

    static {
        Covode.recordClassIndex(17096);
    }

    private q(int i2) {
        this.mValue = i2;
    }
}
