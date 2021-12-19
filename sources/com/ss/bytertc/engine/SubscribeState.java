package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public enum SubscribeState {
    SUBSCRIBE_STATE_SUCCESS,
    SUBSCRIBE_STATE_FAILED_NOT_IN_ROOM,
    SUBSCRIBE_STATE_FAILED_STREAM_NOT_FOUND,
    SUBSCRIBE_STATE_FAILED_AUTO_MODE,
    SUBSCRIBE_STATE_FAILED_SIGNAL;

    static {
        Covode.recordClassIndex(100816);
    }
}
