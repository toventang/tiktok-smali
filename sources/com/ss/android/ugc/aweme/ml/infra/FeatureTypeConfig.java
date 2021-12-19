package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FeatureTypeConfig {
    @c(a = "enable")
    private boolean enable;

    static {
        Covode.recordClassIndex(70959);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public String toString() {
        return "{enable=" + this.enable + '}';
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }
}
