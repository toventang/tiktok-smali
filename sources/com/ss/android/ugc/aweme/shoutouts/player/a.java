package com.ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;

public enum a {
    PREPARED,
    DOWNLOADING,
    SUCCESS,
    CANCEL,
    FAIL;

    static {
        Covode.recordClassIndex(87169);
    }
}
