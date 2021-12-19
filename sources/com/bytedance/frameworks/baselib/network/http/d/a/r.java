package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;

enum r {
    NOT_SET(0),
    SERVE_FROM_CACHE(2),
    SERVE_FROM_PREFER_ADDR(5),
    SERVE_FROM_HTTP_DNS_JOB(6),
    SERVE_FROM_PROC_DNS_JOB(8),
    SERVE_FROM_HARDCODE_HOSTS(9),
    SERVE_FROM_BATCH_PRELOAD(19),
    SERVE_FROM_ASYNC_BATCH_PRELOAD(20);
    
    final int mValue;

    static {
        Covode.recordClassIndex(17097);
    }

    private r(int i2) {
        this.mValue = i2;
    }
}
