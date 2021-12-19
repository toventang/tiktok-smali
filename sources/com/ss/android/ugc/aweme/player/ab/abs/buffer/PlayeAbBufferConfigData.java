package com.ss.android.ugc.aweme.player.ab.abs.buffer;

import com.bytedance.covode.number.Covode;

public final class PlayeAbBufferConfigData {
    private int expType;
    private int interactionBlockDurationNonPreloaded = 1000;
    private int interactionBlockDurationPreloaded = 200;
    private int netBlockDurationInitial = 200;
    private int netBlockDurationMax = 5000;
    private float netBlockIncFactor = 9.0f;

    static {
        Covode.recordClassIndex(73946);
    }

    public final int getExpType() {
        return this.expType;
    }

    public final int getInteractionBlockDurationNonPreloaded() {
        return this.interactionBlockDurationNonPreloaded;
    }

    public final int getInteractionBlockDurationPreloaded() {
        return this.interactionBlockDurationPreloaded;
    }

    public final int getNetBlockDurationInitial() {
        return this.netBlockDurationInitial;
    }

    public final int getNetBlockDurationMax() {
        return this.netBlockDurationMax;
    }

    public final float getNetBlockIncFactor() {
        return this.netBlockIncFactor;
    }

    public final void setExpType(int i2) {
        this.expType = i2;
    }

    public final void setInteractionBlockDurationNonPreloaded(int i2) {
        this.interactionBlockDurationNonPreloaded = i2;
    }

    public final void setInteractionBlockDurationPreloaded(int i2) {
        this.interactionBlockDurationPreloaded = i2;
    }

    public final void setNetBlockDurationInitial(int i2) {
        this.netBlockDurationInitial = i2;
    }

    public final void setNetBlockDurationMax(int i2) {
        this.netBlockDurationMax = i2;
    }

    public final void setNetBlockIncFactor(float f2) {
        this.netBlockIncFactor = f2;
    }
}
