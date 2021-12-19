package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33048);
    }

    static TrackingFailureReason forNumber(int i2) {
        TrackingFailureReason[] values = values();
        for (TrackingFailureReason trackingFailureReason : values) {
            if (trackingFailureReason.nativeCode == i2) {
                return trackingFailureReason;
            }
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("Unexpected value for native TrackingFailureReason, value=");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }

    private TrackingFailureReason(int i2) {
        this.nativeCode = i2;
    }
}
