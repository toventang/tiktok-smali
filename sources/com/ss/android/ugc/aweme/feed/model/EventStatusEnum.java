package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum EventStatusEnum {
    Event_Created(1),
    Event_Reviewing(2),
    Event_Review_Failed(3),
    Event_Upcoming(4),
    Event_Started(5),
    Event_Deleted(6),
    Event_Finished(7);
    
    private final int status;

    public final int getStatus() {
        return this.status;
    }

    static {
        Covode.recordClassIndex(59372);
    }

    private EventStatusEnum(int i2) {
        this.status = i2;
    }
}
