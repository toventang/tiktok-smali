package com.bytedance.android.livesdk.j;

import com.bytedance.covode.number.Covode;

public enum bp {
    SHOWING,
    SCROLLING,
    DISMISS;

    static {
        Covode.recordClassIndex(10194);
    }
}
