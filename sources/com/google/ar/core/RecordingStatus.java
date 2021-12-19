package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(33039);
    }

    static RecordingStatus forNumber(int i2) {
        RecordingStatus[] values = values();
        for (RecordingStatus recordingStatus : values) {
            if (recordingStatus.nativeCode == i2) {
                return recordingStatus;
            }
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Unexpected value for native RecordingStatus, value=");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }

    private RecordingStatus(int i2) {
        this.nativeCode = i2;
    }
}
