package com.bytedance.android.livesdkapi.depend.d;

import com.bytedance.covode.number.Covode;

public enum p {
    IDLE,
    INITIALIZED,
    PREPARING,
    PREPARED,
    LIVE_STARTED,
    LIVE_FINISHED,
    DETACHED;

    static {
        Covode.recordClassIndex(13614);
    }
}
