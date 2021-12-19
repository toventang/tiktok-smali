package com.facebook.a;

import com.bytedance.covode.number.Covode;

public enum j {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    static {
        Covode.recordClassIndex(28536);
    }
}
