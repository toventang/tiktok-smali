package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

public final class OnePlaytimePredictConfig {
    @c(a = "real")
    private OnePlaytimePredictRealConfig realConfig;
    @c(a = "run_delay")
    private int runDelay;
    @c(a = "run_feed_gap")
    private int runFeedGap;
    @c(a = "run_time_gap")
    private int runTimeGap;
    @c(a = "config")
    private SmartSceneConfig sceneConfig;
    @c(a = "skip_count")
    private int skipCount;
    @c(a = "trigger")
    private int trigger;

    static {
        Covode.recordClassIndex(70823);
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final int getRunDelay() {
        return this.runDelay;
    }

    public final int getRunFeedGap() {
        return this.runFeedGap;
    }

    public final int getRunTimeGap() {
        return this.runTimeGap;
    }

    public final SmartSceneConfig getSceneConfig() {
        return this.sceneConfig;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final int getTrigger() {
        return this.trigger;
    }

    public final String toString() {
        return "{sceneConfig=" + this.sceneConfig + ", trigger=" + this.trigger + ", skipCount=" + this.skipCount + ", runDelay=" + this.runDelay + ", runTimeGap=" + this.runTimeGap + ", runFeedGap=" + this.runFeedGap + ", realConfig=" + this.realConfig + '}';
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setRunDelay(int i2) {
        this.runDelay = i2;
    }

    public final void setRunFeedGap(int i2) {
        this.runFeedGap = i2;
    }

    public final void setRunTimeGap(int i2) {
        this.runTimeGap = i2;
    }

    public final void setSceneConfig(SmartSceneConfig smartSceneConfig) {
        this.sceneConfig = smartSceneConfig;
    }

    public final void setSkipCount(int i2) {
        this.skipCount = i2;
    }

    public final void setTrigger(int i2) {
        this.trigger = i2;
    }
}
