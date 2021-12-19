package com.ss.android.socialbase.downloader.b;

import com.bytedance.covode.number.Covode;

public enum a {
    ASYNC_HANDLE_NONE,
    ASYNC_HANDLE_WAITING,
    ASYNC_HANDLE_RESTART,
    ASYNC_HANDLE_DOWNLOADING,
    ASYNC_HANDLE_DOWNLOADED;

    static {
        Covode.recordClassIndex(37220);
    }
}
