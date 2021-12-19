package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;

public enum al {
    SUCCESS,
    FAIL_EXISTS,
    FAIL_LOAD_ERROR,
    FAIL_INVALID,
    FAIL_EXCEPTION;

    static {
        Covode.recordClassIndex(19319);
    }
}
