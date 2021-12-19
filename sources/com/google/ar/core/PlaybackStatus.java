package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33031);
    }

    static PlaybackStatus forNumber(int i2) {
        PlaybackStatus[] values = values();
        for (PlaybackStatus playbackStatus : values) {
            if (playbackStatus.nativeCode == i2) {
                return playbackStatus;
            }
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("Unexpected value for native PlaybackStatus, value=");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }

    private PlaybackStatus(int i2) {
        this.nativeCode = i2;
    }
}
