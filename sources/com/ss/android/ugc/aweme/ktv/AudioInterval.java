package com.ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class AudioInterval implements Serializable {
    private long end;
    private long start;

    static {
        Covode.recordClassIndex(68545);
    }

    public static /* synthetic */ AudioInterval copy$default(AudioInterval audioInterval, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = audioInterval.start;
        }
        if ((i2 & 2) != 0) {
            j3 = audioInterval.end;
        }
        return audioInterval.copy(j2, j3);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final AudioInterval copy(long j2, long j3) {
        return new AudioInterval(j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInterval)) {
            return false;
        }
        AudioInterval audioInterval = (AudioInterval) obj;
        return this.start == audioInterval.start && this.end == audioInterval.end;
    }

    public final int hashCode() {
        long j2 = this.start;
        long j3 = this.end;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "AudioInterval(start=" + this.start + ", end=" + this.end + ")";
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j2) {
        this.end = j2;
    }

    public final void setStart(long j2) {
        this.start = j2;
    }

    public AudioInterval(long j2, long j3) {
        this.start = j2;
        this.end = j3;
    }
}
