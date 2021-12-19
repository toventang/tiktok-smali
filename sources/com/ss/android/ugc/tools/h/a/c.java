package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;

public enum c {
    UNKNOWN,
    NOT_DOWNLOAD,
    DOWNLOADING,
    DOWNLOAD_SUCCESS,
    DOWNLOAD_FAILED;

    static {
        Covode.recordClassIndex(98264);
    }
}
