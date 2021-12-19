package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;

public enum d {
    GONE,
    GRAYED,
    ACTIVE,
    DISCONNECTED;

    static {
        Covode.recordClassIndex(12858);
    }
}
