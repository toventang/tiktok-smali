package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class e implements Serializable {
    private float speed = 1.0f;
    private long videoDuration;
    private long videoEnd;
    private int videoIndex;
    private long videoRange;
    private long videoStart;

    static {
        Covode.recordClassIndex(82364);
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoEnd() {
        return this.videoEnd;
    }

    public final int getVideoIndex() {
        return this.videoIndex;
    }

    public final long getVideoRange() {
        return this.videoRange;
    }

    public final long getVideoStart() {
        return this.videoStart;
    }

    @Override // java.lang.Object
    public final e clone() {
        return new e(this.videoIndex, this.videoStart, this.videoRange, this.videoDuration);
    }

    public final void setSpeed(float f2) {
        this.speed = f2;
    }

    public final void setVideoDuration(long j2) {
        this.videoDuration = j2;
    }

    public final void setVideoEnd(long j2) {
        this.videoEnd = j2;
    }

    public final void setVideoIndex(int i2) {
        this.videoIndex = i2;
    }

    public final void setVideoRange(long j2) {
        this.videoRange = j2;
    }

    public final void setVideoStart(long j2) {
        this.videoStart = j2;
    }

    public final void updateVideoStartTime(long j2) {
        if (j2 > 0 && this.videoRange > 0) {
            this.videoRange = j2;
            long j3 = (this.videoEnd / 2) - (j2 / 2);
            if (j3 > 0) {
                this.videoStart = j3;
            } else {
                this.videoStart = 0;
            }
            this.videoEnd = this.videoStart + j2;
        }
    }

    public final void resetVideoStartTime(long j2, long j3) {
        this.videoStart = j2;
        this.videoRange = j3;
        this.videoEnd = j2 + j3;
    }

    public e(int i2, long j2, long j3, long j4) {
        this.videoIndex = i2;
        this.videoStart = j2;
        this.videoRange = j3;
        this.videoDuration = j4;
        this.videoEnd = j2 + j3;
    }
}
