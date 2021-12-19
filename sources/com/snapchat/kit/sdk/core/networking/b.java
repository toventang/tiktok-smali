package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public enum b {
    NETWORK_ERROR,
    REVOKED_SESSION,
    NO_REFRESH_TOKEN,
    BUSY,
    UNKNOWN;

    static {
        Covode.recordClassIndex(35787);
    }
}
