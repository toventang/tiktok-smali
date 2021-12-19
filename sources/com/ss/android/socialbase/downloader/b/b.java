package com.ss.android.socialbase.downloader.b;

import com.bytedance.covode.number.Covode;

public enum b {
    BYTE_INVALID_RETRY_STATUS_NONE,
    BYTE_INVALID_RETRY_STATUS_RESTART,
    BYTE_INVALID_RETRY_STATUS_DOWNLOADING,
    BYTE_INVALID_RETRY_STATUS_DOWNLOADED;

    static {
        Covode.recordClassIndex(37221);
    }
}
