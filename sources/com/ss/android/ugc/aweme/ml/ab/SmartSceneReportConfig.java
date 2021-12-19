package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class SmartSceneReportConfig {
    @c(a = "enable")
    private boolean enable;
    @c(a = "ignore_scene")
    private String ignoreScene;
    @c(a = "init_rate")
    private float initRate;
    @c(a = "run_rate")
    private float runRate;

    static {
        Covode.recordClassIndex(70842);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getIgnoreScene() {
        return this.ignoreScene;
    }

    public final float getInitRate() {
        return this.initRate;
    }

    public final float getRunRate() {
        return this.runRate;
    }

    public final String toString() {
        return "SmartSceneReportConfig(enable=" + this.enable + ", initRate=" + this.initRate + ", runRate=" + this.runRate + ", ignoreScene=" + this.ignoreScene + ')';
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIgnoreScene(String str) {
        this.ignoreScene = str;
    }

    public final void setInitRate(float f2) {
        this.initRate = f2;
    }

    public final void setRunRate(float f2) {
        this.runRate = f2;
    }
}
