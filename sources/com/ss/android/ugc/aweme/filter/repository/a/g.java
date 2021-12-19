package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;

public enum g {
    FILTER_STATE_UNKNOWN,
    FILTER_STATE_NOT_DOWNLOAD,
    FILTER_STATE_DOWNLOADING,
    FILTER_STATE_DOWNLOAD_SUCCESS,
    FILTER_STATE_DOWNLOAD_FAILED;

    static {
        Covode.recordClassIndex(60551);
    }
}
