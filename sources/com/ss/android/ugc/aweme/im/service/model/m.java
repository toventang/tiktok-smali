package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;

public enum m {
    DEFAULT,
    SENDING,
    SENT,
    UNDO;

    static {
        Covode.recordClassIndex(66573);
    }
}
