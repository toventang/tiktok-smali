package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class FeatureUserTypeConfig extends FeatureTypeConfig {
    @c(a = "percentage_mode")
    private boolean percentageMode;

    static {
        Covode.recordClassIndex(70960);
    }

    public final boolean getPercentageMode() {
        return this.percentageMode;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig
    public final String toString() {
        return "UserType{super=" + super.toString() + ", percentageMode=" + this.percentageMode + '}';
    }

    public final void setPercentageMode(boolean z) {
        this.percentageMode = z;
    }
}
