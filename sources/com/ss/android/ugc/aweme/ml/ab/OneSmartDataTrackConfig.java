package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

public final class OneSmartDataTrackConfig {
    @c(a = "next_real_cnt")
    private int nextRealCnt = 1;
    @c(a = "predict")
    private InputFeaturesConfig predict;
    @c(a = "real")
    private InputFeaturesConfig real;
    @c(a = "report_rate")
    private float reportRate;
    @c(a = "scene")
    private String scene;
    @c(a = "track_type")
    private int trackType;

    static {
        Covode.recordClassIndex(70825);
    }

    public final int getNextRealCnt() {
        return this.nextRealCnt;
    }

    public final InputFeaturesConfig getPredict() {
        return this.predict;
    }

    public final InputFeaturesConfig getReal() {
        return this.real;
    }

    public final float getReportRate() {
        return this.reportRate;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String toString() {
        return "{scene=" + this.scene + ", trackType=" + this.trackType + ", predict=" + this.predict + ", real=" + this.real + ", reportRate=" + this.reportRate + ", nextRealCnt=" + this.nextRealCnt + '}';
    }

    public final void setNextRealCnt(int i2) {
        this.nextRealCnt = i2;
    }

    public final void setPredict(InputFeaturesConfig inputFeaturesConfig) {
        this.predict = inputFeaturesConfig;
    }

    public final void setReal(InputFeaturesConfig inputFeaturesConfig) {
        this.real = inputFeaturesConfig;
    }

    public final void setReportRate(float f2) {
        this.reportRate = f2;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setTrackType(int i2) {
        this.trackType = i2;
    }
}
