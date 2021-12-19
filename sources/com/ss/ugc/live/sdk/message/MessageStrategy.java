package com.ss.ugc.live.sdk.message;

import com.bytedance.covode.number.Covode;

public enum MessageStrategy {
    HTTP,
    WS;

    static {
        Covode.recordClassIndex(102769);
    }
}
