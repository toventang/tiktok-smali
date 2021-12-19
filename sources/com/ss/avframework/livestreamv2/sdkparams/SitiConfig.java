package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class SitiConfig {
    @Serialized(name = "extract_duration")
    private int extractDuration = 1;
    @Serialized(name = "frames_counts_calc_siti")
    private int framesCountsCalcSiti;
    @Serialized(name = "period_ms")
    private int periodMs;
    @Serialized(name = "thread_count")
    private int threadCount;
    @Serialized(name = "using_gpu")
    private boolean usingGpu;

    static {
        Covode.recordClassIndex(100468);
    }

    public final int getExtractDuration() {
        return this.extractDuration;
    }

    public final int getFramesCountsCalcSiti() {
        return this.framesCountsCalcSiti;
    }

    public final int getPeriodMs() {
        return this.periodMs;
    }

    public final int getThreadCount() {
        return this.threadCount;
    }

    public final boolean getUsingGpu() {
        return this.usingGpu;
    }

    public final void setExtractDuration(int i2) {
        this.extractDuration = i2;
    }

    public final void setFramesCountsCalcSiti(int i2) {
        this.framesCountsCalcSiti = i2;
    }

    public final void setPeriodMs(int i2) {
        this.periodMs = i2;
    }

    public final void setThreadCount(int i2) {
        this.threadCount = i2;
    }

    public final void setUsingGpu(boolean z) {
        this.usingGpu = z;
    }
}
