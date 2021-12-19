package com.ss.android.ugc.aweme.ufr;

import com.bytedance.covode.number.Covode;

public enum g {
    CHECK_UID_PERMISSION,
    CHECK_ACTUAL_PERMISSION,
    REQUEST_UID_PERMISSION,
    REQUEST_ACTUAL_PERMISSION,
    AUTHORIZED,
    SYNC_STATUS,
    UPLOAD,
    UNKNOW;

    static {
        Covode.recordClassIndex(92610);
    }
}
