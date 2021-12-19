package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;

public enum am {
    SUCCESS,
    ERR_NOT_SCHEMA_SERVICE,
    ERR_NOT_INIT,
    ERR_MISS_PAGE_ID,
    ERR_MISS_CONFIG,
    ERR_GET_CONFIG_FAILED,
    ERR_CONFIG_EMPTY;

    static {
        Covode.recordClassIndex(19320);
    }
}
