package com.ss.android.socialbase.downloader.b;

import com.bytedance.covode.number.Covode;

public enum j {
    RUN_STATUS_NONE,
    RUN_STATUS_PAUSE,
    RUN_STATUS_CANCELED,
    RUN_STATUS_ERROR,
    RUN_STATUS_END_RIGHT_NOW,
    RUN_STATUS_RETRY_DELAY,
    RUN_STATUS_WAITING_ASYNC_HANDLER,
    RUN_STATUS_END_FOR_FILE_EXIST,
    RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;

    static {
        Covode.recordClassIndex(37229);
    }
}
