package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class RecordingProgress {
    public long duration;
    public long fileSize;

    static {
        Covode.recordClassIndex(100866);
    }

    public RecordingProgress(long j2, long j3) {
        this.duration = j2;
        this.fileSize = j3;
    }

    public static RecordingProgress create(long j2, long j3) {
        return new RecordingProgress(j2, j3);
    }
}
