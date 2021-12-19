package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public enum aq {
    USER_IDLE,
    USER_WAITING,
    USER_READY,
    USER_LINKED;

    static {
        Covode.recordClassIndex(5156);
    }
}
