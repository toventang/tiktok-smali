package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

public class VEVolumeChangeOp {
    public final int mEnd;
    public final int mStart;
    public final int mType;
    public final int mVoiceType;
    public final float mVolume;

    static {
        Covode.recordClassIndex(79865);
    }

    public String toString() {
        return "VEVolumeChangeOp{mType=" + this.mType + ", mVolume=" + this.mVolume + '}';
    }

    public static VEVolumeChangeOp ofMusic(float f2) {
        return new VEVolumeChangeOp(1, f2);
    }

    public static VEVolumeChangeOp ofVoice(float f2) {
        return new VEVolumeChangeOp(0, f2);
    }

    private VEVolumeChangeOp(int i2, float f2) {
        this.mType = i2;
        this.mVolume = f2;
        this.mStart = -1;
        this.mEnd = -1;
    }

    public static VEVolumeChangeOp ofVoice(float f2, int i2, int i3, int i4) {
        return new VEVolumeChangeOp(0, f2, i2, i3, i4);
    }

    private VEVolumeChangeOp(int i2, float f2, int i3, int i4, int i5) {
        this.mType = i2;
        this.mVolume = f2;
        this.mStart = i3;
        this.mEnd = i4;
        this.mVoiceType = i5;
    }
}
