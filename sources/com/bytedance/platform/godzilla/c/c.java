package com.bytedance.platform.godzilla.c;

import com.bytedance.covode.number.Covode;

public enum c {
    INITIALIZED,
    STARTED,
    STOPPED,
    DESTROYED;

    static {
        Covode.recordClassIndex(25653);
    }
}
