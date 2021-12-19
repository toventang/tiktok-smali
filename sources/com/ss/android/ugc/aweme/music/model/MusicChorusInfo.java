package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class MusicChorusInfo implements Serializable {
    @c(a = "duration_ms")
    public long duration;
    @c(a = "start_ms")
    public long startTime;

    static {
        Covode.recordClassIndex(71668);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }
}
