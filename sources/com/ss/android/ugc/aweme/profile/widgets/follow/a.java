package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.covode.number.Covode;

public enum a {
    START,
    LOGIN,
    BLOCK,
    BAN,
    TEMPORARY_BAN,
    DOUBLE_CANCEL,
    REQUESTED,
    FINISH;

    static {
        Covode.recordClassIndex(76271);
    }
}
