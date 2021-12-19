package com.ss.android.socialbase.downloader.b;

import com.bytedance.covode.number.Covode;

public enum i {
    DELAY_RETRY_NONE,
    DELAY_RETRY_WAITING,
    DELAY_RETRY_DOWNLOADING,
    DELAY_RETRY_DOWNLOADED;

    static {
        Covode.recordClassIndex(37228);
    }
}
