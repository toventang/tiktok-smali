package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

enum k$b {
    EMPTY_ARRAY,
    NONEMPTY_ARRAY,
    EMPTY_OBJECT,
    DANGLING_KEY,
    NONEMPTY_OBJECT,
    NULL;

    static {
        Covode.recordClassIndex(2738);
    }
}
