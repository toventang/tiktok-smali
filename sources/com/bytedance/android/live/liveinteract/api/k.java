package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public enum k {
    DISABLED(1),
    MATCH(10),
    INVITING(11),
    APPLYING(12),
    STATE_WAITING(15),
    CONNECTION_START(20),
    CONNECTION_SUCCEED(21),
    STATE_ONLINE(21),
    CONNECTION_FINISH(30),
    CONNECTION_FINISH_SUCCEED(31),
    STATE_OFFLINE(31),
    UNLOADED(40);
    
    private int state;

    public final int getState() {
        return this.state;
    }

    static {
        Covode.recordClassIndex(5197);
    }

    public final void setState(int i2) {
        this.state = i2;
    }

    private k(int i2) {
        this.state = i2;
    }
}
