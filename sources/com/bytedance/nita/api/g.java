package com.bytedance.nita.api;

import com.bytedance.covode.number.Covode;

public enum g {
    INFINITE(0),
    SHORT(15000),
    LONG(60000),
    ACTIVITY_DESTORY(-1);
    
    private final long delay;

    public final long getDelay() {
        return this.delay;
    }

    static {
        Covode.recordClassIndex(25464);
    }

    private g(long j2) {
        this.delay = j2;
    }
}
