package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public enum aw {
    NORMAL_AUDIENCE,
    GUEST_AUDIENCE,
    CURRENT_ANCHOR,
    GUEST_ANCHOR;

    static {
        Covode.recordClassIndex(5162);
    }
}
