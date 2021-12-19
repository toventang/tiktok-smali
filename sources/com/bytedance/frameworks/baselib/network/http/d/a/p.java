package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;

enum p {
    UNKNOWN,
    SUCCESS,
    IO_PENDING,
    CANCELED,
    FAILED;

    static {
        Covode.recordClassIndex(17095);
    }
}
