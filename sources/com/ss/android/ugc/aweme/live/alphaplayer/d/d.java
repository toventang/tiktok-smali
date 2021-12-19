package com.ss.android.ugc.aweme.live.alphaplayer.d;

import com.bytedance.covode.number.Covode;

public enum d {
    NOT_PREPARED,
    PREPARED,
    STARTED,
    PAUSED,
    STOPPED,
    RELEASE;

    static {
        Covode.recordClassIndex(69385);
    }
}
