package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33049);
    }

    static TrackingState forNumber(int i2) {
        TrackingState[] values = values();
        for (TrackingState trackingState : values) {
            if (trackingState.nativeCode == i2) {
                return trackingState;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native TrackingState, value=");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }

    private TrackingState(int i2) {
        this.nativeCode = i2;
    }
}
