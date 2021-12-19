package com.facebook.a;

import com.bytedance.covode.number.Covode;

public enum k {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    static {
        Covode.recordClassIndex(28537);
    }
}
