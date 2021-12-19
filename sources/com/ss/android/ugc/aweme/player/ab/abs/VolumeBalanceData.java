package com.ss.android.ugc.aweme.player.ab.abs;

import com.bytedance.covode.number.Covode;

public final class VolumeBalanceData {
    private float predelay = 0.007f;
    private float pregain = 0.25f;
    private float ratio = 8.0f;
    private float threshold = -18.0f;

    static {
        Covode.recordClassIndex(73929);
    }

    public final float getPredelay() {
        return this.predelay;
    }

    public final float getPregain() {
        return this.pregain;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final void setPredelay(float f2) {
        this.predelay = f2;
    }

    public final void setPregain(float f2) {
        this.pregain = f2;
    }

    public final void setRatio(float f2) {
        this.ratio = f2;
    }

    public final void setThreshold(float f2) {
        this.threshold = f2;
    }
}
