package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class MusicTimeStruct {
    @c(a = "end_time_in_ms")
    private long endTime;
    @c(a = "start_time_in_ms")
    private long startTime;

    static {
        Covode.recordClassIndex(79606);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }
}
